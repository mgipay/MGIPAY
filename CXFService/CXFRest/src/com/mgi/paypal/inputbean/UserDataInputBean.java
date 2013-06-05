package com.mgi.paypal.inputbean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UserDataInputBean")
public class UserDataInputBean {

	private String code;

	private String id_Token;

	public String getId_Token() {
		return id_Token;
	}

	public void setId_Token(
			String id_Token) {
		this.id_Token = id_Token;
	}

	public String getCode() {
		return code;
	}

	public void setCode(
			String code) {
		this.code = code;
	}

}
