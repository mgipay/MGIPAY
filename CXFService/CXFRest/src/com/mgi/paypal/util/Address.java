package com.mgi.paypal.util;

public class Address {

	public Address() {

	}

	/*
	 * "{\"address\":{\"postal_code\":\"07901\",\"locality\":\"Summ" +
	 * "it\",\"region\":\"NJ\",\"country\":\"US\",\"street_address\":\"4807384 5th"
	 * + " Street, 3272844 4th Street\"}," +
	 */
	private String postal_code;
	private String locality;
	private String region;
	private String country;
	private String street_address;

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

}
