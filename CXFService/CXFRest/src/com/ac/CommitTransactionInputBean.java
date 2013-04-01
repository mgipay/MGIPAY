package com.ac;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CommitTransactionInputBean")
public class CommitTransactionInputBean {

	public CommitTransactionInputBean() {

	}

	private Integer transactionId;
	private String mgiTransactionSessionID;
	private String customerEmail;
	private String customerName;
	private String customerPhoneNumber;
	private String paypalTransactionID;
	private BigDecimal transactionAmount;
	private BigDecimal transactionFee;
	private String mgiTransactionStatus;
	private String mgiReferenceNumber;
	private String payPalTransactionStatus;

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getPayPalTransactionStatus() {
		return payPalTransactionStatus;
	}

	public void setPayPalTransactionStatus(String payPalTransactionStatus) {
		this.payPalTransactionStatus = payPalTransactionStatus;
	}

	public String getMgiTransactionSessionID() {
		return mgiTransactionSessionID;
	}

	public void setMgiTransactionSessionID(String mgiTransactionSessionID) {
		this.mgiTransactionSessionID = mgiTransactionSessionID;
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

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getPaypalTransactionID() {
		return paypalTransactionID;
	}

	public void setPaypalTransactionID(String paypalTransactionID) {
		this.paypalTransactionID = paypalTransactionID;
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

	public String getMgiTransactionStatus() {
		return mgiTransactionStatus;
	}

	public void setMgiTransactionStatus(String mgiTransactionStatus) {
		this.mgiTransactionStatus = mgiTransactionStatus;
	}

	public String getMgiReferenceNumber() {
		return mgiReferenceNumber;
	}

	public void setMgiReferenceNumber(String mgiReferenceNumber) {
		this.mgiReferenceNumber = mgiReferenceNumber;
	}

}
