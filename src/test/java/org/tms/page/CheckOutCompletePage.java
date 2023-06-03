package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutCompletePage extends Page {
    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement nameOfCheckOutCompletePageSection;

    public String getTextOfNameOfCheckOutCompletePageSection() {
        return waitVisibilityOf(nameOfCheckOutCompletePageSection).getText();
    }
}
