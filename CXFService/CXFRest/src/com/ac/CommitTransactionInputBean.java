package com.ac;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CommitTransactionInputBean")
public class CommitTransactionInputBean {

	private String feeAmount;
	private String recieveAmount;
	private String pickupLocation;

	public String getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getRecieveAmount() {
		return recieveAmount;
	}

	public void setRecieveAmount(String recieveAmount) {
		this.recieveAmount = recieveAmount;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

}
