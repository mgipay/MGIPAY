package com.ac;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SendReversalInputBean")
public class SendReversalInputBean {
	
	private BigDecimal sendAmount;

	private BigDecimal feeAmount;

	private String sendCurrency;

	private String referenceNumber;

	public BigDecimal getSendAmount() {
		return sendAmount;
	}

	public void setSendAmount(BigDecimal sendAmount) {
		this.sendAmount = sendAmount;
	}

	public BigDecimal getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getSendCurrency() {
		return sendCurrency;
	}

	public void setSendCurrency(String sendCurrency) {
		this.sendCurrency = sendCurrency;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

}
