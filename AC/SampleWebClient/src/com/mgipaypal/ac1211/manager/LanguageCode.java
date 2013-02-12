package com.mgipaypal.ac1211.manager;

/**
 * @author TCS
 * 
 */
public enum LanguageCode {
	
	ENGLISH("eng"), 
	
	SPANISH("spa");

	private String languageCode;

	private LanguageCode(String code) {
		languageCode = code;
	}

	public String getLanguageCode() {
		return languageCode;
	}

}
