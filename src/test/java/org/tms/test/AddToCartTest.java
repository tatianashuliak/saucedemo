package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.service.InventoryPageService;
import org.tms.service.LogInPageService;
import org.tms.service.ShoppingCartPageService;

public class AddToCartTest extends BaseTest {
    private LogInPageService logInPageService;

    @BeforeClass
    public void SetUp() {
        logInPageService = new LogInPageService();
    }

    @Test
    public void addBackPackToCartTest() {
        User user = new User("standard_user", "secret_sauce");
        InventoryPageService inventoryPageService = logInPageService.login(user);
        ShoppingCartPageService shoppingCartPageService = inventoryPageService.addBackPackToCart();
        String actualNameOfInventoryItemAtCart = shoppingCartPageService.getActualNameOfInventoryItemAtCart();
        String expectedNameOfInventoryItemAtCart = "Sauce Labs Backpack";
        Assert.assertEquals(actualNameOfInventoryItemAtCart, expectedNameOfInventoryItemAtCart, "Item wasn't added to cart");
    }


}
