package com.wholesale.engineering.samraat.sample.project.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TRANSACTION")
public class Transaction {

	@Id
	@Column(name = "I_TRANS_ID")
	private long transactionID;

	@Column(name = "C_ACCT_NUM")
	private String accountNumber;

	@Column(name = "C_ACCT_TYPE")
	private String accountType;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "D_VALUE_DATE")
	private Date valueDate;

	@Column(name = "C_CURR_TYPE")
	private String currecyVal;

	@Column(name = "C_TRANS_TYPE")
	private String transactionType;

	@Column(name = "A_DEBIT")
	private BigDecimal amountDebit;

	@Column(name = "A_CREDIT")
	private BigDecimal amountCredit;

	@Column(name = "C_TRANS_DESC")
	private String transactionDes;

	public Transaction() {
		super();
	}

	public Transaction(long transactionID, String accountNumber, String accountType, Date valueDate, String currecyVal,
			String transactionType, BigDecimal amountDebit, BigDecimal amountCredit, String transactionDes) {
		super();
		this.transactionID = transactionID;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.valueDate = valueDate;
		this.currecyVal = currecyVal;
		this.transactionType = transactionType;
		this.amountDebit = amountDebit;
		this.amountCredit = amountCredit;
		this.transactionDes = transactionDes;
	}

	public long getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
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

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public String getCurrecyVal() {
		return currecyVal;
	}

	public void setCurrecyVal(String currecyVal) {
		this.currecyVal = currecyVal;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public BigDecimal getAmountDebit() {
		return amountDebit;
	}

	public void setAmountDebit(BigDecimal amountDebit) {
		this.amountDebit = amountDebit;
	}

	public BigDecimal getAmountCredit() {
		return amountCredit;
	}

	public void setAmountCredit(BigDecimal amountCredit) {
		this.amountCredit = amountCredit;
	}

	public String getTransactionDes() {
		return transactionDes;
	}

	public void setTransactionDes(String transactionDes) {
		this.transactionDes = transactionDes;
	}

	@Override
	public String toString() {
		return "Transaction [accountNumber=" + accountNumber + ", accountType=" + accountType + ", valueDate="
				+ valueDate + ", currecyVal=" + currecyVal + ", transactionType=" + transactionType + ", amountDebit="
				+ amountDebit + ", amountCredit=" + amountCredit + ", transactionDes=" + transactionDes + "]";
	}

}
