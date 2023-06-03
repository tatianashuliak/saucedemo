package org.tms.service;

import org.tms.page.CheckOutCompletePage;

public class CheckOutCompletePageService {

    public String getActualTextOfCheckOutCompletePage() {
        CheckOutCompletePage checkOutCompletePage = new CheckOutCompletePage();
        return checkOutCompletePage.getTextOfNameOfCheckOutCompletePageSection();
    }
}
