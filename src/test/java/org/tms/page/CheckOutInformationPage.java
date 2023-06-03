package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutInformationPage extends Page {

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement zipOrPostalCodeField;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    public CheckOutInformationPage fillInFirstNameField(String firstName) {
        waitVisibilityOf(firstNameField).sendKeys(firstName);
        return this;
    }

    public CheckOutInformationPage fillInLastNameField(String lastName) {
        waitVisibilityOf(lastNameField).sendKeys(lastName);
        return this;
    }

    public CheckOutInformationPage fillInZipOrPostalCodeField(String zipOrPostalCode) {
        waitVisibilityOf(zipOrPostalCodeField).sendKeys(zipOrPostalCode);
        return this;
    }

    public void clickContinueButton() {
        waitElementToBeClickable(continueButton).click();
    }
}
