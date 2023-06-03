package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.service.InventoryPageService;
import org.tms.service.LogInPageService;

public class LoginPageTest extends BaseTest {
    private LogInPageService logInPageService;

    @BeforeClass
    public void SetUp() {
        logInPageService = new LogInPageService();
    }

    @Test
    public void loginTest() {
        User user = new User("standard_user", "secret_sauce");
        InventoryPageService inventoryPageService = logInPageService.login(user);
        String actualTextOfInventoryPage = inventoryPageService.getActualTextOfInventoryPage();
        String expectedPageInventoryPageText = "Products";
        Assert.assertEquals(actualTextOfInventoryPage, expectedPageInventoryPageText, "The actual text of the page doesn't match expected!");
    }
}
