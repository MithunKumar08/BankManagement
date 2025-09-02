package com.mithun.eureka.bank.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.ClientInfoStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Bank")
	public class BankEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long accountId;
	    //@GeneratedValue(strategy = GenerationType.IDENTITY)
		private String accountNumber;
		private String accountType;
		private String bankLocation;
		private long balance;
		private boolean status;
		private LocalDateTime opendate;
		private LocalDateTime closeddate;
		private Long customerId;

	public BankEntity(Long accountId, String accountNumber, String accountType, String bankLocation, long balance, boolean status, LocalDateTime opendate, LocalDateTime closeddate, Long customerId) {
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.bankLocation = bankLocation;
		this.balance = balance;
		this.status = status;
		this.opendate = opendate;
		this.closeddate = closeddate;
		this.customerId = customerId;
	}

	public BankEntity() {
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBankLocation() {
		return bankLocation;
	}

	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDateTime getOpendate() {
		return opendate;
	}

	public void setOpendate(LocalDateTime opendate) {
		this.opendate = opendate;
	}

	public LocalDateTime getCloseddate() {
		return closeddate;
	}

	public void setCloseddate(LocalDateTime closeddate) {
		this.closeddate = closeddate;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
}
