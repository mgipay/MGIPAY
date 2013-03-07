package com.ac;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CommitTransactionInputBean")
public class CommitTransactionInputBean {
	
	public CommitTransactionInputBean() {

	}

	private String mgiTransactionSessionID;

	public String getMgiTransactionSessionID() {
		return mgiTransactionSessionID;
	}

	public void setMgiTransactionSessionID(String mgiTransactionSessionID) {
		this.mgiTransactionSessionID = mgiTransactionSessionID;
	}

}
