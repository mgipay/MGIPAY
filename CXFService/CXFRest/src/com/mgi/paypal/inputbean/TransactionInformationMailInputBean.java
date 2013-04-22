package com.mgi.paypal.inputbean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "TransactionInformationMailInputBean")
public class TransactionInformationMailInputBean {

	public TransactionInformationMailInputBean() {

	}

	private String CustomerEmail;
	private String TransactionAmount;
	private String ReferenceNumber;

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}

	public String getTransactionAmount() {
		return TransactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		TransactionAmount = transactionAmount;
	}

	public String getReferenceNumber() {
		return ReferenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		ReferenceNumber = referenceNumber;
	}

}
