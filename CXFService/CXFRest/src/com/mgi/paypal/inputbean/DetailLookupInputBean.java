package com.mgi.paypal.inputbean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DetailLookupInputBean")
public class DetailLookupInputBean {
	// TODO delete this class
	public DetailLookupInputBean() {
		
	}

	private String referenceNumber;

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

}
