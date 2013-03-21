/**
 * 
 */
package com.ac;

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

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

}
