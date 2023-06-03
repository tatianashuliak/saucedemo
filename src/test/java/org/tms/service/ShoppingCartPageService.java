package org.tms.service;

import org.openqa.selenium.WebElement;
import org.tms.page.CheckOutInformationPage;
import org.tms.page.ShoppingCartPage;

public class ShoppingCartPageService {
    private ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    public String getActualNameOfInventoryItemAtCart() {
        return shoppingCartPage.getNameOfInventoryItemAtCart();
    }

    public CheckOutInformationPageService goToCheckOutInformationPage() {
        shoppingCartPage.clickCheckOutButton();
        return new CheckOutInformationPageService();
    }
}
