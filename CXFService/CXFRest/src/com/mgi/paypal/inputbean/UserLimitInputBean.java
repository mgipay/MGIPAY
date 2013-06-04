/**
 * 
 */
package com.mgi.paypal.inputbean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author TCS
 * 
 */
@XmlRootElement(name = "UserLimitInputBean")
public class UserLimitInputBean {

	public UserLimitInputBean() {

	}

	private String emailID;
	
	private String phoneNumber;
	
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

}
