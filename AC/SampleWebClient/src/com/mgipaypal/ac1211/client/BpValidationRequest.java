/**
 * BpValidationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class BpValidationRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String operatorName;

    private com.mgipaypal.ac1211.client.ProductVariant productVariant;

    private java.lang.String serviceOfferingID;

    private java.math.BigDecimal amount;

    private java.lang.String mgiRewardsNumber;

    private java.lang.String destinationCountry;

    private java.lang.String receiveCode;

    private java.lang.String receiveAgentID;

    private java.lang.String billerAccountNumber;

    private java.lang.String validateAccountNumber;

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

    private java.math.BigDecimal feeAmount;

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

    private java.lang.String thirdPartyZipCode;

    private java.lang.String thirdPartyCountry;

    private com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType;

    private java.lang.String thirdPartyLegalIdNumber;

    private java.util.Date thirdPartyDOB;

    private java.lang.String thirdPartyOccupation;

    private java.lang.String thirdPartyOrg;

    private java.math.BigInteger accountNumberRetryCount;

    private java.lang.String agentUseSendData;

    private java.lang.String sendCurrency;

    private java.lang.String receiveCurrency;

    private java.lang.String pcTerminalNumber;

    private java.lang.Boolean cardSwiped;

    private java.lang.String cardExpirationMonth;

    private java.lang.String cardExpirationYear;

    private java.lang.String purposeOfFund;

    private java.lang.String confirmationNumber;

    private java.lang.String agentConsumerID;

    private java.lang.String agentTransactionId;

    private java.lang.String mgiTransactionSessionID;

    private boolean formFreeStaging;

    private java.math.BigInteger timeToLive;

    private java.lang.String primaryReceiptLanguage;

    private java.lang.String secondaryReceiptLanguage;

    private java.lang.String[] promoCodeValues;

    private com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues;

    public BpValidationRequest() {
    }

    public BpValidationRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String operatorName,
           com.mgipaypal.ac1211.client.ProductVariant productVariant,
           java.lang.String serviceOfferingID,
           java.math.BigDecimal amount,
           java.lang.String mgiRewardsNumber,
           java.lang.String destinationCountry,
           java.lang.String receiveCode,
           java.lang.String receiveAgentID,
           java.lang.String billerAccountNumber,
           java.lang.String validateAccountNumber,
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
           java.math.BigDecimal feeAmount,
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
           java.lang.String thirdPartyZipCode,
           java.lang.String thirdPartyCountry,
           com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType,
           java.lang.String thirdPartyLegalIdNumber,
           java.util.Date thirdPartyDOB,
           java.lang.String thirdPartyOccupation,
           java.lang.String thirdPartyOrg,
           java.math.BigInteger accountNumberRetryCount,
           java.lang.String agentUseSendData,
           java.lang.String sendCurrency,
           java.lang.String receiveCurrency,
           java.lang.String pcTerminalNumber,
           java.lang.Boolean cardSwiped,
           java.lang.String cardExpirationMonth,
           java.lang.String cardExpirationYear,
           java.lang.String purposeOfFund,
           java.lang.String confirmationNumber,
           java.lang.String agentConsumerID,
           java.lang.String agentTransactionId,
           java.lang.String mgiTransactionSessionID,
           boolean formFreeStaging,
           java.math.BigInteger timeToLive,
           java.lang.String primaryReceiptLanguage,
           java.lang.String secondaryReceiptLanguage,
           java.lang.String[] promoCodeValues,
           com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues) {
        super(
            unitProfileID,
            agentID,
            agentSequence,
            token,
            language,
            timeStamp,
            apiVersion,
            clientSoftwareVersion,
            userID);
        this.operatorName = operatorName;
        this.productVariant = productVariant;
        this.serviceOfferingID = serviceOfferingID;
        this.amount = amount;
        this.mgiRewardsNumber = mgiRewardsNumber;
        this.destinationCountry = destinationCountry;
        this.receiveCode = receiveCode;
        this.receiveAgentID = receiveAgentID;
        this.billerAccountNumber = billerAccountNumber;
        this.validateAccountNumber = validateAccountNumber;
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
        this.feeAmount = feeAmount;
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
        this.thirdPartyZipCode = thirdPartyZipCode;
        this.thirdPartyCountry = thirdPartyCountry;
        this.thirdPartyLegalIdType = thirdPartyLegalIdType;
        this.thirdPartyLegalIdNumber = thirdPartyLegalIdNumber;
        this.thirdPartyDOB = thirdPartyDOB;
        this.thirdPartyOccupation = thirdPartyOccupation;
        this.thirdPartyOrg = thirdPartyOrg;
        this.accountNumberRetryCount = accountNumberRetryCount;
        this.agentUseSendData = agentUseSendData;
        this.sendCurrency = sendCurrency;
        this.receiveCurrency = receiveCurrency;
        this.pcTerminalNumber = pcTerminalNumber;
        this.cardSwiped = cardSwiped;
        this.cardExpirationMonth = cardExpirationMonth;
        this.cardExpirationYear = cardExpirationYear;
        this.purposeOfFund = purposeOfFund;
        this.confirmationNumber = confirmationNumber;
        this.agentConsumerID = agentConsumerID;
        this.agentTransactionId = agentTransactionId;
        this.mgiTransactionSessionID = mgiTransactionSessionID;
        this.formFreeStaging = formFreeStaging;
        this.timeToLive = timeToLive;
        this.primaryReceiptLanguage = primaryReceiptLanguage;
        this.secondaryReceiptLanguage = secondaryReceiptLanguage;
        this.promoCodeValues = promoCodeValues;
        this.fieldValues = fieldValues;
    }


    /**
     * Gets the operatorName value for this BpValidationRequest.
     * 
     * @return operatorName
     */
    public java.lang.String getOperatorName() {
        return operatorName;
    }


    /**
     * Sets the operatorName value for this BpValidationRequest.
     * 
     * @param operatorName
     */
    public void setOperatorName(java.lang.String operatorName) {
        this.operatorName = operatorName;
    }


    /**
     * Gets the productVariant value for this BpValidationRequest.
     * 
     * @return productVariant
     */
    public com.mgipaypal.ac1211.client.ProductVariant getProductVariant() {
        return productVariant;
    }


    /**
     * Sets the productVariant value for this BpValidationRequest.
     * 
     * @param productVariant
     */
    public void setProductVariant(com.mgipaypal.ac1211.client.ProductVariant productVariant) {
        this.productVariant = productVariant;
    }


    /**
     * Gets the serviceOfferingID value for this BpValidationRequest.
     * 
     * @return serviceOfferingID
     */
    public java.lang.String getServiceOfferingID() {
        return serviceOfferingID;
    }


    /**
     * Sets the serviceOfferingID value for this BpValidationRequest.
     * 
     * @param serviceOfferingID
     */
    public void setServiceOfferingID(java.lang.String serviceOfferingID) {
        this.serviceOfferingID = serviceOfferingID;
    }


    /**
     * Gets the amount value for this BpValidationRequest.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BpValidationRequest.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the mgiRewardsNumber value for this BpValidationRequest.
     * 
     * @return mgiRewardsNumber
     */
    public java.lang.String getMgiRewardsNumber() {
        return mgiRewardsNumber;
    }


    /**
     * Sets the mgiRewardsNumber value for this BpValidationRequest.
     * 
     * @param mgiRewardsNumber
     */
    public void setMgiRewardsNumber(java.lang.String mgiRewardsNumber) {
        this.mgiRewardsNumber = mgiRewardsNumber;
    }


    /**
     * Gets the destinationCountry value for this BpValidationRequest.
     * 
     * @return destinationCountry
     */
    public java.lang.String getDestinationCountry() {
        return destinationCountry;
    }


    /**
     * Sets the destinationCountry value for this BpValidationRequest.
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(java.lang.String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }


    /**
     * Gets the receiveCode value for this BpValidationRequest.
     * 
     * @return receiveCode
     */
    public java.lang.String getReceiveCode() {
        return receiveCode;
    }


    /**
     * Sets the receiveCode value for this BpValidationRequest.
     * 
     * @param receiveCode
     */
    public void setReceiveCode(java.lang.String receiveCode) {
        this.receiveCode = receiveCode;
    }


    /**
     * Gets the receiveAgentID value for this BpValidationRequest.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this BpValidationRequest.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the billerAccountNumber value for this BpValidationRequest.
     * 
     * @return billerAccountNumber
     */
    public java.lang.String getBillerAccountNumber() {
        return billerAccountNumber;
    }


    /**
     * Sets the billerAccountNumber value for this BpValidationRequest.
     * 
     * @param billerAccountNumber
     */
    public void setBillerAccountNumber(java.lang.String billerAccountNumber) {
        this.billerAccountNumber = billerAccountNumber;
    }


    /**
     * Gets the validateAccountNumber value for this BpValidationRequest.
     * 
     * @return validateAccountNumber
     */
    public java.lang.String getValidateAccountNumber() {
        return validateAccountNumber;
    }


    /**
     * Sets the validateAccountNumber value for this BpValidationRequest.
     * 
     * @param validateAccountNumber
     */
    public void setValidateAccountNumber(java.lang.String validateAccountNumber) {
        this.validateAccountNumber = validateAccountNumber;
    }


    /**
     * Gets the senderFirstName value for this BpValidationRequest.
     * 
     * @return senderFirstName
     */
    public java.lang.String getSenderFirstName() {
        return senderFirstName;
    }


    /**
     * Sets the senderFirstName value for this BpValidationRequest.
     * 
     * @param senderFirstName
     */
    public void setSenderFirstName(java.lang.String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }


    /**
     * Gets the senderMiddleName value for this BpValidationRequest.
     * 
     * @return senderMiddleName
     */
    public java.lang.String getSenderMiddleName() {
        return senderMiddleName;
    }


    /**
     * Sets the senderMiddleName value for this BpValidationRequest.
     * 
     * @param senderMiddleName
     */
    public void setSenderMiddleName(java.lang.String senderMiddleName) {
        this.senderMiddleName = senderMiddleName;
    }


    /**
     * Gets the senderLastName value for this BpValidationRequest.
     * 
     * @return senderLastName
     */
    public java.lang.String getSenderLastName() {
        return senderLastName;
    }


    /**
     * Sets the senderLastName value for this BpValidationRequest.
     * 
     * @param senderLastName
     */
    public void setSenderLastName(java.lang.String senderLastName) {
        this.senderLastName = senderLastName;
    }


    /**
     * Gets the senderAddress value for this BpValidationRequest.
     * 
     * @return senderAddress
     */
    public java.lang.String getSenderAddress() {
        return senderAddress;
    }


    /**
     * Sets the senderAddress value for this BpValidationRequest.
     * 
     * @param senderAddress
     */
    public void setSenderAddress(java.lang.String senderAddress) {
        this.senderAddress = senderAddress;
    }


    /**
     * Gets the senderAddress2 value for this BpValidationRequest.
     * 
     * @return senderAddress2
     */
    public java.lang.String getSenderAddress2() {
        return senderAddress2;
    }


    /**
     * Sets the senderAddress2 value for this BpValidationRequest.
     * 
     * @param senderAddress2
     */
    public void setSenderAddress2(java.lang.String senderAddress2) {
        this.senderAddress2 = senderAddress2;
    }


    /**
     * Gets the senderAddress3 value for this BpValidationRequest.
     * 
     * @return senderAddress3
     */
    public java.lang.String getSenderAddress3() {
        return senderAddress3;
    }


    /**
     * Sets the senderAddress3 value for this BpValidationRequest.
     * 
     * @param senderAddress3
     */
    public void setSenderAddress3(java.lang.String senderAddress3) {
        this.senderAddress3 = senderAddress3;
    }


    /**
     * Gets the senderCity value for this BpValidationRequest.
     * 
     * @return senderCity
     */
    public java.lang.String getSenderCity() {
        return senderCity;
    }


    /**
     * Sets the senderCity value for this BpValidationRequest.
     * 
     * @param senderCity
     */
    public void setSenderCity(java.lang.String senderCity) {
        this.senderCity = senderCity;
    }


    /**
     * Gets the senderState value for this BpValidationRequest.
     * 
     * @return senderState
     */
    public java.lang.String getSenderState() {
        return senderState;
    }


    /**
     * Sets the senderState value for this BpValidationRequest.
     * 
     * @param senderState
     */
    public void setSenderState(java.lang.String senderState) {
        this.senderState = senderState;
    }


    /**
     * Gets the senderZipCode value for this BpValidationRequest.
     * 
     * @return senderZipCode
     */
    public java.lang.String getSenderZipCode() {
        return senderZipCode;
    }


    /**
     * Sets the senderZipCode value for this BpValidationRequest.
     * 
     * @param senderZipCode
     */
    public void setSenderZipCode(java.lang.String senderZipCode) {
        this.senderZipCode = senderZipCode;
    }


    /**
     * Gets the senderCountry value for this BpValidationRequest.
     * 
     * @return senderCountry
     */
    public java.lang.String getSenderCountry() {
        return senderCountry;
    }


    /**
     * Sets the senderCountry value for this BpValidationRequest.
     * 
     * @param senderCountry
     */
    public void setSenderCountry(java.lang.String senderCountry) {
        this.senderCountry = senderCountry;
    }


    /**
     * Gets the senderHomePhone value for this BpValidationRequest.
     * 
     * @return senderHomePhone
     */
    public java.lang.String getSenderHomePhone() {
        return senderHomePhone;
    }


    /**
     * Sets the senderHomePhone value for this BpValidationRequest.
     * 
     * @param senderHomePhone
     */
    public void setSenderHomePhone(java.lang.String senderHomePhone) {
        this.senderHomePhone = senderHomePhone;
    }


    /**
     * Gets the receiverFirstName value for this BpValidationRequest.
     * 
     * @return receiverFirstName
     */
    public java.lang.String getReceiverFirstName() {
        return receiverFirstName;
    }


    /**
     * Sets the receiverFirstName value for this BpValidationRequest.
     * 
     * @param receiverFirstName
     */
    public void setReceiverFirstName(java.lang.String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }


    /**
     * Gets the receiverMiddleName value for this BpValidationRequest.
     * 
     * @return receiverMiddleName
     */
    public java.lang.String getReceiverMiddleName() {
        return receiverMiddleName;
    }


    /**
     * Sets the receiverMiddleName value for this BpValidationRequest.
     * 
     * @param receiverMiddleName
     */
    public void setReceiverMiddleName(java.lang.String receiverMiddleName) {
        this.receiverMiddleName = receiverMiddleName;
    }


    /**
     * Gets the receiverLastName value for this BpValidationRequest.
     * 
     * @return receiverLastName
     */
    public java.lang.String getReceiverLastName() {
        return receiverLastName;
    }


    /**
     * Sets the receiverLastName value for this BpValidationRequest.
     * 
     * @param receiverLastName
     */
    public void setReceiverLastName(java.lang.String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }


    /**
     * Gets the receiverLastName2 value for this BpValidationRequest.
     * 
     * @return receiverLastName2
     */
    public java.lang.String getReceiverLastName2() {
        return receiverLastName2;
    }


    /**
     * Sets the receiverLastName2 value for this BpValidationRequest.
     * 
     * @param receiverLastName2
     */
    public void setReceiverLastName2(java.lang.String receiverLastName2) {
        this.receiverLastName2 = receiverLastName2;
    }


    /**
     * Gets the feeAmount value for this BpValidationRequest.
     * 
     * @return feeAmount
     */
    public java.math.BigDecimal getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this BpValidationRequest.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(java.math.BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the messageField1 value for this BpValidationRequest.
     * 
     * @return messageField1
     */
    public java.lang.String getMessageField1() {
        return messageField1;
    }


    /**
     * Sets the messageField1 value for this BpValidationRequest.
     * 
     * @param messageField1
     */
    public void setMessageField1(java.lang.String messageField1) {
        this.messageField1 = messageField1;
    }


    /**
     * Gets the messageField2 value for this BpValidationRequest.
     * 
     * @return messageField2
     */
    public java.lang.String getMessageField2() {
        return messageField2;
    }


    /**
     * Sets the messageField2 value for this BpValidationRequest.
     * 
     * @param messageField2
     */
    public void setMessageField2(java.lang.String messageField2) {
        this.messageField2 = messageField2;
    }


    /**
     * Gets the senderPhotoIdType value for this BpValidationRequest.
     * 
     * @return senderPhotoIdType
     */
    public com.mgipaypal.ac1211.client.PhotoIdType getSenderPhotoIdType() {
        return senderPhotoIdType;
    }


    /**
     * Sets the senderPhotoIdType value for this BpValidationRequest.
     * 
     * @param senderPhotoIdType
     */
    public void setSenderPhotoIdType(com.mgipaypal.ac1211.client.PhotoIdType senderPhotoIdType) {
        this.senderPhotoIdType = senderPhotoIdType;
    }


    /**
     * Gets the senderPhotoIdNumber value for this BpValidationRequest.
     * 
     * @return senderPhotoIdNumber
     */
    public java.lang.String getSenderPhotoIdNumber() {
        return senderPhotoIdNumber;
    }


    /**
     * Sets the senderPhotoIdNumber value for this BpValidationRequest.
     * 
     * @param senderPhotoIdNumber
     */
    public void setSenderPhotoIdNumber(java.lang.String senderPhotoIdNumber) {
        this.senderPhotoIdNumber = senderPhotoIdNumber;
    }


    /**
     * Gets the senderPhotoIdState value for this BpValidationRequest.
     * 
     * @return senderPhotoIdState
     */
    public java.lang.String getSenderPhotoIdState() {
        return senderPhotoIdState;
    }


    /**
     * Sets the senderPhotoIdState value for this BpValidationRequest.
     * 
     * @param senderPhotoIdState
     */
    public void setSenderPhotoIdState(java.lang.String senderPhotoIdState) {
        this.senderPhotoIdState = senderPhotoIdState;
    }


    /**
     * Gets the senderPhotoIdCountry value for this BpValidationRequest.
     * 
     * @return senderPhotoIdCountry
     */
    public java.lang.String getSenderPhotoIdCountry() {
        return senderPhotoIdCountry;
    }


    /**
     * Sets the senderPhotoIdCountry value for this BpValidationRequest.
     * 
     * @param senderPhotoIdCountry
     */
    public void setSenderPhotoIdCountry(java.lang.String senderPhotoIdCountry) {
        this.senderPhotoIdCountry = senderPhotoIdCountry;
    }


    /**
     * Gets the senderLegalIdType value for this BpValidationRequest.
     * 
     * @return senderLegalIdType
     */
    public com.mgipaypal.ac1211.client.LegalIdType getSenderLegalIdType() {
        return senderLegalIdType;
    }


    /**
     * Sets the senderLegalIdType value for this BpValidationRequest.
     * 
     * @param senderLegalIdType
     */
    public void setSenderLegalIdType(com.mgipaypal.ac1211.client.LegalIdType senderLegalIdType) {
        this.senderLegalIdType = senderLegalIdType;
    }


    /**
     * Gets the senderLegalIdNumber value for this BpValidationRequest.
     * 
     * @return senderLegalIdNumber
     */
    public java.lang.String getSenderLegalIdNumber() {
        return senderLegalIdNumber;
    }


    /**
     * Sets the senderLegalIdNumber value for this BpValidationRequest.
     * 
     * @param senderLegalIdNumber
     */
    public void setSenderLegalIdNumber(java.lang.String senderLegalIdNumber) {
        this.senderLegalIdNumber = senderLegalIdNumber;
    }


    /**
     * Gets the senderDOB value for this BpValidationRequest.
     * 
     * @return senderDOB
     */
    public java.util.Date getSenderDOB() {
        return senderDOB;
    }


    /**
     * Sets the senderDOB value for this BpValidationRequest.
     * 
     * @param senderDOB
     */
    public void setSenderDOB(java.util.Date senderDOB) {
        this.senderDOB = senderDOB;
    }


    /**
     * Gets the senderOccupation value for this BpValidationRequest.
     * 
     * @return senderOccupation
     */
    public java.lang.String getSenderOccupation() {
        return senderOccupation;
    }


    /**
     * Sets the senderOccupation value for this BpValidationRequest.
     * 
     * @param senderOccupation
     */
    public void setSenderOccupation(java.lang.String senderOccupation) {
        this.senderOccupation = senderOccupation;
    }


    /**
     * Gets the thirdPartyFirstName value for this BpValidationRequest.
     * 
     * @return thirdPartyFirstName
     */
    public java.lang.String getThirdPartyFirstName() {
        return thirdPartyFirstName;
    }


    /**
     * Sets the thirdPartyFirstName value for this BpValidationRequest.
     * 
     * @param thirdPartyFirstName
     */
    public void setThirdPartyFirstName(java.lang.String thirdPartyFirstName) {
        this.thirdPartyFirstName = thirdPartyFirstName;
    }


    /**
     * Gets the thirdPartyMiddleName value for this BpValidationRequest.
     * 
     * @return thirdPartyMiddleName
     */
    public java.lang.String getThirdPartyMiddleName() {
        return thirdPartyMiddleName;
    }


    /**
     * Sets the thirdPartyMiddleName value for this BpValidationRequest.
     * 
     * @param thirdPartyMiddleName
     */
    public void setThirdPartyMiddleName(java.lang.String thirdPartyMiddleName) {
        this.thirdPartyMiddleName = thirdPartyMiddleName;
    }


    /**
     * Gets the thirdPartyLastName value for this BpValidationRequest.
     * 
     * @return thirdPartyLastName
     */
    public java.lang.String getThirdPartyLastName() {
        return thirdPartyLastName;
    }


    /**
     * Sets the thirdPartyLastName value for this BpValidationRequest.
     * 
     * @param thirdPartyLastName
     */
    public void setThirdPartyLastName(java.lang.String thirdPartyLastName) {
        this.thirdPartyLastName = thirdPartyLastName;
    }


    /**
     * Gets the thirdPartyAddress value for this BpValidationRequest.
     * 
     * @return thirdPartyAddress
     */
    public java.lang.String getThirdPartyAddress() {
        return thirdPartyAddress;
    }


    /**
     * Sets the thirdPartyAddress value for this BpValidationRequest.
     * 
     * @param thirdPartyAddress
     */
    public void setThirdPartyAddress(java.lang.String thirdPartyAddress) {
        this.thirdPartyAddress = thirdPartyAddress;
    }


    /**
     * Gets the thirdPartyAddress2 value for this BpValidationRequest.
     * 
     * @return thirdPartyAddress2
     */
    public java.lang.String getThirdPartyAddress2() {
        return thirdPartyAddress2;
    }


    /**
     * Sets the thirdPartyAddress2 value for this BpValidationRequest.
     * 
     * @param thirdPartyAddress2
     */
    public void setThirdPartyAddress2(java.lang.String thirdPartyAddress2) {
        this.thirdPartyAddress2 = thirdPartyAddress2;
    }


    /**
     * Gets the thirdPartyAddress3 value for this BpValidationRequest.
     * 
     * @return thirdPartyAddress3
     */
    public java.lang.String getThirdPartyAddress3() {
        return thirdPartyAddress3;
    }


    /**
     * Sets the thirdPartyAddress3 value for this BpValidationRequest.
     * 
     * @param thirdPartyAddress3
     */
    public void setThirdPartyAddress3(java.lang.String thirdPartyAddress3) {
        this.thirdPartyAddress3 = thirdPartyAddress3;
    }


    /**
     * Gets the thirdPartyCity value for this BpValidationRequest.
     * 
     * @return thirdPartyCity
     */
    public java.lang.String getThirdPartyCity() {
        return thirdPartyCity;
    }


    /**
     * Sets the thirdPartyCity value for this BpValidationRequest.
     * 
     * @param thirdPartyCity
     */
    public void setThirdPartyCity(java.lang.String thirdPartyCity) {
        this.thirdPartyCity = thirdPartyCity;
    }


    /**
     * Gets the thirdPartyState value for this BpValidationRequest.
     * 
     * @return thirdPartyState
     */
    public java.lang.String getThirdPartyState() {
        return thirdPartyState;
    }


    /**
     * Sets the thirdPartyState value for this BpValidationRequest.
     * 
     * @param thirdPartyState
     */
    public void setThirdPartyState(java.lang.String thirdPartyState) {
        this.thirdPartyState = thirdPartyState;
    }


    /**
     * Gets the thirdPartyZipCode value for this BpValidationRequest.
     * 
     * @return thirdPartyZipCode
     */
    public java.lang.String getThirdPartyZipCode() {
        return thirdPartyZipCode;
    }


    /**
     * Sets the thirdPartyZipCode value for this BpValidationRequest.
     * 
     * @param thirdPartyZipCode
     */
    public void setThirdPartyZipCode(java.lang.String thirdPartyZipCode) {
        this.thirdPartyZipCode = thirdPartyZipCode;
    }


    /**
     * Gets the thirdPartyCountry value for this BpValidationRequest.
     * 
     * @return thirdPartyCountry
     */
    public java.lang.String getThirdPartyCountry() {
        return thirdPartyCountry;
    }


    /**
     * Sets the thirdPartyCountry value for this BpValidationRequest.
     * 
     * @param thirdPartyCountry
     */
    public void setThirdPartyCountry(java.lang.String thirdPartyCountry) {
        this.thirdPartyCountry = thirdPartyCountry;
    }


    /**
     * Gets the thirdPartyLegalIdType value for this BpValidationRequest.
     * 
     * @return thirdPartyLegalIdType
     */
    public com.mgipaypal.ac1211.client.LegalIdType getThirdPartyLegalIdType() {
        return thirdPartyLegalIdType;
    }


    /**
     * Sets the thirdPartyLegalIdType value for this BpValidationRequest.
     * 
     * @param thirdPartyLegalIdType
     */
    public void setThirdPartyLegalIdType(com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType) {
        this.thirdPartyLegalIdType = thirdPartyLegalIdType;
    }


    /**
     * Gets the thirdPartyLegalIdNumber value for this BpValidationRequest.
     * 
     * @return thirdPartyLegalIdNumber
     */
    public java.lang.String getThirdPartyLegalIdNumber() {
        return thirdPartyLegalIdNumber;
    }


    /**
     * Sets the thirdPartyLegalIdNumber value for this BpValidationRequest.
     * 
     * @param thirdPartyLegalIdNumber
     */
    public void setThirdPartyLegalIdNumber(java.lang.String thirdPartyLegalIdNumber) {
        this.thirdPartyLegalIdNumber = thirdPartyLegalIdNumber;
    }


    /**
     * Gets the thirdPartyDOB value for this BpValidationRequest.
     * 
     * @return thirdPartyDOB
     */
    public java.util.Date getThirdPartyDOB() {
        return thirdPartyDOB;
    }


    /**
     * Sets the thirdPartyDOB value for this BpValidationRequest.
     * 
     * @param thirdPartyDOB
     */
    public void setThirdPartyDOB(java.util.Date thirdPartyDOB) {
        this.thirdPartyDOB = thirdPartyDOB;
    }


    /**
     * Gets the thirdPartyOccupation value for this BpValidationRequest.
     * 
     * @return thirdPartyOccupation
     */
    public java.lang.String getThirdPartyOccupation() {
        return thirdPartyOccupation;
    }


    /**
     * Sets the thirdPartyOccupation value for this BpValidationRequest.
     * 
     * @param thirdPartyOccupation
     */
    public void setThirdPartyOccupation(java.lang.String thirdPartyOccupation) {
        this.thirdPartyOccupation = thirdPartyOccupation;
    }


    /**
     * Gets the thirdPartyOrg value for this BpValidationRequest.
     * 
     * @return thirdPartyOrg
     */
    public java.lang.String getThirdPartyOrg() {
        return thirdPartyOrg;
    }


    /**
     * Sets the thirdPartyOrg value for this BpValidationRequest.
     * 
     * @param thirdPartyOrg
     */
    public void setThirdPartyOrg(java.lang.String thirdPartyOrg) {
        this.thirdPartyOrg = thirdPartyOrg;
    }


    /**
     * Gets the accountNumberRetryCount value for this BpValidationRequest.
     * 
     * @return accountNumberRetryCount
     */
    public java.math.BigInteger getAccountNumberRetryCount() {
        return accountNumberRetryCount;
    }


    /**
     * Sets the accountNumberRetryCount value for this BpValidationRequest.
     * 
     * @param accountNumberRetryCount
     */
    public void setAccountNumberRetryCount(java.math.BigInteger accountNumberRetryCount) {
        this.accountNumberRetryCount = accountNumberRetryCount;
    }


    /**
     * Gets the agentUseSendData value for this BpValidationRequest.
     * 
     * @return agentUseSendData
     */
    public java.lang.String getAgentUseSendData() {
        return agentUseSendData;
    }


    /**
     * Sets the agentUseSendData value for this BpValidationRequest.
     * 
     * @param agentUseSendData
     */
    public void setAgentUseSendData(java.lang.String agentUseSendData) {
        this.agentUseSendData = agentUseSendData;
    }


    /**
     * Gets the sendCurrency value for this BpValidationRequest.
     * 
     * @return sendCurrency
     */
    public java.lang.String getSendCurrency() {
        return sendCurrency;
    }


    /**
     * Sets the sendCurrency value for this BpValidationRequest.
     * 
     * @param sendCurrency
     */
    public void setSendCurrency(java.lang.String sendCurrency) {
        this.sendCurrency = sendCurrency;
    }


    /**
     * Gets the receiveCurrency value for this BpValidationRequest.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this BpValidationRequest.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the pcTerminalNumber value for this BpValidationRequest.
     * 
     * @return pcTerminalNumber
     */
    public java.lang.String getPcTerminalNumber() {
        return pcTerminalNumber;
    }


    /**
     * Sets the pcTerminalNumber value for this BpValidationRequest.
     * 
     * @param pcTerminalNumber
     */
    public void setPcTerminalNumber(java.lang.String pcTerminalNumber) {
        this.pcTerminalNumber = pcTerminalNumber;
    }


    /**
     * Gets the cardSwiped value for this BpValidationRequest.
     * 
     * @return cardSwiped
     */
    public java.lang.Boolean getCardSwiped() {
        return cardSwiped;
    }


    /**
     * Sets the cardSwiped value for this BpValidationRequest.
     * 
     * @param cardSwiped
     */
    public void setCardSwiped(java.lang.Boolean cardSwiped) {
        this.cardSwiped = cardSwiped;
    }


    /**
     * Gets the cardExpirationMonth value for this BpValidationRequest.
     * 
     * @return cardExpirationMonth
     */
    public java.lang.String getCardExpirationMonth() {
        return cardExpirationMonth;
    }


    /**
     * Sets the cardExpirationMonth value for this BpValidationRequest.
     * 
     * @param cardExpirationMonth
     */
    public void setCardExpirationMonth(java.lang.String cardExpirationMonth) {
        this.cardExpirationMonth = cardExpirationMonth;
    }


    /**
     * Gets the cardExpirationYear value for this BpValidationRequest.
     * 
     * @return cardExpirationYear
     */
    public java.lang.String getCardExpirationYear() {
        return cardExpirationYear;
    }


    /**
     * Sets the cardExpirationYear value for this BpValidationRequest.
     * 
     * @param cardExpirationYear
     */
    public void setCardExpirationYear(java.lang.String cardExpirationYear) {
        this.cardExpirationYear = cardExpirationYear;
    }


    /**
     * Gets the purposeOfFund value for this BpValidationRequest.
     * 
     * @return purposeOfFund
     */
    public java.lang.String getPurposeOfFund() {
        return purposeOfFund;
    }


    /**
     * Sets the purposeOfFund value for this BpValidationRequest.
     * 
     * @param purposeOfFund
     */
    public void setPurposeOfFund(java.lang.String purposeOfFund) {
        this.purposeOfFund = purposeOfFund;
    }


    /**
     * Gets the confirmationNumber value for this BpValidationRequest.
     * 
     * @return confirmationNumber
     */
    public java.lang.String getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this BpValidationRequest.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(java.lang.String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }


    /**
     * Gets the agentConsumerID value for this BpValidationRequest.
     * 
     * @return agentConsumerID
     */
    public java.lang.String getAgentConsumerID() {
        return agentConsumerID;
    }


    /**
     * Sets the agentConsumerID value for this BpValidationRequest.
     * 
     * @param agentConsumerID
     */
    public void setAgentConsumerID(java.lang.String agentConsumerID) {
        this.agentConsumerID = agentConsumerID;
    }


    /**
     * Gets the agentTransactionId value for this BpValidationRequest.
     * 
     * @return agentTransactionId
     */
    public java.lang.String getAgentTransactionId() {
        return agentTransactionId;
    }


    /**
     * Sets the agentTransactionId value for this BpValidationRequest.
     * 
     * @param agentTransactionId
     */
    public void setAgentTransactionId(java.lang.String agentTransactionId) {
        this.agentTransactionId = agentTransactionId;
    }


    /**
     * Gets the mgiTransactionSessionID value for this BpValidationRequest.
     * 
     * @return mgiTransactionSessionID
     */
    public java.lang.String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }


    /**
     * Sets the mgiTransactionSessionID value for this BpValidationRequest.
     * 
     * @param mgiTransactionSessionID
     */
    public void setMgiTransactionSessionID(java.lang.String mgiTransactionSessionID) {
        this.mgiTransactionSessionID = mgiTransactionSessionID;
    }


    /**
     * Gets the formFreeStaging value for this BpValidationRequest.
     * 
     * @return formFreeStaging
     */
    public boolean isFormFreeStaging() {
        return formFreeStaging;
    }


    /**
     * Sets the formFreeStaging value for this BpValidationRequest.
     * 
     * @param formFreeStaging
     */
    public void setFormFreeStaging(boolean formFreeStaging) {
        this.formFreeStaging = formFreeStaging;
    }


    /**
     * Gets the timeToLive value for this BpValidationRequest.
     * 
     * @return timeToLive
     */
    public java.math.BigInteger getTimeToLive() {
        return timeToLive;
    }


    /**
     * Sets the timeToLive value for this BpValidationRequest.
     * 
     * @param timeToLive
     */
    public void setTimeToLive(java.math.BigInteger timeToLive) {
        this.timeToLive = timeToLive;
    }


    /**
     * Gets the primaryReceiptLanguage value for this BpValidationRequest.
     * 
     * @return primaryReceiptLanguage
     */
    public java.lang.String getPrimaryReceiptLanguage() {
        return primaryReceiptLanguage;
    }


    /**
     * Sets the primaryReceiptLanguage value for this BpValidationRequest.
     * 
     * @param primaryReceiptLanguage
     */
    public void setPrimaryReceiptLanguage(java.lang.String primaryReceiptLanguage) {
        this.primaryReceiptLanguage = primaryReceiptLanguage;
    }


    /**
     * Gets the secondaryReceiptLanguage value for this BpValidationRequest.
     * 
     * @return secondaryReceiptLanguage
     */
    public java.lang.String getSecondaryReceiptLanguage() {
        return secondaryReceiptLanguage;
    }


    /**
     * Sets the secondaryReceiptLanguage value for this BpValidationRequest.
     * 
     * @param secondaryReceiptLanguage
     */
    public void setSecondaryReceiptLanguage(java.lang.String secondaryReceiptLanguage) {
        this.secondaryReceiptLanguage = secondaryReceiptLanguage;
    }


    /**
     * Gets the promoCodeValues value for this BpValidationRequest.
     * 
     * @return promoCodeValues
     */
    public java.lang.String[] getPromoCodeValues() {
        return promoCodeValues;
    }


    /**
     * Sets the promoCodeValues value for this BpValidationRequest.
     * 
     * @param promoCodeValues
     */
    public void setPromoCodeValues(java.lang.String[] promoCodeValues) {
        this.promoCodeValues = promoCodeValues;
    }


    /**
     * Gets the fieldValues value for this BpValidationRequest.
     * 
     * @return fieldValues
     */
    public com.mgipaypal.ac1211.client.KeyValuePair[] getFieldValues() {
        return fieldValues;
    }


    /**
     * Sets the fieldValues value for this BpValidationRequest.
     * 
     * @param fieldValues
     */
    public void setFieldValues(com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues) {
        this.fieldValues = fieldValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BpValidationRequest)) return false;
        BpValidationRequest other = (BpValidationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operatorName==null && other.getOperatorName()==null) || 
             (this.operatorName!=null &&
              this.operatorName.equals(other.getOperatorName()))) &&
            ((this.productVariant==null && other.getProductVariant()==null) || 
             (this.productVariant!=null &&
              this.productVariant.equals(other.getProductVariant()))) &&
            ((this.serviceOfferingID==null && other.getServiceOfferingID()==null) || 
             (this.serviceOfferingID!=null &&
              this.serviceOfferingID.equals(other.getServiceOfferingID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.mgiRewardsNumber==null && other.getMgiRewardsNumber()==null) || 
             (this.mgiRewardsNumber!=null &&
              this.mgiRewardsNumber.equals(other.getMgiRewardsNumber()))) &&
            ((this.destinationCountry==null && other.getDestinationCountry()==null) || 
             (this.destinationCountry!=null &&
              this.destinationCountry.equals(other.getDestinationCountry()))) &&
            ((this.receiveCode==null && other.getReceiveCode()==null) || 
             (this.receiveCode!=null &&
              this.receiveCode.equals(other.getReceiveCode()))) &&
            ((this.receiveAgentID==null && other.getReceiveAgentID()==null) || 
             (this.receiveAgentID!=null &&
              this.receiveAgentID.equals(other.getReceiveAgentID()))) &&
            ((this.billerAccountNumber==null && other.getBillerAccountNumber()==null) || 
             (this.billerAccountNumber!=null &&
              this.billerAccountNumber.equals(other.getBillerAccountNumber()))) &&
            ((this.validateAccountNumber==null && other.getValidateAccountNumber()==null) || 
             (this.validateAccountNumber!=null &&
              this.validateAccountNumber.equals(other.getValidateAccountNumber()))) &&
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
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
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
            ((this.accountNumberRetryCount==null && other.getAccountNumberRetryCount()==null) || 
             (this.accountNumberRetryCount!=null &&
              this.accountNumberRetryCount.equals(other.getAccountNumberRetryCount()))) &&
            ((this.agentUseSendData==null && other.getAgentUseSendData()==null) || 
             (this.agentUseSendData!=null &&
              this.agentUseSendData.equals(other.getAgentUseSendData()))) &&
            ((this.sendCurrency==null && other.getSendCurrency()==null) || 
             (this.sendCurrency!=null &&
              this.sendCurrency.equals(other.getSendCurrency()))) &&
            ((this.receiveCurrency==null && other.getReceiveCurrency()==null) || 
             (this.receiveCurrency!=null &&
              this.receiveCurrency.equals(other.getReceiveCurrency()))) &&
            ((this.pcTerminalNumber==null && other.getPcTerminalNumber()==null) || 
             (this.pcTerminalNumber!=null &&
              this.pcTerminalNumber.equals(other.getPcTerminalNumber()))) &&
            ((this.cardSwiped==null && other.getCardSwiped()==null) || 
             (this.cardSwiped!=null &&
              this.cardSwiped.equals(other.getCardSwiped()))) &&
            ((this.cardExpirationMonth==null && other.getCardExpirationMonth()==null) || 
             (this.cardExpirationMonth!=null &&
              this.cardExpirationMonth.equals(other.getCardExpirationMonth()))) &&
            ((this.cardExpirationYear==null && other.getCardExpirationYear()==null) || 
             (this.cardExpirationYear!=null &&
              this.cardExpirationYear.equals(other.getCardExpirationYear()))) &&
            ((this.purposeOfFund==null && other.getPurposeOfFund()==null) || 
             (this.purposeOfFund!=null &&
              this.purposeOfFund.equals(other.getPurposeOfFund()))) &&
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              this.confirmationNumber.equals(other.getConfirmationNumber()))) &&
            ((this.agentConsumerID==null && other.getAgentConsumerID()==null) || 
             (this.agentConsumerID!=null &&
              this.agentConsumerID.equals(other.getAgentConsumerID()))) &&
            ((this.agentTransactionId==null && other.getAgentTransactionId()==null) || 
             (this.agentTransactionId!=null &&
              this.agentTransactionId.equals(other.getAgentTransactionId()))) &&
            ((this.mgiTransactionSessionID==null && other.getMgiTransactionSessionID()==null) || 
             (this.mgiTransactionSessionID!=null &&
              this.mgiTransactionSessionID.equals(other.getMgiTransactionSessionID()))) &&
            this.formFreeStaging == other.isFormFreeStaging() &&
            ((this.timeToLive==null && other.getTimeToLive()==null) || 
             (this.timeToLive!=null &&
              this.timeToLive.equals(other.getTimeToLive()))) &&
            ((this.primaryReceiptLanguage==null && other.getPrimaryReceiptLanguage()==null) || 
             (this.primaryReceiptLanguage!=null &&
              this.primaryReceiptLanguage.equals(other.getPrimaryReceiptLanguage()))) &&
            ((this.secondaryReceiptLanguage==null && other.getSecondaryReceiptLanguage()==null) || 
             (this.secondaryReceiptLanguage!=null &&
              this.secondaryReceiptLanguage.equals(other.getSecondaryReceiptLanguage()))) &&
            ((this.promoCodeValues==null && other.getPromoCodeValues()==null) || 
             (this.promoCodeValues!=null &&
              java.util.Arrays.equals(this.promoCodeValues, other.getPromoCodeValues()))) &&
            ((this.fieldValues==null && other.getFieldValues()==null) || 
             (this.fieldValues!=null &&
              java.util.Arrays.equals(this.fieldValues, other.getFieldValues())));
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
        if (getOperatorName() != null) {
            _hashCode += getOperatorName().hashCode();
        }
        if (getProductVariant() != null) {
            _hashCode += getProductVariant().hashCode();
        }
        if (getServiceOfferingID() != null) {
            _hashCode += getServiceOfferingID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMgiRewardsNumber() != null) {
            _hashCode += getMgiRewardsNumber().hashCode();
        }
        if (getDestinationCountry() != null) {
            _hashCode += getDestinationCountry().hashCode();
        }
        if (getReceiveCode() != null) {
            _hashCode += getReceiveCode().hashCode();
        }
        if (getReceiveAgentID() != null) {
            _hashCode += getReceiveAgentID().hashCode();
        }
        if (getBillerAccountNumber() != null) {
            _hashCode += getBillerAccountNumber().hashCode();
        }
        if (getValidateAccountNumber() != null) {
            _hashCode += getValidateAccountNumber().hashCode();
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
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
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
        if (getAccountNumberRetryCount() != null) {
            _hashCode += getAccountNumberRetryCount().hashCode();
        }
        if (getAgentUseSendData() != null) {
            _hashCode += getAgentUseSendData().hashCode();
        }
        if (getSendCurrency() != null) {
            _hashCode += getSendCurrency().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        if (getPcTerminalNumber() != null) {
            _hashCode += getPcTerminalNumber().hashCode();
        }
        if (getCardSwiped() != null) {
            _hashCode += getCardSwiped().hashCode();
        }
        if (getCardExpirationMonth() != null) {
            _hashCode += getCardExpirationMonth().hashCode();
        }
        if (getCardExpirationYear() != null) {
            _hashCode += getCardExpirationYear().hashCode();
        }
        if (getPurposeOfFund() != null) {
            _hashCode += getPurposeOfFund().hashCode();
        }
        if (getConfirmationNumber() != null) {
            _hashCode += getConfirmationNumber().hashCode();
        }
        if (getAgentConsumerID() != null) {
            _hashCode += getAgentConsumerID().hashCode();
        }
        if (getAgentTransactionId() != null) {
            _hashCode += getAgentTransactionId().hashCode();
        }
        if (getMgiTransactionSessionID() != null) {
            _hashCode += getMgiTransactionSessionID().hashCode();
        }
        _hashCode += (isFormFreeStaging() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTimeToLive() != null) {
            _hashCode += getTimeToLive().hashCode();
        }
        if (getPrimaryReceiptLanguage() != null) {
            _hashCode += getPrimaryReceiptLanguage().hashCode();
        }
        if (getSecondaryReceiptLanguage() != null) {
            _hashCode += getSecondaryReceiptLanguage().hashCode();
        }
        if (getPromoCodeValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromoCodeValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromoCodeValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BpValidationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BpValidationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "operatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOfferingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "serviceOfferingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgiRewardsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgiRewardsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "destinationCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCode"));
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
        elemField.setFieldName("billerAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validateAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "validateAccountNumber"));
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
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "feeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("accountNumberRetryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "accountNumberRetryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("sendCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcTerminalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "pcTerminalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardSwiped");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cardSwiped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardExpirationMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cardExpirationMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardExpirationYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cardExpirationYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purposeOfFund");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "purposeOfFund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "confirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentConsumerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentConsumerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgiTransactionSessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgiTransactionSessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formFreeStaging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "formFreeStaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeToLive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "timeToLive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryReceiptLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "primaryReceiptLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryReceiptLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "secondaryReceiptLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCodeValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promoCodeValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax20"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promoCode"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "KeyValuePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "keyValuePair"));
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
