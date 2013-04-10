package com.mgi.paypal.response;

import java.util.List;

import com.mgi.paypal.util.HistoryDetails;

public class HistroyLookupResponse {

	public HistroyLookupResponse() {

	}

	private List<HistoryDetails> historyDetailsList;
	
	private boolean transactionSuccess;
	
	private String errorMessage;

	public List<HistoryDetails> getHistoryDetailsList() {
		return historyDetailsList;
	}

	public void setHistoryDetailsList(List<HistoryDetails> historyDetailsList) {
		this.historyDetailsList = historyDetailsList;
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
