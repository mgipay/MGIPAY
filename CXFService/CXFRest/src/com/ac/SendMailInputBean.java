/**
 * 
 */
package com.ac;

/**
 * @author 538540
 * 
 */
public class SendMailInputBean {

	public SendMailInputBean() {
	}

	private String subject;

	private String text;

	private String referenceNumber;

	private String customerEmailId;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String message) {
		this.text = message;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

}
