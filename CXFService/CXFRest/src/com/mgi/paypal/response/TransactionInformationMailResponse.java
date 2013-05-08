package com.mgi.paypal.response;

public class TransactionInformationMailResponse {

	public TransactionInformationMailResponse() {

	}
	
	private boolean transactionSuccess;
	private String messageToUser;
	public boolean isTransactionSuccess() {
		return transactionSuccess;
	}
	public void setTransactionSuccess(boolean transactionSuccess) {
		this.transactionSuccess = transactionSuccess;
	}
	public String getMessageToUser() {
		return messageToUser;
	}
	public void setMessageToUser(String messageToUser) {
		this.messageToUser = messageToUser;
	}
	
	

}
