package org.tms.model;

public class DeliveryRecipient {
    private String firstName;
    private String lastName;
    private String zipOrPostalCode;

    public DeliveryRecipient(String firstName, String lastName, String zipOrPostalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipOrPostalCode = zipOrPostalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipOrPostalCode() {
        return zipOrPostalCode;
    }

    public void setZipOrPostalCode(String zipOrPostalCode) {
        this.zipOrPostalCode = zipOrPostalCode;
    }
}
