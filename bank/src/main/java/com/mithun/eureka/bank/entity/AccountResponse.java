package com.mithun.eureka.bank.entity;

public class AccountResponse {
    private CustomerDto customer;
    private BankEntity bank;

    public AccountResponse() {
    }

    public AccountResponse(CustomerDto customer, BankEntity bank) {
        this.customer = customer;
        this.bank = bank;
    }

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }

    public BankEntity getBank() {
        return bank;
    }

    public void setBank(BankEntity bank) {
        this.bank = bank;
    }
}
