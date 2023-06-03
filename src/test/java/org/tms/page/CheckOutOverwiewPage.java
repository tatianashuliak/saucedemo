package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutOverwiewPage extends Page {
    @FindBy(xpath = "//span[@class= 'title']")
    private WebElement nameOfCheckOutOverviewPageTitle;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    public String getTextOfNameOfCheckOutOverviewPageTitle() {
        return waitVisibilityOf(nameOfCheckOutOverviewPageTitle).getText();
    }

    public void clickFinishButton() {
        waitElementToBeClickable(finishButton).click();
    }
}
