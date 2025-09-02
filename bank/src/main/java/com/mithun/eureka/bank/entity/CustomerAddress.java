package com.mithun.eureka.bank.entity;

public class CustomerAddress {
    private String doorNo;
    private String Street;
    private String city;
    private String pincode;
    private String state;
    private String country;

    public CustomerAddress() {
    }

    public CustomerAddress(String doorNo, String street, String city, String pincode, String state, String country) {
        this.doorNo = doorNo;
        Street = street;
        this.city = city;
        this.pincode = pincode;
        this.state = state;
        this.country = country;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
