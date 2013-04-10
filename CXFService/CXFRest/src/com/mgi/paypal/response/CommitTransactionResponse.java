/**
 * 
 */
package com.mgi.paypal.response;

/**
 * @author TCS
 * 
 */
public class CommitTransactionResponse {

	public CommitTransactionResponse() {

	}

	private String referenceNumber;

	private boolean transactionSuccess;

	private String errorMessage;

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
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
