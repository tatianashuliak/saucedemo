package org.tms.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.tms.test.LoginPageTest;

public class LogInPage extends Page {
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement logInButton;

    public LogInPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public LogInPage fillInUsername(String username) {
        waitVisibilityOf(usernameField).sendKeys(username);
        return this;
    }

    public LogInPage fillInPassword(String keyPassword) {
        waitVisibilityOf(passwordField).sendKeys(keyPassword);
        return this;
    }

    public void clickLoginButton() {
        waitElementToBeClickable(logInButton).click();
    }
}
