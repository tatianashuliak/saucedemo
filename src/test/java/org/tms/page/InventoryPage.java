package org.tms.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends Page {
    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartBackPack;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement shoppingCartLink;

    public String getTextOfNameOfMainPageSection() {
        return waitVisibilityOf(nameOfMainPageSection).getText();
    }

    public InventoryPage clickAddBackPackToCartButton() {
        waitElementToBeClickable(addToCartBackPack).click();
        return this;
    }

    public void clickShoppingCartLink() {
        waitElementToBeClickable(shoppingCartLink).click();
    }


}
