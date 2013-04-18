package com.mgi.paypal.util;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UserData")
public class UserData {

	public UserData() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * "{"address":{"postal_code":"07901","locality":"Summit","region":"NJ","country
	 * ":"US","street_address":"4807384 5th Street, 3272844 4th
	 * Street"},"family_name
	 * ":"Fundsout11","verified":"true","phone_number":"6023820578
	 * ","zoneinfo":"America/Los_Angeles","name":"MGI
	 * Fundsout11","email":"testuser
	 * 
	 * @moneygram.com","given_name":"MGI","user_id":"
	 * https://www.paypal.com/webapps
	 * /auth/identity/user/dCn3hbvb2NWbecoGgSGz41zZ5jGdcYvQAr3zmwEZxUo"}"
	 */

	private String address;
	private String family_name;
	private boolean verified;
	private String phone_number;
	private String zoneinfo;
	private String name;
	private String email;
	private String given_name;
	private String user_id;
	private String token;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getZoneinfo() {
		return zoneinfo;
	}

	public void setZoneinfo(String zoneinfo) {
		this.zoneinfo = zoneinfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGiven_name() {
		return given_name;
	}

	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
