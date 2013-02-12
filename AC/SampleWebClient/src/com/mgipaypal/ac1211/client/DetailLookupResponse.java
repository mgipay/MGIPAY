/**
 * DetailLookupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class DetailLookupResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String mgiTransactionSessionID;

    private com.mgipaypal.ac1211.client.TransactionStatus transactionStatus;

    private java.util.Calendar dateTimeSent;

    private java.lang.String referenceNumber;

    private java.lang.String freqCustCardNumber;

    private java.lang.String receiveCountry;

    private java.lang.String deliveryOption;

    private java.lang.String senderFirstName;

    private java.lang.String senderMiddleName;

    private java.lang.String senderLastName;

    private java.lang.String senderAddress;

    private java.lang.String senderAddress2;

    private java.lang.String senderAddress3;

    private java.lang.String senderCity;

    private java.lang.String senderState;

    private java.lang.String senderZipCode;

    private java.lang.String senderCountry;

    private java.lang.String senderHomePhone;

    private java.lang.String receiverFirstName;

    private java.lang.String receiverMiddleName;

    private java.lang.String receiverLastName;

    private java.lang.String receiverLastName2;

    private java.lang.String receiverAddress;

    private java.lang.String receiverAddress2;

    private java.lang.String receiverAddress3;

    private java.lang.String receiverCity;

    private java.lang.String receiverState;

    private java.lang.String receiverZipCode;

    private java.lang.String receiverCountry;

    private java.lang.String receiverPhone;

    private java.lang.String direction1;

    private java.lang.String direction2;

    private java.lang.String direction3;

    private java.lang.String testQuestion;

    private java.lang.String testAnswer;

    private java.lang.String messageField1;

    private java.lang.String messageField2;

    private com.mgipaypal.ac1211.client.PhotoIdType senderPhotoIdType;

    private java.lang.String senderPhotoIdNumber;

    private java.lang.String senderPhotoIdState;

    private java.lang.String senderPhotoIdCountry;

    private com.mgipaypal.ac1211.client.LegalIdType senderLegalIdType;

    private java.lang.String senderLegalIdNumber;

    private java.util.Date senderDOB;

    private java.lang.String senderOccupation;

    private java.lang.String thirdPartyFirstName;

    private java.lang.String thirdPartyMiddleName;

    private java.lang.String thirdPartyLastName;

    private java.lang.String thirdPartyAddress;

    private java.lang.String thirdPartyAddress2;

    private java.lang.String thirdPartyAddress3;

    private java.lang.String thirdPartyCity;

    private java.lang.String thirdPartyState;

    private java.lang.String thirdPartyCountry;

    private java.lang.String thirdPartyZipCode;

    private java.util.Date thirdPartyDOB;

    private com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType;

    private java.lang.String thirdPartyLegalIdNumber;

    private java.lang.String thirdPartyOccupation;

    private java.lang.String thirdPartyOrg;

    private java.lang.String senderBirthCity;

    private java.lang.String senderBirthCountry;

    private java.util.Date senderPassportIssueDate;

    private java.lang.String senderPassportIssueCity;

    private java.lang.String senderPassportIssueCountry;

    private java.lang.String operatorName;

    private java.lang.Boolean validIndicator;

    private java.lang.String agentUseSendData;

    private java.lang.String customerReceiveNumber;

    private java.lang.String receiveAgentID;

    private java.lang.String receiveAgentName;

    private java.lang.String receiveAgentAbbreviation;

    private java.util.Date expectedDateOfDelivery;

    private java.lang.Boolean redirectIndicator;

    private com.mgipaypal.ac1211.client.RedirectInfo redirectInfo;

    private java.lang.String agentCheckAuthorizationNumber;

    private java.lang.String accountNickname;

    private com.mgipaypal.ac1211.client.PromotionInfo[] promotionInfo;

    private com.mgipaypal.ac1211.client.TextTranslation[] disclosureText;

    private java.lang.Boolean feeRefundRequired;

    private com.mgipaypal.ac1211.client.SendAmountInfo sendAmounts;

    private com.mgipaypal.ac1211.client.ReceiveAmountInfo receiveAmounts;

    private java.math.BigDecimal exchangeRateApplied;

    public DetailLookupResponse() {
    }

    public DetailLookupResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String mgiTransactionSessionID,
           com.mgipaypal.ac1211.client.TransactionStatus transactionStatus,
           java.util.Calendar dateTimeSent,
           java.lang.String referenceNumber,
           java.lang.String freqCustCardNumber,
           java.lang.String receiveCountry,
           java.lang.String deliveryOption,
           java.lang.String senderFirstName,
           java.lang.String senderMiddleName,
           java.lang.String senderLastName,
           java.lang.String senderAddress,
           java.lang.String senderAddress2,
           java.lang.String senderAddress3,
           java.lang.String senderCity,
           java.lang.String senderState,
           java.lang.String senderZipCode,
           java.lang.String senderCountry,
           java.lang.String senderHomePhone,
           java.lang.String receiverFirstName,
           java.lang.String receiverMiddleName,
           java.lang.String receiverLastName,
           java.lang.String receiverLastName2,
           java.lang.String receiverAddress,
           java.lang.String receiverAddress2,
           java.lang.String receiverAddress3,
           java.lang.String receiverCity,
           java.lang.String receiverState,
           java.lang.String receiverZipCode,
           java.lang.String receiverCountry,
           java.lang.String receiverPhone,
           java.lang.String direction1,
           java.lang.String direction2,
           java.lang.String direction3,
           java.lang.String testQuestion,
           java.lang.String testAnswer,
           java.lang.String messageField1,
           java.lang.String messageField2,
           com.mgipaypal.ac1211.client.PhotoIdType senderPhotoIdType,
           java.lang.String senderPhotoIdNumber,
           java.lang.String senderPhotoIdState,
           java.lang.String senderPhotoIdCountry,
           com.mgipaypal.ac1211.client.LegalIdType senderLegalIdType,
           java.lang.String senderLegalIdNumber,
           java.util.Date senderDOB,
           java.lang.String senderOccupation,
           java.lang.String thirdPartyFirstName,
           java.lang.String thirdPartyMiddleName,
           java.lang.String thirdPartyLastName,
           java.lang.String thirdPartyAddress,
           java.lang.String thirdPartyAddress2,
           java.lang.String thirdPartyAddress3,
           java.lang.String thirdPartyCity,
           java.lang.String thirdPartyState,
           java.lang.String thirdPartyCountry,
           java.lang.String thirdPartyZipCode,
           java.util.Date thirdPartyDOB,
           com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType,
           java.lang.String thirdPartyLegalIdNumber,
           java.lang.String thirdPartyOccupation,
           java.lang.String thirdPartyOrg,
           java.lang.String senderBirthCity,
           java.lang.String senderBirthCountry,
           java.util.Date senderPassportIssueDate,
           java.lang.String senderPassportIssueCity,
           java.lang.String senderPassportIssueCountry,
           java.lang.String operatorName,
           java.lang.Boolean validIndicator,
           java.lang.String agentUseSendData,
           java.lang.String customerReceiveNumber,
           java.lang.String receiveAgentID,
           java.lang.String receiveAgentName,
           java.lang.String receiveAgentAbbreviation,
           java.util.Date expectedDateOfDelivery,
           java.lang.Boolean redirectIndicator,
           com.mgipaypal.ac1211.client.RedirectInfo redirectInfo,
           java.lang.String agentCheckAuthorizationNumber,
           java.lang.String accountNickname,
           com.mgipaypal.ac1211.client.PromotionInfo[] promotionInfo,
           com.mgipaypal.ac1211.client.TextTranslation[] disclosureText,
           java.lang.Boolean feeRefundRequired,
           com.mgipaypal.ac1211.client.SendAmountInfo sendAmounts,
           com.mgipaypal.ac1211.client.ReceiveAmountInfo receiveAmounts,
           java.math.BigDecimal exchangeRateApplied) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.mgiTransactionSessionID = mgiTransactionSessionID;
        this.transactionStatus = transactionStatus;
        this.dateTimeSent = dateTimeSent;
        this.referenceNumber = referenceNumber;
        this.freqCustCardNumber = freqCustCardNumber;
        this.receiveCountry = receiveCountry;
        this.deliveryOption = deliveryOption;
        this.senderFirstName = senderFirstName;
        this.senderMiddleName = senderMiddleName;
        this.senderLastName = senderLastName;
        this.senderAddress = senderAddress;
        this.senderAddress2 = senderAddress2;
        this.senderAddress3 = senderAddress3;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZipCode = senderZipCode;
        this.senderCountry = senderCountry;
        this.senderHomePhone = senderHomePhone;
        this.receiverFirstName = receiverFirstName;
        this.receiverMiddleName = receiverMiddleName;
        this.receiverLastName = receiverLastName;
        this.receiverLastName2 = receiverLastName2;
        this.receiverAddress = receiverAddress;
        this.receiverAddress2 = receiverAddress2;
        this.receiverAddress3 = receiverAddress3;
        this.receiverCity = receiverCity;
        this.receiverState = receiverState;
        this.receiverZipCode = receiverZipCode;
        this.receiverCountry = receiverCountry;
        this.receiverPhone = receiverPhone;
        this.direction1 = direction1;
        this.direction2 = direction2;
        this.direction3 = direction3;
        this.testQuestion = testQuestion;
        this.testAnswer = testAnswer;
        this.messageField1 = messageField1;
        this.messageField2 = messageField2;
        this.senderPhotoIdType = senderPhotoIdType;
        this.senderPhotoIdNumber = senderPhotoIdNumber;
        this.senderPhotoIdState = senderPhotoIdState;
        this.senderPhotoIdCountry = senderPhotoIdCountry;
        this.senderLegalIdType = senderLegalIdType;
        this.senderLegalIdNumber = senderLegalIdNumber;
        this.senderDOB = senderDOB;
        this.senderOccupation = senderOccupation;
        this.thirdPartyFirstName = thirdPartyFirstName;
        this.thirdPartyMiddleName = thirdPartyMiddleName;
        this.thirdPartyLastName = thirdPartyLastName;
        this.thirdPartyAddress = thirdPartyAddress;
        this.thirdPartyAddress2 = thirdPartyAddress2;
        this.thirdPartyAddress3 = thirdPartyAddress3;
        this.thirdPartyCity = thirdPartyCity;
        this.thirdPartyState = thirdPartyState;
        this.thirdPartyCountry = thirdPartyCountry;
        this.thirdPartyZipCode = thirdPartyZipCode;
        this.thirdPartyDOB = thirdPartyDOB;
        this.thirdPartyLegalIdType = thirdPartyLegalIdType;
        this.thirdPartyLegalIdNumber = thirdPartyLegalIdNumber;
        this.thirdPartyOccupation = thirdPartyOccupation;
        this.thirdPartyOrg = thirdPartyOrg;
        this.senderBirthCity = senderBirthCity;
        this.senderBirthCountry = senderBirthCountry;
        this.senderPassportIssueDate = senderPassportIssueDate;
        this.senderPassportIssueCity = senderPassportIssueCity;
        this.senderPassportIssueCountry = senderPassportIssueCountry;
        this.operatorName = operatorName;
        this.validIndicator = validIndicator;
        this.agentUseSendData = agentUseSendData;
        this.customerReceiveNumber = customerReceiveNumber;
        this.receiveAgentID = receiveAgentID;
        this.receiveAgentName = receiveAgentName;
        this.receiveAgentAbbreviation = receiveAgentAbbreviation;
        this.expectedDateOfDelivery = expectedDateOfDelivery;
        this.redirectIndicator = redirectIndicator;
        this.redirectInfo = redirectInfo;
        this.agentCheckAuthorizationNumber = agentCheckAuthorizationNumber;
        this.accountNickname = accountNickname;
        this.promotionInfo = promotionInfo;
        this.disclosureText = disclosureText;
        this.feeRefundRequired = feeRefundRequired;
        this.sendAmounts = sendAmounts;
        this.receiveAmounts = receiveAmounts;
        this.exchangeRateApplied = exchangeRateApplied;
    }


    /**
     * Gets the mgiTransactionSessionID value for this DetailLookupResponse.
     * 
     * @return mgiTransactionSessionID
     */
    public java.lang.String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }


    /**
     * Sets the mgiTransactionSessionID value for this DetailLookupResponse.
     * 
     * @param mgiTransactionSessionID
     */
    public void setMgiTransactionSessionID(java.lang.String mgiTransactionSessionID) {
        this.mgiTransactionSessionID = mgiTransactionSessionID;
    }


    /**
     * Gets the transactionStatus value for this DetailLookupResponse.
     * 
     * @return transactionStatus
     */
    public com.mgipaypal.ac1211.client.TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }


    /**
     * Sets the transactionStatus value for this DetailLookupResponse.
     * 
     * @param transactionStatus
     */
    public void setTransactionStatus(com.mgipaypal.ac1211.client.TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }


    /**
     * Gets the dateTimeSent value for this DetailLookupResponse.
     * 
     * @return dateTimeSent
     */
    public java.util.Calendar getDateTimeSent() {
        return dateTimeSent;
    }


    /**
     * Sets the dateTimeSent value for this DetailLookupResponse.
     * 
     * @param dateTimeSent
     */
    public void setDateTimeSent(java.util.Calendar dateTimeSent) {
        this.dateTimeSent = dateTimeSent;
    }


    /**
     * Gets the referenceNumber value for this DetailLookupResponse.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this DetailLookupResponse.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the freqCustCardNumber value for this DetailLookupResponse.
     * 
     * @return freqCustCardNumber
     */
    public java.lang.String getFreqCustCardNumber() {
        return freqCustCardNumber;
    }


    /**
     * Sets the freqCustCardNumber value for this DetailLookupResponse.
     * 
     * @param freqCustCardNumber
     */
    public void setFreqCustCardNumber(java.lang.String freqCustCardNumber) {
        this.freqCustCardNumber = freqCustCardNumber;
    }


    /**
     * Gets the receiveCountry value for this DetailLookupResponse.
     * 
     * @return receiveCountry
     */
    public java.lang.String getReceiveCountry() {
        return receiveCountry;
    }


    /**
     * Sets the receiveCountry value for this DetailLookupResponse.
     * 
     * @param receiveCountry
     */
    public void setReceiveCountry(java.lang.String receiveCountry) {
        this.receiveCountry = receiveCountry;
    }


    /**
     * Gets the deliveryOption value for this DetailLookupResponse.
     * 
     * @return deliveryOption
     */
    public java.lang.String getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this DetailLookupResponse.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(java.lang.String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the senderFirstName value for this DetailLookupResponse.
     * 
     * @return senderFirstName
     */
    public java.lang.String getSenderFirstName() {
        return senderFirstName;
    }


    /**
     * Sets the senderFirstName value for this DetailLookupResponse.
     * 
     * @param senderFirstName
     */
    public void setSenderFirstName(java.lang.String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }


    /**
     * Gets the senderMiddleName value for this DetailLookupResponse.
     * 
     * @return senderMiddleName
     */
    public java.lang.String getSenderMiddleName() {
        return senderMiddleName;
    }


    /**
     * Sets the senderMiddleName value for this DetailLookupResponse.
     * 
     * @param senderMiddleName
     */
    public void setSenderMiddleName(java.lang.String senderMiddleName) {
        this.senderMiddleName = senderMiddleName;
    }


    /**
     * Gets the senderLastName value for this DetailLookupResponse.
     * 
     * @return senderLastName
     */
    public java.lang.String getSenderLastName() {
        return senderLastName;
    }


    /**
     * Sets the senderLastName value for this DetailLookupResponse.
     * 
     * @param senderLastName
     */
    public void setSenderLastName(java.lang.String senderLastName) {
        this.senderLastName = senderLastName;
    }


    /**
     * Gets the senderAddress value for this DetailLookupResponse.
     * 
     * @return senderAddress
     */
    public java.lang.String getSenderAddress() {
        return senderAddress;
    }


    /**
     * Sets the senderAddress value for this DetailLookupResponse.
     * 
     * @param senderAddress
     */
    public void setSenderAddress(java.lang.String senderAddress) {
        this.senderAddress = senderAddress;
    }


    /**
     * Gets the senderAddress2 value for this DetailLookupResponse.
     * 
     * @return senderAddress2
     */
    public java.lang.String getSenderAddress2() {
        return senderAddress2;
    }


    /**
     * Sets the senderAddress2 value for this DetailLookupResponse.
     * 
     * @param senderAddress2
     */
    public void setSenderAddress2(java.lang.String senderAddress2) {
        this.senderAddress2 = senderAddress2;
    }


    /**
     * Gets the senderAddress3 value for this DetailLookupResponse.
     * 
     * @return senderAddress3
     */
    public java.lang.String getSenderAddress3() {
        return senderAddress3;
    }


    /**
     * Sets the senderAddress3 value for this DetailLookupResponse.
     * 
     * @param senderAddress3
     */
    public void setSenderAddress3(java.lang.String senderAddress3) {
        this.senderAddress3 = senderAddress3;
    }


    /**
     * Gets the senderCity value for this DetailLookupResponse.
     * 
     * @return senderCity
     */
    public java.lang.String getSenderCity() {
        return senderCity;
    }


    /**
     * Sets the senderCity value for this DetailLookupResponse.
     * 
     * @param senderCity
     */
    public void setSenderCity(java.lang.String senderCity) {
        this.senderCity = senderCity;
    }


    /**
     * Gets the senderState value for this DetailLookupResponse.
     * 
     * @return senderState
     */
    public java.lang.String getSenderState() {
        return senderState;
    }


    /**
     * Sets the senderState value for this DetailLookupResponse.
     * 
     * @param senderState
     */
    public void setSenderState(java.lang.String senderState) {
        this.senderState = senderState;
    }


    /**
     * Gets the senderZipCode value for this DetailLookupResponse.
     * 
     * @return senderZipCode
     */
    public java.lang.String getSenderZipCode() {
        return senderZipCode;
    }


    /**
     * Sets the senderZipCode value for this DetailLookupResponse.
     * 
     * @param senderZipCode
     */
    public void setSenderZipCode(java.lang.String senderZipCode) {
        this.senderZipCode = senderZipCode;
    }


    /**
     * Gets the senderCountry value for this DetailLookupResponse.
     * 
     * @return senderCountry
     */
    public java.lang.String getSenderCountry() {
        return senderCountry;
    }


    /**
     * Sets the senderCountry value for this DetailLookupResponse.
     * 
     * @param senderCountry
     */
    public void setSenderCountry(java.lang.String senderCountry) {
        this.senderCountry = senderCountry;
    }


    /**
     * Gets the senderHomePhone value for this DetailLookupResponse.
     * 
     * @return senderHomePhone
     */
    public java.lang.String getSenderHomePhone() {
        return senderHomePhone;
    }


    /**
     * Sets the senderHomePhone value for this DetailLookupResponse.
     * 
     * @param senderHomePhone
     */
    public void setSenderHomePhone(java.lang.String senderHomePhone) {
        this.senderHomePhone = senderHomePhone;
    }


    /**
     * Gets the receiverFirstName value for this DetailLookupResponse.
     * 
     * @return receiverFirstName
     */
    public java.lang.String getReceiverFirstName() {
        return receiverFirstName;
    }


    /**
     * Sets the receiverFirstName value for this DetailLookupResponse.
     * 
     * @param receiverFirstName
     */
    public void setReceiverFirstName(java.lang.String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }


    /**
     * Gets the receiverMiddleName value for this DetailLookupResponse.
     * 
     * @return receiverMiddleName
     */
    public java.lang.String getReceiverMiddleName() {
        return receiverMiddleName;
    }


    /**
     * Sets the receiverMiddleName value for this DetailLookupResponse.
     * 
     * @param receiverMiddleName
     */
    public void setReceiverMiddleName(java.lang.String receiverMiddleName) {
        this.receiverMiddleName = receiverMiddleName;
    }


    /**
     * Gets the receiverLastName value for this DetailLookupResponse.
     * 
     * @return receiverLastName
     */
    public java.lang.String getReceiverLastName() {
        return receiverLastName;
    }


    /**
     * Sets the receiverLastName value for this DetailLookupResponse.
     * 
     * @param receiverLastName
     */
    public void setReceiverLastName(java.lang.String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }


    /**
     * Gets the receiverLastName2 value for this DetailLookupResponse.
     * 
     * @return receiverLastName2
     */
    public java.lang.String getReceiverLastName2() {
        return receiverLastName2;
    }


    /**
     * Sets the receiverLastName2 value for this DetailLookupResponse.
     * 
     * @param receiverLastName2
     */
    public void setReceiverLastName2(java.lang.String receiverLastName2) {
        this.receiverLastName2 = receiverLastName2;
    }


    /**
     * Gets the receiverAddress value for this DetailLookupResponse.
     * 
     * @return receiverAddress
     */
    public java.lang.String getReceiverAddress() {
        return receiverAddress;
    }


    /**
     * Sets the receiverAddress value for this DetailLookupResponse.
     * 
     * @param receiverAddress
     */
    public void setReceiverAddress(java.lang.String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }


    /**
     * Gets the receiverAddress2 value for this DetailLookupResponse.
     * 
     * @return receiverAddress2
     */
    public java.lang.String getReceiverAddress2() {
        return receiverAddress2;
    }


    /**
     * Sets the receiverAddress2 value for this DetailLookupResponse.
     * 
     * @param receiverAddress2
     */
    public void setReceiverAddress2(java.lang.String receiverAddress2) {
        this.receiverAddress2 = receiverAddress2;
    }


    /**
     * Gets the receiverAddress3 value for this DetailLookupResponse.
     * 
     * @return receiverAddress3
     */
    public java.lang.String getReceiverAddress3() {
        return receiverAddress3;
    }


    /**
     * Sets the receiverAddress3 value for this DetailLookupResponse.
     * 
     * @param receiverAddress3
     */
    public void setReceiverAddress3(java.lang.String receiverAddress3) {
        this.receiverAddress3 = receiverAddress3;
    }


    /**
     * Gets the receiverCity value for this DetailLookupResponse.
     * 
     * @return receiverCity
     */
    public java.lang.String getReceiverCity() {
        return receiverCity;
    }


    /**
     * Sets the receiverCity value for this DetailLookupResponse.
     * 
     * @param receiverCity
     */
    public void setReceiverCity(java.lang.String receiverCity) {
        this.receiverCity = receiverCity;
    }


    /**
     * Gets the receiverState value for this DetailLookupResponse.
     * 
     * @return receiverState
     */
    public java.lang.String getReceiverState() {
        return receiverState;
    }


    /**
     * Sets the receiverState value for this DetailLookupResponse.
     * 
     * @param receiverState
     */
    public void setReceiverState(java.lang.String receiverState) {
        this.receiverState = receiverState;
    }


    /**
     * Gets the receiverZipCode value for this DetailLookupResponse.
     * 
     * @return receiverZipCode
     */
    public java.lang.String getReceiverZipCode() {
        return receiverZipCode;
    }


    /**
     * Sets the receiverZipCode value for this DetailLookupResponse.
     * 
     * @param receiverZipCode
     */
    public void setReceiverZipCode(java.lang.String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
    }


    /**
     * Gets the receiverCountry value for this DetailLookupResponse.
     * 
     * @return receiverCountry
     */
    public java.lang.String getReceiverCountry() {
        return receiverCountry;
    }


    /**
     * Sets the receiverCountry value for this DetailLookupResponse.
     * 
     * @param receiverCountry
     */
    public void setReceiverCountry(java.lang.String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }


    /**
     * Gets the receiverPhone value for this DetailLookupResponse.
     * 
     * @return receiverPhone
     */
    public java.lang.String getReceiverPhone() {
        return receiverPhone;
    }


    /**
     * Sets the receiverPhone value for this DetailLookupResponse.
     * 
     * @param receiverPhone
     */
    public void setReceiverPhone(java.lang.String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }


    /**
     * Gets the direction1 value for this DetailLookupResponse.
     * 
     * @return direction1
     */
    public java.lang.String getDirection1() {
        return direction1;
    }


    /**
     * Sets the direction1 value for this DetailLookupResponse.
     * 
     * @param direction1
     */
    public void setDirection1(java.lang.String direction1) {
        this.direction1 = direction1;
    }


    /**
     * Gets the direction2 value for this DetailLookupResponse.
     * 
     * @return direction2
     */
    public java.lang.String getDirection2() {
        return direction2;
    }


    /**
     * Sets the direction2 value for this DetailLookupResponse.
     * 
     * @param direction2
     */
    public void setDirection2(java.lang.String direction2) {
        this.direction2 = direction2;
    }


    /**
     * Gets the direction3 value for this DetailLookupResponse.
     * 
     * @return direction3
     */
    public java.lang.String getDirection3() {
        return direction3;
    }


    /**
     * Sets the direction3 value for this DetailLookupResponse.
     * 
     * @param direction3
     */
    public void setDirection3(java.lang.String direction3) {
        this.direction3 = direction3;
    }


    /**
     * Gets the testQuestion value for this DetailLookupResponse.
     * 
     * @return testQuestion
     */
    public java.lang.String getTestQuestion() {
        return testQuestion;
    }


    /**
     * Sets the testQuestion value for this DetailLookupResponse.
     * 
     * @param testQuestion
     */
    public void setTestQuestion(java.lang.String testQuestion) {
        this.testQuestion = testQuestion;
    }


    /**
     * Gets the testAnswer value for this DetailLookupResponse.
     * 
     * @return testAnswer
     */
    public java.lang.String getTestAnswer() {
        return testAnswer;
    }


    /**
     * Sets the testAnswer value for this DetailLookupResponse.
     * 
     * @param testAnswer
     */
    public void setTestAnswer(java.lang.String testAnswer) {
        this.testAnswer = testAnswer;
    }


    /**
     * Gets the messageField1 value for this DetailLookupResponse.
     * 
     * @return messageField1
     */
    public java.lang.String getMessageField1() {
        return messageField1;
    }


    /**
     * Sets the messageField1 value for this DetailLookupResponse.
     * 
     * @param messageField1
     */
    public void setMessageField1(java.lang.String messageField1) {
        this.messageField1 = messageField1;
    }


    /**
     * Gets the messageField2 value for this DetailLookupResponse.
     * 
     * @return messageField2
     */
    public java.lang.String getMessageField2() {
        return messageField2;
    }


    /**
     * Sets the messageField2 value for this DetailLookupResponse.
     * 
     * @param messageField2
     */
    public void setMessageField2(java.lang.String messageField2) {
        this.messageField2 = messageField2;
    }


    /**
     * Gets the senderPhotoIdType value for this DetailLookupResponse.
     * 
     * @return senderPhotoIdType
     */
    public com.mgipaypal.ac1211.client.PhotoIdType getSenderPhotoIdType() {
        return senderPhotoIdType;
    }


    /**
     * Sets the senderPhotoIdType value for this DetailLookupResponse.
     * 
     * @param senderPhotoIdType
     */
    public void setSenderPhotoIdType(com.mgipaypal.ac1211.client.PhotoIdType senderPhotoIdType) {
        this.senderPhotoIdType = senderPhotoIdType;
    }


    /**
     * Gets the senderPhotoIdNumber value for this DetailLookupResponse.
     * 
     * @return senderPhotoIdNumber
     */
    public java.lang.String getSenderPhotoIdNumber() {
        return senderPhotoIdNumber;
    }


    /**
     * Sets the senderPhotoIdNumber value for this DetailLookupResponse.
     * 
     * @param senderPhotoIdNumber
     */
    public void setSenderPhotoIdNumber(java.lang.String senderPhotoIdNumber) {
        this.senderPhotoIdNumber = senderPhotoIdNumber;
    }


    /**
     * Gets the senderPhotoIdState value for this DetailLookupResponse.
     * 
     * @return senderPhotoIdState
     */
    public java.lang.String getSenderPhotoIdState() {
        return senderPhotoIdState;
    }


    /**
     * Sets the senderPhotoIdState value for this DetailLookupResponse.
     * 
     * @param senderPhotoIdState
     */
    public void setSenderPhotoIdState(java.lang.String senderPhotoIdState) {
        this.senderPhotoIdState = senderPhotoIdState;
    }


    /**
     * Gets the senderPhotoIdCountry value for this DetailLookupResponse.
     * 
     * @return senderPhotoIdCountry
     */
    public java.lang.String getSenderPhotoIdCountry() {
        return senderPhotoIdCountry;
    }


    /**
     * Sets the senderPhotoIdCountry value for this DetailLookupResponse.
     * 
     * @param senderPhotoIdCountry
     */
    public void setSenderPhotoIdCountry(java.lang.String senderPhotoIdCountry) {
        this.senderPhotoIdCountry = senderPhotoIdCountry;
    }


    /**
     * Gets the senderLegalIdType value for this DetailLookupResponse.
     * 
     * @return senderLegalIdType
     */
    public com.mgipaypal.ac1211.client.LegalIdType getSenderLegalIdType() {
        return senderLegalIdType;
    }


    /**
     * Sets the senderLegalIdType value for this DetailLookupResponse.
     * 
     * @param senderLegalIdType
     */
    public void setSenderLegalIdType(com.mgipaypal.ac1211.client.LegalIdType senderLegalIdType) {
        this.senderLegalIdType = senderLegalIdType;
    }


    /**
     * Gets the senderLegalIdNumber value for this DetailLookupResponse.
     * 
     * @return senderLegalIdNumber
     */
    public java.lang.String getSenderLegalIdNumber() {
        return senderLegalIdNumber;
    }


    /**
     * Sets the senderLegalIdNumber value for this DetailLookupResponse.
     * 
     * @param senderLegalIdNumber
     */
    public void setSenderLegalIdNumber(java.lang.String senderLegalIdNumber) {
        this.senderLegalIdNumber = senderLegalIdNumber;
    }


    /**
     * Gets the senderDOB value for this DetailLookupResponse.
     * 
     * @return senderDOB
     */
    public java.util.Date getSenderDOB() {
        return senderDOB;
    }


    /**
     * Sets the senderDOB value for this DetailLookupResponse.
     * 
     * @param senderDOB
     */
    public void setSenderDOB(java.util.Date senderDOB) {
        this.senderDOB = senderDOB;
    }


    /**
     * Gets the senderOccupation value for this DetailLookupResponse.
     * 
     * @return senderOccupation
     */
    public java.lang.String getSenderOccupation() {
        return senderOccupation;
    }


    /**
     * Sets the senderOccupation value for this DetailLookupResponse.
     * 
     * @param senderOccupation
     */
    public void setSenderOccupation(java.lang.String senderOccupation) {
        this.senderOccupation = senderOccupation;
    }


    /**
     * Gets the thirdPartyFirstName value for this DetailLookupResponse.
     * 
     * @return thirdPartyFirstName
     */
    public java.lang.String getThirdPartyFirstName() {
        return thirdPartyFirstName;
    }


    /**
     * Sets the thirdPartyFirstName value for this DetailLookupResponse.
     * 
     * @param thirdPartyFirstName
     */
    public void setThirdPartyFirstName(java.lang.String thirdPartyFirstName) {
        this.thirdPartyFirstName = thirdPartyFirstName;
    }


    /**
     * Gets the thirdPartyMiddleName value for this DetailLookupResponse.
     * 
     * @return thirdPartyMiddleName
     */
    public java.lang.String getThirdPartyMiddleName() {
        return thirdPartyMiddleName;
    }


    /**
     * Sets the thirdPartyMiddleName value for this DetailLookupResponse.
     * 
     * @param thirdPartyMiddleName
     */
    public void setThirdPartyMiddleName(java.lang.String thirdPartyMiddleName) {
        this.thirdPartyMiddleName = thirdPartyMiddleName;
    }


    /**
     * Gets the thirdPartyLastName value for this DetailLookupResponse.
     * 
     * @return thirdPartyLastName
     */
    public java.lang.String getThirdPartyLastName() {
        return thirdPartyLastName;
    }


    /**
     * Sets the thirdPartyLastName value for this DetailLookupResponse.
     * 
     * @param thirdPartyLastName
     */
    public void setThirdPartyLastName(java.lang.String thirdPartyLastName) {
        this.thirdPartyLastName = thirdPartyLastName;
    }


    /**
     * Gets the thirdPartyAddress value for this DetailLookupResponse.
     * 
     * @return thirdPartyAddress
     */
    public java.lang.String getThirdPartyAddress() {
        return thirdPartyAddress;
    }


    /**
     * Sets the thirdPartyAddress value for this DetailLookupResponse.
     * 
     * @param thirdPartyAddress
     */
    public void setThirdPartyAddress(java.lang.String thirdPartyAddress) {
        this.thirdPartyAddress = thirdPartyAddress;
    }


    /**
     * Gets the thirdPartyAddress2 value for this DetailLookupResponse.
     * 
     * @return thirdPartyAddress2
     */
    public java.lang.String getThirdPartyAddress2() {
        return thirdPartyAddress2;
    }


    /**
     * Sets the thirdPartyAddress2 value for this DetailLookupResponse.
     * 
     * @param thirdPartyAddress2
     */
    public void setThirdPartyAddress2(java.lang.String thirdPartyAddress2) {
        this.thirdPartyAddress2 = thirdPartyAddress2;
    }


    /**
     * Gets the thirdPartyAddress3 value for this DetailLookupResponse.
     * 
     * @return thirdPartyAddress3
     */
    public java.lang.String getThirdPartyAddress3() {
        return thirdPartyAddress3;
    }


    /**
     * Sets the thirdPartyAddress3 value for this DetailLookupResponse.
     * 
     * @param thirdPartyAddress3
     */
    public void setThirdPartyAddress3(java.lang.String thirdPartyAddress3) {
        this.thirdPartyAddress3 = thirdPartyAddress3;
    }


    /**
     * Gets the thirdPartyCity value for this DetailLookupResponse.
     * 
     * @return thirdPartyCity
     */
    public java.lang.String getThirdPartyCity() {
        return thirdPartyCity;
    }


    /**
     * Sets the thirdPartyCity value for this DetailLookupResponse.
     * 
     * @param thirdPartyCity
     */
    public void setThirdPartyCity(java.lang.String thirdPartyCity) {
        this.thirdPartyCity = thirdPartyCity;
    }


    /**
     * Gets the thirdPartyState value for this DetailLookupResponse.
     * 
     * @return thirdPartyState
     */
    public java.lang.String getThirdPartyState() {
        return thirdPartyState;
    }


    /**
     * Sets the thirdPartyState value for this DetailLookupResponse.
     * 
     * @param thirdPartyState
     */
    public void setThirdPartyState(java.lang.String thirdPartyState) {
        this.thirdPartyState = thirdPartyState;
    }


    /**
     * Gets the thirdPartyCountry value for this DetailLookupResponse.
     * 
     * @return thirdPartyCountry
     */
    public java.lang.String getThirdPartyCountry() {
        return thirdPartyCountry;
    }


    /**
     * Sets the thirdPartyCountry value for this DetailLookupResponse.
     * 
     * @param thirdPartyCountry
     */
    public void setThirdPartyCountry(java.lang.String thirdPartyCountry) {
        this.thirdPartyCountry = thirdPartyCountry;
    }


    /**
     * Gets the thirdPartyZipCode value for this DetailLookupResponse.
     * 
     * @return thirdPartyZipCode
     */
    public java.lang.String getThirdPartyZipCode() {
        return thirdPartyZipCode;
    }


    /**
     * Sets the thirdPartyZipCode value for this DetailLookupResponse.
     * 
     * @param thirdPartyZipCode
     */
    public void setThirdPartyZipCode(java.lang.String thirdPartyZipCode) {
        this.thirdPartyZipCode = thirdPartyZipCode;
    }


    /**
     * Gets the thirdPartyDOB value for this DetailLookupResponse.
     * 
     * @return thirdPartyDOB
     */
    public java.util.Date getThirdPartyDOB() {
        return thirdPartyDOB;
    }


    /**
     * Sets the thirdPartyDOB value for this DetailLookupResponse.
     * 
     * @param thirdPartyDOB
     */
    public void setThirdPartyDOB(java.util.Date thirdPartyDOB) {
        this.thirdPartyDOB = thirdPartyDOB;
    }


    /**
     * Gets the thirdPartyLegalIdType value for this DetailLookupResponse.
     * 
     * @return thirdPartyLegalIdType
     */
    public com.mgipaypal.ac1211.client.LegalIdType getThirdPartyLegalIdType() {
        return thirdPartyLegalIdType;
    }


    /**
     * Sets the thirdPartyLegalIdType value for this DetailLookupResponse.
     * 
     * @param thirdPartyLegalIdType
     */
    public void setThirdPartyLegalIdType(com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType) {
        this.thirdPartyLegalIdType = thirdPartyLegalIdType;
    }


    /**
     * Gets the thirdPartyLegalIdNumber value for this DetailLookupResponse.
     * 
     * @return thirdPartyLegalIdNumber
     */
    public java.lang.String getThirdPartyLegalIdNumber() {
        return thirdPartyLegalIdNumber;
    }


    /**
     * Sets the thirdPartyLegalIdNumber value for this DetailLookupResponse.
     * 
     * @param thirdPartyLegalIdNumber
     */
    public void setThirdPartyLegalIdNumber(java.lang.String thirdPartyLegalIdNumber) {
        this.thirdPartyLegalIdNumber = thirdPartyLegalIdNumber;
    }


    /**
     * Gets the thirdPartyOccupation value for this DetailLookupResponse.
     * 
     * @return thirdPartyOccupation
     */
    public java.lang.String getThirdPartyOccupation() {
        return thirdPartyOccupation;
    }


    /**
     * Sets the thirdPartyOccupation value for this DetailLookupResponse.
     * 
     * @param thirdPartyOccupation
     */
    public void setThirdPartyOccupation(java.lang.String thirdPartyOccupation) {
        this.thirdPartyOccupation = thirdPartyOccupation;
    }


    /**
     * Gets the thirdPartyOrg value for this DetailLookupResponse.
     * 
     * @return thirdPartyOrg
     */
    public java.lang.String getThirdPartyOrg() {
        return thirdPartyOrg;
    }


    /**
     * Sets the thirdPartyOrg value for this DetailLookupResponse.
     * 
     * @param thirdPartyOrg
     */
    public void setThirdPartyOrg(java.lang.String thirdPartyOrg) {
        this.thirdPartyOrg = thirdPartyOrg;
    }


    /**
     * Gets the senderBirthCity value for this DetailLookupResponse.
     * 
     * @return senderBirthCity
     */
    public java.lang.String getSenderBirthCity() {
        return senderBirthCity;
    }


    /**
     * Sets the senderBirthCity value for this DetailLookupResponse.
     * 
     * @param senderBirthCity
     */
    public void setSenderBirthCity(java.lang.String senderBirthCity) {
        this.senderBirthCity = senderBirthCity;
    }


    /**
     * Gets the senderBirthCountry value for this DetailLookupResponse.
     * 
     * @return senderBirthCountry
     */
    public java.lang.String getSenderBirthCountry() {
        return senderBirthCountry;
    }


    /**
     * Sets the senderBirthCountry value for this DetailLookupResponse.
     * 
     * @param senderBirthCountry
     */
    public void setSenderBirthCountry(java.lang.String senderBirthCountry) {
        this.senderBirthCountry = senderBirthCountry;
    }


    /**
     * Gets the senderPassportIssueDate value for this DetailLookupResponse.
     * 
     * @return senderPassportIssueDate
     */
    public java.util.Date getSenderPassportIssueDate() {
        return senderPassportIssueDate;
    }


    /**
     * Sets the senderPassportIssueDate value for this DetailLookupResponse.
     * 
     * @param senderPassportIssueDate
     */
    public void setSenderPassportIssueDate(java.util.Date senderPassportIssueDate) {
        this.senderPassportIssueDate = senderPassportIssueDate;
    }


    /**
     * Gets the senderPassportIssueCity value for this DetailLookupResponse.
     * 
     * @return senderPassportIssueCity
     */
    public java.lang.String getSenderPassportIssueCity() {
        return senderPassportIssueCity;
    }


    /**
     * Sets the senderPassportIssueCity value for this DetailLookupResponse.
     * 
     * @param senderPassportIssueCity
     */
    public void setSenderPassportIssueCity(java.lang.String senderPassportIssueCity) {
        this.senderPassportIssueCity = senderPassportIssueCity;
    }


    /**
     * Gets the senderPassportIssueCountry value for this DetailLookupResponse.
     * 
     * @return senderPassportIssueCountry
     */
    public java.lang.String getSenderPassportIssueCountry() {
        return senderPassportIssueCountry;
    }


    /**
     * Sets the senderPassportIssueCountry value for this DetailLookupResponse.
     * 
     * @param senderPassportIssueCountry
     */
    public void setSenderPassportIssueCountry(java.lang.String senderPassportIssueCountry) {
        this.senderPassportIssueCountry = senderPassportIssueCountry;
    }


    /**
     * Gets the operatorName value for this DetailLookupResponse.
     * 
     * @return operatorName
     */
    public java.lang.String getOperatorName() {
        return operatorName;
    }


    /**
     * Sets the operatorName value for this DetailLookupResponse.
     * 
     * @param operatorName
     */
    public void setOperatorName(java.lang.String operatorName) {
        this.operatorName = operatorName;
    }


    /**
     * Gets the validIndicator value for this DetailLookupResponse.
     * 
     * @return validIndicator
     */
    public java.lang.Boolean getValidIndicator() {
        return validIndicator;
    }


    /**
     * Sets the validIndicator value for this DetailLookupResponse.
     * 
     * @param validIndicator
     */
    public void setValidIndicator(java.lang.Boolean validIndicator) {
        this.validIndicator = validIndicator;
    }


    /**
     * Gets the agentUseSendData value for this DetailLookupResponse.
     * 
     * @return agentUseSendData
     */
    public java.lang.String getAgentUseSendData() {
        return agentUseSendData;
    }


    /**
     * Sets the agentUseSendData value for this DetailLookupResponse.
     * 
     * @param agentUseSendData
     */
    public void setAgentUseSendData(java.lang.String agentUseSendData) {
        this.agentUseSendData = agentUseSendData;
    }


    /**
     * Gets the customerReceiveNumber value for this DetailLookupResponse.
     * 
     * @return customerReceiveNumber
     */
    public java.lang.String getCustomerReceiveNumber() {
        return customerReceiveNumber;
    }


    /**
     * Sets the customerReceiveNumber value for this DetailLookupResponse.
     * 
     * @param customerReceiveNumber
     */
    public void setCustomerReceiveNumber(java.lang.String customerReceiveNumber) {
        this.customerReceiveNumber = customerReceiveNumber;
    }


    /**
     * Gets the receiveAgentID value for this DetailLookupResponse.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this DetailLookupResponse.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the receiveAgentName value for this DetailLookupResponse.
     * 
     * @return receiveAgentName
     */
    public java.lang.String getReceiveAgentName() {
        return receiveAgentName;
    }


    /**
     * Sets the receiveAgentName value for this DetailLookupResponse.
     * 
     * @param receiveAgentName
     */
    public void setReceiveAgentName(java.lang.String receiveAgentName) {
        this.receiveAgentName = receiveAgentName;
    }


    /**
     * Gets the receiveAgentAbbreviation value for this DetailLookupResponse.
     * 
     * @return receiveAgentAbbreviation
     */
    public java.lang.String getReceiveAgentAbbreviation() {
        return receiveAgentAbbreviation;
    }


    /**
     * Sets the receiveAgentAbbreviation value for this DetailLookupResponse.
     * 
     * @param receiveAgentAbbreviation
     */
    public void setReceiveAgentAbbreviation(java.lang.String receiveAgentAbbreviation) {
        this.receiveAgentAbbreviation = receiveAgentAbbreviation;
    }


    /**
     * Gets the expectedDateOfDelivery value for this DetailLookupResponse.
     * 
     * @return expectedDateOfDelivery
     */
    public java.util.Date getExpectedDateOfDelivery() {
        return expectedDateOfDelivery;
    }


    /**
     * Sets the expectedDateOfDelivery value for this DetailLookupResponse.
     * 
     * @param expectedDateOfDelivery
     */
    public void setExpectedDateOfDelivery(java.util.Date expectedDateOfDelivery) {
        this.expectedDateOfDelivery = expectedDateOfDelivery;
    }


    /**
     * Gets the redirectIndicator value for this DetailLookupResponse.
     * 
     * @return redirectIndicator
     */
    public java.lang.Boolean getRedirectIndicator() {
        return redirectIndicator;
    }


    /**
     * Sets the redirectIndicator value for this DetailLookupResponse.
     * 
     * @param redirectIndicator
     */
    public void setRedirectIndicator(java.lang.Boolean redirectIndicator) {
        this.redirectIndicator = redirectIndicator;
    }


    /**
     * Gets the redirectInfo value for this DetailLookupResponse.
     * 
     * @return redirectInfo
     */
    public com.mgipaypal.ac1211.client.RedirectInfo getRedirectInfo() {
        return redirectInfo;
    }


    /**
     * Sets the redirectInfo value for this DetailLookupResponse.
     * 
     * @param redirectInfo
     */
    public void setRedirectInfo(com.mgipaypal.ac1211.client.RedirectInfo redirectInfo) {
        this.redirectInfo = redirectInfo;
    }


    /**
     * Gets the agentCheckAuthorizationNumber value for this DetailLookupResponse.
     * 
     * @return agentCheckAuthorizationNumber
     */
    public java.lang.String getAgentCheckAuthorizationNumber() {
        return agentCheckAuthorizationNumber;
    }


    /**
     * Sets the agentCheckAuthorizationNumber value for this DetailLookupResponse.
     * 
     * @param agentCheckAuthorizationNumber
     */
    public void setAgentCheckAuthorizationNumber(java.lang.String agentCheckAuthorizationNumber) {
        this.agentCheckAuthorizationNumber = agentCheckAuthorizationNumber;
    }


    /**
     * Gets the accountNickname value for this DetailLookupResponse.
     * 
     * @return accountNickname
     */
    public java.lang.String getAccountNickname() {
        return accountNickname;
    }


    /**
     * Sets the accountNickname value for this DetailLookupResponse.
     * 
     * @param accountNickname
     */
    public void setAccountNickname(java.lang.String accountNickname) {
        this.accountNickname = accountNickname;
    }


    /**
     * Gets the promotionInfo value for this DetailLookupResponse.
     * 
     * @return promotionInfo
     */
    public com.mgipaypal.ac1211.client.PromotionInfo[] getPromotionInfo() {
        return promotionInfo;
    }


    /**
     * Sets the promotionInfo value for this DetailLookupResponse.
     * 
     * @param promotionInfo
     */
    public void setPromotionInfo(com.mgipaypal.ac1211.client.PromotionInfo[] promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public com.mgipaypal.ac1211.client.PromotionInfo getPromotionInfo(int i) {
        return this.promotionInfo[i];
    }

    public void setPromotionInfo(int i, com.mgipaypal.ac1211.client.PromotionInfo _value) {
        this.promotionInfo[i] = _value;
    }


    /**
     * Gets the disclosureText value for this DetailLookupResponse.
     * 
     * @return disclosureText
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getDisclosureText() {
        return disclosureText;
    }


    /**
     * Sets the disclosureText value for this DetailLookupResponse.
     * 
     * @param disclosureText
     */
    public void setDisclosureText(com.mgipaypal.ac1211.client.TextTranslation[] disclosureText) {
        this.disclosureText = disclosureText;
    }

    public com.mgipaypal.ac1211.client.TextTranslation getDisclosureText(int i) {
        return this.disclosureText[i];
    }

    public void setDisclosureText(int i, com.mgipaypal.ac1211.client.TextTranslation _value) {
        this.disclosureText[i] = _value;
    }


    /**
     * Gets the feeRefundRequired value for this DetailLookupResponse.
     * 
     * @return feeRefundRequired
     */
    public java.lang.Boolean getFeeRefundRequired() {
        return feeRefundRequired;
    }


    /**
     * Sets the feeRefundRequired value for this DetailLookupResponse.
     * 
     * @param feeRefundRequired
     */
    public void setFeeRefundRequired(java.lang.Boolean feeRefundRequired) {
        this.feeRefundRequired = feeRefundRequired;
    }


    /**
     * Gets the sendAmounts value for this DetailLookupResponse.
     * 
     * @return sendAmounts
     */
    public com.mgipaypal.ac1211.client.SendAmountInfo getSendAmounts() {
        return sendAmounts;
    }


    /**
     * Sets the sendAmounts value for this DetailLookupResponse.
     * 
     * @param sendAmounts
     */
    public void setSendAmounts(com.mgipaypal.ac1211.client.SendAmountInfo sendAmounts) {
        this.sendAmounts = sendAmounts;
    }


    /**
     * Gets the receiveAmounts value for this DetailLookupResponse.
     * 
     * @return receiveAmounts
     */
    public com.mgipaypal.ac1211.client.ReceiveAmountInfo getReceiveAmounts() {
        return receiveAmounts;
    }


    /**
     * Sets the receiveAmounts value for this DetailLookupResponse.
     * 
     * @param receiveAmounts
     */
    public void setReceiveAmounts(com.mgipaypal.ac1211.client.ReceiveAmountInfo receiveAmounts) {
        this.receiveAmounts = receiveAmounts;
    }


    /**
     * Gets the exchangeRateApplied value for this DetailLookupResponse.
     * 
     * @return exchangeRateApplied
     */
    public java.math.BigDecimal getExchangeRateApplied() {
        return exchangeRateApplied;
    }


    /**
     * Sets the exchangeRateApplied value for this DetailLookupResponse.
     * 
     * @param exchangeRateApplied
     */
    public void setExchangeRateApplied(java.math.BigDecimal exchangeRateApplied) {
        this.exchangeRateApplied = exchangeRateApplied;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetailLookupResponse)) return false;
        DetailLookupResponse other = (DetailLookupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mgiTransactionSessionID==null && other.getMgiTransactionSessionID()==null) || 
             (this.mgiTransactionSessionID!=null &&
              this.mgiTransactionSessionID.equals(other.getMgiTransactionSessionID()))) &&
            ((this.transactionStatus==null && other.getTransactionStatus()==null) || 
             (this.transactionStatus!=null &&
              this.transactionStatus.equals(other.getTransactionStatus()))) &&
            ((this.dateTimeSent==null && other.getDateTimeSent()==null) || 
             (this.dateTimeSent!=null &&
              this.dateTimeSent.equals(other.getDateTimeSent()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.freqCustCardNumber==null && other.getFreqCustCardNumber()==null) || 
             (this.freqCustCardNumber!=null &&
              this.freqCustCardNumber.equals(other.getFreqCustCardNumber()))) &&
            ((this.receiveCountry==null && other.getReceiveCountry()==null) || 
             (this.receiveCountry!=null &&
              this.receiveCountry.equals(other.getReceiveCountry()))) &&
            ((this.deliveryOption==null && other.getDeliveryOption()==null) || 
             (this.deliveryOption!=null &&
              this.deliveryOption.equals(other.getDeliveryOption()))) &&
            ((this.senderFirstName==null && other.getSenderFirstName()==null) || 
             (this.senderFirstName!=null &&
              this.senderFirstName.equals(other.getSenderFirstName()))) &&
            ((this.senderMiddleName==null && other.getSenderMiddleName()==null) || 
             (this.senderMiddleName!=null &&
              this.senderMiddleName.equals(other.getSenderMiddleName()))) &&
            ((this.senderLastName==null && other.getSenderLastName()==null) || 
             (this.senderLastName!=null &&
              this.senderLastName.equals(other.getSenderLastName()))) &&
            ((this.senderAddress==null && other.getSenderAddress()==null) || 
             (this.senderAddress!=null &&
              this.senderAddress.equals(other.getSenderAddress()))) &&
            ((this.senderAddress2==null && other.getSenderAddress2()==null) || 
             (this.senderAddress2!=null &&
              this.senderAddress2.equals(other.getSenderAddress2()))) &&
            ((this.senderAddress3==null && other.getSenderAddress3()==null) || 
             (this.senderAddress3!=null &&
              this.senderAddress3.equals(other.getSenderAddress3()))) &&
            ((this.senderCity==null && other.getSenderCity()==null) || 
             (this.senderCity!=null &&
              this.senderCity.equals(other.getSenderCity()))) &&
            ((this.senderState==null && other.getSenderState()==null) || 
             (this.senderState!=null &&
              this.senderState.equals(other.getSenderState()))) &&
            ((this.senderZipCode==null && other.getSenderZipCode()==null) || 
             (this.senderZipCode!=null &&
              this.senderZipCode.equals(other.getSenderZipCode()))) &&
            ((this.senderCountry==null && other.getSenderCountry()==null) || 
             (this.senderCountry!=null &&
              this.senderCountry.equals(other.getSenderCountry()))) &&
            ((this.senderHomePhone==null && other.getSenderHomePhone()==null) || 
             (this.senderHomePhone!=null &&
              this.senderHomePhone.equals(other.getSenderHomePhone()))) &&
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
            ((this.receiverCity==null && other.getReceiverCity()==null) || 
             (this.receiverCity!=null &&
              this.receiverCity.equals(other.getReceiverCity()))) &&
            ((this.receiverState==null && other.getReceiverState()==null) || 
             (this.receiverState!=null &&
              this.receiverState.equals(other.getReceiverState()))) &&
            ((this.receiverZipCode==null && other.getReceiverZipCode()==null) || 
             (this.receiverZipCode!=null &&
              this.receiverZipCode.equals(other.getReceiverZipCode()))) &&
            ((this.receiverCountry==null && other.getReceiverCountry()==null) || 
             (this.receiverCountry!=null &&
              this.receiverCountry.equals(other.getReceiverCountry()))) &&
            ((this.receiverPhone==null && other.getReceiverPhone()==null) || 
             (this.receiverPhone!=null &&
              this.receiverPhone.equals(other.getReceiverPhone()))) &&
            ((this.direction1==null && other.getDirection1()==null) || 
             (this.direction1!=null &&
              this.direction1.equals(other.getDirection1()))) &&
            ((this.direction2==null && other.getDirection2()==null) || 
             (this.direction2!=null &&
              this.direction2.equals(other.getDirection2()))) &&
            ((this.direction3==null && other.getDirection3()==null) || 
             (this.direction3!=null &&
              this.direction3.equals(other.getDirection3()))) &&
            ((this.testQuestion==null && other.getTestQuestion()==null) || 
             (this.testQuestion!=null &&
              this.testQuestion.equals(other.getTestQuestion()))) &&
            ((this.testAnswer==null && other.getTestAnswer()==null) || 
             (this.testAnswer!=null &&
              this.testAnswer.equals(other.getTestAnswer()))) &&
            ((this.messageField1==null && other.getMessageField1()==null) || 
             (this.messageField1!=null &&
              this.messageField1.equals(other.getMessageField1()))) &&
            ((this.messageField2==null && other.getMessageField2()==null) || 
             (this.messageField2!=null &&
              this.messageField2.equals(other.getMessageField2()))) &&
            ((this.senderPhotoIdType==null && other.getSenderPhotoIdType()==null) || 
             (this.senderPhotoIdType!=null &&
              this.senderPhotoIdType.equals(other.getSenderPhotoIdType()))) &&
            ((this.senderPhotoIdNumber==null && other.getSenderPhotoIdNumber()==null) || 
             (this.senderPhotoIdNumber!=null &&
              this.senderPhotoIdNumber.equals(other.getSenderPhotoIdNumber()))) &&
            ((this.senderPhotoIdState==null && other.getSenderPhotoIdState()==null) || 
             (this.senderPhotoIdState!=null &&
              this.senderPhotoIdState.equals(other.getSenderPhotoIdState()))) &&
            ((this.senderPhotoIdCountry==null && other.getSenderPhotoIdCountry()==null) || 
             (this.senderPhotoIdCountry!=null &&
              this.senderPhotoIdCountry.equals(other.getSenderPhotoIdCountry()))) &&
            ((this.senderLegalIdType==null && other.getSenderLegalIdType()==null) || 
             (this.senderLegalIdType!=null &&
              this.senderLegalIdType.equals(other.getSenderLegalIdType()))) &&
            ((this.senderLegalIdNumber==null && other.getSenderLegalIdNumber()==null) || 
             (this.senderLegalIdNumber!=null &&
              this.senderLegalIdNumber.equals(other.getSenderLegalIdNumber()))) &&
            ((this.senderDOB==null && other.getSenderDOB()==null) || 
             (this.senderDOB!=null &&
              this.senderDOB.equals(other.getSenderDOB()))) &&
            ((this.senderOccupation==null && other.getSenderOccupation()==null) || 
             (this.senderOccupation!=null &&
              this.senderOccupation.equals(other.getSenderOccupation()))) &&
            ((this.thirdPartyFirstName==null && other.getThirdPartyFirstName()==null) || 
             (this.thirdPartyFirstName!=null &&
              this.thirdPartyFirstName.equals(other.getThirdPartyFirstName()))) &&
            ((this.thirdPartyMiddleName==null && other.getThirdPartyMiddleName()==null) || 
             (this.thirdPartyMiddleName!=null &&
              this.thirdPartyMiddleName.equals(other.getThirdPartyMiddleName()))) &&
            ((this.thirdPartyLastName==null && other.getThirdPartyLastName()==null) || 
             (this.thirdPartyLastName!=null &&
              this.thirdPartyLastName.equals(other.getThirdPartyLastName()))) &&
            ((this.thirdPartyAddress==null && other.getThirdPartyAddress()==null) || 
             (this.thirdPartyAddress!=null &&
              this.thirdPartyAddress.equals(other.getThirdPartyAddress()))) &&
            ((this.thirdPartyAddress2==null && other.getThirdPartyAddress2()==null) || 
             (this.thirdPartyAddress2!=null &&
              this.thirdPartyAddress2.equals(other.getThirdPartyAddress2()))) &&
            ((this.thirdPartyAddress3==null && other.getThirdPartyAddress3()==null) || 
             (this.thirdPartyAddress3!=null &&
              this.thirdPartyAddress3.equals(other.getThirdPartyAddress3()))) &&
            ((this.thirdPartyCity==null && other.getThirdPartyCity()==null) || 
             (this.thirdPartyCity!=null &&
              this.thirdPartyCity.equals(other.getThirdPartyCity()))) &&
            ((this.thirdPartyState==null && other.getThirdPartyState()==null) || 
             (this.thirdPartyState!=null &&
              this.thirdPartyState.equals(other.getThirdPartyState()))) &&
            ((this.thirdPartyCountry==null && other.getThirdPartyCountry()==null) || 
             (this.thirdPartyCountry!=null &&
              this.thirdPartyCountry.equals(other.getThirdPartyCountry()))) &&
            ((this.thirdPartyZipCode==null && other.getThirdPartyZipCode()==null) || 
             (this.thirdPartyZipCode!=null &&
              this.thirdPartyZipCode.equals(other.getThirdPartyZipCode()))) &&
            ((this.thirdPartyDOB==null && other.getThirdPartyDOB()==null) || 
             (this.thirdPartyDOB!=null &&
              this.thirdPartyDOB.equals(other.getThirdPartyDOB()))) &&
            ((this.thirdPartyLegalIdType==null && other.getThirdPartyLegalIdType()==null) || 
             (this.thirdPartyLegalIdType!=null &&
              this.thirdPartyLegalIdType.equals(other.getThirdPartyLegalIdType()))) &&
            ((this.thirdPartyLegalIdNumber==null && other.getThirdPartyLegalIdNumber()==null) || 
             (this.thirdPartyLegalIdNumber!=null &&
              this.thirdPartyLegalIdNumber.equals(other.getThirdPartyLegalIdNumber()))) &&
            ((this.thirdPartyOccupation==null && other.getThirdPartyOccupation()==null) || 
             (this.thirdPartyOccupation!=null &&
              this.thirdPartyOccupation.equals(other.getThirdPartyOccupation()))) &&
            ((this.thirdPartyOrg==null && other.getThirdPartyOrg()==null) || 
             (this.thirdPartyOrg!=null &&
              this.thirdPartyOrg.equals(other.getThirdPartyOrg()))) &&
            ((this.senderBirthCity==null && other.getSenderBirthCity()==null) || 
             (this.senderBirthCity!=null &&
              this.senderBirthCity.equals(other.getSenderBirthCity()))) &&
            ((this.senderBirthCountry==null && other.getSenderBirthCountry()==null) || 
             (this.senderBirthCountry!=null &&
              this.senderBirthCountry.equals(other.getSenderBirthCountry()))) &&
            ((this.senderPassportIssueDate==null && other.getSenderPassportIssueDate()==null) || 
             (this.senderPassportIssueDate!=null &&
              this.senderPassportIssueDate.equals(other.getSenderPassportIssueDate()))) &&
            ((this.senderPassportIssueCity==null && other.getSenderPassportIssueCity()==null) || 
             (this.senderPassportIssueCity!=null &&
              this.senderPassportIssueCity.equals(other.getSenderPassportIssueCity()))) &&
            ((this.senderPassportIssueCountry==null && other.getSenderPassportIssueCountry()==null) || 
             (this.senderPassportIssueCountry!=null &&
              this.senderPassportIssueCountry.equals(other.getSenderPassportIssueCountry()))) &&
            ((this.operatorName==null && other.getOperatorName()==null) || 
             (this.operatorName!=null &&
              this.operatorName.equals(other.getOperatorName()))) &&
            ((this.validIndicator==null && other.getValidIndicator()==null) || 
             (this.validIndicator!=null &&
              this.validIndicator.equals(other.getValidIndicator()))) &&
            ((this.agentUseSendData==null && other.getAgentUseSendData()==null) || 
             (this.agentUseSendData!=null &&
              this.agentUseSendData.equals(other.getAgentUseSendData()))) &&
            ((this.customerReceiveNumber==null && other.getCustomerReceiveNumber()==null) || 
             (this.customerReceiveNumber!=null &&
              this.customerReceiveNumber.equals(other.getCustomerReceiveNumber()))) &&
            ((this.receiveAgentID==null && other.getReceiveAgentID()==null) || 
             (this.receiveAgentID!=null &&
              this.receiveAgentID.equals(other.getReceiveAgentID()))) &&
            ((this.receiveAgentName==null && other.getReceiveAgentName()==null) || 
             (this.receiveAgentName!=null &&
              this.receiveAgentName.equals(other.getReceiveAgentName()))) &&
            ((this.receiveAgentAbbreviation==null && other.getReceiveAgentAbbreviation()==null) || 
             (this.receiveAgentAbbreviation!=null &&
              this.receiveAgentAbbreviation.equals(other.getReceiveAgentAbbreviation()))) &&
            ((this.expectedDateOfDelivery==null && other.getExpectedDateOfDelivery()==null) || 
             (this.expectedDateOfDelivery!=null &&
              this.expectedDateOfDelivery.equals(other.getExpectedDateOfDelivery()))) &&
            ((this.redirectIndicator==null && other.getRedirectIndicator()==null) || 
             (this.redirectIndicator!=null &&
              this.redirectIndicator.equals(other.getRedirectIndicator()))) &&
            ((this.redirectInfo==null && other.getRedirectInfo()==null) || 
             (this.redirectInfo!=null &&
              this.redirectInfo.equals(other.getRedirectInfo()))) &&
            ((this.agentCheckAuthorizationNumber==null && other.getAgentCheckAuthorizationNumber()==null) || 
             (this.agentCheckAuthorizationNumber!=null &&
              this.agentCheckAuthorizationNumber.equals(other.getAgentCheckAuthorizationNumber()))) &&
            ((this.accountNickname==null && other.getAccountNickname()==null) || 
             (this.accountNickname!=null &&
              this.accountNickname.equals(other.getAccountNickname()))) &&
            ((this.promotionInfo==null && other.getPromotionInfo()==null) || 
             (this.promotionInfo!=null &&
              java.util.Arrays.equals(this.promotionInfo, other.getPromotionInfo()))) &&
            ((this.disclosureText==null && other.getDisclosureText()==null) || 
             (this.disclosureText!=null &&
              java.util.Arrays.equals(this.disclosureText, other.getDisclosureText()))) &&
            ((this.feeRefundRequired==null && other.getFeeRefundRequired()==null) || 
             (this.feeRefundRequired!=null &&
              this.feeRefundRequired.equals(other.getFeeRefundRequired()))) &&
            ((this.sendAmounts==null && other.getSendAmounts()==null) || 
             (this.sendAmounts!=null &&
              this.sendAmounts.equals(other.getSendAmounts()))) &&
            ((this.receiveAmounts==null && other.getReceiveAmounts()==null) || 
             (this.receiveAmounts!=null &&
              this.receiveAmounts.equals(other.getReceiveAmounts()))) &&
            ((this.exchangeRateApplied==null && other.getExchangeRateApplied()==null) || 
             (this.exchangeRateApplied!=null &&
              this.exchangeRateApplied.equals(other.getExchangeRateApplied())));
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
        if (getMgiTransactionSessionID() != null) {
            _hashCode += getMgiTransactionSessionID().hashCode();
        }
        if (getTransactionStatus() != null) {
            _hashCode += getTransactionStatus().hashCode();
        }
        if (getDateTimeSent() != null) {
            _hashCode += getDateTimeSent().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getFreqCustCardNumber() != null) {
            _hashCode += getFreqCustCardNumber().hashCode();
        }
        if (getReceiveCountry() != null) {
            _hashCode += getReceiveCountry().hashCode();
        }
        if (getDeliveryOption() != null) {
            _hashCode += getDeliveryOption().hashCode();
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
        if (getSenderAddress() != null) {
            _hashCode += getSenderAddress().hashCode();
        }
        if (getSenderAddress2() != null) {
            _hashCode += getSenderAddress2().hashCode();
        }
        if (getSenderAddress3() != null) {
            _hashCode += getSenderAddress3().hashCode();
        }
        if (getSenderCity() != null) {
            _hashCode += getSenderCity().hashCode();
        }
        if (getSenderState() != null) {
            _hashCode += getSenderState().hashCode();
        }
        if (getSenderZipCode() != null) {
            _hashCode += getSenderZipCode().hashCode();
        }
        if (getSenderCountry() != null) {
            _hashCode += getSenderCountry().hashCode();
        }
        if (getSenderHomePhone() != null) {
            _hashCode += getSenderHomePhone().hashCode();
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
        if (getReceiverCity() != null) {
            _hashCode += getReceiverCity().hashCode();
        }
        if (getReceiverState() != null) {
            _hashCode += getReceiverState().hashCode();
        }
        if (getReceiverZipCode() != null) {
            _hashCode += getReceiverZipCode().hashCode();
        }
        if (getReceiverCountry() != null) {
            _hashCode += getReceiverCountry().hashCode();
        }
        if (getReceiverPhone() != null) {
            _hashCode += getReceiverPhone().hashCode();
        }
        if (getDirection1() != null) {
            _hashCode += getDirection1().hashCode();
        }
        if (getDirection2() != null) {
            _hashCode += getDirection2().hashCode();
        }
        if (getDirection3() != null) {
            _hashCode += getDirection3().hashCode();
        }
        if (getTestQuestion() != null) {
            _hashCode += getTestQuestion().hashCode();
        }
        if (getTestAnswer() != null) {
            _hashCode += getTestAnswer().hashCode();
        }
        if (getMessageField1() != null) {
            _hashCode += getMessageField1().hashCode();
        }
        if (getMessageField2() != null) {
            _hashCode += getMessageField2().hashCode();
        }
        if (getSenderPhotoIdType() != null) {
            _hashCode += getSenderPhotoIdType().hashCode();
        }
        if (getSenderPhotoIdNumber() != null) {
            _hashCode += getSenderPhotoIdNumber().hashCode();
        }
        if (getSenderPhotoIdState() != null) {
            _hashCode += getSenderPhotoIdState().hashCode();
        }
        if (getSenderPhotoIdCountry() != null) {
            _hashCode += getSenderPhotoIdCountry().hashCode();
        }
        if (getSenderLegalIdType() != null) {
            _hashCode += getSenderLegalIdType().hashCode();
        }
        if (getSenderLegalIdNumber() != null) {
            _hashCode += getSenderLegalIdNumber().hashCode();
        }
        if (getSenderDOB() != null) {
            _hashCode += getSenderDOB().hashCode();
        }
        if (getSenderOccupation() != null) {
            _hashCode += getSenderOccupation().hashCode();
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
        if (getThirdPartyAddress() != null) {
            _hashCode += getThirdPartyAddress().hashCode();
        }
        if (getThirdPartyAddress2() != null) {
            _hashCode += getThirdPartyAddress2().hashCode();
        }
        if (getThirdPartyAddress3() != null) {
            _hashCode += getThirdPartyAddress3().hashCode();
        }
        if (getThirdPartyCity() != null) {
            _hashCode += getThirdPartyCity().hashCode();
        }
        if (getThirdPartyState() != null) {
            _hashCode += getThirdPartyState().hashCode();
        }
        if (getThirdPartyCountry() != null) {
            _hashCode += getThirdPartyCountry().hashCode();
        }
        if (getThirdPartyZipCode() != null) {
            _hashCode += getThirdPartyZipCode().hashCode();
        }
        if (getThirdPartyDOB() != null) {
            _hashCode += getThirdPartyDOB().hashCode();
        }
        if (getThirdPartyLegalIdType() != null) {
            _hashCode += getThirdPartyLegalIdType().hashCode();
        }
        if (getThirdPartyLegalIdNumber() != null) {
            _hashCode += getThirdPartyLegalIdNumber().hashCode();
        }
        if (getThirdPartyOccupation() != null) {
            _hashCode += getThirdPartyOccupation().hashCode();
        }
        if (getThirdPartyOrg() != null) {
            _hashCode += getThirdPartyOrg().hashCode();
        }
        if (getSenderBirthCity() != null) {
            _hashCode += getSenderBirthCity().hashCode();
        }
        if (getSenderBirthCountry() != null) {
            _hashCode += getSenderBirthCountry().hashCode();
        }
        if (getSenderPassportIssueDate() != null) {
            _hashCode += getSenderPassportIssueDate().hashCode();
        }
        if (getSenderPassportIssueCity() != null) {
            _hashCode += getSenderPassportIssueCity().hashCode();
        }
        if (getSenderPassportIssueCountry() != null) {
            _hashCode += getSenderPassportIssueCountry().hashCode();
        }
        if (getOperatorName() != null) {
            _hashCode += getOperatorName().hashCode();
        }
        if (getValidIndicator() != null) {
            _hashCode += getValidIndicator().hashCode();
        }
        if (getAgentUseSendData() != null) {
            _hashCode += getAgentUseSendData().hashCode();
        }
        if (getCustomerReceiveNumber() != null) {
            _hashCode += getCustomerReceiveNumber().hashCode();
        }
        if (getReceiveAgentID() != null) {
            _hashCode += getReceiveAgentID().hashCode();
        }
        if (getReceiveAgentName() != null) {
            _hashCode += getReceiveAgentName().hashCode();
        }
        if (getReceiveAgentAbbreviation() != null) {
            _hashCode += getReceiveAgentAbbreviation().hashCode();
        }
        if (getExpectedDateOfDelivery() != null) {
            _hashCode += getExpectedDateOfDelivery().hashCode();
        }
        if (getRedirectIndicator() != null) {
            _hashCode += getRedirectIndicator().hashCode();
        }
        if (getRedirectInfo() != null) {
            _hashCode += getRedirectInfo().hashCode();
        }
        if (getAgentCheckAuthorizationNumber() != null) {
            _hashCode += getAgentCheckAuthorizationNumber().hashCode();
        }
        if (getAccountNickname() != null) {
            _hashCode += getAccountNickname().hashCode();
        }
        if (getPromotionInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotionInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotionInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisclosureText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisclosureText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisclosureText(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeeRefundRequired() != null) {
            _hashCode += getFeeRefundRequired().hashCode();
        }
        if (getSendAmounts() != null) {
            _hashCode += getSendAmounts().hashCode();
        }
        if (getReceiveAmounts() != null) {
            _hashCode += getReceiveAmounts().hashCode();
        }
        if (getExchangeRateApplied() != null) {
            _hashCode += getExchangeRateApplied().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetailLookupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DetailLookupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgiTransactionSessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgiTransactionSessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "transactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "transactionStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeSent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dateTimeSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("receiveCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "deliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("senderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderCountry"));
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
        elemField.setFieldName("receiverCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverCountry"));
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
        elemField.setFieldName("direction1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "direction1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "direction2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "direction3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testQuestion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "testQuestion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testAnswer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "testAnswer"));
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
        elemField.setFieldName("senderPhotoIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderPhotoIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "photoIdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPhotoIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderPhotoIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPhotoIdState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderPhotoIdState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPhotoIdCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderPhotoIdCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderLegalIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderLegalIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "legalIdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderLegalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderLegalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderDOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderDOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderOccupation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderOccupation"));
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
        elemField.setFieldName("thirdPartyCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyCountry"));
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
        elemField.setFieldName("thirdPartyDOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyDOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("senderBirthCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderBirthCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderBirthCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderBirthCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPassportIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderPassportIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPassportIssueCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderPassportIssueCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPassportIssueCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderPassportIssueCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "operatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "validIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentUseSendData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentUseSendData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReceiveNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerReceiveNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAgentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAgentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAgentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAgentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAgentAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAgentAbbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDateOfDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "expectedDateOfDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "redirectIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "redirectInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RedirectInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCheckAuthorizationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentCheckAuthorizationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNickname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "accountNickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promotionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "PromotionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disclosureText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "disclosureText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeRefundRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "feeRefundRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendAmountInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveAmountInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRateApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "exchangeRateApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
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
