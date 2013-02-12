/**
 * SendValidationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class SendValidationRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String operatorName;

    private java.math.BigDecimal amount;

    private java.math.BigDecimal feeAmount;

    private java.lang.String mgiRewardsNumber;

    private java.lang.String agentCustomerNumber;

    private java.lang.String destinationCountry;

    private java.lang.String destinationState;

    private java.lang.String deliveryOption;

    private java.lang.String receiveCurrency;

    private java.lang.String receiveAgentID;

    private java.lang.String accountNumber;

    private java.lang.String customerReceiveNumber;

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

    private java.lang.String direction1;

    private java.lang.String direction2;

    private java.lang.String direction3;

    private java.lang.String receiverCity;

    private java.lang.String receiverState;

    private java.lang.String receiverZipCode;

    private java.lang.String receiverCountry;

    private java.lang.String receiverPhone;

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

    private java.lang.String thirdPartyZipCode;

    private java.lang.String thirdPartyCountry;

    private com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType;

    private java.lang.String thirdPartyLegalIdNumber;

    private java.util.Date thirdPartyDOB;

    private java.lang.String thirdPartyOccupation;

    private java.lang.String thirdPartyOrg;

    private com.mgipaypal.ac1211.client.PhotoIdType thirdPartyPhotoIdType;

    private java.lang.String thirdPartyPhotoIdNumber;

    private java.lang.String thirdPartyPhotoIdState;

    private java.lang.String thirdPartyPhotoIdIssueCountry;

    private java.lang.String thirdPartyLegalIdIssueCountry;

    private java.lang.String senderBirthCity;

    private java.lang.String senderBirthCountry;

    private java.util.Date senderPassportIssueDate;

    private java.lang.String senderPassportIssueCity;

    private java.lang.String senderPassportIssueCountry;

    private java.lang.String senderLegalIdIssueCountry;

    private org.apache.axis.types.Token senderEmailAddress;

    private java.lang.String senderMobilePhone;

    private java.lang.Boolean marketingOptIn;

    private java.lang.String pcTerminalNumber;

    private java.lang.String agentUseSendData;

    private java.lang.String sendCurrency;

    private java.lang.String consumerId;

    private java.util.Date senderPhotoIdExpDate;

    private java.util.Date senderPhotoIdIssueDate;

    private java.lang.Boolean senderPhotoIdStored;

    private java.lang.String senderNationalityCountry;

    private java.lang.String senderNationalityAtBirthCountry;

    private java.lang.String agentTransactionId;

    private java.lang.String mgiTransactionSessionID;

    private boolean formFreeStaging;

    private java.math.BigInteger timeToLive;

    private java.lang.String primaryReceiptLanguage;

    private java.lang.String secondaryReceiptLanguage;

    private java.lang.String[] promoCodeValues;

    private com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues;

    public SendValidationRequest() {
    }

    public SendValidationRequest(
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
           java.math.BigDecimal amount,
           java.math.BigDecimal feeAmount,
           java.lang.String mgiRewardsNumber,
           java.lang.String agentCustomerNumber,
           java.lang.String destinationCountry,
           java.lang.String destinationState,
           java.lang.String deliveryOption,
           java.lang.String receiveCurrency,
           java.lang.String receiveAgentID,
           java.lang.String accountNumber,
           java.lang.String customerReceiveNumber,
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
           java.lang.String direction1,
           java.lang.String direction2,
           java.lang.String direction3,
           java.lang.String receiverCity,
           java.lang.String receiverState,
           java.lang.String receiverZipCode,
           java.lang.String receiverCountry,
           java.lang.String receiverPhone,
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
           java.lang.String thirdPartyZipCode,
           java.lang.String thirdPartyCountry,
           com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType,
           java.lang.String thirdPartyLegalIdNumber,
           java.util.Date thirdPartyDOB,
           java.lang.String thirdPartyOccupation,
           java.lang.String thirdPartyOrg,
           com.mgipaypal.ac1211.client.PhotoIdType thirdPartyPhotoIdType,
           java.lang.String thirdPartyPhotoIdNumber,
           java.lang.String thirdPartyPhotoIdState,
           java.lang.String thirdPartyPhotoIdIssueCountry,
           java.lang.String thirdPartyLegalIdIssueCountry,
           java.lang.String senderBirthCity,
           java.lang.String senderBirthCountry,
           java.util.Date senderPassportIssueDate,
           java.lang.String senderPassportIssueCity,
           java.lang.String senderPassportIssueCountry,
           java.lang.String senderLegalIdIssueCountry,
           org.apache.axis.types.Token senderEmailAddress,
           java.lang.String senderMobilePhone,
           java.lang.Boolean marketingOptIn,
           java.lang.String pcTerminalNumber,
           java.lang.String agentUseSendData,
           java.lang.String sendCurrency,
           java.lang.String consumerId,
           java.util.Date senderPhotoIdExpDate,
           java.util.Date senderPhotoIdIssueDate,
           java.lang.Boolean senderPhotoIdStored,
           java.lang.String senderNationalityCountry,
           java.lang.String senderNationalityAtBirthCountry,
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
        this.amount = amount;
        this.feeAmount = feeAmount;
        this.mgiRewardsNumber = mgiRewardsNumber;
        this.agentCustomerNumber = agentCustomerNumber;
        this.destinationCountry = destinationCountry;
        this.destinationState = destinationState;
        this.deliveryOption = deliveryOption;
        this.receiveCurrency = receiveCurrency;
        this.receiveAgentID = receiveAgentID;
        this.accountNumber = accountNumber;
        this.customerReceiveNumber = customerReceiveNumber;
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
        this.direction1 = direction1;
        this.direction2 = direction2;
        this.direction3 = direction3;
        this.receiverCity = receiverCity;
        this.receiverState = receiverState;
        this.receiverZipCode = receiverZipCode;
        this.receiverCountry = receiverCountry;
        this.receiverPhone = receiverPhone;
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
        this.thirdPartyZipCode = thirdPartyZipCode;
        this.thirdPartyCountry = thirdPartyCountry;
        this.thirdPartyLegalIdType = thirdPartyLegalIdType;
        this.thirdPartyLegalIdNumber = thirdPartyLegalIdNumber;
        this.thirdPartyDOB = thirdPartyDOB;
        this.thirdPartyOccupation = thirdPartyOccupation;
        this.thirdPartyOrg = thirdPartyOrg;
        this.thirdPartyPhotoIdType = thirdPartyPhotoIdType;
        this.thirdPartyPhotoIdNumber = thirdPartyPhotoIdNumber;
        this.thirdPartyPhotoIdState = thirdPartyPhotoIdState;
        this.thirdPartyPhotoIdIssueCountry = thirdPartyPhotoIdIssueCountry;
        this.thirdPartyLegalIdIssueCountry = thirdPartyLegalIdIssueCountry;
        this.senderBirthCity = senderBirthCity;
        this.senderBirthCountry = senderBirthCountry;
        this.senderPassportIssueDate = senderPassportIssueDate;
        this.senderPassportIssueCity = senderPassportIssueCity;
        this.senderPassportIssueCountry = senderPassportIssueCountry;
        this.senderLegalIdIssueCountry = senderLegalIdIssueCountry;
        this.senderEmailAddress = senderEmailAddress;
        this.senderMobilePhone = senderMobilePhone;
        this.marketingOptIn = marketingOptIn;
        this.pcTerminalNumber = pcTerminalNumber;
        this.agentUseSendData = agentUseSendData;
        this.sendCurrency = sendCurrency;
        this.consumerId = consumerId;
        this.senderPhotoIdExpDate = senderPhotoIdExpDate;
        this.senderPhotoIdIssueDate = senderPhotoIdIssueDate;
        this.senderPhotoIdStored = senderPhotoIdStored;
        this.senderNationalityCountry = senderNationalityCountry;
        this.senderNationalityAtBirthCountry = senderNationalityAtBirthCountry;
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
     * Gets the operatorName value for this SendValidationRequest.
     * 
     * @return operatorName
     */
    public java.lang.String getOperatorName() {
        return operatorName;
    }


    /**
     * Sets the operatorName value for this SendValidationRequest.
     * 
     * @param operatorName
     */
    public void setOperatorName(java.lang.String operatorName) {
        this.operatorName = operatorName;
    }


    /**
     * Gets the amount value for this SendValidationRequest.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SendValidationRequest.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the feeAmount value for this SendValidationRequest.
     * 
     * @return feeAmount
     */
    public java.math.BigDecimal getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this SendValidationRequest.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(java.math.BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the mgiRewardsNumber value for this SendValidationRequest.
     * 
     * @return mgiRewardsNumber
     */
    public java.lang.String getMgiRewardsNumber() {
        return mgiRewardsNumber;
    }


    /**
     * Sets the mgiRewardsNumber value for this SendValidationRequest.
     * 
     * @param mgiRewardsNumber
     */
    public void setMgiRewardsNumber(java.lang.String mgiRewardsNumber) {
        this.mgiRewardsNumber = mgiRewardsNumber;
    }


    /**
     * Gets the agentCustomerNumber value for this SendValidationRequest.
     * 
     * @return agentCustomerNumber
     */
    public java.lang.String getAgentCustomerNumber() {
        return agentCustomerNumber;
    }


    /**
     * Sets the agentCustomerNumber value for this SendValidationRequest.
     * 
     * @param agentCustomerNumber
     */
    public void setAgentCustomerNumber(java.lang.String agentCustomerNumber) {
        this.agentCustomerNumber = agentCustomerNumber;
    }


    /**
     * Gets the destinationCountry value for this SendValidationRequest.
     * 
     * @return destinationCountry
     */
    public java.lang.String getDestinationCountry() {
        return destinationCountry;
    }


    /**
     * Sets the destinationCountry value for this SendValidationRequest.
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(java.lang.String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }


    /**
     * Gets the destinationState value for this SendValidationRequest.
     * 
     * @return destinationState
     */
    public java.lang.String getDestinationState() {
        return destinationState;
    }


    /**
     * Sets the destinationState value for this SendValidationRequest.
     * 
     * @param destinationState
     */
    public void setDestinationState(java.lang.String destinationState) {
        this.destinationState = destinationState;
    }


    /**
     * Gets the deliveryOption value for this SendValidationRequest.
     * 
     * @return deliveryOption
     */
    public java.lang.String getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this SendValidationRequest.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(java.lang.String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the receiveCurrency value for this SendValidationRequest.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this SendValidationRequest.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the receiveAgentID value for this SendValidationRequest.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this SendValidationRequest.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the accountNumber value for this SendValidationRequest.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this SendValidationRequest.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the customerReceiveNumber value for this SendValidationRequest.
     * 
     * @return customerReceiveNumber
     */
    public java.lang.String getCustomerReceiveNumber() {
        return customerReceiveNumber;
    }


    /**
     * Sets the customerReceiveNumber value for this SendValidationRequest.
     * 
     * @param customerReceiveNumber
     */
    public void setCustomerReceiveNumber(java.lang.String customerReceiveNumber) {
        this.customerReceiveNumber = customerReceiveNumber;
    }


    /**
     * Gets the senderFirstName value for this SendValidationRequest.
     * 
     * @return senderFirstName
     */
    public java.lang.String getSenderFirstName() {
        return senderFirstName;
    }


    /**
     * Sets the senderFirstName value for this SendValidationRequest.
     * 
     * @param senderFirstName
     */
    public void setSenderFirstName(java.lang.String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }


    /**
     * Gets the senderMiddleName value for this SendValidationRequest.
     * 
     * @return senderMiddleName
     */
    public java.lang.String getSenderMiddleName() {
        return senderMiddleName;
    }


    /**
     * Sets the senderMiddleName value for this SendValidationRequest.
     * 
     * @param senderMiddleName
     */
    public void setSenderMiddleName(java.lang.String senderMiddleName) {
        this.senderMiddleName = senderMiddleName;
    }


    /**
     * Gets the senderLastName value for this SendValidationRequest.
     * 
     * @return senderLastName
     */
    public java.lang.String getSenderLastName() {
        return senderLastName;
    }


    /**
     * Sets the senderLastName value for this SendValidationRequest.
     * 
     * @param senderLastName
     */
    public void setSenderLastName(java.lang.String senderLastName) {
        this.senderLastName = senderLastName;
    }


    /**
     * Gets the senderAddress value for this SendValidationRequest.
     * 
     * @return senderAddress
     */
    public java.lang.String getSenderAddress() {
        return senderAddress;
    }


    /**
     * Sets the senderAddress value for this SendValidationRequest.
     * 
     * @param senderAddress
     */
    public void setSenderAddress(java.lang.String senderAddress) {
        this.senderAddress = senderAddress;
    }


    /**
     * Gets the senderAddress2 value for this SendValidationRequest.
     * 
     * @return senderAddress2
     */
    public java.lang.String getSenderAddress2() {
        return senderAddress2;
    }


    /**
     * Sets the senderAddress2 value for this SendValidationRequest.
     * 
     * @param senderAddress2
     */
    public void setSenderAddress2(java.lang.String senderAddress2) {
        this.senderAddress2 = senderAddress2;
    }


    /**
     * Gets the senderAddress3 value for this SendValidationRequest.
     * 
     * @return senderAddress3
     */
    public java.lang.String getSenderAddress3() {
        return senderAddress3;
    }


    /**
     * Sets the senderAddress3 value for this SendValidationRequest.
     * 
     * @param senderAddress3
     */
    public void setSenderAddress3(java.lang.String senderAddress3) {
        this.senderAddress3 = senderAddress3;
    }


    /**
     * Gets the senderCity value for this SendValidationRequest.
     * 
     * @return senderCity
     */
    public java.lang.String getSenderCity() {
        return senderCity;
    }


    /**
     * Sets the senderCity value for this SendValidationRequest.
     * 
     * @param senderCity
     */
    public void setSenderCity(java.lang.String senderCity) {
        this.senderCity = senderCity;
    }


    /**
     * Gets the senderState value for this SendValidationRequest.
     * 
     * @return senderState
     */
    public java.lang.String getSenderState() {
        return senderState;
    }


    /**
     * Sets the senderState value for this SendValidationRequest.
     * 
     * @param senderState
     */
    public void setSenderState(java.lang.String senderState) {
        this.senderState = senderState;
    }


    /**
     * Gets the senderZipCode value for this SendValidationRequest.
     * 
     * @return senderZipCode
     */
    public java.lang.String getSenderZipCode() {
        return senderZipCode;
    }


    /**
     * Sets the senderZipCode value for this SendValidationRequest.
     * 
     * @param senderZipCode
     */
    public void setSenderZipCode(java.lang.String senderZipCode) {
        this.senderZipCode = senderZipCode;
    }


    /**
     * Gets the senderCountry value for this SendValidationRequest.
     * 
     * @return senderCountry
     */
    public java.lang.String getSenderCountry() {
        return senderCountry;
    }


    /**
     * Sets the senderCountry value for this SendValidationRequest.
     * 
     * @param senderCountry
     */
    public void setSenderCountry(java.lang.String senderCountry) {
        this.senderCountry = senderCountry;
    }


    /**
     * Gets the senderHomePhone value for this SendValidationRequest.
     * 
     * @return senderHomePhone
     */
    public java.lang.String getSenderHomePhone() {
        return senderHomePhone;
    }


    /**
     * Sets the senderHomePhone value for this SendValidationRequest.
     * 
     * @param senderHomePhone
     */
    public void setSenderHomePhone(java.lang.String senderHomePhone) {
        this.senderHomePhone = senderHomePhone;
    }


    /**
     * Gets the receiverFirstName value for this SendValidationRequest.
     * 
     * @return receiverFirstName
     */
    public java.lang.String getReceiverFirstName() {
        return receiverFirstName;
    }


    /**
     * Sets the receiverFirstName value for this SendValidationRequest.
     * 
     * @param receiverFirstName
     */
    public void setReceiverFirstName(java.lang.String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }


    /**
     * Gets the receiverMiddleName value for this SendValidationRequest.
     * 
     * @return receiverMiddleName
     */
    public java.lang.String getReceiverMiddleName() {
        return receiverMiddleName;
    }


    /**
     * Sets the receiverMiddleName value for this SendValidationRequest.
     * 
     * @param receiverMiddleName
     */
    public void setReceiverMiddleName(java.lang.String receiverMiddleName) {
        this.receiverMiddleName = receiverMiddleName;
    }


    /**
     * Gets the receiverLastName value for this SendValidationRequest.
     * 
     * @return receiverLastName
     */
    public java.lang.String getReceiverLastName() {
        return receiverLastName;
    }


    /**
     * Sets the receiverLastName value for this SendValidationRequest.
     * 
     * @param receiverLastName
     */
    public void setReceiverLastName(java.lang.String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }


    /**
     * Gets the receiverLastName2 value for this SendValidationRequest.
     * 
     * @return receiverLastName2
     */
    public java.lang.String getReceiverLastName2() {
        return receiverLastName2;
    }


    /**
     * Sets the receiverLastName2 value for this SendValidationRequest.
     * 
     * @param receiverLastName2
     */
    public void setReceiverLastName2(java.lang.String receiverLastName2) {
        this.receiverLastName2 = receiverLastName2;
    }


    /**
     * Gets the receiverAddress value for this SendValidationRequest.
     * 
     * @return receiverAddress
     */
    public java.lang.String getReceiverAddress() {
        return receiverAddress;
    }


    /**
     * Sets the receiverAddress value for this SendValidationRequest.
     * 
     * @param receiverAddress
     */
    public void setReceiverAddress(java.lang.String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }


    /**
     * Gets the receiverAddress2 value for this SendValidationRequest.
     * 
     * @return receiverAddress2
     */
    public java.lang.String getReceiverAddress2() {
        return receiverAddress2;
    }


    /**
     * Sets the receiverAddress2 value for this SendValidationRequest.
     * 
     * @param receiverAddress2
     */
    public void setReceiverAddress2(java.lang.String receiverAddress2) {
        this.receiverAddress2 = receiverAddress2;
    }


    /**
     * Gets the receiverAddress3 value for this SendValidationRequest.
     * 
     * @return receiverAddress3
     */
    public java.lang.String getReceiverAddress3() {
        return receiverAddress3;
    }


    /**
     * Sets the receiverAddress3 value for this SendValidationRequest.
     * 
     * @param receiverAddress3
     */
    public void setReceiverAddress3(java.lang.String receiverAddress3) {
        this.receiverAddress3 = receiverAddress3;
    }


    /**
     * Gets the direction1 value for this SendValidationRequest.
     * 
     * @return direction1
     */
    public java.lang.String getDirection1() {
        return direction1;
    }


    /**
     * Sets the direction1 value for this SendValidationRequest.
     * 
     * @param direction1
     */
    public void setDirection1(java.lang.String direction1) {
        this.direction1 = direction1;
    }


    /**
     * Gets the direction2 value for this SendValidationRequest.
     * 
     * @return direction2
     */
    public java.lang.String getDirection2() {
        return direction2;
    }


    /**
     * Sets the direction2 value for this SendValidationRequest.
     * 
     * @param direction2
     */
    public void setDirection2(java.lang.String direction2) {
        this.direction2 = direction2;
    }


    /**
     * Gets the direction3 value for this SendValidationRequest.
     * 
     * @return direction3
     */
    public java.lang.String getDirection3() {
        return direction3;
    }


    /**
     * Sets the direction3 value for this SendValidationRequest.
     * 
     * @param direction3
     */
    public void setDirection3(java.lang.String direction3) {
        this.direction3 = direction3;
    }


    /**
     * Gets the receiverCity value for this SendValidationRequest.
     * 
     * @return receiverCity
     */
    public java.lang.String getReceiverCity() {
        return receiverCity;
    }


    /**
     * Sets the receiverCity value for this SendValidationRequest.
     * 
     * @param receiverCity
     */
    public void setReceiverCity(java.lang.String receiverCity) {
        this.receiverCity = receiverCity;
    }


    /**
     * Gets the receiverState value for this SendValidationRequest.
     * 
     * @return receiverState
     */
    public java.lang.String getReceiverState() {
        return receiverState;
    }


    /**
     * Sets the receiverState value for this SendValidationRequest.
     * 
     * @param receiverState
     */
    public void setReceiverState(java.lang.String receiverState) {
        this.receiverState = receiverState;
    }


    /**
     * Gets the receiverZipCode value for this SendValidationRequest.
     * 
     * @return receiverZipCode
     */
    public java.lang.String getReceiverZipCode() {
        return receiverZipCode;
    }


    /**
     * Sets the receiverZipCode value for this SendValidationRequest.
     * 
     * @param receiverZipCode
     */
    public void setReceiverZipCode(java.lang.String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
    }


    /**
     * Gets the receiverCountry value for this SendValidationRequest.
     * 
     * @return receiverCountry
     */
    public java.lang.String getReceiverCountry() {
        return receiverCountry;
    }


    /**
     * Sets the receiverCountry value for this SendValidationRequest.
     * 
     * @param receiverCountry
     */
    public void setReceiverCountry(java.lang.String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }


    /**
     * Gets the receiverPhone value for this SendValidationRequest.
     * 
     * @return receiverPhone
     */
    public java.lang.String getReceiverPhone() {
        return receiverPhone;
    }


    /**
     * Sets the receiverPhone value for this SendValidationRequest.
     * 
     * @param receiverPhone
     */
    public void setReceiverPhone(java.lang.String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }


    /**
     * Gets the testQuestion value for this SendValidationRequest.
     * 
     * @return testQuestion
     */
    public java.lang.String getTestQuestion() {
        return testQuestion;
    }


    /**
     * Sets the testQuestion value for this SendValidationRequest.
     * 
     * @param testQuestion
     */
    public void setTestQuestion(java.lang.String testQuestion) {
        this.testQuestion = testQuestion;
    }


    /**
     * Gets the testAnswer value for this SendValidationRequest.
     * 
     * @return testAnswer
     */
    public java.lang.String getTestAnswer() {
        return testAnswer;
    }


    /**
     * Sets the testAnswer value for this SendValidationRequest.
     * 
     * @param testAnswer
     */
    public void setTestAnswer(java.lang.String testAnswer) {
        this.testAnswer = testAnswer;
    }


    /**
     * Gets the messageField1 value for this SendValidationRequest.
     * 
     * @return messageField1
     */
    public java.lang.String getMessageField1() {
        return messageField1;
    }


    /**
     * Sets the messageField1 value for this SendValidationRequest.
     * 
     * @param messageField1
     */
    public void setMessageField1(java.lang.String messageField1) {
        this.messageField1 = messageField1;
    }


    /**
     * Gets the messageField2 value for this SendValidationRequest.
     * 
     * @return messageField2
     */
    public java.lang.String getMessageField2() {
        return messageField2;
    }


    /**
     * Sets the messageField2 value for this SendValidationRequest.
     * 
     * @param messageField2
     */
    public void setMessageField2(java.lang.String messageField2) {
        this.messageField2 = messageField2;
    }


    /**
     * Gets the senderPhotoIdType value for this SendValidationRequest.
     * 
     * @return senderPhotoIdType
     */
    public com.mgipaypal.ac1211.client.PhotoIdType getSenderPhotoIdType() {
        return senderPhotoIdType;
    }


    /**
     * Sets the senderPhotoIdType value for this SendValidationRequest.
     * 
     * @param senderPhotoIdType
     */
    public void setSenderPhotoIdType(com.mgipaypal.ac1211.client.PhotoIdType senderPhotoIdType) {
        this.senderPhotoIdType = senderPhotoIdType;
    }


    /**
     * Gets the senderPhotoIdNumber value for this SendValidationRequest.
     * 
     * @return senderPhotoIdNumber
     */
    public java.lang.String getSenderPhotoIdNumber() {
        return senderPhotoIdNumber;
    }


    /**
     * Sets the senderPhotoIdNumber value for this SendValidationRequest.
     * 
     * @param senderPhotoIdNumber
     */
    public void setSenderPhotoIdNumber(java.lang.String senderPhotoIdNumber) {
        this.senderPhotoIdNumber = senderPhotoIdNumber;
    }


    /**
     * Gets the senderPhotoIdState value for this SendValidationRequest.
     * 
     * @return senderPhotoIdState
     */
    public java.lang.String getSenderPhotoIdState() {
        return senderPhotoIdState;
    }


    /**
     * Sets the senderPhotoIdState value for this SendValidationRequest.
     * 
     * @param senderPhotoIdState
     */
    public void setSenderPhotoIdState(java.lang.String senderPhotoIdState) {
        this.senderPhotoIdState = senderPhotoIdState;
    }


    /**
     * Gets the senderPhotoIdCountry value for this SendValidationRequest.
     * 
     * @return senderPhotoIdCountry
     */
    public java.lang.String getSenderPhotoIdCountry() {
        return senderPhotoIdCountry;
    }


    /**
     * Sets the senderPhotoIdCountry value for this SendValidationRequest.
     * 
     * @param senderPhotoIdCountry
     */
    public void setSenderPhotoIdCountry(java.lang.String senderPhotoIdCountry) {
        this.senderPhotoIdCountry = senderPhotoIdCountry;
    }


    /**
     * Gets the senderLegalIdType value for this SendValidationRequest.
     * 
     * @return senderLegalIdType
     */
    public com.mgipaypal.ac1211.client.LegalIdType getSenderLegalIdType() {
        return senderLegalIdType;
    }


    /**
     * Sets the senderLegalIdType value for this SendValidationRequest.
     * 
     * @param senderLegalIdType
     */
    public void setSenderLegalIdType(com.mgipaypal.ac1211.client.LegalIdType senderLegalIdType) {
        this.senderLegalIdType = senderLegalIdType;
    }


    /**
     * Gets the senderLegalIdNumber value for this SendValidationRequest.
     * 
     * @return senderLegalIdNumber
     */
    public java.lang.String getSenderLegalIdNumber() {
        return senderLegalIdNumber;
    }


    /**
     * Sets the senderLegalIdNumber value for this SendValidationRequest.
     * 
     * @param senderLegalIdNumber
     */
    public void setSenderLegalIdNumber(java.lang.String senderLegalIdNumber) {
        this.senderLegalIdNumber = senderLegalIdNumber;
    }


    /**
     * Gets the senderDOB value for this SendValidationRequest.
     * 
     * @return senderDOB
     */
    public java.util.Date getSenderDOB() {
        return senderDOB;
    }


    /**
     * Sets the senderDOB value for this SendValidationRequest.
     * 
     * @param senderDOB
     */
    public void setSenderDOB(java.util.Date senderDOB) {
        this.senderDOB = senderDOB;
    }


    /**
     * Gets the senderOccupation value for this SendValidationRequest.
     * 
     * @return senderOccupation
     */
    public java.lang.String getSenderOccupation() {
        return senderOccupation;
    }


    /**
     * Sets the senderOccupation value for this SendValidationRequest.
     * 
     * @param senderOccupation
     */
    public void setSenderOccupation(java.lang.String senderOccupation) {
        this.senderOccupation = senderOccupation;
    }


    /**
     * Gets the thirdPartyFirstName value for this SendValidationRequest.
     * 
     * @return thirdPartyFirstName
     */
    public java.lang.String getThirdPartyFirstName() {
        return thirdPartyFirstName;
    }


    /**
     * Sets the thirdPartyFirstName value for this SendValidationRequest.
     * 
     * @param thirdPartyFirstName
     */
    public void setThirdPartyFirstName(java.lang.String thirdPartyFirstName) {
        this.thirdPartyFirstName = thirdPartyFirstName;
    }


    /**
     * Gets the thirdPartyMiddleName value for this SendValidationRequest.
     * 
     * @return thirdPartyMiddleName
     */
    public java.lang.String getThirdPartyMiddleName() {
        return thirdPartyMiddleName;
    }


    /**
     * Sets the thirdPartyMiddleName value for this SendValidationRequest.
     * 
     * @param thirdPartyMiddleName
     */
    public void setThirdPartyMiddleName(java.lang.String thirdPartyMiddleName) {
        this.thirdPartyMiddleName = thirdPartyMiddleName;
    }


    /**
     * Gets the thirdPartyLastName value for this SendValidationRequest.
     * 
     * @return thirdPartyLastName
     */
    public java.lang.String getThirdPartyLastName() {
        return thirdPartyLastName;
    }


    /**
     * Sets the thirdPartyLastName value for this SendValidationRequest.
     * 
     * @param thirdPartyLastName
     */
    public void setThirdPartyLastName(java.lang.String thirdPartyLastName) {
        this.thirdPartyLastName = thirdPartyLastName;
    }


    /**
     * Gets the thirdPartyAddress value for this SendValidationRequest.
     * 
     * @return thirdPartyAddress
     */
    public java.lang.String getThirdPartyAddress() {
        return thirdPartyAddress;
    }


    /**
     * Sets the thirdPartyAddress value for this SendValidationRequest.
     * 
     * @param thirdPartyAddress
     */
    public void setThirdPartyAddress(java.lang.String thirdPartyAddress) {
        this.thirdPartyAddress = thirdPartyAddress;
    }


    /**
     * Gets the thirdPartyAddress2 value for this SendValidationRequest.
     * 
     * @return thirdPartyAddress2
     */
    public java.lang.String getThirdPartyAddress2() {
        return thirdPartyAddress2;
    }


    /**
     * Sets the thirdPartyAddress2 value for this SendValidationRequest.
     * 
     * @param thirdPartyAddress2
     */
    public void setThirdPartyAddress2(java.lang.String thirdPartyAddress2) {
        this.thirdPartyAddress2 = thirdPartyAddress2;
    }


    /**
     * Gets the thirdPartyAddress3 value for this SendValidationRequest.
     * 
     * @return thirdPartyAddress3
     */
    public java.lang.String getThirdPartyAddress3() {
        return thirdPartyAddress3;
    }


    /**
     * Sets the thirdPartyAddress3 value for this SendValidationRequest.
     * 
     * @param thirdPartyAddress3
     */
    public void setThirdPartyAddress3(java.lang.String thirdPartyAddress3) {
        this.thirdPartyAddress3 = thirdPartyAddress3;
    }


    /**
     * Gets the thirdPartyCity value for this SendValidationRequest.
     * 
     * @return thirdPartyCity
     */
    public java.lang.String getThirdPartyCity() {
        return thirdPartyCity;
    }


    /**
     * Sets the thirdPartyCity value for this SendValidationRequest.
     * 
     * @param thirdPartyCity
     */
    public void setThirdPartyCity(java.lang.String thirdPartyCity) {
        this.thirdPartyCity = thirdPartyCity;
    }


    /**
     * Gets the thirdPartyState value for this SendValidationRequest.
     * 
     * @return thirdPartyState
     */
    public java.lang.String getThirdPartyState() {
        return thirdPartyState;
    }


    /**
     * Sets the thirdPartyState value for this SendValidationRequest.
     * 
     * @param thirdPartyState
     */
    public void setThirdPartyState(java.lang.String thirdPartyState) {
        this.thirdPartyState = thirdPartyState;
    }


    /**
     * Gets the thirdPartyZipCode value for this SendValidationRequest.
     * 
     * @return thirdPartyZipCode
     */
    public java.lang.String getThirdPartyZipCode() {
        return thirdPartyZipCode;
    }


    /**
     * Sets the thirdPartyZipCode value for this SendValidationRequest.
     * 
     * @param thirdPartyZipCode
     */
    public void setThirdPartyZipCode(java.lang.String thirdPartyZipCode) {
        this.thirdPartyZipCode = thirdPartyZipCode;
    }


    /**
     * Gets the thirdPartyCountry value for this SendValidationRequest.
     * 
     * @return thirdPartyCountry
     */
    public java.lang.String getThirdPartyCountry() {
        return thirdPartyCountry;
    }


    /**
     * Sets the thirdPartyCountry value for this SendValidationRequest.
     * 
     * @param thirdPartyCountry
     */
    public void setThirdPartyCountry(java.lang.String thirdPartyCountry) {
        this.thirdPartyCountry = thirdPartyCountry;
    }


    /**
     * Gets the thirdPartyLegalIdType value for this SendValidationRequest.
     * 
     * @return thirdPartyLegalIdType
     */
    public com.mgipaypal.ac1211.client.LegalIdType getThirdPartyLegalIdType() {
        return thirdPartyLegalIdType;
    }


    /**
     * Sets the thirdPartyLegalIdType value for this SendValidationRequest.
     * 
     * @param thirdPartyLegalIdType
     */
    public void setThirdPartyLegalIdType(com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType) {
        this.thirdPartyLegalIdType = thirdPartyLegalIdType;
    }


    /**
     * Gets the thirdPartyLegalIdNumber value for this SendValidationRequest.
     * 
     * @return thirdPartyLegalIdNumber
     */
    public java.lang.String getThirdPartyLegalIdNumber() {
        return thirdPartyLegalIdNumber;
    }


    /**
     * Sets the thirdPartyLegalIdNumber value for this SendValidationRequest.
     * 
     * @param thirdPartyLegalIdNumber
     */
    public void setThirdPartyLegalIdNumber(java.lang.String thirdPartyLegalIdNumber) {
        this.thirdPartyLegalIdNumber = thirdPartyLegalIdNumber;
    }


    /**
     * Gets the thirdPartyDOB value for this SendValidationRequest.
     * 
     * @return thirdPartyDOB
     */
    public java.util.Date getThirdPartyDOB() {
        return thirdPartyDOB;
    }


    /**
     * Sets the thirdPartyDOB value for this SendValidationRequest.
     * 
     * @param thirdPartyDOB
     */
    public void setThirdPartyDOB(java.util.Date thirdPartyDOB) {
        this.thirdPartyDOB = thirdPartyDOB;
    }


    /**
     * Gets the thirdPartyOccupation value for this SendValidationRequest.
     * 
     * @return thirdPartyOccupation
     */
    public java.lang.String getThirdPartyOccupation() {
        return thirdPartyOccupation;
    }


    /**
     * Sets the thirdPartyOccupation value for this SendValidationRequest.
     * 
     * @param thirdPartyOccupation
     */
    public void setThirdPartyOccupation(java.lang.String thirdPartyOccupation) {
        this.thirdPartyOccupation = thirdPartyOccupation;
    }


    /**
     * Gets the thirdPartyOrg value for this SendValidationRequest.
     * 
     * @return thirdPartyOrg
     */
    public java.lang.String getThirdPartyOrg() {
        return thirdPartyOrg;
    }


    /**
     * Sets the thirdPartyOrg value for this SendValidationRequest.
     * 
     * @param thirdPartyOrg
     */
    public void setThirdPartyOrg(java.lang.String thirdPartyOrg) {
        this.thirdPartyOrg = thirdPartyOrg;
    }


    /**
     * Gets the thirdPartyPhotoIdType value for this SendValidationRequest.
     * 
     * @return thirdPartyPhotoIdType
     */
    public com.mgipaypal.ac1211.client.PhotoIdType getThirdPartyPhotoIdType() {
        return thirdPartyPhotoIdType;
    }


    /**
     * Sets the thirdPartyPhotoIdType value for this SendValidationRequest.
     * 
     * @param thirdPartyPhotoIdType
     */
    public void setThirdPartyPhotoIdType(com.mgipaypal.ac1211.client.PhotoIdType thirdPartyPhotoIdType) {
        this.thirdPartyPhotoIdType = thirdPartyPhotoIdType;
    }


    /**
     * Gets the thirdPartyPhotoIdNumber value for this SendValidationRequest.
     * 
     * @return thirdPartyPhotoIdNumber
     */
    public java.lang.String getThirdPartyPhotoIdNumber() {
        return thirdPartyPhotoIdNumber;
    }


    /**
     * Sets the thirdPartyPhotoIdNumber value for this SendValidationRequest.
     * 
     * @param thirdPartyPhotoIdNumber
     */
    public void setThirdPartyPhotoIdNumber(java.lang.String thirdPartyPhotoIdNumber) {
        this.thirdPartyPhotoIdNumber = thirdPartyPhotoIdNumber;
    }


    /**
     * Gets the thirdPartyPhotoIdState value for this SendValidationRequest.
     * 
     * @return thirdPartyPhotoIdState
     */
    public java.lang.String getThirdPartyPhotoIdState() {
        return thirdPartyPhotoIdState;
    }


    /**
     * Sets the thirdPartyPhotoIdState value for this SendValidationRequest.
     * 
     * @param thirdPartyPhotoIdState
     */
    public void setThirdPartyPhotoIdState(java.lang.String thirdPartyPhotoIdState) {
        this.thirdPartyPhotoIdState = thirdPartyPhotoIdState;
    }


    /**
     * Gets the thirdPartyPhotoIdIssueCountry value for this SendValidationRequest.
     * 
     * @return thirdPartyPhotoIdIssueCountry
     */
    public java.lang.String getThirdPartyPhotoIdIssueCountry() {
        return thirdPartyPhotoIdIssueCountry;
    }


    /**
     * Sets the thirdPartyPhotoIdIssueCountry value for this SendValidationRequest.
     * 
     * @param thirdPartyPhotoIdIssueCountry
     */
    public void setThirdPartyPhotoIdIssueCountry(java.lang.String thirdPartyPhotoIdIssueCountry) {
        this.thirdPartyPhotoIdIssueCountry = thirdPartyPhotoIdIssueCountry;
    }


    /**
     * Gets the thirdPartyLegalIdIssueCountry value for this SendValidationRequest.
     * 
     * @return thirdPartyLegalIdIssueCountry
     */
    public java.lang.String getThirdPartyLegalIdIssueCountry() {
        return thirdPartyLegalIdIssueCountry;
    }


    /**
     * Sets the thirdPartyLegalIdIssueCountry value for this SendValidationRequest.
     * 
     * @param thirdPartyLegalIdIssueCountry
     */
    public void setThirdPartyLegalIdIssueCountry(java.lang.String thirdPartyLegalIdIssueCountry) {
        this.thirdPartyLegalIdIssueCountry = thirdPartyLegalIdIssueCountry;
    }


    /**
     * Gets the senderBirthCity value for this SendValidationRequest.
     * 
     * @return senderBirthCity
     */
    public java.lang.String getSenderBirthCity() {
        return senderBirthCity;
    }


    /**
     * Sets the senderBirthCity value for this SendValidationRequest.
     * 
     * @param senderBirthCity
     */
    public void setSenderBirthCity(java.lang.String senderBirthCity) {
        this.senderBirthCity = senderBirthCity;
    }


    /**
     * Gets the senderBirthCountry value for this SendValidationRequest.
     * 
     * @return senderBirthCountry
     */
    public java.lang.String getSenderBirthCountry() {
        return senderBirthCountry;
    }


    /**
     * Sets the senderBirthCountry value for this SendValidationRequest.
     * 
     * @param senderBirthCountry
     */
    public void setSenderBirthCountry(java.lang.String senderBirthCountry) {
        this.senderBirthCountry = senderBirthCountry;
    }


    /**
     * Gets the senderPassportIssueDate value for this SendValidationRequest.
     * 
     * @return senderPassportIssueDate
     */
    public java.util.Date getSenderPassportIssueDate() {
        return senderPassportIssueDate;
    }


    /**
     * Sets the senderPassportIssueDate value for this SendValidationRequest.
     * 
     * @param senderPassportIssueDate
     */
    public void setSenderPassportIssueDate(java.util.Date senderPassportIssueDate) {
        this.senderPassportIssueDate = senderPassportIssueDate;
    }


    /**
     * Gets the senderPassportIssueCity value for this SendValidationRequest.
     * 
     * @return senderPassportIssueCity
     */
    public java.lang.String getSenderPassportIssueCity() {
        return senderPassportIssueCity;
    }


    /**
     * Sets the senderPassportIssueCity value for this SendValidationRequest.
     * 
     * @param senderPassportIssueCity
     */
    public void setSenderPassportIssueCity(java.lang.String senderPassportIssueCity) {
        this.senderPassportIssueCity = senderPassportIssueCity;
    }


    /**
     * Gets the senderPassportIssueCountry value for this SendValidationRequest.
     * 
     * @return senderPassportIssueCountry
     */
    public java.lang.String getSenderPassportIssueCountry() {
        return senderPassportIssueCountry;
    }


    /**
     * Sets the senderPassportIssueCountry value for this SendValidationRequest.
     * 
     * @param senderPassportIssueCountry
     */
    public void setSenderPassportIssueCountry(java.lang.String senderPassportIssueCountry) {
        this.senderPassportIssueCountry = senderPassportIssueCountry;
    }


    /**
     * Gets the senderLegalIdIssueCountry value for this SendValidationRequest.
     * 
     * @return senderLegalIdIssueCountry
     */
    public java.lang.String getSenderLegalIdIssueCountry() {
        return senderLegalIdIssueCountry;
    }


    /**
     * Sets the senderLegalIdIssueCountry value for this SendValidationRequest.
     * 
     * @param senderLegalIdIssueCountry
     */
    public void setSenderLegalIdIssueCountry(java.lang.String senderLegalIdIssueCountry) {
        this.senderLegalIdIssueCountry = senderLegalIdIssueCountry;
    }


    /**
     * Gets the senderEmailAddress value for this SendValidationRequest.
     * 
     * @return senderEmailAddress
     */
    public org.apache.axis.types.Token getSenderEmailAddress() {
        return senderEmailAddress;
    }


    /**
     * Sets the senderEmailAddress value for this SendValidationRequest.
     * 
     * @param senderEmailAddress
     */
    public void setSenderEmailAddress(org.apache.axis.types.Token senderEmailAddress) {
        this.senderEmailAddress = senderEmailAddress;
    }


    /**
     * Gets the senderMobilePhone value for this SendValidationRequest.
     * 
     * @return senderMobilePhone
     */
    public java.lang.String getSenderMobilePhone() {
        return senderMobilePhone;
    }


    /**
     * Sets the senderMobilePhone value for this SendValidationRequest.
     * 
     * @param senderMobilePhone
     */
    public void setSenderMobilePhone(java.lang.String senderMobilePhone) {
        this.senderMobilePhone = senderMobilePhone;
    }


    /**
     * Gets the marketingOptIn value for this SendValidationRequest.
     * 
     * @return marketingOptIn
     */
    public java.lang.Boolean getMarketingOptIn() {
        return marketingOptIn;
    }


    /**
     * Sets the marketingOptIn value for this SendValidationRequest.
     * 
     * @param marketingOptIn
     */
    public void setMarketingOptIn(java.lang.Boolean marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
    }


    /**
     * Gets the pcTerminalNumber value for this SendValidationRequest.
     * 
     * @return pcTerminalNumber
     */
    public java.lang.String getPcTerminalNumber() {
        return pcTerminalNumber;
    }


    /**
     * Sets the pcTerminalNumber value for this SendValidationRequest.
     * 
     * @param pcTerminalNumber
     */
    public void setPcTerminalNumber(java.lang.String pcTerminalNumber) {
        this.pcTerminalNumber = pcTerminalNumber;
    }


    /**
     * Gets the agentUseSendData value for this SendValidationRequest.
     * 
     * @return agentUseSendData
     */
    public java.lang.String getAgentUseSendData() {
        return agentUseSendData;
    }


    /**
     * Sets the agentUseSendData value for this SendValidationRequest.
     * 
     * @param agentUseSendData
     */
    public void setAgentUseSendData(java.lang.String agentUseSendData) {
        this.agentUseSendData = agentUseSendData;
    }


    /**
     * Gets the sendCurrency value for this SendValidationRequest.
     * 
     * @return sendCurrency
     */
    public java.lang.String getSendCurrency() {
        return sendCurrency;
    }


    /**
     * Sets the sendCurrency value for this SendValidationRequest.
     * 
     * @param sendCurrency
     */
    public void setSendCurrency(java.lang.String sendCurrency) {
        this.sendCurrency = sendCurrency;
    }


    /**
     * Gets the consumerId value for this SendValidationRequest.
     * 
     * @return consumerId
     */
    public java.lang.String getConsumerId() {
        return consumerId;
    }


    /**
     * Sets the consumerId value for this SendValidationRequest.
     * 
     * @param consumerId
     */
    public void setConsumerId(java.lang.String consumerId) {
        this.consumerId = consumerId;
    }


    /**
     * Gets the senderPhotoIdExpDate value for this SendValidationRequest.
     * 
     * @return senderPhotoIdExpDate
     */
    public java.util.Date getSenderPhotoIdExpDate() {
        return senderPhotoIdExpDate;
    }


    /**
     * Sets the senderPhotoIdExpDate value for this SendValidationRequest.
     * 
     * @param senderPhotoIdExpDate
     */
    public void setSenderPhotoIdExpDate(java.util.Date senderPhotoIdExpDate) {
        this.senderPhotoIdExpDate = senderPhotoIdExpDate;
    }


    /**
     * Gets the senderPhotoIdIssueDate value for this SendValidationRequest.
     * 
     * @return senderPhotoIdIssueDate
     */
    public java.util.Date getSenderPhotoIdIssueDate() {
        return senderPhotoIdIssueDate;
    }


    /**
     * Sets the senderPhotoIdIssueDate value for this SendValidationRequest.
     * 
     * @param senderPhotoIdIssueDate
     */
    public void setSenderPhotoIdIssueDate(java.util.Date senderPhotoIdIssueDate) {
        this.senderPhotoIdIssueDate = senderPhotoIdIssueDate;
    }


    /**
     * Gets the senderPhotoIdStored value for this SendValidationRequest.
     * 
     * @return senderPhotoIdStored
     */
    public java.lang.Boolean getSenderPhotoIdStored() {
        return senderPhotoIdStored;
    }


    /**
     * Sets the senderPhotoIdStored value for this SendValidationRequest.
     * 
     * @param senderPhotoIdStored
     */
    public void setSenderPhotoIdStored(java.lang.Boolean senderPhotoIdStored) {
        this.senderPhotoIdStored = senderPhotoIdStored;
    }


    /**
     * Gets the senderNationalityCountry value for this SendValidationRequest.
     * 
     * @return senderNationalityCountry
     */
    public java.lang.String getSenderNationalityCountry() {
        return senderNationalityCountry;
    }


    /**
     * Sets the senderNationalityCountry value for this SendValidationRequest.
     * 
     * @param senderNationalityCountry
     */
    public void setSenderNationalityCountry(java.lang.String senderNationalityCountry) {
        this.senderNationalityCountry = senderNationalityCountry;
    }


    /**
     * Gets the senderNationalityAtBirthCountry value for this SendValidationRequest.
     * 
     * @return senderNationalityAtBirthCountry
     */
    public java.lang.String getSenderNationalityAtBirthCountry() {
        return senderNationalityAtBirthCountry;
    }


    /**
     * Sets the senderNationalityAtBirthCountry value for this SendValidationRequest.
     * 
     * @param senderNationalityAtBirthCountry
     */
    public void setSenderNationalityAtBirthCountry(java.lang.String senderNationalityAtBirthCountry) {
        this.senderNationalityAtBirthCountry = senderNationalityAtBirthCountry;
    }


    /**
     * Gets the agentTransactionId value for this SendValidationRequest.
     * 
     * @return agentTransactionId
     */
    public java.lang.String getAgentTransactionId() {
        return agentTransactionId;
    }


    /**
     * Sets the agentTransactionId value for this SendValidationRequest.
     * 
     * @param agentTransactionId
     */
    public void setAgentTransactionId(java.lang.String agentTransactionId) {
        this.agentTransactionId = agentTransactionId;
    }


    /**
     * Gets the mgiTransactionSessionID value for this SendValidationRequest.
     * 
     * @return mgiTransactionSessionID
     */
    public java.lang.String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }


    /**
     * Sets the mgiTransactionSessionID value for this SendValidationRequest.
     * 
     * @param mgiTransactionSessionID
     */
    public void setMgiTransactionSessionID(java.lang.String mgiTransactionSessionID) {
        this.mgiTransactionSessionID = mgiTransactionSessionID;
    }


    /**
     * Gets the formFreeStaging value for this SendValidationRequest.
     * 
     * @return formFreeStaging
     */
    public boolean isFormFreeStaging() {
        return formFreeStaging;
    }


    /**
     * Sets the formFreeStaging value for this SendValidationRequest.
     * 
     * @param formFreeStaging
     */
    public void setFormFreeStaging(boolean formFreeStaging) {
        this.formFreeStaging = formFreeStaging;
    }


    /**
     * Gets the timeToLive value for this SendValidationRequest.
     * 
     * @return timeToLive
     */
    public java.math.BigInteger getTimeToLive() {
        return timeToLive;
    }


    /**
     * Sets the timeToLive value for this SendValidationRequest.
     * 
     * @param timeToLive
     */
    public void setTimeToLive(java.math.BigInteger timeToLive) {
        this.timeToLive = timeToLive;
    }


    /**
     * Gets the primaryReceiptLanguage value for this SendValidationRequest.
     * 
     * @return primaryReceiptLanguage
     */
    public java.lang.String getPrimaryReceiptLanguage() {
        return primaryReceiptLanguage;
    }


    /**
     * Sets the primaryReceiptLanguage value for this SendValidationRequest.
     * 
     * @param primaryReceiptLanguage
     */
    public void setPrimaryReceiptLanguage(java.lang.String primaryReceiptLanguage) {
        this.primaryReceiptLanguage = primaryReceiptLanguage;
    }


    /**
     * Gets the secondaryReceiptLanguage value for this SendValidationRequest.
     * 
     * @return secondaryReceiptLanguage
     */
    public java.lang.String getSecondaryReceiptLanguage() {
        return secondaryReceiptLanguage;
    }


    /**
     * Sets the secondaryReceiptLanguage value for this SendValidationRequest.
     * 
     * @param secondaryReceiptLanguage
     */
    public void setSecondaryReceiptLanguage(java.lang.String secondaryReceiptLanguage) {
        this.secondaryReceiptLanguage = secondaryReceiptLanguage;
    }


    /**
     * Gets the promoCodeValues value for this SendValidationRequest.
     * 
     * @return promoCodeValues
     */
    public java.lang.String[] getPromoCodeValues() {
        return promoCodeValues;
    }


    /**
     * Sets the promoCodeValues value for this SendValidationRequest.
     * 
     * @param promoCodeValues
     */
    public void setPromoCodeValues(java.lang.String[] promoCodeValues) {
        this.promoCodeValues = promoCodeValues;
    }


    /**
     * Gets the fieldValues value for this SendValidationRequest.
     * 
     * @return fieldValues
     */
    public com.mgipaypal.ac1211.client.KeyValuePair[] getFieldValues() {
        return fieldValues;
    }


    /**
     * Sets the fieldValues value for this SendValidationRequest.
     * 
     * @param fieldValues
     */
    public void setFieldValues(com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues) {
        this.fieldValues = fieldValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendValidationRequest)) return false;
        SendValidationRequest other = (SendValidationRequest) obj;
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
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
            ((this.mgiRewardsNumber==null && other.getMgiRewardsNumber()==null) || 
             (this.mgiRewardsNumber!=null &&
              this.mgiRewardsNumber.equals(other.getMgiRewardsNumber()))) &&
            ((this.agentCustomerNumber==null && other.getAgentCustomerNumber()==null) || 
             (this.agentCustomerNumber!=null &&
              this.agentCustomerNumber.equals(other.getAgentCustomerNumber()))) &&
            ((this.destinationCountry==null && other.getDestinationCountry()==null) || 
             (this.destinationCountry!=null &&
              this.destinationCountry.equals(other.getDestinationCountry()))) &&
            ((this.destinationState==null && other.getDestinationState()==null) || 
             (this.destinationState!=null &&
              this.destinationState.equals(other.getDestinationState()))) &&
            ((this.deliveryOption==null && other.getDeliveryOption()==null) || 
             (this.deliveryOption!=null &&
              this.deliveryOption.equals(other.getDeliveryOption()))) &&
            ((this.receiveCurrency==null && other.getReceiveCurrency()==null) || 
             (this.receiveCurrency!=null &&
              this.receiveCurrency.equals(other.getReceiveCurrency()))) &&
            ((this.receiveAgentID==null && other.getReceiveAgentID()==null) || 
             (this.receiveAgentID!=null &&
              this.receiveAgentID.equals(other.getReceiveAgentID()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.customerReceiveNumber==null && other.getCustomerReceiveNumber()==null) || 
             (this.customerReceiveNumber!=null &&
              this.customerReceiveNumber.equals(other.getCustomerReceiveNumber()))) &&
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
            ((this.direction1==null && other.getDirection1()==null) || 
             (this.direction1!=null &&
              this.direction1.equals(other.getDirection1()))) &&
            ((this.direction2==null && other.getDirection2()==null) || 
             (this.direction2!=null &&
              this.direction2.equals(other.getDirection2()))) &&
            ((this.direction3==null && other.getDirection3()==null) || 
             (this.direction3!=null &&
              this.direction3.equals(other.getDirection3()))) &&
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
            ((this.thirdPartyPhotoIdType==null && other.getThirdPartyPhotoIdType()==null) || 
             (this.thirdPartyPhotoIdType!=null &&
              this.thirdPartyPhotoIdType.equals(other.getThirdPartyPhotoIdType()))) &&
            ((this.thirdPartyPhotoIdNumber==null && other.getThirdPartyPhotoIdNumber()==null) || 
             (this.thirdPartyPhotoIdNumber!=null &&
              this.thirdPartyPhotoIdNumber.equals(other.getThirdPartyPhotoIdNumber()))) &&
            ((this.thirdPartyPhotoIdState==null && other.getThirdPartyPhotoIdState()==null) || 
             (this.thirdPartyPhotoIdState!=null &&
              this.thirdPartyPhotoIdState.equals(other.getThirdPartyPhotoIdState()))) &&
            ((this.thirdPartyPhotoIdIssueCountry==null && other.getThirdPartyPhotoIdIssueCountry()==null) || 
             (this.thirdPartyPhotoIdIssueCountry!=null &&
              this.thirdPartyPhotoIdIssueCountry.equals(other.getThirdPartyPhotoIdIssueCountry()))) &&
            ((this.thirdPartyLegalIdIssueCountry==null && other.getThirdPartyLegalIdIssueCountry()==null) || 
             (this.thirdPartyLegalIdIssueCountry!=null &&
              this.thirdPartyLegalIdIssueCountry.equals(other.getThirdPartyLegalIdIssueCountry()))) &&
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
            ((this.senderLegalIdIssueCountry==null && other.getSenderLegalIdIssueCountry()==null) || 
             (this.senderLegalIdIssueCountry!=null &&
              this.senderLegalIdIssueCountry.equals(other.getSenderLegalIdIssueCountry()))) &&
            ((this.senderEmailAddress==null && other.getSenderEmailAddress()==null) || 
             (this.senderEmailAddress!=null &&
              this.senderEmailAddress.equals(other.getSenderEmailAddress()))) &&
            ((this.senderMobilePhone==null && other.getSenderMobilePhone()==null) || 
             (this.senderMobilePhone!=null &&
              this.senderMobilePhone.equals(other.getSenderMobilePhone()))) &&
            ((this.marketingOptIn==null && other.getMarketingOptIn()==null) || 
             (this.marketingOptIn!=null &&
              this.marketingOptIn.equals(other.getMarketingOptIn()))) &&
            ((this.pcTerminalNumber==null && other.getPcTerminalNumber()==null) || 
             (this.pcTerminalNumber!=null &&
              this.pcTerminalNumber.equals(other.getPcTerminalNumber()))) &&
            ((this.agentUseSendData==null && other.getAgentUseSendData()==null) || 
             (this.agentUseSendData!=null &&
              this.agentUseSendData.equals(other.getAgentUseSendData()))) &&
            ((this.sendCurrency==null && other.getSendCurrency()==null) || 
             (this.sendCurrency!=null &&
              this.sendCurrency.equals(other.getSendCurrency()))) &&
            ((this.consumerId==null && other.getConsumerId()==null) || 
             (this.consumerId!=null &&
              this.consumerId.equals(other.getConsumerId()))) &&
            ((this.senderPhotoIdExpDate==null && other.getSenderPhotoIdExpDate()==null) || 
             (this.senderPhotoIdExpDate!=null &&
              this.senderPhotoIdExpDate.equals(other.getSenderPhotoIdExpDate()))) &&
            ((this.senderPhotoIdIssueDate==null && other.getSenderPhotoIdIssueDate()==null) || 
             (this.senderPhotoIdIssueDate!=null &&
              this.senderPhotoIdIssueDate.equals(other.getSenderPhotoIdIssueDate()))) &&
            ((this.senderPhotoIdStored==null && other.getSenderPhotoIdStored()==null) || 
             (this.senderPhotoIdStored!=null &&
              this.senderPhotoIdStored.equals(other.getSenderPhotoIdStored()))) &&
            ((this.senderNationalityCountry==null && other.getSenderNationalityCountry()==null) || 
             (this.senderNationalityCountry!=null &&
              this.senderNationalityCountry.equals(other.getSenderNationalityCountry()))) &&
            ((this.senderNationalityAtBirthCountry==null && other.getSenderNationalityAtBirthCountry()==null) || 
             (this.senderNationalityAtBirthCountry!=null &&
              this.senderNationalityAtBirthCountry.equals(other.getSenderNationalityAtBirthCountry()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getMgiRewardsNumber() != null) {
            _hashCode += getMgiRewardsNumber().hashCode();
        }
        if (getAgentCustomerNumber() != null) {
            _hashCode += getAgentCustomerNumber().hashCode();
        }
        if (getDestinationCountry() != null) {
            _hashCode += getDestinationCountry().hashCode();
        }
        if (getDestinationState() != null) {
            _hashCode += getDestinationState().hashCode();
        }
        if (getDeliveryOption() != null) {
            _hashCode += getDeliveryOption().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        if (getReceiveAgentID() != null) {
            _hashCode += getReceiveAgentID().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getCustomerReceiveNumber() != null) {
            _hashCode += getCustomerReceiveNumber().hashCode();
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
        if (getDirection1() != null) {
            _hashCode += getDirection1().hashCode();
        }
        if (getDirection2() != null) {
            _hashCode += getDirection2().hashCode();
        }
        if (getDirection3() != null) {
            _hashCode += getDirection3().hashCode();
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
        if (getThirdPartyPhotoIdType() != null) {
            _hashCode += getThirdPartyPhotoIdType().hashCode();
        }
        if (getThirdPartyPhotoIdNumber() != null) {
            _hashCode += getThirdPartyPhotoIdNumber().hashCode();
        }
        if (getThirdPartyPhotoIdState() != null) {
            _hashCode += getThirdPartyPhotoIdState().hashCode();
        }
        if (getThirdPartyPhotoIdIssueCountry() != null) {
            _hashCode += getThirdPartyPhotoIdIssueCountry().hashCode();
        }
        if (getThirdPartyLegalIdIssueCountry() != null) {
            _hashCode += getThirdPartyLegalIdIssueCountry().hashCode();
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
        if (getSenderLegalIdIssueCountry() != null) {
            _hashCode += getSenderLegalIdIssueCountry().hashCode();
        }
        if (getSenderEmailAddress() != null) {
            _hashCode += getSenderEmailAddress().hashCode();
        }
        if (getSenderMobilePhone() != null) {
            _hashCode += getSenderMobilePhone().hashCode();
        }
        if (getMarketingOptIn() != null) {
            _hashCode += getMarketingOptIn().hashCode();
        }
        if (getPcTerminalNumber() != null) {
            _hashCode += getPcTerminalNumber().hashCode();
        }
        if (getAgentUseSendData() != null) {
            _hashCode += getAgentUseSendData().hashCode();
        }
        if (getSendCurrency() != null) {
            _hashCode += getSendCurrency().hashCode();
        }
        if (getConsumerId() != null) {
            _hashCode += getConsumerId().hashCode();
        }
        if (getSenderPhotoIdExpDate() != null) {
            _hashCode += getSenderPhotoIdExpDate().hashCode();
        }
        if (getSenderPhotoIdIssueDate() != null) {
            _hashCode += getSenderPhotoIdIssueDate().hashCode();
        }
        if (getSenderPhotoIdStored() != null) {
            _hashCode += getSenderPhotoIdStored().hashCode();
        }
        if (getSenderNationalityCountry() != null) {
            _hashCode += getSenderNationalityCountry().hashCode();
        }
        if (getSenderNationalityAtBirthCountry() != null) {
            _hashCode += getSenderNationalityAtBirthCountry().hashCode();
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
        new org.apache.axis.description.TypeDesc(SendValidationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendValidationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "operatorName"));
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
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "feeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("agentCustomerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentCustomerNumber"));
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
        elemField.setFieldName("destinationState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "destinationState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "deliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCurrency"));
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
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "accountNumber"));
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
        elemField.setFieldName("senderFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("thirdPartyPhotoIdState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyPhotoIdState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("thirdPartyLegalIdIssueCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyLegalIdIssueCountry"));
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
        elemField.setFieldName("senderLegalIdIssueCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderLegalIdIssueCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderMobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderMobilePhone"));
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
        elemField.setFieldName("pcTerminalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "pcTerminalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("sendCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPhotoIdExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderPhotoIdExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPhotoIdIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderPhotoIdIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPhotoIdStored");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderPhotoIdStored"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderNationalityCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderNationalityCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderNationalityAtBirthCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderNationalityAtBirthCountry"));
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
