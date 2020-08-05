package com.wholesale.engineering.samraat.sample.project.entity
;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "ACCOUNT")
public class Account {
	@Id
	@Column(name = "C_ACCT_NUM")
	private String accountNumber;
	
	@Column(name = "C_ACCT_NAME")
	private String accountName;
	
	@Column(name = "C_ACCT_TYPE")
	private String accountType;
	
	@Column(name = "C_CURR_TYPE")
	private String currecyVal;
	
	@Column(name = "A_ACCT_BAL")
	private BigDecimal balance;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "D_TRANS_DATE")
	private Date transactionDate;

	public Account() {
		super();
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Account(String accountNumber, String accountName, String accountType, String currecyVal, BigDecimal balance,
			Date transactionDate) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.currecyVal = currecyVal;
		this.balance = balance;
		this.transactionDate = transactionDate;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCurrecyVal() {
		return currecyVal;
	}

	public void setCurrecyVal(String currecyVal) {
		this.currecyVal = currecyVal;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
				+ accountType + ", currecyVal=" + currecyVal + ", balance=" + balance + ", transactionDate="
				+ transactionDate + "]";
	}

}
