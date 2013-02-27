package com.ac;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FeeRequestInputBean")
public class FeeRequestInputBean {

	private String amount;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
