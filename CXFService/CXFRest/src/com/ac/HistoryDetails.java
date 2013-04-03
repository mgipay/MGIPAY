package com.ac;

import java.math.BigDecimal;

public class HistoryDetails {

	public HistoryDetails() {

	}

	private String transactionDate;
	private BigDecimal transactionID;
	private String customerEmail;
	private String customerName;
	private BigDecimal customerPhone;
	private String paypalTransactionID;
	private String mgiReferenceNumber;
	private BigDecimal transactionAmount;
	private BigDecimal transactionFee;
	private String transactionStatus;

	
	public BigDecimal getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(BigDecimal customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(BigDecimal transactionID) {
		this.transactionID = transactionID;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

//	public Integer getCustomerPhone() {
//		return customerPhone;
//	}
//
//	public void setCustomerPhone(Integer customerPhone) {
//		this.customerPhone = customerPhone;
//	}

	public String getPaypalTransactionID() {
		return paypalTransactionID;
	}

	public void setPaypalTransactionID(String paypalTransactionID) {
		this.paypalTransactionID = paypalTransactionID;
	}

	public String getMgiReferenceNumber() {
		return mgiReferenceNumber;
	}

	public void setMgiReferenceNumber(String mgiReferenceNumber) {
		this.mgiReferenceNumber = mgiReferenceNumber;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public BigDecimal getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(BigDecimal transactionFee) {
		this.transactionFee = transactionFee;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

}
