package com.mgi.paypal.inputbean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "TransactionInformationMailInputBean")
public class TransactionInformationMailInputBean {

	public TransactionInformationMailInputBean() {

	}

	private String customerEmail;
	private String transactionAmount;
	private String referenceNumber;
	private String customerName;
	private String stateName;
	private String fee;
	
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



}
