package com.mgi.paypal.response;

public class LogOutResponse {

	public LogOutResponse() {
	}
	private boolean transactionSuccess;

	public boolean isTransactionSuccess() {
		return transactionSuccess;
	}
	public void setTransactionSuccess(
			boolean transactionSuccess) {
		this.transactionSuccess = transactionSuccess;
	}

}
