package com.mgi.paypal.inputbean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UserDataInputBean")
public class UserDataInputBean {

	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
