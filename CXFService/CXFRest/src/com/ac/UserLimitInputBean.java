/**
 * 
 */
package com.ac;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author 538540
 * 
 */
@XmlRootElement(name="UserLimitInputBean")
public class UserLimitInputBean {

	/**
	 * 
	 */
	public UserLimitInputBean() {
		// TODO Auto-generated constructor stub
	}

	private String emailID;

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

}
