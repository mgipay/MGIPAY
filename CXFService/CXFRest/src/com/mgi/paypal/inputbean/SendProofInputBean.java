package com.mgi.paypal.inputbean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SendProofInputBean")
public class SendProofInputBean {

	public SendProofInputBean() {

	}

	private String customerEmail;

	private String zipCode;

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
