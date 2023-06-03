package org.tms.service;

import org.tms.model.User;
import org.tms.page.LogInPage;

public class LogInPageService {
    private static final String LOGIN_PAGE_URL = "https://www.saucedemo.com/";

    public InventoryPageService login(User user) {
        LogInPage logInPage = new LogInPage();
        logInPage.openPage(LOGIN_PAGE_URL)
                .fillInUsername(user.getName())
                .fillInPassword(user.getPassword())
                .clickLoginButton();
        return new InventoryPageService();
    }
}
