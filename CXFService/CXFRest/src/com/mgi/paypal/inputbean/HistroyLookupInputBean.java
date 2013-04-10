package com.mgi.paypal.inputbean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HistroyLookupInputBean")
public class HistroyLookupInputBean {

	public HistroyLookupInputBean() {

	}

	private String customerEmailId;

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

}
