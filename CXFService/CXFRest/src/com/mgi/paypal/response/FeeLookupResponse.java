package com.mgi.paypal.response;

import java.math.BigDecimal;

public class FeeLookupResponse {

	public FeeLookupResponse() {
	}

	private String mgiTransactionSessionID;

	private BigDecimal totalAmount;

	private BigDecimal feeAmount;

	private boolean transactionSuccess;

	private String errorMessage;

	public BigDecimal getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getMgiTransactionSessionID() {
		return mgiTransactionSessionID;
	}

	public void setMgiTransactionSessionID(String mgiTransactionSessionID) {
		this.mgiTransactionSessionID = mgiTransactionSessionID;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal feeAmount) {
		this.totalAmount = feeAmount;
	}

	public boolean isTransactionSuccess() {
		return transactionSuccess;
	}

	public void setTransactionSuccess(boolean transactionSuccess) {
		this.transactionSuccess = transactionSuccess;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
