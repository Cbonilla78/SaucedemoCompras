package com.saucedemo.project.models;

public class PurchasingDataInformationFormDTO {

    private String firstName;
    private String lastName;
    private int postalCode;

    public PurchasingDataInformationFormDTO() {}

    public PurchasingDataInformationFormDTO(String firstName, String lastName, int postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
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

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}