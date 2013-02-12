/**
 * ReferenceNumberResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ReferenceNumberResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String mgiTransactionSessionID;

    private java.lang.String senderFirstName;

    private java.lang.String senderMiddleName;

    private java.lang.String senderLastName;

    private java.lang.String senderLastName2;

    private java.lang.String senderHomePhone;

    private java.lang.String senderAddress;

    private java.lang.String senderAddress2;

    private java.lang.String senderAddress3;

    private java.lang.String senderAddress4;

    private java.lang.String senderCity;

    private java.lang.String senderState;

    private java.lang.String senderZipCode;

    private java.lang.String senderCountry;

    private java.lang.String receiverFirstName;

    private java.lang.String receiverMiddleName;

    private java.lang.String receiverLastName;

    private java.lang.String receiverLastName2;

    private java.lang.String receiverAddress;

    private java.lang.String receiverAddress2;

    private java.lang.String receiverAddress3;

    private java.lang.String receiverAddress4;

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

    private java.lang.String agentCheckNumber;

    private java.math.BigDecimal agentCheckAmount;

    private java.lang.String agentCheckAuthorizationNumber;

    private java.lang.String customerCheckNumber;

    private java.math.BigDecimal customerCheckAmount;

    private boolean okForAgent;

    private java.lang.String deliveryOption;

    private com.mgipaypal.ac1211.client.TransactionStatus transactionStatus;

    private java.util.Calendar dateTimeSent;

    private java.lang.String receiveCurrency;

    private java.math.BigDecimal receiveAmount;

    private java.lang.String referenceNumber;

    private java.lang.String originatingCountry;

    private boolean validIndicator;

    private java.math.BigDecimal indicativeReceiveAmount;

    private java.lang.String indicativeReceiveCurrency;

    private java.math.BigDecimal indicativeExchangeRate;

    private java.lang.String mgCustomerReceiveNumber;

    private java.lang.String partnerCustomerReceiveNumber;

    private java.lang.String receiveAgentID;

    private java.lang.String receiveAgentName;

    private java.lang.String receiveAgentAbbreviation;

    private java.util.Date expectedDateOfDelivery;

    private java.math.BigDecimal originalSendAmount;

    private java.lang.String originalSendCurrency;

    private java.math.BigDecimal originalSendFee;

    private java.math.BigDecimal originalExchangeRate;

    private java.lang.Boolean redirectIndicator;

    private com.mgipaypal.ac1211.client.RedirectInfo redirectInfo;

    private java.lang.Boolean okForPickup;

    private java.math.BigInteger notOkForPickupReasonCode;

    private java.lang.String notOkForPickupReasonDescription;

    private java.math.BigInteger minutesUntilOkForPickup;

    public ReferenceNumberResponse() {
    }

    public ReferenceNumberResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String mgiTransactionSessionID,
           java.lang.String senderFirstName,
           java.lang.String senderMiddleName,
           java.lang.String senderLastName,
           java.lang.String senderLastName2,
           java.lang.String senderHomePhone,
           java.lang.String senderAddress,
           java.lang.String senderAddress2,
           java.lang.String senderAddress3,
           java.lang.String senderAddress4,
           java.lang.String senderCity,
           java.lang.String senderState,
           java.lang.String senderZipCode,
           java.lang.String senderCountry,
           java.lang.String receiverFirstName,
           java.lang.String receiverMiddleName,
           java.lang.String receiverLastName,
           java.lang.String receiverLastName2,
           java.lang.String receiverAddress,
           java.lang.String receiverAddress2,
           java.lang.String receiverAddress3,
           java.lang.String receiverAddress4,
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
           java.lang.String agentCheckNumber,
           java.math.BigDecimal agentCheckAmount,
           java.lang.String agentCheckAuthorizationNumber,
           java.lang.String customerCheckNumber,
           java.math.BigDecimal customerCheckAmount,
           boolean okForAgent,
           java.lang.String deliveryOption,
           com.mgipaypal.ac1211.client.TransactionStatus transactionStatus,
           java.util.Calendar dateTimeSent,
           java.lang.String receiveCurrency,
           java.math.BigDecimal receiveAmount,
           java.lang.String referenceNumber,
           java.lang.String originatingCountry,
           boolean validIndicator,
           java.math.BigDecimal indicativeReceiveAmount,
           java.lang.String indicativeReceiveCurrency,
           java.math.BigDecimal indicativeExchangeRate,
           java.lang.String mgCustomerReceiveNumber,
           java.lang.String partnerCustomerReceiveNumber,
           java.lang.String receiveAgentID,
           java.lang.String receiveAgentName,
           java.lang.String receiveAgentAbbreviation,
           java.util.Date expectedDateOfDelivery,
           java.math.BigDecimal originalSendAmount,
           java.lang.String originalSendCurrency,
           java.math.BigDecimal originalSendFee,
           java.math.BigDecimal originalExchangeRate,
           java.lang.Boolean redirectIndicator,
           com.mgipaypal.ac1211.client.RedirectInfo redirectInfo,
           java.lang.Boolean okForPickup,
           java.math.BigInteger notOkForPickupReasonCode,
           java.lang.String notOkForPickupReasonDescription,
           java.math.BigInteger minutesUntilOkForPickup) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.mgiTransactionSessionID = mgiTransactionSessionID;
        this.senderFirstName = senderFirstName;
        this.senderMiddleName = senderMiddleName;
        this.senderLastName = senderLastName;
        this.senderLastName2 = senderLastName2;
        this.senderHomePhone = senderHomePhone;
        this.senderAddress = senderAddress;
        this.senderAddress2 = senderAddress2;
        this.senderAddress3 = senderAddress3;
        this.senderAddress4 = senderAddress4;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZipCode = senderZipCode;
        this.senderCountry = senderCountry;
        this.receiverFirstName = receiverFirstName;
        this.receiverMiddleName = receiverMiddleName;
        this.receiverLastName = receiverLastName;
        this.receiverLastName2 = receiverLastName2;
        this.receiverAddress = receiverAddress;
        this.receiverAddress2 = receiverAddress2;
        this.receiverAddress3 = receiverAddress3;
        this.receiverAddress4 = receiverAddress4;
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
        this.agentCheckNumber = agentCheckNumber;
        this.agentCheckAmount = agentCheckAmount;
        this.agentCheckAuthorizationNumber = agentCheckAuthorizationNumber;
        this.customerCheckNumber = customerCheckNumber;
        this.customerCheckAmount = customerCheckAmount;
        this.okForAgent = okForAgent;
        this.deliveryOption = deliveryOption;
        this.transactionStatus = transactionStatus;
        this.dateTimeSent = dateTimeSent;
        this.receiveCurrency = receiveCurrency;
        this.receiveAmount = receiveAmount;
        this.referenceNumber = referenceNumber;
        this.originatingCountry = originatingCountry;
        this.validIndicator = validIndicator;
        this.indicativeReceiveAmount = indicativeReceiveAmount;
        this.indicativeReceiveCurrency = indicativeReceiveCurrency;
        this.indicativeExchangeRate = indicativeExchangeRate;
        this.mgCustomerReceiveNumber = mgCustomerReceiveNumber;
        this.partnerCustomerReceiveNumber = partnerCustomerReceiveNumber;
        this.receiveAgentID = receiveAgentID;
        this.receiveAgentName = receiveAgentName;
        this.receiveAgentAbbreviation = receiveAgentAbbreviation;
        this.expectedDateOfDelivery = expectedDateOfDelivery;
        this.originalSendAmount = originalSendAmount;
        this.originalSendCurrency = originalSendCurrency;
        this.originalSendFee = originalSendFee;
        this.originalExchangeRate = originalExchangeRate;
        this.redirectIndicator = redirectIndicator;
        this.redirectInfo = redirectInfo;
        this.okForPickup = okForPickup;
        this.notOkForPickupReasonCode = notOkForPickupReasonCode;
        this.notOkForPickupReasonDescription = notOkForPickupReasonDescription;
        this.minutesUntilOkForPickup = minutesUntilOkForPickup;
    }


    /**
     * Gets the mgiTransactionSessionID value for this ReferenceNumberResponse.
     * 
     * @return mgiTransactionSessionID
     */
    public java.lang.String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }


    /**
     * Sets the mgiTransactionSessionID value for this ReferenceNumberResponse.
     * 
     * @param mgiTransactionSessionID
     */
    public void setMgiTransactionSessionID(java.lang.String mgiTransactionSessionID) {
        this.mgiTransactionSessionID = mgiTransactionSessionID;
    }


    /**
     * Gets the senderFirstName value for this ReferenceNumberResponse.
     * 
     * @return senderFirstName
     */
    public java.lang.String getSenderFirstName() {
        return senderFirstName;
    }


    /**
     * Sets the senderFirstName value for this ReferenceNumberResponse.
     * 
     * @param senderFirstName
     */
    public void setSenderFirstName(java.lang.String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }


    /**
     * Gets the senderMiddleName value for this ReferenceNumberResponse.
     * 
     * @return senderMiddleName
     */
    public java.lang.String getSenderMiddleName() {
        return senderMiddleName;
    }


    /**
     * Sets the senderMiddleName value for this ReferenceNumberResponse.
     * 
     * @param senderMiddleName
     */
    public void setSenderMiddleName(java.lang.String senderMiddleName) {
        this.senderMiddleName = senderMiddleName;
    }


    /**
     * Gets the senderLastName value for this ReferenceNumberResponse.
     * 
     * @return senderLastName
     */
    public java.lang.String getSenderLastName() {
        return senderLastName;
    }


    /**
     * Sets the senderLastName value for this ReferenceNumberResponse.
     * 
     * @param senderLastName
     */
    public void setSenderLastName(java.lang.String senderLastName) {
        this.senderLastName = senderLastName;
    }


    /**
     * Gets the senderLastName2 value for this ReferenceNumberResponse.
     * 
     * @return senderLastName2
     */
    public java.lang.String getSenderLastName2() {
        return senderLastName2;
    }


    /**
     * Sets the senderLastName2 value for this ReferenceNumberResponse.
     * 
     * @param senderLastName2
     */
    public void setSenderLastName2(java.lang.String senderLastName2) {
        this.senderLastName2 = senderLastName2;
    }


    /**
     * Gets the senderHomePhone value for this ReferenceNumberResponse.
     * 
     * @return senderHomePhone
     */
    public java.lang.String getSenderHomePhone() {
        return senderHomePhone;
    }


    /**
     * Sets the senderHomePhone value for this ReferenceNumberResponse.
     * 
     * @param senderHomePhone
     */
    public void setSenderHomePhone(java.lang.String senderHomePhone) {
        this.senderHomePhone = senderHomePhone;
    }


    /**
     * Gets the senderAddress value for this ReferenceNumberResponse.
     * 
     * @return senderAddress
     */
    public java.lang.String getSenderAddress() {
        return senderAddress;
    }


    /**
     * Sets the senderAddress value for this ReferenceNumberResponse.
     * 
     * @param senderAddress
     */
    public void setSenderAddress(java.lang.String senderAddress) {
        this.senderAddress = senderAddress;
    }


    /**
     * Gets the senderAddress2 value for this ReferenceNumberResponse.
     * 
     * @return senderAddress2
     */
    public java.lang.String getSenderAddress2() {
        return senderAddress2;
    }


    /**
     * Sets the senderAddress2 value for this ReferenceNumberResponse.
     * 
     * @param senderAddress2
     */
    public void setSenderAddress2(java.lang.String senderAddress2) {
        this.senderAddress2 = senderAddress2;
    }


    /**
     * Gets the senderAddress3 value for this ReferenceNumberResponse.
     * 
     * @return senderAddress3
     */
    public java.lang.String getSenderAddress3() {
        return senderAddress3;
    }


    /**
     * Sets the senderAddress3 value for this ReferenceNumberResponse.
     * 
     * @param senderAddress3
     */
    public void setSenderAddress3(java.lang.String senderAddress3) {
        this.senderAddress3 = senderAddress3;
    }


    /**
     * Gets the senderAddress4 value for this ReferenceNumberResponse.
     * 
     * @return senderAddress4
     */
    public java.lang.String getSenderAddress4() {
        return senderAddress4;
    }


    /**
     * Sets the senderAddress4 value for this ReferenceNumberResponse.
     * 
     * @param senderAddress4
     */
    public void setSenderAddress4(java.lang.String senderAddress4) {
        this.senderAddress4 = senderAddress4;
    }


    /**
     * Gets the senderCity value for this ReferenceNumberResponse.
     * 
     * @return senderCity
     */
    public java.lang.String getSenderCity() {
        return senderCity;
    }


    /**
     * Sets the senderCity value for this ReferenceNumberResponse.
     * 
     * @param senderCity
     */
    public void setSenderCity(java.lang.String senderCity) {
        this.senderCity = senderCity;
    }


    /**
     * Gets the senderState value for this ReferenceNumberResponse.
     * 
     * @return senderState
     */
    public java.lang.String getSenderState() {
        return senderState;
    }


    /**
     * Sets the senderState value for this ReferenceNumberResponse.
     * 
     * @param senderState
     */
    public void setSenderState(java.lang.String senderState) {
        this.senderState = senderState;
    }


    /**
     * Gets the senderZipCode value for this ReferenceNumberResponse.
     * 
     * @return senderZipCode
     */
    public java.lang.String getSenderZipCode() {
        return senderZipCode;
    }


    /**
     * Sets the senderZipCode value for this ReferenceNumberResponse.
     * 
     * @param senderZipCode
     */
    public void setSenderZipCode(java.lang.String senderZipCode) {
        this.senderZipCode = senderZipCode;
    }


    /**
     * Gets the senderCountry value for this ReferenceNumberResponse.
     * 
     * @return senderCountry
     */
    public java.lang.String getSenderCountry() {
        return senderCountry;
    }


    /**
     * Sets the senderCountry value for this ReferenceNumberResponse.
     * 
     * @param senderCountry
     */
    public void setSenderCountry(java.lang.String senderCountry) {
        this.senderCountry = senderCountry;
    }


    /**
     * Gets the receiverFirstName value for this ReferenceNumberResponse.
     * 
     * @return receiverFirstName
     */
    public java.lang.String getReceiverFirstName() {
        return receiverFirstName;
    }


    /**
     * Sets the receiverFirstName value for this ReferenceNumberResponse.
     * 
     * @param receiverFirstName
     */
    public void setReceiverFirstName(java.lang.String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }


    /**
     * Gets the receiverMiddleName value for this ReferenceNumberResponse.
     * 
     * @return receiverMiddleName
     */
    public java.lang.String getReceiverMiddleName() {
        return receiverMiddleName;
    }


    /**
     * Sets the receiverMiddleName value for this ReferenceNumberResponse.
     * 
     * @param receiverMiddleName
     */
    public void setReceiverMiddleName(java.lang.String receiverMiddleName) {
        this.receiverMiddleName = receiverMiddleName;
    }


    /**
     * Gets the receiverLastName value for this ReferenceNumberResponse.
     * 
     * @return receiverLastName
     */
    public java.lang.String getReceiverLastName() {
        return receiverLastName;
    }


    /**
     * Sets the receiverLastName value for this ReferenceNumberResponse.
     * 
     * @param receiverLastName
     */
    public void setReceiverLastName(java.lang.String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }


    /**
     * Gets the receiverLastName2 value for this ReferenceNumberResponse.
     * 
     * @return receiverLastName2
     */
    public java.lang.String getReceiverLastName2() {
        return receiverLastName2;
    }


    /**
     * Sets the receiverLastName2 value for this ReferenceNumberResponse.
     * 
     * @param receiverLastName2
     */
    public void setReceiverLastName2(java.lang.String receiverLastName2) {
        this.receiverLastName2 = receiverLastName2;
    }


    /**
     * Gets the receiverAddress value for this ReferenceNumberResponse.
     * 
     * @return receiverAddress
     */
    public java.lang.String getReceiverAddress() {
        return receiverAddress;
    }


    /**
     * Sets the receiverAddress value for this ReferenceNumberResponse.
     * 
     * @param receiverAddress
     */
    public void setReceiverAddress(java.lang.String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }


    /**
     * Gets the receiverAddress2 value for this ReferenceNumberResponse.
     * 
     * @return receiverAddress2
     */
    public java.lang.String getReceiverAddress2() {
        return receiverAddress2;
    }


    /**
     * Sets the receiverAddress2 value for this ReferenceNumberResponse.
     * 
     * @param receiverAddress2
     */
    public void setReceiverAddress2(java.lang.String receiverAddress2) {
        this.receiverAddress2 = receiverAddress2;
    }


    /**
     * Gets the receiverAddress3 value for this ReferenceNumberResponse.
     * 
     * @return receiverAddress3
     */
    public java.lang.String getReceiverAddress3() {
        return receiverAddress3;
    }


    /**
     * Sets the receiverAddress3 value for this ReferenceNumberResponse.
     * 
     * @param receiverAddress3
     */
    public void setReceiverAddress3(java.lang.String receiverAddress3) {
        this.receiverAddress3 = receiverAddress3;
    }


    /**
     * Gets the receiverAddress4 value for this ReferenceNumberResponse.
     * 
     * @return receiverAddress4
     */
    public java.lang.String getReceiverAddress4() {
        return receiverAddress4;
    }


    /**
     * Sets the receiverAddress4 value for this ReferenceNumberResponse.
     * 
     * @param receiverAddress4
     */
    public void setReceiverAddress4(java.lang.String receiverAddress4) {
        this.receiverAddress4 = receiverAddress4;
    }


    /**
     * Gets the direction1 value for this ReferenceNumberResponse.
     * 
     * @return direction1
     */
    public java.lang.String getDirection1() {
        return direction1;
    }


    /**
     * Sets the direction1 value for this ReferenceNumberResponse.
     * 
     * @param direction1
     */
    public void setDirection1(java.lang.String direction1) {
        this.direction1 = direction1;
    }


    /**
     * Gets the direction2 value for this ReferenceNumberResponse.
     * 
     * @return direction2
     */
    public java.lang.String getDirection2() {
        return direction2;
    }


    /**
     * Sets the direction2 value for this ReferenceNumberResponse.
     * 
     * @param direction2
     */
    public void setDirection2(java.lang.String direction2) {
        this.direction2 = direction2;
    }


    /**
     * Gets the direction3 value for this ReferenceNumberResponse.
     * 
     * @return direction3
     */
    public java.lang.String getDirection3() {
        return direction3;
    }


    /**
     * Sets the direction3 value for this ReferenceNumberResponse.
     * 
     * @param direction3
     */
    public void setDirection3(java.lang.String direction3) {
        this.direction3 = direction3;
    }


    /**
     * Gets the receiverCity value for this ReferenceNumberResponse.
     * 
     * @return receiverCity
     */
    public java.lang.String getReceiverCity() {
        return receiverCity;
    }


    /**
     * Sets the receiverCity value for this ReferenceNumberResponse.
     * 
     * @param receiverCity
     */
    public void setReceiverCity(java.lang.String receiverCity) {
        this.receiverCity = receiverCity;
    }


    /**
     * Gets the receiverState value for this ReferenceNumberResponse.
     * 
     * @return receiverState
     */
    public java.lang.String getReceiverState() {
        return receiverState;
    }


    /**
     * Sets the receiverState value for this ReferenceNumberResponse.
     * 
     * @param receiverState
     */
    public void setReceiverState(java.lang.String receiverState) {
        this.receiverState = receiverState;
    }


    /**
     * Gets the receiverZipCode value for this ReferenceNumberResponse.
     * 
     * @return receiverZipCode
     */
    public java.lang.String getReceiverZipCode() {
        return receiverZipCode;
    }


    /**
     * Sets the receiverZipCode value for this ReferenceNumberResponse.
     * 
     * @param receiverZipCode
     */
    public void setReceiverZipCode(java.lang.String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
    }


    /**
     * Gets the receiverCountry value for this ReferenceNumberResponse.
     * 
     * @return receiverCountry
     */
    public java.lang.String getReceiverCountry() {
        return receiverCountry;
    }


    /**
     * Sets the receiverCountry value for this ReferenceNumberResponse.
     * 
     * @param receiverCountry
     */
    public void setReceiverCountry(java.lang.String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }


    /**
     * Gets the receiverPhone value for this ReferenceNumberResponse.
     * 
     * @return receiverPhone
     */
    public java.lang.String getReceiverPhone() {
        return receiverPhone;
    }


    /**
     * Sets the receiverPhone value for this ReferenceNumberResponse.
     * 
     * @param receiverPhone
     */
    public void setReceiverPhone(java.lang.String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }


    /**
     * Gets the testQuestion value for this ReferenceNumberResponse.
     * 
     * @return testQuestion
     */
    public java.lang.String getTestQuestion() {
        return testQuestion;
    }


    /**
     * Sets the testQuestion value for this ReferenceNumberResponse.
     * 
     * @param testQuestion
     */
    public void setTestQuestion(java.lang.String testQuestion) {
        this.testQuestion = testQuestion;
    }


    /**
     * Gets the testAnswer value for this ReferenceNumberResponse.
     * 
     * @return testAnswer
     */
    public java.lang.String getTestAnswer() {
        return testAnswer;
    }


    /**
     * Sets the testAnswer value for this ReferenceNumberResponse.
     * 
     * @param testAnswer
     */
    public void setTestAnswer(java.lang.String testAnswer) {
        this.testAnswer = testAnswer;
    }


    /**
     * Gets the messageField1 value for this ReferenceNumberResponse.
     * 
     * @return messageField1
     */
    public java.lang.String getMessageField1() {
        return messageField1;
    }


    /**
     * Sets the messageField1 value for this ReferenceNumberResponse.
     * 
     * @param messageField1
     */
    public void setMessageField1(java.lang.String messageField1) {
        this.messageField1 = messageField1;
    }


    /**
     * Gets the messageField2 value for this ReferenceNumberResponse.
     * 
     * @return messageField2
     */
    public java.lang.String getMessageField2() {
        return messageField2;
    }


    /**
     * Sets the messageField2 value for this ReferenceNumberResponse.
     * 
     * @param messageField2
     */
    public void setMessageField2(java.lang.String messageField2) {
        this.messageField2 = messageField2;
    }


    /**
     * Gets the agentCheckNumber value for this ReferenceNumberResponse.
     * 
     * @return agentCheckNumber
     */
    public java.lang.String getAgentCheckNumber() {
        return agentCheckNumber;
    }


    /**
     * Sets the agentCheckNumber value for this ReferenceNumberResponse.
     * 
     * @param agentCheckNumber
     */
    public void setAgentCheckNumber(java.lang.String agentCheckNumber) {
        this.agentCheckNumber = agentCheckNumber;
    }


    /**
     * Gets the agentCheckAmount value for this ReferenceNumberResponse.
     * 
     * @return agentCheckAmount
     */
    public java.math.BigDecimal getAgentCheckAmount() {
        return agentCheckAmount;
    }


    /**
     * Sets the agentCheckAmount value for this ReferenceNumberResponse.
     * 
     * @param agentCheckAmount
     */
    public void setAgentCheckAmount(java.math.BigDecimal agentCheckAmount) {
        this.agentCheckAmount = agentCheckAmount;
    }


    /**
     * Gets the agentCheckAuthorizationNumber value for this ReferenceNumberResponse.
     * 
     * @return agentCheckAuthorizationNumber
     */
    public java.lang.String getAgentCheckAuthorizationNumber() {
        return agentCheckAuthorizationNumber;
    }


    /**
     * Sets the agentCheckAuthorizationNumber value for this ReferenceNumberResponse.
     * 
     * @param agentCheckAuthorizationNumber
     */
    public void setAgentCheckAuthorizationNumber(java.lang.String agentCheckAuthorizationNumber) {
        this.agentCheckAuthorizationNumber = agentCheckAuthorizationNumber;
    }


    /**
     * Gets the customerCheckNumber value for this ReferenceNumberResponse.
     * 
     * @return customerCheckNumber
     */
    public java.lang.String getCustomerCheckNumber() {
        return customerCheckNumber;
    }


    /**
     * Sets the customerCheckNumber value for this ReferenceNumberResponse.
     * 
     * @param customerCheckNumber
     */
    public void setCustomerCheckNumber(java.lang.String customerCheckNumber) {
        this.customerCheckNumber = customerCheckNumber;
    }


    /**
     * Gets the customerCheckAmount value for this ReferenceNumberResponse.
     * 
     * @return customerCheckAmount
     */
    public java.math.BigDecimal getCustomerCheckAmount() {
        return customerCheckAmount;
    }


    /**
     * Sets the customerCheckAmount value for this ReferenceNumberResponse.
     * 
     * @param customerCheckAmount
     */
    public void setCustomerCheckAmount(java.math.BigDecimal customerCheckAmount) {
        this.customerCheckAmount = customerCheckAmount;
    }


    /**
     * Gets the okForAgent value for this ReferenceNumberResponse.
     * 
     * @return okForAgent
     */
    public boolean isOkForAgent() {
        return okForAgent;
    }


    /**
     * Sets the okForAgent value for this ReferenceNumberResponse.
     * 
     * @param okForAgent
     */
    public void setOkForAgent(boolean okForAgent) {
        this.okForAgent = okForAgent;
    }


    /**
     * Gets the deliveryOption value for this ReferenceNumberResponse.
     * 
     * @return deliveryOption
     */
    public java.lang.String getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this ReferenceNumberResponse.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(java.lang.String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the transactionStatus value for this ReferenceNumberResponse.
     * 
     * @return transactionStatus
     */
    public com.mgipaypal.ac1211.client.TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }


    /**
     * Sets the transactionStatus value for this ReferenceNumberResponse.
     * 
     * @param transactionStatus
     */
    public void setTransactionStatus(com.mgipaypal.ac1211.client.TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }


    /**
     * Gets the dateTimeSent value for this ReferenceNumberResponse.
     * 
     * @return dateTimeSent
     */
    public java.util.Calendar getDateTimeSent() {
        return dateTimeSent;
    }


    /**
     * Sets the dateTimeSent value for this ReferenceNumberResponse.
     * 
     * @param dateTimeSent
     */
    public void setDateTimeSent(java.util.Calendar dateTimeSent) {
        this.dateTimeSent = dateTimeSent;
    }


    /**
     * Gets the receiveCurrency value for this ReferenceNumberResponse.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this ReferenceNumberResponse.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the receiveAmount value for this ReferenceNumberResponse.
     * 
     * @return receiveAmount
     */
    public java.math.BigDecimal getReceiveAmount() {
        return receiveAmount;
    }


    /**
     * Sets the receiveAmount value for this ReferenceNumberResponse.
     * 
     * @param receiveAmount
     */
    public void setReceiveAmount(java.math.BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }


    /**
     * Gets the referenceNumber value for this ReferenceNumberResponse.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this ReferenceNumberResponse.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the originatingCountry value for this ReferenceNumberResponse.
     * 
     * @return originatingCountry
     */
    public java.lang.String getOriginatingCountry() {
        return originatingCountry;
    }


    /**
     * Sets the originatingCountry value for this ReferenceNumberResponse.
     * 
     * @param originatingCountry
     */
    public void setOriginatingCountry(java.lang.String originatingCountry) {
        this.originatingCountry = originatingCountry;
    }


    /**
     * Gets the validIndicator value for this ReferenceNumberResponse.
     * 
     * @return validIndicator
     */
    public boolean isValidIndicator() {
        return validIndicator;
    }


    /**
     * Sets the validIndicator value for this ReferenceNumberResponse.
     * 
     * @param validIndicator
     */
    public void setValidIndicator(boolean validIndicator) {
        this.validIndicator = validIndicator;
    }


    /**
     * Gets the indicativeReceiveAmount value for this ReferenceNumberResponse.
     * 
     * @return indicativeReceiveAmount
     */
    public java.math.BigDecimal getIndicativeReceiveAmount() {
        return indicativeReceiveAmount;
    }


    /**
     * Sets the indicativeReceiveAmount value for this ReferenceNumberResponse.
     * 
     * @param indicativeReceiveAmount
     */
    public void setIndicativeReceiveAmount(java.math.BigDecimal indicativeReceiveAmount) {
        this.indicativeReceiveAmount = indicativeReceiveAmount;
    }


    /**
     * Gets the indicativeReceiveCurrency value for this ReferenceNumberResponse.
     * 
     * @return indicativeReceiveCurrency
     */
    public java.lang.String getIndicativeReceiveCurrency() {
        return indicativeReceiveCurrency;
    }


    /**
     * Sets the indicativeReceiveCurrency value for this ReferenceNumberResponse.
     * 
     * @param indicativeReceiveCurrency
     */
    public void setIndicativeReceiveCurrency(java.lang.String indicativeReceiveCurrency) {
        this.indicativeReceiveCurrency = indicativeReceiveCurrency;
    }


    /**
     * Gets the indicativeExchangeRate value for this ReferenceNumberResponse.
     * 
     * @return indicativeExchangeRate
     */
    public java.math.BigDecimal getIndicativeExchangeRate() {
        return indicativeExchangeRate;
    }


    /**
     * Sets the indicativeExchangeRate value for this ReferenceNumberResponse.
     * 
     * @param indicativeExchangeRate
     */
    public void setIndicativeExchangeRate(java.math.BigDecimal indicativeExchangeRate) {
        this.indicativeExchangeRate = indicativeExchangeRate;
    }


    /**
     * Gets the mgCustomerReceiveNumber value for this ReferenceNumberResponse.
     * 
     * @return mgCustomerReceiveNumber
     */
    public java.lang.String getMgCustomerReceiveNumber() {
        return mgCustomerReceiveNumber;
    }


    /**
     * Sets the mgCustomerReceiveNumber value for this ReferenceNumberResponse.
     * 
     * @param mgCustomerReceiveNumber
     */
    public void setMgCustomerReceiveNumber(java.lang.String mgCustomerReceiveNumber) {
        this.mgCustomerReceiveNumber = mgCustomerReceiveNumber;
    }


    /**
     * Gets the partnerCustomerReceiveNumber value for this ReferenceNumberResponse.
     * 
     * @return partnerCustomerReceiveNumber
     */
    public java.lang.String getPartnerCustomerReceiveNumber() {
        return partnerCustomerReceiveNumber;
    }


    /**
     * Sets the partnerCustomerReceiveNumber value for this ReferenceNumberResponse.
     * 
     * @param partnerCustomerReceiveNumber
     */
    public void setPartnerCustomerReceiveNumber(java.lang.String partnerCustomerReceiveNumber) {
        this.partnerCustomerReceiveNumber = partnerCustomerReceiveNumber;
    }


    /**
     * Gets the receiveAgentID value for this ReferenceNumberResponse.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this ReferenceNumberResponse.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the receiveAgentName value for this ReferenceNumberResponse.
     * 
     * @return receiveAgentName
     */
    public java.lang.String getReceiveAgentName() {
        return receiveAgentName;
    }


    /**
     * Sets the receiveAgentName value for this ReferenceNumberResponse.
     * 
     * @param receiveAgentName
     */
    public void setReceiveAgentName(java.lang.String receiveAgentName) {
        this.receiveAgentName = receiveAgentName;
    }


    /**
     * Gets the receiveAgentAbbreviation value for this ReferenceNumberResponse.
     * 
     * @return receiveAgentAbbreviation
     */
    public java.lang.String getReceiveAgentAbbreviation() {
        return receiveAgentAbbreviation;
    }


    /**
     * Sets the receiveAgentAbbreviation value for this ReferenceNumberResponse.
     * 
     * @param receiveAgentAbbreviation
     */
    public void setReceiveAgentAbbreviation(java.lang.String receiveAgentAbbreviation) {
        this.receiveAgentAbbreviation = receiveAgentAbbreviation;
    }


    /**
     * Gets the expectedDateOfDelivery value for this ReferenceNumberResponse.
     * 
     * @return expectedDateOfDelivery
     */
    public java.util.Date getExpectedDateOfDelivery() {
        return expectedDateOfDelivery;
    }


    /**
     * Sets the expectedDateOfDelivery value for this ReferenceNumberResponse.
     * 
     * @param expectedDateOfDelivery
     */
    public void setExpectedDateOfDelivery(java.util.Date expectedDateOfDelivery) {
        this.expectedDateOfDelivery = expectedDateOfDelivery;
    }


    /**
     * Gets the originalSendAmount value for this ReferenceNumberResponse.
     * 
     * @return originalSendAmount
     */
    public java.math.BigDecimal getOriginalSendAmount() {
        return originalSendAmount;
    }


    /**
     * Sets the originalSendAmount value for this ReferenceNumberResponse.
     * 
     * @param originalSendAmount
     */
    public void setOriginalSendAmount(java.math.BigDecimal originalSendAmount) {
        this.originalSendAmount = originalSendAmount;
    }


    /**
     * Gets the originalSendCurrency value for this ReferenceNumberResponse.
     * 
     * @return originalSendCurrency
     */
    public java.lang.String getOriginalSendCurrency() {
        return originalSendCurrency;
    }


    /**
     * Sets the originalSendCurrency value for this ReferenceNumberResponse.
     * 
     * @param originalSendCurrency
     */
    public void setOriginalSendCurrency(java.lang.String originalSendCurrency) {
        this.originalSendCurrency = originalSendCurrency;
    }


    /**
     * Gets the originalSendFee value for this ReferenceNumberResponse.
     * 
     * @return originalSendFee
     */
    public java.math.BigDecimal getOriginalSendFee() {
        return originalSendFee;
    }


    /**
     * Sets the originalSendFee value for this ReferenceNumberResponse.
     * 
     * @param originalSendFee
     */
    public void setOriginalSendFee(java.math.BigDecimal originalSendFee) {
        this.originalSendFee = originalSendFee;
    }


    /**
     * Gets the originalExchangeRate value for this ReferenceNumberResponse.
     * 
     * @return originalExchangeRate
     */
    public java.math.BigDecimal getOriginalExchangeRate() {
        return originalExchangeRate;
    }


    /**
     * Sets the originalExchangeRate value for this ReferenceNumberResponse.
     * 
     * @param originalExchangeRate
     */
    public void setOriginalExchangeRate(java.math.BigDecimal originalExchangeRate) {
        this.originalExchangeRate = originalExchangeRate;
    }


    /**
     * Gets the redirectIndicator value for this ReferenceNumberResponse.
     * 
     * @return redirectIndicator
     */
    public java.lang.Boolean getRedirectIndicator() {
        return redirectIndicator;
    }


    /**
     * Sets the redirectIndicator value for this ReferenceNumberResponse.
     * 
     * @param redirectIndicator
     */
    public void setRedirectIndicator(java.lang.Boolean redirectIndicator) {
        this.redirectIndicator = redirectIndicator;
    }


    /**
     * Gets the redirectInfo value for this ReferenceNumberResponse.
     * 
     * @return redirectInfo
     */
    public com.mgipaypal.ac1211.client.RedirectInfo getRedirectInfo() {
        return redirectInfo;
    }


    /**
     * Sets the redirectInfo value for this ReferenceNumberResponse.
     * 
     * @param redirectInfo
     */
    public void setRedirectInfo(com.mgipaypal.ac1211.client.RedirectInfo redirectInfo) {
        this.redirectInfo = redirectInfo;
    }


    /**
     * Gets the okForPickup value for this ReferenceNumberResponse.
     * 
     * @return okForPickup
     */
    public java.lang.Boolean getOkForPickup() {
        return okForPickup;
    }


    /**
     * Sets the okForPickup value for this ReferenceNumberResponse.
     * 
     * @param okForPickup
     */
    public void setOkForPickup(java.lang.Boolean okForPickup) {
        this.okForPickup = okForPickup;
    }


    /**
     * Gets the notOkForPickupReasonCode value for this ReferenceNumberResponse.
     * 
     * @return notOkForPickupReasonCode
     */
    public java.math.BigInteger getNotOkForPickupReasonCode() {
        return notOkForPickupReasonCode;
    }


    /**
     * Sets the notOkForPickupReasonCode value for this ReferenceNumberResponse.
     * 
     * @param notOkForPickupReasonCode
     */
    public void setNotOkForPickupReasonCode(java.math.BigInteger notOkForPickupReasonCode) {
        this.notOkForPickupReasonCode = notOkForPickupReasonCode;
    }


    /**
     * Gets the notOkForPickupReasonDescription value for this ReferenceNumberResponse.
     * 
     * @return notOkForPickupReasonDescription
     */
    public java.lang.String getNotOkForPickupReasonDescription() {
        return notOkForPickupReasonDescription;
    }


    /**
     * Sets the notOkForPickupReasonDescription value for this ReferenceNumberResponse.
     * 
     * @param notOkForPickupReasonDescription
     */
    public void setNotOkForPickupReasonDescription(java.lang.String notOkForPickupReasonDescription) {
        this.notOkForPickupReasonDescription = notOkForPickupReasonDescription;
    }


    /**
     * Gets the minutesUntilOkForPickup value for this ReferenceNumberResponse.
     * 
     * @return minutesUntilOkForPickup
     */
    public java.math.BigInteger getMinutesUntilOkForPickup() {
        return minutesUntilOkForPickup;
    }


    /**
     * Sets the minutesUntilOkForPickup value for this ReferenceNumberResponse.
     * 
     * @param minutesUntilOkForPickup
     */
    public void setMinutesUntilOkForPickup(java.math.BigInteger minutesUntilOkForPickup) {
        this.minutesUntilOkForPickup = minutesUntilOkForPickup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReferenceNumberResponse)) return false;
        ReferenceNumberResponse other = (ReferenceNumberResponse) obj;
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
            ((this.senderAddress==null && other.getSenderAddress()==null) || 
             (this.senderAddress!=null &&
              this.senderAddress.equals(other.getSenderAddress()))) &&
            ((this.senderAddress2==null && other.getSenderAddress2()==null) || 
             (this.senderAddress2!=null &&
              this.senderAddress2.equals(other.getSenderAddress2()))) &&
            ((this.senderAddress3==null && other.getSenderAddress3()==null) || 
             (this.senderAddress3!=null &&
              this.senderAddress3.equals(other.getSenderAddress3()))) &&
            ((this.senderAddress4==null && other.getSenderAddress4()==null) || 
             (this.senderAddress4!=null &&
              this.senderAddress4.equals(other.getSenderAddress4()))) &&
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
            ((this.agentCheckNumber==null && other.getAgentCheckNumber()==null) || 
             (this.agentCheckNumber!=null &&
              this.agentCheckNumber.equals(other.getAgentCheckNumber()))) &&
            ((this.agentCheckAmount==null && other.getAgentCheckAmount()==null) || 
             (this.agentCheckAmount!=null &&
              this.agentCheckAmount.equals(other.getAgentCheckAmount()))) &&
            ((this.agentCheckAuthorizationNumber==null && other.getAgentCheckAuthorizationNumber()==null) || 
             (this.agentCheckAuthorizationNumber!=null &&
              this.agentCheckAuthorizationNumber.equals(other.getAgentCheckAuthorizationNumber()))) &&
            ((this.customerCheckNumber==null && other.getCustomerCheckNumber()==null) || 
             (this.customerCheckNumber!=null &&
              this.customerCheckNumber.equals(other.getCustomerCheckNumber()))) &&
            ((this.customerCheckAmount==null && other.getCustomerCheckAmount()==null) || 
             (this.customerCheckAmount!=null &&
              this.customerCheckAmount.equals(other.getCustomerCheckAmount()))) &&
            this.okForAgent == other.isOkForAgent() &&
            ((this.deliveryOption==null && other.getDeliveryOption()==null) || 
             (this.deliveryOption!=null &&
              this.deliveryOption.equals(other.getDeliveryOption()))) &&
            ((this.transactionStatus==null && other.getTransactionStatus()==null) || 
             (this.transactionStatus!=null &&
              this.transactionStatus.equals(other.getTransactionStatus()))) &&
            ((this.dateTimeSent==null && other.getDateTimeSent()==null) || 
             (this.dateTimeSent!=null &&
              this.dateTimeSent.equals(other.getDateTimeSent()))) &&
            ((this.receiveCurrency==null && other.getReceiveCurrency()==null) || 
             (this.receiveCurrency!=null &&
              this.receiveCurrency.equals(other.getReceiveCurrency()))) &&
            ((this.receiveAmount==null && other.getReceiveAmount()==null) || 
             (this.receiveAmount!=null &&
              this.receiveAmount.equals(other.getReceiveAmount()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.originatingCountry==null && other.getOriginatingCountry()==null) || 
             (this.originatingCountry!=null &&
              this.originatingCountry.equals(other.getOriginatingCountry()))) &&
            this.validIndicator == other.isValidIndicator() &&
            ((this.indicativeReceiveAmount==null && other.getIndicativeReceiveAmount()==null) || 
             (this.indicativeReceiveAmount!=null &&
              this.indicativeReceiveAmount.equals(other.getIndicativeReceiveAmount()))) &&
            ((this.indicativeReceiveCurrency==null && other.getIndicativeReceiveCurrency()==null) || 
             (this.indicativeReceiveCurrency!=null &&
              this.indicativeReceiveCurrency.equals(other.getIndicativeReceiveCurrency()))) &&
            ((this.indicativeExchangeRate==null && other.getIndicativeExchangeRate()==null) || 
             (this.indicativeExchangeRate!=null &&
              this.indicativeExchangeRate.equals(other.getIndicativeExchangeRate()))) &&
            ((this.mgCustomerReceiveNumber==null && other.getMgCustomerReceiveNumber()==null) || 
             (this.mgCustomerReceiveNumber!=null &&
              this.mgCustomerReceiveNumber.equals(other.getMgCustomerReceiveNumber()))) &&
            ((this.partnerCustomerReceiveNumber==null && other.getPartnerCustomerReceiveNumber()==null) || 
             (this.partnerCustomerReceiveNumber!=null &&
              this.partnerCustomerReceiveNumber.equals(other.getPartnerCustomerReceiveNumber()))) &&
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
            ((this.originalSendAmount==null && other.getOriginalSendAmount()==null) || 
             (this.originalSendAmount!=null &&
              this.originalSendAmount.equals(other.getOriginalSendAmount()))) &&
            ((this.originalSendCurrency==null && other.getOriginalSendCurrency()==null) || 
             (this.originalSendCurrency!=null &&
              this.originalSendCurrency.equals(other.getOriginalSendCurrency()))) &&
            ((this.originalSendFee==null && other.getOriginalSendFee()==null) || 
             (this.originalSendFee!=null &&
              this.originalSendFee.equals(other.getOriginalSendFee()))) &&
            ((this.originalExchangeRate==null && other.getOriginalExchangeRate()==null) || 
             (this.originalExchangeRate!=null &&
              this.originalExchangeRate.equals(other.getOriginalExchangeRate()))) &&
            ((this.redirectIndicator==null && other.getRedirectIndicator()==null) || 
             (this.redirectIndicator!=null &&
              this.redirectIndicator.equals(other.getRedirectIndicator()))) &&
            ((this.redirectInfo==null && other.getRedirectInfo()==null) || 
             (this.redirectInfo!=null &&
              this.redirectInfo.equals(other.getRedirectInfo()))) &&
            ((this.okForPickup==null && other.getOkForPickup()==null) || 
             (this.okForPickup!=null &&
              this.okForPickup.equals(other.getOkForPickup()))) &&
            ((this.notOkForPickupReasonCode==null && other.getNotOkForPickupReasonCode()==null) || 
             (this.notOkForPickupReasonCode!=null &&
              this.notOkForPickupReasonCode.equals(other.getNotOkForPickupReasonCode()))) &&
            ((this.notOkForPickupReasonDescription==null && other.getNotOkForPickupReasonDescription()==null) || 
             (this.notOkForPickupReasonDescription!=null &&
              this.notOkForPickupReasonDescription.equals(other.getNotOkForPickupReasonDescription()))) &&
            ((this.minutesUntilOkForPickup==null && other.getMinutesUntilOkForPickup()==null) || 
             (this.minutesUntilOkForPickup!=null &&
              this.minutesUntilOkForPickup.equals(other.getMinutesUntilOkForPickup())));
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
        if (getSenderAddress() != null) {
            _hashCode += getSenderAddress().hashCode();
        }
        if (getSenderAddress2() != null) {
            _hashCode += getSenderAddress2().hashCode();
        }
        if (getSenderAddress3() != null) {
            _hashCode += getSenderAddress3().hashCode();
        }
        if (getSenderAddress4() != null) {
            _hashCode += getSenderAddress4().hashCode();
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
        if (getAgentCheckNumber() != null) {
            _hashCode += getAgentCheckNumber().hashCode();
        }
        if (getAgentCheckAmount() != null) {
            _hashCode += getAgentCheckAmount().hashCode();
        }
        if (getAgentCheckAuthorizationNumber() != null) {
            _hashCode += getAgentCheckAuthorizationNumber().hashCode();
        }
        if (getCustomerCheckNumber() != null) {
            _hashCode += getCustomerCheckNumber().hashCode();
        }
        if (getCustomerCheckAmount() != null) {
            _hashCode += getCustomerCheckAmount().hashCode();
        }
        _hashCode += (isOkForAgent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDeliveryOption() != null) {
            _hashCode += getDeliveryOption().hashCode();
        }
        if (getTransactionStatus() != null) {
            _hashCode += getTransactionStatus().hashCode();
        }
        if (getDateTimeSent() != null) {
            _hashCode += getDateTimeSent().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        if (getReceiveAmount() != null) {
            _hashCode += getReceiveAmount().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getOriginatingCountry() != null) {
            _hashCode += getOriginatingCountry().hashCode();
        }
        _hashCode += (isValidIndicator() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIndicativeReceiveAmount() != null) {
            _hashCode += getIndicativeReceiveAmount().hashCode();
        }
        if (getIndicativeReceiveCurrency() != null) {
            _hashCode += getIndicativeReceiveCurrency().hashCode();
        }
        if (getIndicativeExchangeRate() != null) {
            _hashCode += getIndicativeExchangeRate().hashCode();
        }
        if (getMgCustomerReceiveNumber() != null) {
            _hashCode += getMgCustomerReceiveNumber().hashCode();
        }
        if (getPartnerCustomerReceiveNumber() != null) {
            _hashCode += getPartnerCustomerReceiveNumber().hashCode();
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
        if (getOriginalSendAmount() != null) {
            _hashCode += getOriginalSendAmount().hashCode();
        }
        if (getOriginalSendCurrency() != null) {
            _hashCode += getOriginalSendCurrency().hashCode();
        }
        if (getOriginalSendFee() != null) {
            _hashCode += getOriginalSendFee().hashCode();
        }
        if (getOriginalExchangeRate() != null) {
            _hashCode += getOriginalExchangeRate().hashCode();
        }
        if (getRedirectIndicator() != null) {
            _hashCode += getRedirectIndicator().hashCode();
        }
        if (getRedirectInfo() != null) {
            _hashCode += getRedirectInfo().hashCode();
        }
        if (getOkForPickup() != null) {
            _hashCode += getOkForPickup().hashCode();
        }
        if (getNotOkForPickupReasonCode() != null) {
            _hashCode += getNotOkForPickupReasonCode().hashCode();
        }
        if (getNotOkForPickupReasonDescription() != null) {
            _hashCode += getNotOkForPickupReasonDescription().hashCode();
        }
        if (getMinutesUntilOkForPickup() != null) {
            _hashCode += getMinutesUntilOkForPickup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReferenceNumberResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgiTransactionSessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgiTransactionSessionID"));
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
        elemField.setFieldName("senderAddress4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderAddress4"));
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
        elemField.setFieldName("agentCheckNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentCheckNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCheckAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentCheckAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("customerCheckNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerCheckNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCheckAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerCheckAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("okForAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "okForAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("receiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCurrency"));
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
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("validIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "validIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicativeReceiveAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "indicativeReceiveAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicativeReceiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "indicativeReceiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicativeExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "indicativeExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgCustomerReceiveNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgCustomerReceiveNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerCustomerReceiveNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "partnerCustomerReceiveNumber"));
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
        elemField.setFieldName("originalSendAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "originalSendAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalSendCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "originalSendCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalSendFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "originalSendFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "originalExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("okForPickup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "okForPickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notOkForPickupReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "notOkForPickupReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notOkForPickupReasonDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "notOkForPickupReasonDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesUntilOkForPickup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "minutesUntilOkForPickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
