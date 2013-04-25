package com.mgi.paypal.util;

public class StatusToReverseBean {

	public StatusToReverseBean() {

	}

	private String MgiTransactionSessionID;

	private String mgiReferenceNumber;

	public String getMgiTransactionSessionID() {
		return MgiTransactionSessionID;
	}

	public void setMgiTransactionSessionID(String mgiTransactionSessionID) {
		MgiTransactionSessionID = mgiTransactionSessionID;
	}

	public String getMgiReferenceNumber() {
		return mgiReferenceNumber;
	}

	public void setMgiReferenceNumber(String mgiReferenceNumber) {
		this.mgiReferenceNumber = mgiReferenceNumber;
	}

}
