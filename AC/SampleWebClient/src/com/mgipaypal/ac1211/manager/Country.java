package com.mgipaypal.ac1211.manager;

/**
 * @author TCS
 * 
 */
public enum Country {

	AMERICA("USA", "USD");

	private String countryCode;
	
	private String currencyCode;

	private Country(String country, String currency) {
		countryCode = country;
		currencyCode = currency;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}
}
