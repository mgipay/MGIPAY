package com.ac;

import java.util.List;

public class HistroyLookupResponse {

	public HistroyLookupResponse() {
		// TODO Auto-generated constructor stub
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
