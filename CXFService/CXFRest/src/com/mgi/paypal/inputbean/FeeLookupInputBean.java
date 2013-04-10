package com.mgi.paypal.inputbean;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FeeLookupInputBean")
public class FeeLookupInputBean {

	public FeeLookupInputBean() {

	}

	private BigDecimal amount;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
