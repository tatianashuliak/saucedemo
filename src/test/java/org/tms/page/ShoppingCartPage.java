package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Page {
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement nameOfInventoryItemAtCart;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkOutButton;

    public String getNameOfInventoryItemAtCart() {
        return waitVisibilityOf(nameOfInventoryItemAtCart).getText();
    }

    public void clickCheckOutButton() {
        waitElementToBeClickable(checkOutButton).click();
    }
}
