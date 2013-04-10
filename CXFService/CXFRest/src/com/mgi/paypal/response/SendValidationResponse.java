/**
 * 
 */
package com.mgi.paypal.response;

/**
 * @author TCS
 * 
 */
public class SendValidationResponse {

	public SendValidationResponse() {

	}

	private String mgiTransactionSessionID;

	private boolean transactionSuccess;

	private String errorMessage;

	public String getMgiTransactionSessionID() {
		return mgiTransactionSessionID;
	}

	public void setMgiTransactionSessionID(String mgiTransactionSessionID) {
		this.mgiTransactionSessionID = mgiTransactionSessionID;
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
