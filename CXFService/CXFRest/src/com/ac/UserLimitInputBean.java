/**
 * 
 */
package com.ac;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author 538540
 * 
 */
@XmlRootElement(name = "UserLimitInputBean")
public class UserLimitInputBean {

	public UserLimitInputBean() {

	}

	private String emailID;

	private String phoneNumber;

	private String countryCode;

	private String extension;

	private String country;

	private String currencyCode;

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
