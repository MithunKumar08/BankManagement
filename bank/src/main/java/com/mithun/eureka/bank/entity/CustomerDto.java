package com.mithun.eureka.bank.entity;

import jakarta.validation.constraints.NotEmpty;

public class CustomerDto {
    private Long customerId;
    @NotEmpty(message = "Customer Name is required")
    private String customerName;
    private String email;
    private long phoneNo;
    private String DOB;
    private CustomerAddress address;

    public CustomerDto() {
    }

    public CustomerDto(Long customerId, String customerName, String email, long phoneNo, String DOB, CustomerAddress address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.DOB = DOB;
        this.address = address;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public CustomerAddress getAddress() {
        return address;
    }

    public void setAddress(CustomerAddress address) {
        this.address = address;
    }
}
