package com.ac;

import java.math.BigDecimal;

public class FeeLinkValues {

	public FeeLinkValues() {
	}

	private BigDecimal feeForTwoHundred;

	private BigDecimal feeForFiveHundred;

	private boolean transactionSuccess;

	private String errorMessage;

	public BigDecimal getFeeForTwoHundred() {
		return feeForTwoHundred;
	}

	public void setFeeForTwoHundred(BigDecimal feeForTwoHundred) {
		this.feeForTwoHundred = feeForTwoHundred;
	}

	public BigDecimal getFeeForFiveHundred() {
		return feeForFiveHundred;
	}

	public void setFeeForFiveHundred(BigDecimal feeForFiveHundred) {
		this.feeForFiveHundred = feeForFiveHundred;
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
