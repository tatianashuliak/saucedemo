package org.tms.service;

import org.tms.page.CheckOutOverwiewPage;

public class CheckOutOverviewPageService {

    public String getActualTextOfCheckOutOverviewPage() {
        CheckOutOverwiewPage checkOutOverwiewPage = new CheckOutOverwiewPage();
        return checkOutOverwiewPage.getTextOfNameOfCheckOutOverviewPageTitle();
    }

    public CheckOutCompletePageService goToCheckOutCompletePage() {
        CheckOutOverwiewPage checkOutOverwiewPage = new CheckOutOverwiewPage();
        checkOutOverwiewPage.clickFinishButton();
        return new CheckOutCompletePageService();
    }
}
