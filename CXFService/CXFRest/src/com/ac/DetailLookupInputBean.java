package com.ac;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SendValidationInputBean")
public class DetailLookupInputBean {

	public DetailLookupInputBean() {
		// TODO Auto-generated constructor stub
	}

	private String referenceNumber;

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

}
