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

	/**
	 * @return country code
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @return currency code
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}
}
