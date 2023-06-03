package org.tms.service;

import org.tms.model.DeliveryRecipient;
import org.tms.page.CheckOutInformationPage;

public class CheckOutInformationPageService {

    public CheckOutOverviewPageService fillInDeliveryInformation(DeliveryRecipient deliveryRecipient) {
        CheckOutInformationPage checkOutInformationPage = new CheckOutInformationPage();
        checkOutInformationPage.fillInFirstNameField(deliveryRecipient.getFirstName())
                .fillInLastNameField(deliveryRecipient.getLastName())
                .fillInZipOrPostalCodeField(deliveryRecipient.getZipOrPostalCode())
                .clickContinueButton();
        return new CheckOutOverviewPageService();
    }
}
