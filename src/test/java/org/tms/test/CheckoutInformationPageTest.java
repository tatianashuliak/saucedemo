package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.DeliveryRecipient;
import org.tms.model.User;
import org.tms.page.CheckOutInformationPage;
import org.tms.service.*;

public class CheckoutInformationPageTest extends BaseTest {

    private LogInPageService logInPageService;
    private ShoppingCartPageService shoppingCartPageService;

    @BeforeClass
    public void SetUp() {
        logInPageService = new LogInPageService();
        shoppingCartPageService = new ShoppingCartPageService();
    }

    @Test
    public void checkoutInformationTest() {
        User user = new User("standard_user", "secret_sauce");
        InventoryPageService inventoryPageService = logInPageService.login(user);
        ShoppingCartPageService shoppingCartPageService = inventoryPageService.addBackPackToCart();
        CheckOutInformationPageService checkOutInformationPageService = shoppingCartPageService.goToCheckOutInformationPage();
        DeliveryRecipient deliveryRecipient = new DeliveryRecipient("Tatiana", "Shuliak", "12345");
        CheckOutOverviewPageService checkOutOverviewPageService = checkOutInformationPageService.fillInDeliveryInformation(deliveryRecipient);
        String actualTextOfCheckOutOverviewPage = checkOutOverviewPageService.getActualTextOfCheckOutOverviewPage();
        String expectedTextOfCheckOutOverviewPage = "Checkout: Overview";
        Assert.assertEquals(actualTextOfCheckOutOverviewPage, expectedTextOfCheckOutOverviewPage, "Delivery information wasn't checkout");
    }

}
