package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.DeliveryRecipient;
import org.tms.model.User;
import org.tms.service.*;

public class CheckOutOverviewPageTest extends BaseTest {
    private LogInPageService logInPageService;

    @BeforeClass
    public void SetUp() {
        logInPageService = new LogInPageService();
    }

    @Test
    public void checkoutOverviewTest() {
        User user = new User("standard_user", "secret_sauce");
        InventoryPageService inventoryPageService = logInPageService.login(user);
        ShoppingCartPageService shoppingCartPageService = inventoryPageService.addBackPackToCart();
        CheckOutInformationPageService checkOutInformationPageService = shoppingCartPageService.goToCheckOutInformationPage();
        DeliveryRecipient deliveryRecipient = new DeliveryRecipient("Tatiana", "Shuliak", "12345");
        CheckOutOverviewPageService checkOutOverviewPageService = checkOutInformationPageService.fillInDeliveryInformation(deliveryRecipient);
        CheckOutCompletePageService checkOutCompletePageService = checkOutOverviewPageService.goToCheckOutCompletePage();
        String actualTextOfCheckOutCompletePage = checkOutCompletePageService.getActualTextOfCheckOutCompletePage();
        String expectedTextOfCheckOutCompletePage = "Thank you for your order!";
        Assert.assertEquals(actualTextOfCheckOutCompletePage, expectedTextOfCheckOutCompletePage, "Checkout Overview wasn't successful");
    }
}
