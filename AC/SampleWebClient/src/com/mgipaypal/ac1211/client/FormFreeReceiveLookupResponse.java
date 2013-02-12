/**
 * FormFreeReceiveLookupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class FormFreeReceiveLookupResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String referenceNumber;

    private java.math.BigDecimal receiveAmount;

    private java.lang.String receiveCurrency;

    private java.lang.String senderFirstName;

    private java.lang.String senderMiddleName;

    private java.lang.String senderLastName;

    private java.lang.String senderLastName2;

    private java.lang.String senderHomePhone;

    private java.lang.String originatingCountry;

    private java.util.Calendar dateTimeSent;

    private java.lang.String receiverFirstName;

    private java.lang.String receiverMiddleName;

    private java.lang.String receiverLastName;

    private java.lang.String receiverLastName2;

    private java.lang.String receiverAddress;

    private java.lang.String receiverAddress2;

    private java.lang.String receiverAddress3;

    private java.lang.String receiverAddress4;

    private java.lang.String receiverCity;

    private java.lang.String receiverState;

    private java.lang.String receiverZipCode;

    private java.lang.String messageField1;

    private java.lang.String messageField2;

    private com.mgipaypal.ac1211.client.PhotoIdType receiverPhotoIdType;

    private java.lang.String receiverPhotoIdNumber;

    private java.lang.String receiverPhotoIdState;

    private java.lang.String receiverPhotoIdCountry;

    private com.mgipaypal.ac1211.client.LegalIdType receiverLegalIdType;

    private java.lang.String receiverLegalIdNumber;

    private java.util.Date receiverDOB;

    private java.lang.String receiverOccupation;

    private java.lang.String thirdPartyFirstName;

    private java.lang.String thirdPartyMiddleName;

    private java.lang.String thirdPartyLastName;

    private java.lang.String thirdPartyLastName2;

    private java.lang.String thirdPartyAddress;

    private java.lang.String thirdPartyAddress2;

    private java.lang.String thirdPartyAddress3;

    private java.lang.String thirdPartyAddress4;

    private java.lang.String thirdPartyCity;

    private java.lang.String thirdPartyState;

    private java.lang.String thirdPartyZipCode;

    private java.lang.String thirdPartyCountry;

    private com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType;

    private java.lang.String thirdPartyLegalIdNumber;

    private java.util.Date thirdPartyDOB;

    private java.lang.String thirdPartyOccupation;

    private java.lang.String thirdPartyOrg;

    private java.lang.String receiverBirthCity;

    private java.lang.String receiverBirthCountry;

    private java.util.Date receiverPassportIssueDate;

    private java.lang.String receiverPassportIssueCity;

    private java.lang.String receiverPassportIssueCountry;

    private java.lang.String consumerId;

    private java.lang.String freqCustCardNumber;

    private java.lang.String receiverPhone;

    private java.util.Date receiverPhotoIdExpDate;

    private java.util.Date receiverPhotoIdIssueDate;

    private java.lang.Boolean receiverPhotoIdStored;

    private java.util.Date receiverLegalIdExpDate;

    private java.util.Date receiverLegalIdIssueDate;

    private java.lang.String receiverLegalIdIssueCountry;

    private java.lang.Boolean receiverLegalIdStored;

    private java.lang.String receiverPassportNumber;

    private java.util.Date receiverPassportExpDate;

    private java.lang.Boolean receiverPassportStored;

    private java.lang.String receiverNationalityCountry;

    private java.lang.String receiverNationalityAtBirthCountry;

    private java.lang.Boolean additionalDocumentationNeeded;

    private java.lang.String purposeOfTransaction;

    private java.lang.String relationToSender;

    private org.apache.axis.types.Token receiverEmailAddress;

    private java.lang.String receiverMobilePhone;

    private java.lang.Boolean marketingOptIn;

    private com.mgipaypal.ac1211.client.PhotoIdType thirdPartyPhotoIdType;

    private java.lang.String thirdPartyPhotoIdNumber;

    private java.util.Date thirdPartyPhotoIdExpDate;

    private java.util.Date thirdPartyPhotoIdIssueDate;

    private java.lang.String thirdPartyPhotoIdIssueCountry;

    private java.lang.Boolean thirdPartyPhotoIdStored;

    private java.util.Date thirdPartyLegalIdExpDate;

    private java.util.Date thirdPartyLegalIdIssueDate;

    private java.lang.String thirdPartyLegalIdIssueCountry;

    private java.lang.Boolean thirdPartyLegalIdStored;

    private com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues;

    private java.lang.String mgiTransactionSessionID;

    public FormFreeReceiveLookupResponse() {
    }

    public FormFreeReceiveLookupResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String referenceNumber,
           java.math.BigDecimal receiveAmount,
           java.lang.String receiveCurrency,
           java.lang.String senderFirstName,
           java.lang.String senderMiddleName,
           java.lang.String senderLastName,
           java.lang.String senderLastName2,
           java.lang.String senderHomePhone,
           java.lang.String originatingCountry,
           java.util.Calendar dateTimeSent,
           java.lang.String receiverFirstName,
           java.lang.String receiverMiddleName,
           java.lang.String receiverLastName,
           java.lang.String receiverLastName2,
           java.lang.String receiverAddress,
           java.lang.String receiverAddress2,
           java.lang.String receiverAddress3,
           java.lang.String receiverAddress4,
           java.lang.String receiverCity,
           java.lang.String receiverState,
           java.lang.String receiverZipCode,
           java.lang.String messageField1,
           java.lang.String messageField2,
           com.mgipaypal.ac1211.client.PhotoIdType receiverPhotoIdType,
           java.lang.String receiverPhotoIdNumber,
           java.lang.String receiverPhotoIdState,
           java.lang.String receiverPhotoIdCountry,
           com.mgipaypal.ac1211.client.LegalIdType receiverLegalIdType,
           java.lang.String receiverLegalIdNumber,
           java.util.Date receiverDOB,
           java.lang.String receiverOccupation,
           java.lang.String thirdPartyFirstName,
           java.lang.String thirdPartyMiddleName,
           java.lang.String thirdPartyLastName,
           java.lang.String thirdPartyLastName2,
           java.lang.String thirdPartyAddress,
           java.lang.String thirdPartyAddress2,
           java.lang.String thirdPartyAddress3,
           java.lang.String thirdPartyAddress4,
           java.lang.String thirdPartyCity,
           java.lang.String thirdPartyState,
           java.lang.String thirdPartyZipCode,
           java.lang.String thirdPartyCountry,
           com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType,
           java.lang.String thirdPartyLegalIdNumber,
           java.util.Date thirdPartyDOB,
           java.lang.String thirdPartyOccupation,
           java.lang.String thirdPartyOrg,
           java.lang.String receiverBirthCity,
           java.lang.String receiverBirthCountry,
           java.util.Date receiverPassportIssueDate,
           java.lang.String receiverPassportIssueCity,
           java.lang.String receiverPassportIssueCountry,
           java.lang.String consumerId,
           java.lang.String freqCustCardNumber,
           java.lang.String receiverPhone,
           java.util.Date receiverPhotoIdExpDate,
           java.util.Date receiverPhotoIdIssueDate,
           java.lang.Boolean receiverPhotoIdStored,
           java.util.Date receiverLegalIdExpDate,
           java.util.Date receiverLegalIdIssueDate,
           java.lang.String receiverLegalIdIssueCountry,
           java.lang.Boolean receiverLegalIdStored,
           java.lang.String receiverPassportNumber,
           java.util.Date receiverPassportExpDate,
           java.lang.Boolean receiverPassportStored,
           java.lang.String receiverNationalityCountry,
           java.lang.String receiverNationalityAtBirthCountry,
           java.lang.Boolean additionalDocumentationNeeded,
           java.lang.String purposeOfTransaction,
           java.lang.String relationToSender,
           org.apache.axis.types.Token receiverEmailAddress,
           java.lang.String receiverMobilePhone,
           java.lang.Boolean marketingOptIn,
           com.mgipaypal.ac1211.client.PhotoIdType thirdPartyPhotoIdType,
           java.lang.String thirdPartyPhotoIdNumber,
           java.util.Date thirdPartyPhotoIdExpDate,
           java.util.Date thirdPartyPhotoIdIssueDate,
           java.lang.String thirdPartyPhotoIdIssueCountry,
           java.lang.Boolean thirdPartyPhotoIdStored,
           java.util.Date thirdPartyLegalIdExpDate,
           java.util.Date thirdPartyLegalIdIssueDate,
           java.lang.String thirdPartyLegalIdIssueCountry,
           java.lang.Boolean thirdPartyLegalIdStored,
           com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues,
           java.lang.String mgiTransactionSessionID) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.referenceNumber = referenceNumber;
        this.receiveAmount = receiveAmount;
        this.receiveCurrency = receiveCurrency;
        this.senderFirstName = senderFirstName;
        this.senderMiddleName = senderMiddleName;
        this.senderLastName = senderLastName;
        this.senderLastName2 = senderLastName2;
        this.senderHomePhone = senderHomePhone;
        this.originatingCountry = originatingCountry;
        this.dateTimeSent = dateTimeSent;
        this.receiverFirstName = receiverFirstName;
        this.receiverMiddleName = receiverMiddleName;
        this.receiverLastName = receiverLastName;
        this.receiverLastName2 = receiverLastName2;
        this.receiverAddress = receiverAddress;
        this.receiverAddress2 = receiverAddress2;
        this.receiverAddress3 = receiverAddress3;
        this.receiverAddress4 = receiverAddress4;
        this.receiverCity = receiverCity;
        this.receiverState = receiverState;
        this.receiverZipCode = receiverZipCode;
        this.messageField1 = messageField1;
        this.messageField2 = messageField2;
        this.receiverPhotoIdType = receiverPhotoIdType;
        this.receiverPhotoIdNumber = receiverPhotoIdNumber;
        this.receiverPhotoIdState = receiverPhotoIdState;
        this.receiverPhotoIdCountry = receiverPhotoIdCountry;
        this.receiverLegalIdType = receiverLegalIdType;
        this.receiverLegalIdNumber = receiverLegalIdNumber;
        this.receiverDOB = receiverDOB;
        this.receiverOccupation = receiverOccupation;
        this.thirdPartyFirstName = thirdPartyFirstName;
        this.thirdPartyMiddleName = thirdPartyMiddleName;
        this.thirdPartyLastName = thirdPartyLastName;
        this.thirdPartyLastName2 = thirdPartyLastName2;
        this.thirdPartyAddress = thirdPartyAddress;
        this.thirdPartyAddress2 = thirdPartyAddress2;
        this.thirdPartyAddress3 = thirdPartyAddress3;
        this.thirdPartyAddress4 = thirdPartyAddress4;
        this.thirdPartyCity = thirdPartyCity;
        this.thirdPartyState = thirdPartyState;
        this.thirdPartyZipCode = thirdPartyZipCode;
        this.thirdPartyCountry = thirdPartyCountry;
        this.thirdPartyLegalIdType = thirdPartyLegalIdType;
        this.thirdPartyLegalIdNumber = thirdPartyLegalIdNumber;
        this.thirdPartyDOB = thirdPartyDOB;
        this.thirdPartyOccupation = thirdPartyOccupation;
        this.thirdPartyOrg = thirdPartyOrg;
        this.receiverBirthCity = receiverBirthCity;
        this.receiverBirthCountry = receiverBirthCountry;
        this.receiverPassportIssueDate = receiverPassportIssueDate;
        this.receiverPassportIssueCity = receiverPassportIssueCity;
        this.receiverPassportIssueCountry = receiverPassportIssueCountry;
        this.consumerId = consumerId;
        this.freqCustCardNumber = freqCustCardNumber;
        this.receiverPhone = receiverPhone;
        this.receiverPhotoIdExpDate = receiverPhotoIdExpDate;
        this.receiverPhotoIdIssueDate = receiverPhotoIdIssueDate;
        this.receiverPhotoIdStored = receiverPhotoIdStored;
        this.receiverLegalIdExpDate = receiverLegalIdExpDate;
        this.receiverLegalIdIssueDate = receiverLegalIdIssueDate;
        this.receiverLegalIdIssueCountry = receiverLegalIdIssueCountry;
        this.receiverLegalIdStored = receiverLegalIdStored;
        this.receiverPassportNumber = receiverPassportNumber;
        this.receiverPassportExpDate = receiverPassportExpDate;
        this.receiverPassportStored = receiverPassportStored;
        this.receiverNationalityCountry = receiverNationalityCountry;
        this.receiverNationalityAtBirthCountry = receiverNationalityAtBirthCountry;
        this.additionalDocumentationNeeded = additionalDocumentationNeeded;
        this.purposeOfTransaction = purposeOfTransaction;
        this.relationToSender = relationToSender;
        this.receiverEmailAddress = receiverEmailAddress;
        this.receiverMobilePhone = receiverMobilePhone;
        this.marketingOptIn = marketingOptIn;
        this.thirdPartyPhotoIdType = thirdPartyPhotoIdType;
        this.thirdPartyPhotoIdNumber = thirdPartyPhotoIdNumber;
        this.thirdPartyPhotoIdExpDate = thirdPartyPhotoIdExpDate;
        this.thirdPartyPhotoIdIssueDate = thirdPartyPhotoIdIssueDate;
        this.thirdPartyPhotoIdIssueCountry = thirdPartyPhotoIdIssueCountry;
        this.thirdPartyPhotoIdStored = thirdPartyPhotoIdStored;
        this.thirdPartyLegalIdExpDate = thirdPartyLegalIdExpDate;
        this.thirdPartyLegalIdIssueDate = thirdPartyLegalIdIssueDate;
        this.thirdPartyLegalIdIssueCountry = thirdPartyLegalIdIssueCountry;
        this.thirdPartyLegalIdStored = thirdPartyLegalIdStored;
        this.fieldValues = fieldValues;
        this.mgiTransactionSessionID = mgiTransactionSessionID;
    }


    /**
     * Gets the referenceNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the receiveAmount value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiveAmount
     */
    public java.math.BigDecimal getReceiveAmount() {
        return receiveAmount;
    }


    /**
     * Sets the receiveAmount value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiveAmount
     */
    public void setReceiveAmount(java.math.BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }


    /**
     * Gets the receiveCurrency value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the senderFirstName value for this FormFreeReceiveLookupResponse.
     * 
     * @return senderFirstName
     */
    public java.lang.String getSenderFirstName() {
        return senderFirstName;
    }


    /**
     * Sets the senderFirstName value for this FormFreeReceiveLookupResponse.
     * 
     * @param senderFirstName
     */
    public void setSenderFirstName(java.lang.String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }


    /**
     * Gets the senderMiddleName value for this FormFreeReceiveLookupResponse.
     * 
     * @return senderMiddleName
     */
    public java.lang.String getSenderMiddleName() {
        return senderMiddleName;
    }


    /**
     * Sets the senderMiddleName value for this FormFreeReceiveLookupResponse.
     * 
     * @param senderMiddleName
     */
    public void setSenderMiddleName(java.lang.String senderMiddleName) {
        this.senderMiddleName = senderMiddleName;
    }


    /**
     * Gets the senderLastName value for this FormFreeReceiveLookupResponse.
     * 
     * @return senderLastName
     */
    public java.lang.String getSenderLastName() {
        return senderLastName;
    }


    /**
     * Sets the senderLastName value for this FormFreeReceiveLookupResponse.
     * 
     * @param senderLastName
     */
    public void setSenderLastName(java.lang.String senderLastName) {
        this.senderLastName = senderLastName;
    }


    /**
     * Gets the senderLastName2 value for this FormFreeReceiveLookupResponse.
     * 
     * @return senderLastName2
     */
    public java.lang.String getSenderLastName2() {
        return senderLastName2;
    }


    /**
     * Sets the senderLastName2 value for this FormFreeReceiveLookupResponse.
     * 
     * @param senderLastName2
     */
    public void setSenderLastName2(java.lang.String senderLastName2) {
        this.senderLastName2 = senderLastName2;
    }


    /**
     * Gets the senderHomePhone value for this FormFreeReceiveLookupResponse.
     * 
     * @return senderHomePhone
     */
    public java.lang.String getSenderHomePhone() {
        return senderHomePhone;
    }


    /**
     * Sets the senderHomePhone value for this FormFreeReceiveLookupResponse.
     * 
     * @param senderHomePhone
     */
    public void setSenderHomePhone(java.lang.String senderHomePhone) {
        this.senderHomePhone = senderHomePhone;
    }


    /**
     * Gets the originatingCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @return originatingCountry
     */
    public java.lang.String getOriginatingCountry() {
        return originatingCountry;
    }


    /**
     * Sets the originatingCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @param originatingCountry
     */
    public void setOriginatingCountry(java.lang.String originatingCountry) {
        this.originatingCountry = originatingCountry;
    }


    /**
     * Gets the dateTimeSent value for this FormFreeReceiveLookupResponse.
     * 
     * @return dateTimeSent
     */
    public java.util.Calendar getDateTimeSent() {
        return dateTimeSent;
    }


    /**
     * Sets the dateTimeSent value for this FormFreeReceiveLookupResponse.
     * 
     * @param dateTimeSent
     */
    public void setDateTimeSent(java.util.Calendar dateTimeSent) {
        this.dateTimeSent = dateTimeSent;
    }


    /**
     * Gets the receiverFirstName value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverFirstName
     */
    public java.lang.String getReceiverFirstName() {
        return receiverFirstName;
    }


    /**
     * Sets the receiverFirstName value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverFirstName
     */
    public void setReceiverFirstName(java.lang.String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }


    /**
     * Gets the receiverMiddleName value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverMiddleName
     */
    public java.lang.String getReceiverMiddleName() {
        return receiverMiddleName;
    }


    /**
     * Sets the receiverMiddleName value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverMiddleName
     */
    public void setReceiverMiddleName(java.lang.String receiverMiddleName) {
        this.receiverMiddleName = receiverMiddleName;
    }


    /**
     * Gets the receiverLastName value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverLastName
     */
    public java.lang.String getReceiverLastName() {
        return receiverLastName;
    }


    /**
     * Sets the receiverLastName value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverLastName
     */
    public void setReceiverLastName(java.lang.String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }


    /**
     * Gets the receiverLastName2 value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverLastName2
     */
    public java.lang.String getReceiverLastName2() {
        return receiverLastName2;
    }


    /**
     * Sets the receiverLastName2 value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverLastName2
     */
    public void setReceiverLastName2(java.lang.String receiverLastName2) {
        this.receiverLastName2 = receiverLastName2;
    }


    /**
     * Gets the receiverAddress value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverAddress
     */
    public java.lang.String getReceiverAddress() {
        return receiverAddress;
    }


    /**
     * Sets the receiverAddress value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverAddress
     */
    public void setReceiverAddress(java.lang.String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }


    /**
     * Gets the receiverAddress2 value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverAddress2
     */
    public java.lang.String getReceiverAddress2() {
        return receiverAddress2;
    }


    /**
     * Sets the receiverAddress2 value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverAddress2
     */
    public void setReceiverAddress2(java.lang.String receiverAddress2) {
        this.receiverAddress2 = receiverAddress2;
    }


    /**
     * Gets the receiverAddress3 value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverAddress3
     */
    public java.lang.String getReceiverAddress3() {
        return receiverAddress3;
    }


    /**
     * Sets the receiverAddress3 value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverAddress3
     */
    public void setReceiverAddress3(java.lang.String receiverAddress3) {
        this.receiverAddress3 = receiverAddress3;
    }


    /**
     * Gets the receiverAddress4 value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverAddress4
     */
    public java.lang.String getReceiverAddress4() {
        return receiverAddress4;
    }


    /**
     * Sets the receiverAddress4 value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverAddress4
     */
    public void setReceiverAddress4(java.lang.String receiverAddress4) {
        this.receiverAddress4 = receiverAddress4;
    }


    /**
     * Gets the receiverCity value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverCity
     */
    public java.lang.String getReceiverCity() {
        return receiverCity;
    }


    /**
     * Sets the receiverCity value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverCity
     */
    public void setReceiverCity(java.lang.String receiverCity) {
        this.receiverCity = receiverCity;
    }


    /**
     * Gets the receiverState value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverState
     */
    public java.lang.String getReceiverState() {
        return receiverState;
    }


    /**
     * Sets the receiverState value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverState
     */
    public void setReceiverState(java.lang.String receiverState) {
        this.receiverState = receiverState;
    }


    /**
     * Gets the receiverZipCode value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverZipCode
     */
    public java.lang.String getReceiverZipCode() {
        return receiverZipCode;
    }


    /**
     * Sets the receiverZipCode value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverZipCode
     */
    public void setReceiverZipCode(java.lang.String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
    }


    /**
     * Gets the messageField1 value for this FormFreeReceiveLookupResponse.
     * 
     * @return messageField1
     */
    public java.lang.String getMessageField1() {
        return messageField1;
    }


    /**
     * Sets the messageField1 value for this FormFreeReceiveLookupResponse.
     * 
     * @param messageField1
     */
    public void setMessageField1(java.lang.String messageField1) {
        this.messageField1 = messageField1;
    }


    /**
     * Gets the messageField2 value for this FormFreeReceiveLookupResponse.
     * 
     * @return messageField2
     */
    public java.lang.String getMessageField2() {
        return messageField2;
    }


    /**
     * Sets the messageField2 value for this FormFreeReceiveLookupResponse.
     * 
     * @param messageField2
     */
    public void setMessageField2(java.lang.String messageField2) {
        this.messageField2 = messageField2;
    }


    /**
     * Gets the receiverPhotoIdType value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPhotoIdType
     */
    public com.mgipaypal.ac1211.client.PhotoIdType getReceiverPhotoIdType() {
        return receiverPhotoIdType;
    }


    /**
     * Sets the receiverPhotoIdType value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPhotoIdType
     */
    public void setReceiverPhotoIdType(com.mgipaypal.ac1211.client.PhotoIdType receiverPhotoIdType) {
        this.receiverPhotoIdType = receiverPhotoIdType;
    }


    /**
     * Gets the receiverPhotoIdNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPhotoIdNumber
     */
    public java.lang.String getReceiverPhotoIdNumber() {
        return receiverPhotoIdNumber;
    }


    /**
     * Sets the receiverPhotoIdNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPhotoIdNumber
     */
    public void setReceiverPhotoIdNumber(java.lang.String receiverPhotoIdNumber) {
        this.receiverPhotoIdNumber = receiverPhotoIdNumber;
    }


    /**
     * Gets the receiverPhotoIdState value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPhotoIdState
     */
    public java.lang.String getReceiverPhotoIdState() {
        return receiverPhotoIdState;
    }


    /**
     * Sets the receiverPhotoIdState value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPhotoIdState
     */
    public void setReceiverPhotoIdState(java.lang.String receiverPhotoIdState) {
        this.receiverPhotoIdState = receiverPhotoIdState;
    }


    /**
     * Gets the receiverPhotoIdCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPhotoIdCountry
     */
    public java.lang.String getReceiverPhotoIdCountry() {
        return receiverPhotoIdCountry;
    }


    /**
     * Sets the receiverPhotoIdCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPhotoIdCountry
     */
    public void setReceiverPhotoIdCountry(java.lang.String receiverPhotoIdCountry) {
        this.receiverPhotoIdCountry = receiverPhotoIdCountry;
    }


    /**
     * Gets the receiverLegalIdType value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverLegalIdType
     */
    public com.mgipaypal.ac1211.client.LegalIdType getReceiverLegalIdType() {
        return receiverLegalIdType;
    }


    /**
     * Sets the receiverLegalIdType value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverLegalIdType
     */
    public void setReceiverLegalIdType(com.mgipaypal.ac1211.client.LegalIdType receiverLegalIdType) {
        this.receiverLegalIdType = receiverLegalIdType;
    }


    /**
     * Gets the receiverLegalIdNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverLegalIdNumber
     */
    public java.lang.String getReceiverLegalIdNumber() {
        return receiverLegalIdNumber;
    }


    /**
     * Sets the receiverLegalIdNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverLegalIdNumber
     */
    public void setReceiverLegalIdNumber(java.lang.String receiverLegalIdNumber) {
        this.receiverLegalIdNumber = receiverLegalIdNumber;
    }


    /**
     * Gets the receiverDOB value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverDOB
     */
    public java.util.Date getReceiverDOB() {
        return receiverDOB;
    }


    /**
     * Sets the receiverDOB value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverDOB
     */
    public void setReceiverDOB(java.util.Date receiverDOB) {
        this.receiverDOB = receiverDOB;
    }


    /**
     * Gets the receiverOccupation value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverOccupation
     */
    public java.lang.String getReceiverOccupation() {
        return receiverOccupation;
    }


    /**
     * Sets the receiverOccupation value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverOccupation
     */
    public void setReceiverOccupation(java.lang.String receiverOccupation) {
        this.receiverOccupation = receiverOccupation;
    }


    /**
     * Gets the thirdPartyFirstName value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyFirstName
     */
    public java.lang.String getThirdPartyFirstName() {
        return thirdPartyFirstName;
    }


    /**
     * Sets the thirdPartyFirstName value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyFirstName
     */
    public void setThirdPartyFirstName(java.lang.String thirdPartyFirstName) {
        this.thirdPartyFirstName = thirdPartyFirstName;
    }


    /**
     * Gets the thirdPartyMiddleName value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyMiddleName
     */
    public java.lang.String getThirdPartyMiddleName() {
        return thirdPartyMiddleName;
    }


    /**
     * Sets the thirdPartyMiddleName value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyMiddleName
     */
    public void setThirdPartyMiddleName(java.lang.String thirdPartyMiddleName) {
        this.thirdPartyMiddleName = thirdPartyMiddleName;
    }


    /**
     * Gets the thirdPartyLastName value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyLastName
     */
    public java.lang.String getThirdPartyLastName() {
        return thirdPartyLastName;
    }


    /**
     * Sets the thirdPartyLastName value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyLastName
     */
    public void setThirdPartyLastName(java.lang.String thirdPartyLastName) {
        this.thirdPartyLastName = thirdPartyLastName;
    }


    /**
     * Gets the thirdPartyLastName2 value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyLastName2
     */
    public java.lang.String getThirdPartyLastName2() {
        return thirdPartyLastName2;
    }


    /**
     * Sets the thirdPartyLastName2 value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyLastName2
     */
    public void setThirdPartyLastName2(java.lang.String thirdPartyLastName2) {
        this.thirdPartyLastName2 = thirdPartyLastName2;
    }


    /**
     * Gets the thirdPartyAddress value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyAddress
     */
    public java.lang.String getThirdPartyAddress() {
        return thirdPartyAddress;
    }


    /**
     * Sets the thirdPartyAddress value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyAddress
     */
    public void setThirdPartyAddress(java.lang.String thirdPartyAddress) {
        this.thirdPartyAddress = thirdPartyAddress;
    }


    /**
     * Gets the thirdPartyAddress2 value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyAddress2
     */
    public java.lang.String getThirdPartyAddress2() {
        return thirdPartyAddress2;
    }


    /**
     * Sets the thirdPartyAddress2 value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyAddress2
     */
    public void setThirdPartyAddress2(java.lang.String thirdPartyAddress2) {
        this.thirdPartyAddress2 = thirdPartyAddress2;
    }


    /**
     * Gets the thirdPartyAddress3 value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyAddress3
     */
    public java.lang.String getThirdPartyAddress3() {
        return thirdPartyAddress3;
    }


    /**
     * Sets the thirdPartyAddress3 value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyAddress3
     */
    public void setThirdPartyAddress3(java.lang.String thirdPartyAddress3) {
        this.thirdPartyAddress3 = thirdPartyAddress3;
    }


    /**
     * Gets the thirdPartyAddress4 value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyAddress4
     */
    public java.lang.String getThirdPartyAddress4() {
        return thirdPartyAddress4;
    }


    /**
     * Sets the thirdPartyAddress4 value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyAddress4
     */
    public void setThirdPartyAddress4(java.lang.String thirdPartyAddress4) {
        this.thirdPartyAddress4 = thirdPartyAddress4;
    }


    /**
     * Gets the thirdPartyCity value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyCity
     */
    public java.lang.String getThirdPartyCity() {
        return thirdPartyCity;
    }


    /**
     * Sets the thirdPartyCity value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyCity
     */
    public void setThirdPartyCity(java.lang.String thirdPartyCity) {
        this.thirdPartyCity = thirdPartyCity;
    }


    /**
     * Gets the thirdPartyState value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyState
     */
    public java.lang.String getThirdPartyState() {
        return thirdPartyState;
    }


    /**
     * Sets the thirdPartyState value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyState
     */
    public void setThirdPartyState(java.lang.String thirdPartyState) {
        this.thirdPartyState = thirdPartyState;
    }


    /**
     * Gets the thirdPartyZipCode value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyZipCode
     */
    public java.lang.String getThirdPartyZipCode() {
        return thirdPartyZipCode;
    }


    /**
     * Sets the thirdPartyZipCode value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyZipCode
     */
    public void setThirdPartyZipCode(java.lang.String thirdPartyZipCode) {
        this.thirdPartyZipCode = thirdPartyZipCode;
    }


    /**
     * Gets the thirdPartyCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyCountry
     */
    public java.lang.String getThirdPartyCountry() {
        return thirdPartyCountry;
    }


    /**
     * Sets the thirdPartyCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyCountry
     */
    public void setThirdPartyCountry(java.lang.String thirdPartyCountry) {
        this.thirdPartyCountry = thirdPartyCountry;
    }


    /**
     * Gets the thirdPartyLegalIdType value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyLegalIdType
     */
    public com.mgipaypal.ac1211.client.LegalIdType getThirdPartyLegalIdType() {
        return thirdPartyLegalIdType;
    }


    /**
     * Sets the thirdPartyLegalIdType value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyLegalIdType
     */
    public void setThirdPartyLegalIdType(com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType) {
        this.thirdPartyLegalIdType = thirdPartyLegalIdType;
    }


    /**
     * Gets the thirdPartyLegalIdNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyLegalIdNumber
     */
    public java.lang.String getThirdPartyLegalIdNumber() {
        return thirdPartyLegalIdNumber;
    }


    /**
     * Sets the thirdPartyLegalIdNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyLegalIdNumber
     */
    public void setThirdPartyLegalIdNumber(java.lang.String thirdPartyLegalIdNumber) {
        this.thirdPartyLegalIdNumber = thirdPartyLegalIdNumber;
    }


    /**
     * Gets the thirdPartyDOB value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyDOB
     */
    public java.util.Date getThirdPartyDOB() {
        return thirdPartyDOB;
    }


    /**
     * Sets the thirdPartyDOB value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyDOB
     */
    public void setThirdPartyDOB(java.util.Date thirdPartyDOB) {
        this.thirdPartyDOB = thirdPartyDOB;
    }


    /**
     * Gets the thirdPartyOccupation value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyOccupation
     */
    public java.lang.String getThirdPartyOccupation() {
        return thirdPartyOccupation;
    }


    /**
     * Sets the thirdPartyOccupation value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyOccupation
     */
    public void setThirdPartyOccupation(java.lang.String thirdPartyOccupation) {
        this.thirdPartyOccupation = thirdPartyOccupation;
    }


    /**
     * Gets the thirdPartyOrg value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyOrg
     */
    public java.lang.String getThirdPartyOrg() {
        return thirdPartyOrg;
    }


    /**
     * Sets the thirdPartyOrg value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyOrg
     */
    public void setThirdPartyOrg(java.lang.String thirdPartyOrg) {
        this.thirdPartyOrg = thirdPartyOrg;
    }


    /**
     * Gets the receiverBirthCity value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverBirthCity
     */
    public java.lang.String getReceiverBirthCity() {
        return receiverBirthCity;
    }


    /**
     * Sets the receiverBirthCity value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverBirthCity
     */
    public void setReceiverBirthCity(java.lang.String receiverBirthCity) {
        this.receiverBirthCity = receiverBirthCity;
    }


    /**
     * Gets the receiverBirthCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverBirthCountry
     */
    public java.lang.String getReceiverBirthCountry() {
        return receiverBirthCountry;
    }


    /**
     * Sets the receiverBirthCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverBirthCountry
     */
    public void setReceiverBirthCountry(java.lang.String receiverBirthCountry) {
        this.receiverBirthCountry = receiverBirthCountry;
    }


    /**
     * Gets the receiverPassportIssueDate value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPassportIssueDate
     */
    public java.util.Date getReceiverPassportIssueDate() {
        return receiverPassportIssueDate;
    }


    /**
     * Sets the receiverPassportIssueDate value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPassportIssueDate
     */
    public void setReceiverPassportIssueDate(java.util.Date receiverPassportIssueDate) {
        this.receiverPassportIssueDate = receiverPassportIssueDate;
    }


    /**
     * Gets the receiverPassportIssueCity value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPassportIssueCity
     */
    public java.lang.String getReceiverPassportIssueCity() {
        return receiverPassportIssueCity;
    }


    /**
     * Sets the receiverPassportIssueCity value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPassportIssueCity
     */
    public void setReceiverPassportIssueCity(java.lang.String receiverPassportIssueCity) {
        this.receiverPassportIssueCity = receiverPassportIssueCity;
    }


    /**
     * Gets the receiverPassportIssueCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPassportIssueCountry
     */
    public java.lang.String getReceiverPassportIssueCountry() {
        return receiverPassportIssueCountry;
    }


    /**
     * Sets the receiverPassportIssueCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPassportIssueCountry
     */
    public void setReceiverPassportIssueCountry(java.lang.String receiverPassportIssueCountry) {
        this.receiverPassportIssueCountry = receiverPassportIssueCountry;
    }


    /**
     * Gets the consumerId value for this FormFreeReceiveLookupResponse.
     * 
     * @return consumerId
     */
    public java.lang.String getConsumerId() {
        return consumerId;
    }


    /**
     * Sets the consumerId value for this FormFreeReceiveLookupResponse.
     * 
     * @param consumerId
     */
    public void setConsumerId(java.lang.String consumerId) {
        this.consumerId = consumerId;
    }


    /**
     * Gets the freqCustCardNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @return freqCustCardNumber
     */
    public java.lang.String getFreqCustCardNumber() {
        return freqCustCardNumber;
    }


    /**
     * Sets the freqCustCardNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @param freqCustCardNumber
     */
    public void setFreqCustCardNumber(java.lang.String freqCustCardNumber) {
        this.freqCustCardNumber = freqCustCardNumber;
    }


    /**
     * Gets the receiverPhone value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPhone
     */
    public java.lang.String getReceiverPhone() {
        return receiverPhone;
    }


    /**
     * Sets the receiverPhone value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPhone
     */
    public void setReceiverPhone(java.lang.String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }


    /**
     * Gets the receiverPhotoIdExpDate value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPhotoIdExpDate
     */
    public java.util.Date getReceiverPhotoIdExpDate() {
        return receiverPhotoIdExpDate;
    }


    /**
     * Sets the receiverPhotoIdExpDate value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPhotoIdExpDate
     */
    public void setReceiverPhotoIdExpDate(java.util.Date receiverPhotoIdExpDate) {
        this.receiverPhotoIdExpDate = receiverPhotoIdExpDate;
    }


    /**
     * Gets the receiverPhotoIdIssueDate value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPhotoIdIssueDate
     */
    public java.util.Date getReceiverPhotoIdIssueDate() {
        return receiverPhotoIdIssueDate;
    }


    /**
     * Sets the receiverPhotoIdIssueDate value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPhotoIdIssueDate
     */
    public void setReceiverPhotoIdIssueDate(java.util.Date receiverPhotoIdIssueDate) {
        this.receiverPhotoIdIssueDate = receiverPhotoIdIssueDate;
    }


    /**
     * Gets the receiverPhotoIdStored value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPhotoIdStored
     */
    public java.lang.Boolean getReceiverPhotoIdStored() {
        return receiverPhotoIdStored;
    }


    /**
     * Sets the receiverPhotoIdStored value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPhotoIdStored
     */
    public void setReceiverPhotoIdStored(java.lang.Boolean receiverPhotoIdStored) {
        this.receiverPhotoIdStored = receiverPhotoIdStored;
    }


    /**
     * Gets the receiverLegalIdExpDate value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverLegalIdExpDate
     */
    public java.util.Date getReceiverLegalIdExpDate() {
        return receiverLegalIdExpDate;
    }


    /**
     * Sets the receiverLegalIdExpDate value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverLegalIdExpDate
     */
    public void setReceiverLegalIdExpDate(java.util.Date receiverLegalIdExpDate) {
        this.receiverLegalIdExpDate = receiverLegalIdExpDate;
    }


    /**
     * Gets the receiverLegalIdIssueDate value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverLegalIdIssueDate
     */
    public java.util.Date getReceiverLegalIdIssueDate() {
        return receiverLegalIdIssueDate;
    }


    /**
     * Sets the receiverLegalIdIssueDate value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverLegalIdIssueDate
     */
    public void setReceiverLegalIdIssueDate(java.util.Date receiverLegalIdIssueDate) {
        this.receiverLegalIdIssueDate = receiverLegalIdIssueDate;
    }


    /**
     * Gets the receiverLegalIdIssueCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverLegalIdIssueCountry
     */
    public java.lang.String getReceiverLegalIdIssueCountry() {
        return receiverLegalIdIssueCountry;
    }


    /**
     * Sets the receiverLegalIdIssueCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverLegalIdIssueCountry
     */
    public void setReceiverLegalIdIssueCountry(java.lang.String receiverLegalIdIssueCountry) {
        this.receiverLegalIdIssueCountry = receiverLegalIdIssueCountry;
    }


    /**
     * Gets the receiverLegalIdStored value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverLegalIdStored
     */
    public java.lang.Boolean getReceiverLegalIdStored() {
        return receiverLegalIdStored;
    }


    /**
     * Sets the receiverLegalIdStored value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverLegalIdStored
     */
    public void setReceiverLegalIdStored(java.lang.Boolean receiverLegalIdStored) {
        this.receiverLegalIdStored = receiverLegalIdStored;
    }


    /**
     * Gets the receiverPassportNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPassportNumber
     */
    public java.lang.String getReceiverPassportNumber() {
        return receiverPassportNumber;
    }


    /**
     * Sets the receiverPassportNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPassportNumber
     */
    public void setReceiverPassportNumber(java.lang.String receiverPassportNumber) {
        this.receiverPassportNumber = receiverPassportNumber;
    }


    /**
     * Gets the receiverPassportExpDate value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPassportExpDate
     */
    public java.util.Date getReceiverPassportExpDate() {
        return receiverPassportExpDate;
    }


    /**
     * Sets the receiverPassportExpDate value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPassportExpDate
     */
    public void setReceiverPassportExpDate(java.util.Date receiverPassportExpDate) {
        this.receiverPassportExpDate = receiverPassportExpDate;
    }


    /**
     * Gets the receiverPassportStored value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverPassportStored
     */
    public java.lang.Boolean getReceiverPassportStored() {
        return receiverPassportStored;
    }


    /**
     * Sets the receiverPassportStored value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverPassportStored
     */
    public void setReceiverPassportStored(java.lang.Boolean receiverPassportStored) {
        this.receiverPassportStored = receiverPassportStored;
    }


    /**
     * Gets the receiverNationalityCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverNationalityCountry
     */
    public java.lang.String getReceiverNationalityCountry() {
        return receiverNationalityCountry;
    }


    /**
     * Sets the receiverNationalityCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverNationalityCountry
     */
    public void setReceiverNationalityCountry(java.lang.String receiverNationalityCountry) {
        this.receiverNationalityCountry = receiverNationalityCountry;
    }


    /**
     * Gets the receiverNationalityAtBirthCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverNationalityAtBirthCountry
     */
    public java.lang.String getReceiverNationalityAtBirthCountry() {
        return receiverNationalityAtBirthCountry;
    }


    /**
     * Sets the receiverNationalityAtBirthCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverNationalityAtBirthCountry
     */
    public void setReceiverNationalityAtBirthCountry(java.lang.String receiverNationalityAtBirthCountry) {
        this.receiverNationalityAtBirthCountry = receiverNationalityAtBirthCountry;
    }


    /**
     * Gets the additionalDocumentationNeeded value for this FormFreeReceiveLookupResponse.
     * 
     * @return additionalDocumentationNeeded
     */
    public java.lang.Boolean getAdditionalDocumentationNeeded() {
        return additionalDocumentationNeeded;
    }


    /**
     * Sets the additionalDocumentationNeeded value for this FormFreeReceiveLookupResponse.
     * 
     * @param additionalDocumentationNeeded
     */
    public void setAdditionalDocumentationNeeded(java.lang.Boolean additionalDocumentationNeeded) {
        this.additionalDocumentationNeeded = additionalDocumentationNeeded;
    }


    /**
     * Gets the purposeOfTransaction value for this FormFreeReceiveLookupResponse.
     * 
     * @return purposeOfTransaction
     */
    public java.lang.String getPurposeOfTransaction() {
        return purposeOfTransaction;
    }


    /**
     * Sets the purposeOfTransaction value for this FormFreeReceiveLookupResponse.
     * 
     * @param purposeOfTransaction
     */
    public void setPurposeOfTransaction(java.lang.String purposeOfTransaction) {
        this.purposeOfTransaction = purposeOfTransaction;
    }


    /**
     * Gets the relationToSender value for this FormFreeReceiveLookupResponse.
     * 
     * @return relationToSender
     */
    public java.lang.String getRelationToSender() {
        return relationToSender;
    }


    /**
     * Sets the relationToSender value for this FormFreeReceiveLookupResponse.
     * 
     * @param relationToSender
     */
    public void setRelationToSender(java.lang.String relationToSender) {
        this.relationToSender = relationToSender;
    }


    /**
     * Gets the receiverEmailAddress value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverEmailAddress
     */
    public org.apache.axis.types.Token getReceiverEmailAddress() {
        return receiverEmailAddress;
    }


    /**
     * Sets the receiverEmailAddress value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverEmailAddress
     */
    public void setReceiverEmailAddress(org.apache.axis.types.Token receiverEmailAddress) {
        this.receiverEmailAddress = receiverEmailAddress;
    }


    /**
     * Gets the receiverMobilePhone value for this FormFreeReceiveLookupResponse.
     * 
     * @return receiverMobilePhone
     */
    public java.lang.String getReceiverMobilePhone() {
        return receiverMobilePhone;
    }


    /**
     * Sets the receiverMobilePhone value for this FormFreeReceiveLookupResponse.
     * 
     * @param receiverMobilePhone
     */
    public void setReceiverMobilePhone(java.lang.String receiverMobilePhone) {
        this.receiverMobilePhone = receiverMobilePhone;
    }


    /**
     * Gets the marketingOptIn value for this FormFreeReceiveLookupResponse.
     * 
     * @return marketingOptIn
     */
    public java.lang.Boolean getMarketingOptIn() {
        return marketingOptIn;
    }


    /**
     * Sets the marketingOptIn value for this FormFreeReceiveLookupResponse.
     * 
     * @param marketingOptIn
     */
    public void setMarketingOptIn(java.lang.Boolean marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
    }


    /**
     * Gets the thirdPartyPhotoIdType value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyPhotoIdType
     */
    public com.mgipaypal.ac1211.client.PhotoIdType getThirdPartyPhotoIdType() {
        return thirdPartyPhotoIdType;
    }


    /**
     * Sets the thirdPartyPhotoIdType value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyPhotoIdType
     */
    public void setThirdPartyPhotoIdType(com.mgipaypal.ac1211.client.PhotoIdType thirdPartyPhotoIdType) {
        this.thirdPartyPhotoIdType = thirdPartyPhotoIdType;
    }


    /**
     * Gets the thirdPartyPhotoIdNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyPhotoIdNumber
     */
    public java.lang.String getThirdPartyPhotoIdNumber() {
        return thirdPartyPhotoIdNumber;
    }


    /**
     * Sets the thirdPartyPhotoIdNumber value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyPhotoIdNumber
     */
    public void setThirdPartyPhotoIdNumber(java.lang.String thirdPartyPhotoIdNumber) {
        this.thirdPartyPhotoIdNumber = thirdPartyPhotoIdNumber;
    }


    /**
     * Gets the thirdPartyPhotoIdExpDate value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyPhotoIdExpDate
     */
    public java.util.Date getThirdPartyPhotoIdExpDate() {
        return thirdPartyPhotoIdExpDate;
    }


    /**
     * Sets the thirdPartyPhotoIdExpDate value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyPhotoIdExpDate
     */
    public void setThirdPartyPhotoIdExpDate(java.util.Date thirdPartyPhotoIdExpDate) {
        this.thirdPartyPhotoIdExpDate = thirdPartyPhotoIdExpDate;
    }


    /**
     * Gets the thirdPartyPhotoIdIssueDate value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyPhotoIdIssueDate
     */
    public java.util.Date getThirdPartyPhotoIdIssueDate() {
        return thirdPartyPhotoIdIssueDate;
    }


    /**
     * Sets the thirdPartyPhotoIdIssueDate value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyPhotoIdIssueDate
     */
    public void setThirdPartyPhotoIdIssueDate(java.util.Date thirdPartyPhotoIdIssueDate) {
        this.thirdPartyPhotoIdIssueDate = thirdPartyPhotoIdIssueDate;
    }


    /**
     * Gets the thirdPartyPhotoIdIssueCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyPhotoIdIssueCountry
     */
    public java.lang.String getThirdPartyPhotoIdIssueCountry() {
        return thirdPartyPhotoIdIssueCountry;
    }


    /**
     * Sets the thirdPartyPhotoIdIssueCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyPhotoIdIssueCountry
     */
    public void setThirdPartyPhotoIdIssueCountry(java.lang.String thirdPartyPhotoIdIssueCountry) {
        this.thirdPartyPhotoIdIssueCountry = thirdPartyPhotoIdIssueCountry;
    }


    /**
     * Gets the thirdPartyPhotoIdStored value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyPhotoIdStored
     */
    public java.lang.Boolean getThirdPartyPhotoIdStored() {
        return thirdPartyPhotoIdStored;
    }


    /**
     * Sets the thirdPartyPhotoIdStored value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyPhotoIdStored
     */
    public void setThirdPartyPhotoIdStored(java.lang.Boolean thirdPartyPhotoIdStored) {
        this.thirdPartyPhotoIdStored = thirdPartyPhotoIdStored;
    }


    /**
     * Gets the thirdPartyLegalIdExpDate value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyLegalIdExpDate
     */
    public java.util.Date getThirdPartyLegalIdExpDate() {
        return thirdPartyLegalIdExpDate;
    }


    /**
     * Sets the thirdPartyLegalIdExpDate value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyLegalIdExpDate
     */
    public void setThirdPartyLegalIdExpDate(java.util.Date thirdPartyLegalIdExpDate) {
        this.thirdPartyLegalIdExpDate = thirdPartyLegalIdExpDate;
    }


    /**
     * Gets the thirdPartyLegalIdIssueDate value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyLegalIdIssueDate
     */
    public java.util.Date getThirdPartyLegalIdIssueDate() {
        return thirdPartyLegalIdIssueDate;
    }


    /**
     * Sets the thirdPartyLegalIdIssueDate value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyLegalIdIssueDate
     */
    public void setThirdPartyLegalIdIssueDate(java.util.Date thirdPartyLegalIdIssueDate) {
        this.thirdPartyLegalIdIssueDate = thirdPartyLegalIdIssueDate;
    }


    /**
     * Gets the thirdPartyLegalIdIssueCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyLegalIdIssueCountry
     */
    public java.lang.String getThirdPartyLegalIdIssueCountry() {
        return thirdPartyLegalIdIssueCountry;
    }


    /**
     * Sets the thirdPartyLegalIdIssueCountry value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyLegalIdIssueCountry
     */
    public void setThirdPartyLegalIdIssueCountry(java.lang.String thirdPartyLegalIdIssueCountry) {
        this.thirdPartyLegalIdIssueCountry = thirdPartyLegalIdIssueCountry;
    }


    /**
     * Gets the thirdPartyLegalIdStored value for this FormFreeReceiveLookupResponse.
     * 
     * @return thirdPartyLegalIdStored
     */
    public java.lang.Boolean getThirdPartyLegalIdStored() {
        return thirdPartyLegalIdStored;
    }


    /**
     * Sets the thirdPartyLegalIdStored value for this FormFreeReceiveLookupResponse.
     * 
     * @param thirdPartyLegalIdStored
     */
    public void setThirdPartyLegalIdStored(java.lang.Boolean thirdPartyLegalIdStored) {
        this.thirdPartyLegalIdStored = thirdPartyLegalIdStored;
    }


    /**
     * Gets the fieldValues value for this FormFreeReceiveLookupResponse.
     * 
     * @return fieldValues
     */
    public com.mgipaypal.ac1211.client.KeyValuePair[] getFieldValues() {
        return fieldValues;
    }


    /**
     * Sets the fieldValues value for this FormFreeReceiveLookupResponse.
     * 
     * @param fieldValues
     */
    public void setFieldValues(com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues) {
        this.fieldValues = fieldValues;
    }


    /**
     * Gets the mgiTransactionSessionID value for this FormFreeReceiveLookupResponse.
     * 
     * @return mgiTransactionSessionID
     */
    public java.lang.String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }


    /**
     * Sets the mgiTransactionSessionID value for this FormFreeReceiveLookupResponse.
     * 
     * @param mgiTransactionSessionID
     */
    public void setMgiTransactionSessionID(java.lang.String mgiTransactionSessionID) {
        this.mgiTransactionSessionID = mgiTransactionSessionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormFreeReceiveLookupResponse)) return false;
        FormFreeReceiveLookupResponse other = (FormFreeReceiveLookupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.receiveAmount==null && other.getReceiveAmount()==null) || 
             (this.receiveAmount!=null &&
              this.receiveAmount.equals(other.getReceiveAmount()))) &&
            ((this.receiveCurrency==null && other.getReceiveCurrency()==null) || 
             (this.receiveCurrency!=null &&
              this.receiveCurrency.equals(other.getReceiveCurrency()))) &&
            ((this.senderFirstName==null && other.getSenderFirstName()==null) || 
             (this.senderFirstName!=null &&
              this.senderFirstName.equals(other.getSenderFirstName()))) &&
            ((this.senderMiddleName==null && other.getSenderMiddleName()==null) || 
             (this.senderMiddleName!=null &&
              this.senderMiddleName.equals(other.getSenderMiddleName()))) &&
            ((this.senderLastName==null && other.getSenderLastName()==null) || 
             (this.senderLastName!=null &&
              this.senderLastName.equals(other.getSenderLastName()))) &&
            ((this.senderLastName2==null && other.getSenderLastName2()==null) || 
             (this.senderLastName2!=null &&
              this.senderLastName2.equals(other.getSenderLastName2()))) &&
            ((this.senderHomePhone==null && other.getSenderHomePhone()==null) || 
             (this.senderHomePhone!=null &&
              this.senderHomePhone.equals(other.getSenderHomePhone()))) &&
            ((this.originatingCountry==null && other.getOriginatingCountry()==null) || 
             (this.originatingCountry!=null &&
              this.originatingCountry.equals(other.getOriginatingCountry()))) &&
            ((this.dateTimeSent==null && other.getDateTimeSent()==null) || 
             (this.dateTimeSent!=null &&
              this.dateTimeSent.equals(other.getDateTimeSent()))) &&
            ((this.receiverFirstName==null && other.getReceiverFirstName()==null) || 
             (this.receiverFirstName!=null &&
              this.receiverFirstName.equals(other.getReceiverFirstName()))) &&
            ((this.receiverMiddleName==null && other.getReceiverMiddleName()==null) || 
             (this.receiverMiddleName!=null &&
              this.receiverMiddleName.equals(other.getReceiverMiddleName()))) &&
            ((this.receiverLastName==null && other.getReceiverLastName()==null) || 
             (this.receiverLastName!=null &&
              this.receiverLastName.equals(other.getReceiverLastName()))) &&
            ((this.receiverLastName2==null && other.getReceiverLastName2()==null) || 
             (this.receiverLastName2!=null &&
              this.receiverLastName2.equals(other.getReceiverLastName2()))) &&
            ((this.receiverAddress==null && other.getReceiverAddress()==null) || 
             (this.receiverAddress!=null &&
              this.receiverAddress.equals(other.getReceiverAddress()))) &&
            ((this.receiverAddress2==null && other.getReceiverAddress2()==null) || 
             (this.receiverAddress2!=null &&
              this.receiverAddress2.equals(other.getReceiverAddress2()))) &&
            ((this.receiverAddress3==null && other.getReceiverAddress3()==null) || 
             (this.receiverAddress3!=null &&
              this.receiverAddress3.equals(other.getReceiverAddress3()))) &&
            ((this.receiverAddress4==null && other.getReceiverAddress4()==null) || 
             (this.receiverAddress4!=null &&
              this.receiverAddress4.equals(other.getReceiverAddress4()))) &&
            ((this.receiverCity==null && other.getReceiverCity()==null) || 
             (this.receiverCity!=null &&
              this.receiverCity.equals(other.getReceiverCity()))) &&
            ((this.receiverState==null && other.getReceiverState()==null) || 
             (this.receiverState!=null &&
              this.receiverState.equals(other.getReceiverState()))) &&
            ((this.receiverZipCode==null && other.getReceiverZipCode()==null) || 
             (this.receiverZipCode!=null &&
              this.receiverZipCode.equals(other.getReceiverZipCode()))) &&
            ((this.messageField1==null && other.getMessageField1()==null) || 
             (this.messageField1!=null &&
              this.messageField1.equals(other.getMessageField1()))) &&
            ((this.messageField2==null && other.getMessageField2()==null) || 
             (this.messageField2!=null &&
              this.messageField2.equals(other.getMessageField2()))) &&
            ((this.receiverPhotoIdType==null && other.getReceiverPhotoIdType()==null) || 
             (this.receiverPhotoIdType!=null &&
              this.receiverPhotoIdType.equals(other.getReceiverPhotoIdType()))) &&
            ((this.receiverPhotoIdNumber==null && other.getReceiverPhotoIdNumber()==null) || 
             (this.receiverPhotoIdNumber!=null &&
              this.receiverPhotoIdNumber.equals(other.getReceiverPhotoIdNumber()))) &&
            ((this.receiverPhotoIdState==null && other.getReceiverPhotoIdState()==null) || 
             (this.receiverPhotoIdState!=null &&
              this.receiverPhotoIdState.equals(other.getReceiverPhotoIdState()))) &&
            ((this.receiverPhotoIdCountry==null && other.getReceiverPhotoIdCountry()==null) || 
             (this.receiverPhotoIdCountry!=null &&
              this.receiverPhotoIdCountry.equals(other.getReceiverPhotoIdCountry()))) &&
            ((this.receiverLegalIdType==null && other.getReceiverLegalIdType()==null) || 
             (this.receiverLegalIdType!=null &&
              this.receiverLegalIdType.equals(other.getReceiverLegalIdType()))) &&
            ((this.receiverLegalIdNumber==null && other.getReceiverLegalIdNumber()==null) || 
             (this.receiverLegalIdNumber!=null &&
              this.receiverLegalIdNumber.equals(other.getReceiverLegalIdNumber()))) &&
            ((this.receiverDOB==null && other.getReceiverDOB()==null) || 
             (this.receiverDOB!=null &&
              this.receiverDOB.equals(other.getReceiverDOB()))) &&
            ((this.receiverOccupation==null && other.getReceiverOccupation()==null) || 
             (this.receiverOccupation!=null &&
              this.receiverOccupation.equals(other.getReceiverOccupation()))) &&
            ((this.thirdPartyFirstName==null && other.getThirdPartyFirstName()==null) || 
             (this.thirdPartyFirstName!=null &&
              this.thirdPartyFirstName.equals(other.getThirdPartyFirstName()))) &&
            ((this.thirdPartyMiddleName==null && other.getThirdPartyMiddleName()==null) || 
             (this.thirdPartyMiddleName!=null &&
              this.thirdPartyMiddleName.equals(other.getThirdPartyMiddleName()))) &&
            ((this.thirdPartyLastName==null && other.getThirdPartyLastName()==null) || 
             (this.thirdPartyLastName!=null &&
              this.thirdPartyLastName.equals(other.getThirdPartyLastName()))) &&
            ((this.thirdPartyLastName2==null && other.getThirdPartyLastName2()==null) || 
             (this.thirdPartyLastName2!=null &&
              this.thirdPartyLastName2.equals(other.getThirdPartyLastName2()))) &&
            ((this.thirdPartyAddress==null && other.getThirdPartyAddress()==null) || 
             (this.thirdPartyAddress!=null &&
              this.thirdPartyAddress.equals(other.getThirdPartyAddress()))) &&
            ((this.thirdPartyAddress2==null && other.getThirdPartyAddress2()==null) || 
             (this.thirdPartyAddress2!=null &&
              this.thirdPartyAddress2.equals(other.getThirdPartyAddress2()))) &&
            ((this.thirdPartyAddress3==null && other.getThirdPartyAddress3()==null) || 
             (this.thirdPartyAddress3!=null &&
              this.thirdPartyAddress3.equals(other.getThirdPartyAddress3()))) &&
            ((this.thirdPartyAddress4==null && other.getThirdPartyAddress4()==null) || 
             (this.thirdPartyAddress4!=null &&
              this.thirdPartyAddress4.equals(other.getThirdPartyAddress4()))) &&
            ((this.thirdPartyCity==null && other.getThirdPartyCity()==null) || 
             (this.thirdPartyCity!=null &&
              this.thirdPartyCity.equals(other.getThirdPartyCity()))) &&
            ((this.thirdPartyState==null && other.getThirdPartyState()==null) || 
             (this.thirdPartyState!=null &&
              this.thirdPartyState.equals(other.getThirdPartyState()))) &&
            ((this.thirdPartyZipCode==null && other.getThirdPartyZipCode()==null) || 
             (this.thirdPartyZipCode!=null &&
              this.thirdPartyZipCode.equals(other.getThirdPartyZipCode()))) &&
            ((this.thirdPartyCountry==null && other.getThirdPartyCountry()==null) || 
             (this.thirdPartyCountry!=null &&
              this.thirdPartyCountry.equals(other.getThirdPartyCountry()))) &&
            ((this.thirdPartyLegalIdType==null && other.getThirdPartyLegalIdType()==null) || 
             (this.thirdPartyLegalIdType!=null &&
              this.thirdPartyLegalIdType.equals(other.getThirdPartyLegalIdType()))) &&
            ((this.thirdPartyLegalIdNumber==null && other.getThirdPartyLegalIdNumber()==null) || 
             (this.thirdPartyLegalIdNumber!=null &&
              this.thirdPartyLegalIdNumber.equals(other.getThirdPartyLegalIdNumber()))) &&
            ((this.thirdPartyDOB==null && other.getThirdPartyDOB()==null) || 
             (this.thirdPartyDOB!=null &&
              this.thirdPartyDOB.equals(other.getThirdPartyDOB()))) &&
            ((this.thirdPartyOccupation==null && other.getThirdPartyOccupation()==null) || 
             (this.thirdPartyOccupation!=null &&
              this.thirdPartyOccupation.equals(other.getThirdPartyOccupation()))) &&
            ((this.thirdPartyOrg==null && other.getThirdPartyOrg()==null) || 
             (this.thirdPartyOrg!=null &&
              this.thirdPartyOrg.equals(other.getThirdPartyOrg()))) &&
            ((this.receiverBirthCity==null && other.getReceiverBirthCity()==null) || 
             (this.receiverBirthCity!=null &&
              this.receiverBirthCity.equals(other.getReceiverBirthCity()))) &&
            ((this.receiverBirthCountry==null && other.getReceiverBirthCountry()==null) || 
             (this.receiverBirthCountry!=null &&
              this.receiverBirthCountry.equals(other.getReceiverBirthCountry()))) &&
            ((this.receiverPassportIssueDate==null && other.getReceiverPassportIssueDate()==null) || 
             (this.receiverPassportIssueDate!=null &&
              this.receiverPassportIssueDate.equals(other.getReceiverPassportIssueDate()))) &&
            ((this.receiverPassportIssueCity==null && other.getReceiverPassportIssueCity()==null) || 
             (this.receiverPassportIssueCity!=null &&
              this.receiverPassportIssueCity.equals(other.getReceiverPassportIssueCity()))) &&
            ((this.receiverPassportIssueCountry==null && other.getReceiverPassportIssueCountry()==null) || 
             (this.receiverPassportIssueCountry!=null &&
              this.receiverPassportIssueCountry.equals(other.getReceiverPassportIssueCountry()))) &&
            ((this.consumerId==null && other.getConsumerId()==null) || 
             (this.consumerId!=null &&
              this.consumerId.equals(other.getConsumerId()))) &&
            ((this.freqCustCardNumber==null && other.getFreqCustCardNumber()==null) || 
             (this.freqCustCardNumber!=null &&
              this.freqCustCardNumber.equals(other.getFreqCustCardNumber()))) &&
            ((this.receiverPhone==null && other.getReceiverPhone()==null) || 
             (this.receiverPhone!=null &&
              this.receiverPhone.equals(other.getReceiverPhone()))) &&
            ((this.receiverPhotoIdExpDate==null && other.getReceiverPhotoIdExpDate()==null) || 
             (this.receiverPhotoIdExpDate!=null &&
              this.receiverPhotoIdExpDate.equals(other.getReceiverPhotoIdExpDate()))) &&
            ((this.receiverPhotoIdIssueDate==null && other.getReceiverPhotoIdIssueDate()==null) || 
             (this.receiverPhotoIdIssueDate!=null &&
              this.receiverPhotoIdIssueDate.equals(other.getReceiverPhotoIdIssueDate()))) &&
            ((this.receiverPhotoIdStored==null && other.getReceiverPhotoIdStored()==null) || 
             (this.receiverPhotoIdStored!=null &&
              this.receiverPhotoIdStored.equals(other.getReceiverPhotoIdStored()))) &&
            ((this.receiverLegalIdExpDate==null && other.getReceiverLegalIdExpDate()==null) || 
             (this.receiverLegalIdExpDate!=null &&
              this.receiverLegalIdExpDate.equals(other.getReceiverLegalIdExpDate()))) &&
            ((this.receiverLegalIdIssueDate==null && other.getReceiverLegalIdIssueDate()==null) || 
             (this.receiverLegalIdIssueDate!=null &&
              this.receiverLegalIdIssueDate.equals(other.getReceiverLegalIdIssueDate()))) &&
            ((this.receiverLegalIdIssueCountry==null && other.getReceiverLegalIdIssueCountry()==null) || 
             (this.receiverLegalIdIssueCountry!=null &&
              this.receiverLegalIdIssueCountry.equals(other.getReceiverLegalIdIssueCountry()))) &&
            ((this.receiverLegalIdStored==null && other.getReceiverLegalIdStored()==null) || 
             (this.receiverLegalIdStored!=null &&
              this.receiverLegalIdStored.equals(other.getReceiverLegalIdStored()))) &&
            ((this.receiverPassportNumber==null && other.getReceiverPassportNumber()==null) || 
             (this.receiverPassportNumber!=null &&
              this.receiverPassportNumber.equals(other.getReceiverPassportNumber()))) &&
            ((this.receiverPassportExpDate==null && other.getReceiverPassportExpDate()==null) || 
             (this.receiverPassportExpDate!=null &&
              this.receiverPassportExpDate.equals(other.getReceiverPassportExpDate()))) &&
            ((this.receiverPassportStored==null && other.getReceiverPassportStored()==null) || 
             (this.receiverPassportStored!=null &&
              this.receiverPassportStored.equals(other.getReceiverPassportStored()))) &&
            ((this.receiverNationalityCountry==null && other.getReceiverNationalityCountry()==null) || 
             (this.receiverNationalityCountry!=null &&
              this.receiverNationalityCountry.equals(other.getReceiverNationalityCountry()))) &&
            ((this.receiverNationalityAtBirthCountry==null && other.getReceiverNationalityAtBirthCountry()==null) || 
             (this.receiverNationalityAtBirthCountry!=null &&
              this.receiverNationalityAtBirthCountry.equals(other.getReceiverNationalityAtBirthCountry()))) &&
            ((this.additionalDocumentationNeeded==null && other.getAdditionalDocumentationNeeded()==null) || 
             (this.additionalDocumentationNeeded!=null &&
              this.additionalDocumentationNeeded.equals(other.getAdditionalDocumentationNeeded()))) &&
            ((this.purposeOfTransaction==null && other.getPurposeOfTransaction()==null) || 
             (this.purposeOfTransaction!=null &&
              this.purposeOfTransaction.equals(other.getPurposeOfTransaction()))) &&
            ((this.relationToSender==null && other.getRelationToSender()==null) || 
             (this.relationToSender!=null &&
              this.relationToSender.equals(other.getRelationToSender()))) &&
            ((this.receiverEmailAddress==null && other.getReceiverEmailAddress()==null) || 
             (this.receiverEmailAddress!=null &&
              this.receiverEmailAddress.equals(other.getReceiverEmailAddress()))) &&
            ((this.receiverMobilePhone==null && other.getReceiverMobilePhone()==null) || 
             (this.receiverMobilePhone!=null &&
              this.receiverMobilePhone.equals(other.getReceiverMobilePhone()))) &&
            ((this.marketingOptIn==null && other.getMarketingOptIn()==null) || 
             (this.marketingOptIn!=null &&
              this.marketingOptIn.equals(other.getMarketingOptIn()))) &&
            ((this.thirdPartyPhotoIdType==null && other.getThirdPartyPhotoIdType()==null) || 
             (this.thirdPartyPhotoIdType!=null &&
              this.thirdPartyPhotoIdType.equals(other.getThirdPartyPhotoIdType()))) &&
            ((this.thirdPartyPhotoIdNumber==null && other.getThirdPartyPhotoIdNumber()==null) || 
             (this.thirdPartyPhotoIdNumber!=null &&
              this.thirdPartyPhotoIdNumber.equals(other.getThirdPartyPhotoIdNumber()))) &&
            ((this.thirdPartyPhotoIdExpDate==null && other.getThirdPartyPhotoIdExpDate()==null) || 
             (this.thirdPartyPhotoIdExpDate!=null &&
              this.thirdPartyPhotoIdExpDate.equals(other.getThirdPartyPhotoIdExpDate()))) &&
            ((this.thirdPartyPhotoIdIssueDate==null && other.getThirdPartyPhotoIdIssueDate()==null) || 
             (this.thirdPartyPhotoIdIssueDate!=null &&
              this.thirdPartyPhotoIdIssueDate.equals(other.getThirdPartyPhotoIdIssueDate()))) &&
            ((this.thirdPartyPhotoIdIssueCountry==null && other.getThirdPartyPhotoIdIssueCountry()==null) || 
             (this.thirdPartyPhotoIdIssueCountry!=null &&
              this.thirdPartyPhotoIdIssueCountry.equals(other.getThirdPartyPhotoIdIssueCountry()))) &&
            ((this.thirdPartyPhotoIdStored==null && other.getThirdPartyPhotoIdStored()==null) || 
             (this.thirdPartyPhotoIdStored!=null &&
              this.thirdPartyPhotoIdStored.equals(other.getThirdPartyPhotoIdStored()))) &&
            ((this.thirdPartyLegalIdExpDate==null && other.getThirdPartyLegalIdExpDate()==null) || 
             (this.thirdPartyLegalIdExpDate!=null &&
              this.thirdPartyLegalIdExpDate.equals(other.getThirdPartyLegalIdExpDate()))) &&
            ((this.thirdPartyLegalIdIssueDate==null && other.getThirdPartyLegalIdIssueDate()==null) || 
             (this.thirdPartyLegalIdIssueDate!=null &&
              this.thirdPartyLegalIdIssueDate.equals(other.getThirdPartyLegalIdIssueDate()))) &&
            ((this.thirdPartyLegalIdIssueCountry==null && other.getThirdPartyLegalIdIssueCountry()==null) || 
             (this.thirdPartyLegalIdIssueCountry!=null &&
              this.thirdPartyLegalIdIssueCountry.equals(other.getThirdPartyLegalIdIssueCountry()))) &&
            ((this.thirdPartyLegalIdStored==null && other.getThirdPartyLegalIdStored()==null) || 
             (this.thirdPartyLegalIdStored!=null &&
              this.thirdPartyLegalIdStored.equals(other.getThirdPartyLegalIdStored()))) &&
            ((this.fieldValues==null && other.getFieldValues()==null) || 
             (this.fieldValues!=null &&
              java.util.Arrays.equals(this.fieldValues, other.getFieldValues()))) &&
            ((this.mgiTransactionSessionID==null && other.getMgiTransactionSessionID()==null) || 
             (this.mgiTransactionSessionID!=null &&
              this.mgiTransactionSessionID.equals(other.getMgiTransactionSessionID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getReceiveAmount() != null) {
            _hashCode += getReceiveAmount().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        if (getSenderFirstName() != null) {
            _hashCode += getSenderFirstName().hashCode();
        }
        if (getSenderMiddleName() != null) {
            _hashCode += getSenderMiddleName().hashCode();
        }
        if (getSenderLastName() != null) {
            _hashCode += getSenderLastName().hashCode();
        }
        if (getSenderLastName2() != null) {
            _hashCode += getSenderLastName2().hashCode();
        }
        if (getSenderHomePhone() != null) {
            _hashCode += getSenderHomePhone().hashCode();
        }
        if (getOriginatingCountry() != null) {
            _hashCode += getOriginatingCountry().hashCode();
        }
        if (getDateTimeSent() != null) {
            _hashCode += getDateTimeSent().hashCode();
        }
        if (getReceiverFirstName() != null) {
            _hashCode += getReceiverFirstName().hashCode();
        }
        if (getReceiverMiddleName() != null) {
            _hashCode += getReceiverMiddleName().hashCode();
        }
        if (getReceiverLastName() != null) {
            _hashCode += getReceiverLastName().hashCode();
        }
        if (getReceiverLastName2() != null) {
            _hashCode += getReceiverLastName2().hashCode();
        }
        if (getReceiverAddress() != null) {
            _hashCode += getReceiverAddress().hashCode();
        }
        if (getReceiverAddress2() != null) {
            _hashCode += getReceiverAddress2().hashCode();
        }
        if (getReceiverAddress3() != null) {
            _hashCode += getReceiverAddress3().hashCode();
        }
        if (getReceiverAddress4() != null) {
            _hashCode += getReceiverAddress4().hashCode();
        }
        if (getReceiverCity() != null) {
            _hashCode += getReceiverCity().hashCode();
        }
        if (getReceiverState() != null) {
            _hashCode += getReceiverState().hashCode();
        }
        if (getReceiverZipCode() != null) {
            _hashCode += getReceiverZipCode().hashCode();
        }
        if (getMessageField1() != null) {
            _hashCode += getMessageField1().hashCode();
        }
        if (getMessageField2() != null) {
            _hashCode += getMessageField2().hashCode();
        }
        if (getReceiverPhotoIdType() != null) {
            _hashCode += getReceiverPhotoIdType().hashCode();
        }
        if (getReceiverPhotoIdNumber() != null) {
            _hashCode += getReceiverPhotoIdNumber().hashCode();
        }
        if (getReceiverPhotoIdState() != null) {
            _hashCode += getReceiverPhotoIdState().hashCode();
        }
        if (getReceiverPhotoIdCountry() != null) {
            _hashCode += getReceiverPhotoIdCountry().hashCode();
        }
        if (getReceiverLegalIdType() != null) {
            _hashCode += getReceiverLegalIdType().hashCode();
        }
        if (getReceiverLegalIdNumber() != null) {
            _hashCode += getReceiverLegalIdNumber().hashCode();
        }
        if (getReceiverDOB() != null) {
            _hashCode += getReceiverDOB().hashCode();
        }
        if (getReceiverOccupation() != null) {
            _hashCode += getReceiverOccupation().hashCode();
        }
        if (getThirdPartyFirstName() != null) {
            _hashCode += getThirdPartyFirstName().hashCode();
        }
        if (getThirdPartyMiddleName() != null) {
            _hashCode += getThirdPartyMiddleName().hashCode();
        }
        if (getThirdPartyLastName() != null) {
            _hashCode += getThirdPartyLastName().hashCode();
        }
        if (getThirdPartyLastName2() != null) {
            _hashCode += getThirdPartyLastName2().hashCode();
        }
        if (getThirdPartyAddress() != null) {
            _hashCode += getThirdPartyAddress().hashCode();
        }
        if (getThirdPartyAddress2() != null) {
            _hashCode += getThirdPartyAddress2().hashCode();
        }
        if (getThirdPartyAddress3() != null) {
            _hashCode += getThirdPartyAddress3().hashCode();
        }
        if (getThirdPartyAddress4() != null) {
            _hashCode += getThirdPartyAddress4().hashCode();
        }
        if (getThirdPartyCity() != null) {
            _hashCode += getThirdPartyCity().hashCode();
        }
        if (getThirdPartyState() != null) {
            _hashCode += getThirdPartyState().hashCode();
        }
        if (getThirdPartyZipCode() != null) {
            _hashCode += getThirdPartyZipCode().hashCode();
        }
        if (getThirdPartyCountry() != null) {
            _hashCode += getThirdPartyCountry().hashCode();
        }
        if (getThirdPartyLegalIdType() != null) {
            _hashCode += getThirdPartyLegalIdType().hashCode();
        }
        if (getThirdPartyLegalIdNumber() != null) {
            _hashCode += getThirdPartyLegalIdNumber().hashCode();
        }
        if (getThirdPartyDOB() != null) {
            _hashCode += getThirdPartyDOB().hashCode();
        }
        if (getThirdPartyOccupation() != null) {
            _hashCode += getThirdPartyOccupation().hashCode();
        }
        if (getThirdPartyOrg() != null) {
            _hashCode += getThirdPartyOrg().hashCode();
        }
        if (getReceiverBirthCity() != null) {
            _hashCode += getReceiverBirthCity().hashCode();
        }
        if (getReceiverBirthCountry() != null) {
            _hashCode += getReceiverBirthCountry().hashCode();
        }
        if (getReceiverPassportIssueDate() != null) {
            _hashCode += getReceiverPassportIssueDate().hashCode();
        }
        if (getReceiverPassportIssueCity() != null) {
            _hashCode += getReceiverPassportIssueCity().hashCode();
        }
        if (getReceiverPassportIssueCountry() != null) {
            _hashCode += getReceiverPassportIssueCountry().hashCode();
        }
        if (getConsumerId() != null) {
            _hashCode += getConsumerId().hashCode();
        }
        if (getFreqCustCardNumber() != null) {
            _hashCode += getFreqCustCardNumber().hashCode();
        }
        if (getReceiverPhone() != null) {
            _hashCode += getReceiverPhone().hashCode();
        }
        if (getReceiverPhotoIdExpDate() != null) {
            _hashCode += getReceiverPhotoIdExpDate().hashCode();
        }
        if (getReceiverPhotoIdIssueDate() != null) {
            _hashCode += getReceiverPhotoIdIssueDate().hashCode();
        }
        if (getReceiverPhotoIdStored() != null) {
            _hashCode += getReceiverPhotoIdStored().hashCode();
        }
        if (getReceiverLegalIdExpDate() != null) {
            _hashCode += getReceiverLegalIdExpDate().hashCode();
        }
        if (getReceiverLegalIdIssueDate() != null) {
            _hashCode += getReceiverLegalIdIssueDate().hashCode();
        }
        if (getReceiverLegalIdIssueCountry() != null) {
            _hashCode += getReceiverLegalIdIssueCountry().hashCode();
        }
        if (getReceiverLegalIdStored() != null) {
            _hashCode += getReceiverLegalIdStored().hashCode();
        }
        if (getReceiverPassportNumber() != null) {
            _hashCode += getReceiverPassportNumber().hashCode();
        }
        if (getReceiverPassportExpDate() != null) {
            _hashCode += getReceiverPassportExpDate().hashCode();
        }
        if (getReceiverPassportStored() != null) {
            _hashCode += getReceiverPassportStored().hashCode();
        }
        if (getReceiverNationalityCountry() != null) {
            _hashCode += getReceiverNationalityCountry().hashCode();
        }
        if (getReceiverNationalityAtBirthCountry() != null) {
            _hashCode += getReceiverNationalityAtBirthCountry().hashCode();
        }
        if (getAdditionalDocumentationNeeded() != null) {
            _hashCode += getAdditionalDocumentationNeeded().hashCode();
        }
        if (getPurposeOfTransaction() != null) {
            _hashCode += getPurposeOfTransaction().hashCode();
        }
        if (getRelationToSender() != null) {
            _hashCode += getRelationToSender().hashCode();
        }
        if (getReceiverEmailAddress() != null) {
            _hashCode += getReceiverEmailAddress().hashCode();
        }
        if (getReceiverMobilePhone() != null) {
            _hashCode += getReceiverMobilePhone().hashCode();
        }
        if (getMarketingOptIn() != null) {
            _hashCode += getMarketingOptIn().hashCode();
        }
        if (getThirdPartyPhotoIdType() != null) {
            _hashCode += getThirdPartyPhotoIdType().hashCode();
        }
        if (getThirdPartyPhotoIdNumber() != null) {
            _hashCode += getThirdPartyPhotoIdNumber().hashCode();
        }
        if (getThirdPartyPhotoIdExpDate() != null) {
            _hashCode += getThirdPartyPhotoIdExpDate().hashCode();
        }
        if (getThirdPartyPhotoIdIssueDate() != null) {
            _hashCode += getThirdPartyPhotoIdIssueDate().hashCode();
        }
        if (getThirdPartyPhotoIdIssueCountry() != null) {
            _hashCode += getThirdPartyPhotoIdIssueCountry().hashCode();
        }
        if (getThirdPartyPhotoIdStored() != null) {
            _hashCode += getThirdPartyPhotoIdStored().hashCode();
        }
        if (getThirdPartyLegalIdExpDate() != null) {
            _hashCode += getThirdPartyLegalIdExpDate().hashCode();
        }
        if (getThirdPartyLegalIdIssueDate() != null) {
            _hashCode += getThirdPartyLegalIdIssueDate().hashCode();
        }
        if (getThirdPartyLegalIdIssueCountry() != null) {
            _hashCode += getThirdPartyLegalIdIssueCountry().hashCode();
        }
        if (getThirdPartyLegalIdStored() != null) {
            _hashCode += getThirdPartyLegalIdStored().hashCode();
        }
        if (getFieldValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMgiTransactionSessionID() != null) {
            _hashCode += getMgiTransactionSessionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormFreeReceiveLookupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeReceiveLookupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderMiddleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderMiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderLastName2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderLastName2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderHomePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderHomePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "originatingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeSent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dateTimeSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverMiddleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverMiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLastName2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverLastName2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverAddress4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverAddress4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageField1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "messageField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageField2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "messageField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhotoIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPhotoIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "photoIdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhotoIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPhotoIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhotoIdState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPhotoIdState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhotoIdCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPhotoIdCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLegalIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverLegalIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "legalIdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLegalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverLegalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverDOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverDOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverOccupation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverOccupation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyMiddleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyMiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyLastName2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyLastName2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAddress4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyAddress4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyLegalIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyLegalIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "legalIdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyLegalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyLegalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyDOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyDOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyOccupation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyOccupation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyOrg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyOrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverBirthCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverBirthCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverBirthCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverBirthCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPassportIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPassportIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPassportIssueCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPassportIssueCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPassportIssueCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPassportIssueCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freqCustCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "freqCustCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhotoIdExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPhotoIdExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhotoIdIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPhotoIdIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhotoIdStored");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPhotoIdStored"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLegalIdExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverLegalIdExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLegalIdIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverLegalIdIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLegalIdIssueCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverLegalIdIssueCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLegalIdStored");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverLegalIdStored"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPassportNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPassportNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPassportExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPassportExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPassportStored");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPassportStored"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverNationalityCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverNationalityCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverNationalityAtBirthCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverNationalityAtBirthCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalDocumentationNeeded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "additionalDocumentationNeeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purposeOfTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "purposeOfTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationToSender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "relationToSender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverMobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverMobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingOptIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "marketingOptIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyPhotoIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyPhotoIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "photoIdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyPhotoIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyPhotoIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyPhotoIdExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyPhotoIdExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyPhotoIdIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyPhotoIdIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyPhotoIdIssueCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyPhotoIdIssueCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyPhotoIdStored");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyPhotoIdStored"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyLegalIdExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyLegalIdExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyLegalIdIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyLegalIdIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyLegalIdIssueCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyLegalIdIssueCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyLegalIdStored");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyLegalIdStored"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "KeyValuePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "keyValuePair"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgiTransactionSessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgiTransactionSessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
