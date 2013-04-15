package com.mgi.paypal.inputbean;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SendValidationInputBean")
public class SendValidationInputBean {

	public SendValidationInputBean() {

	}

	private BigDecimal amount;
	private BigDecimal feeAmount;
	private String destinationCountry;
	private String destinationState;
	private String receiveCurrency;
	private String senderFirstName;
	private String senderLastName;
	private String senderAddress;
	private String senderCity;
	private String senderState;
	private String senderZipCode;
	private String senderCountry;
	private String senderHomePhone;
	private String receiverFirstName;
	private String receiverLastName;
	private String sendCurrency;
	private String consumerId;
	private String mgiTransactionSessionID;
	private String senderEmail;

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getDestinationCountry() {
		return destinationCountry;
	}

	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}

	public String getDestinationState() {
		return destinationState;
	}

	public void setDestinationState(String destinationState) {
		this.destinationState = destinationState;
	}

	public String getReceiveCurrency() {
		return receiveCurrency;
	}

	public void setReceiveCurrency(String receiveCurrency) {
		this.receiveCurrency = receiveCurrency;
	}

	public String getSenderFirstName() {
		return senderFirstName;
	}

	public void setSenderFirstName(String senderFirstName) {
		this.senderFirstName = senderFirstName;
	}

	public String getSenderLastName() {
		return senderLastName;
	}

	public void setSenderLastName(String senderLastName) {
		this.senderLastName = senderLastName;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderCity() {
		return senderCity;
	}

	public void setSenderCity(String senderCity) {
		this.senderCity = senderCity;
	}

	public String getSenderState() {
		return senderState;
	}

	public void setSenderState(String senderState) {
		this.senderState = senderState;
	}

	public String getSenderZipCode() {
		return senderZipCode;
	}

	public void setSenderZipCode(String senderZipCode) {
		this.senderZipCode = senderZipCode;
	}

	public String getSenderCountry() {
		return senderCountry;
	}

	public void setSenderCountry(String senderCountry) {
		this.senderCountry = senderCountry;
	}

	public String getSenderHomePhone() {
		return senderHomePhone;
	}

	public void setSenderHomePhone(String senderHomePhone) {
		this.senderHomePhone = senderHomePhone;
	}

	public String getReceiverFirstName() {
		return receiverFirstName;
	}

	public void setReceiverFirstName(String receiverFirstName) {
		this.receiverFirstName = receiverFirstName;
	}

	public String getReceiverLastName() {
		return receiverLastName;
	}

	public void setReceiverLastName(String receiverLastName) {
		this.receiverLastName = receiverLastName;
	}

	public String getSendCurrency() {
		return sendCurrency;
	}

	public void setSendCurrency(String sendCurrency) {
		this.sendCurrency = sendCurrency;
	}

	public String getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public String getMgiTransactionSessionID() {
		return mgiTransactionSessionID;
	}

	public void setMgiTransactionSessionID(String mgiTransactionSessionID) {
		this.mgiTransactionSessionID = mgiTransactionSessionID;
	}

}
