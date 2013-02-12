/**
 * ReceiveValidationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ReceiveValidationRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String operatorName;

    private java.lang.String referenceNumber;

    private java.lang.String pin;

    private java.lang.String receiveCurrency;

    private java.lang.String agentCheckNumber;

    private java.lang.String agentCheckType;

    private java.math.BigDecimal agentCheckAmount;

    private java.lang.String customerCheckNumber;

    private java.lang.String customerCheckType;

    private java.math.BigDecimal customerCheckAmount;

    private java.lang.String receiverAddress;

    private java.lang.String receiverAddress2;

    private java.lang.String receiverAddress3;

    private java.lang.String receiverCity;

    private java.lang.String receiverState;

    private java.lang.String receiverZipCode;

    private java.lang.String receiverCountry;

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

    private java.lang.String receiverBirthCity;

    private java.lang.String receiverBirthCountry;

    private java.util.Date receiverPassportIssueDate;

    private java.lang.String receiverPassportIssueCity;

    private java.lang.String receiverPassportIssueCountry;

    private java.lang.String pcTerminalNumber;

    private java.lang.String agentUseReceiveData;

    private java.lang.String billerAccountNumber;

    private java.lang.String otherPayoutType;

    private java.math.BigDecimal otherPayoutAmount;

    private java.lang.String cardExpirationMonth;

    private java.lang.String cardExpirationYear;

    private java.lang.Boolean cardSwiped;

    private java.lang.String consumerId;

    private java.lang.String receiverPhone;

    private java.lang.String receiverLegalIdIssueCountry;

    private com.mgipaypal.ac1211.client.PhotoIdType thirdPartyPhotoIdType;

    private java.lang.String thirdPartyPhotoIdNumber;

    private java.lang.String thirdPartyPhotoIdState;

    private java.lang.String thirdPartyPhotoIdIssueCountry;

    private java.lang.String thirdPartyLegalIdIssueCountry;

    private java.lang.String agentConsumerID;

    private java.lang.String agentTransactionId;

    private java.lang.String mgiTransactionSessionID;

    private boolean formFreeStaging;

    private java.math.BigInteger timeToLive;

    private com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues;

    public ReceiveValidationRequest() {
    }

    public ReceiveValidationRequest(
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
           java.lang.String referenceNumber,
           java.lang.String pin,
           java.lang.String receiveCurrency,
           java.lang.String agentCheckNumber,
           java.lang.String agentCheckType,
           java.math.BigDecimal agentCheckAmount,
           java.lang.String customerCheckNumber,
           java.lang.String customerCheckType,
           java.math.BigDecimal customerCheckAmount,
           java.lang.String receiverAddress,
           java.lang.String receiverAddress2,
           java.lang.String receiverAddress3,
           java.lang.String receiverCity,
           java.lang.String receiverState,
           java.lang.String receiverZipCode,
           java.lang.String receiverCountry,
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
           java.lang.String receiverBirthCity,
           java.lang.String receiverBirthCountry,
           java.util.Date receiverPassportIssueDate,
           java.lang.String receiverPassportIssueCity,
           java.lang.String receiverPassportIssueCountry,
           java.lang.String pcTerminalNumber,
           java.lang.String agentUseReceiveData,
           java.lang.String billerAccountNumber,
           java.lang.String otherPayoutType,
           java.math.BigDecimal otherPayoutAmount,
           java.lang.String cardExpirationMonth,
           java.lang.String cardExpirationYear,
           java.lang.Boolean cardSwiped,
           java.lang.String consumerId,
           java.lang.String receiverPhone,
           java.lang.String receiverLegalIdIssueCountry,
           com.mgipaypal.ac1211.client.PhotoIdType thirdPartyPhotoIdType,
           java.lang.String thirdPartyPhotoIdNumber,
           java.lang.String thirdPartyPhotoIdState,
           java.lang.String thirdPartyPhotoIdIssueCountry,
           java.lang.String thirdPartyLegalIdIssueCountry,
           java.lang.String agentConsumerID,
           java.lang.String agentTransactionId,
           java.lang.String mgiTransactionSessionID,
           boolean formFreeStaging,
           java.math.BigInteger timeToLive,
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
        this.referenceNumber = referenceNumber;
        this.pin = pin;
        this.receiveCurrency = receiveCurrency;
        this.agentCheckNumber = agentCheckNumber;
        this.agentCheckType = agentCheckType;
        this.agentCheckAmount = agentCheckAmount;
        this.customerCheckNumber = customerCheckNumber;
        this.customerCheckType = customerCheckType;
        this.customerCheckAmount = customerCheckAmount;
        this.receiverAddress = receiverAddress;
        this.receiverAddress2 = receiverAddress2;
        this.receiverAddress3 = receiverAddress3;
        this.receiverCity = receiverCity;
        this.receiverState = receiverState;
        this.receiverZipCode = receiverZipCode;
        this.receiverCountry = receiverCountry;
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
        this.receiverBirthCity = receiverBirthCity;
        this.receiverBirthCountry = receiverBirthCountry;
        this.receiverPassportIssueDate = receiverPassportIssueDate;
        this.receiverPassportIssueCity = receiverPassportIssueCity;
        this.receiverPassportIssueCountry = receiverPassportIssueCountry;
        this.pcTerminalNumber = pcTerminalNumber;
        this.agentUseReceiveData = agentUseReceiveData;
        this.billerAccountNumber = billerAccountNumber;
        this.otherPayoutType = otherPayoutType;
        this.otherPayoutAmount = otherPayoutAmount;
        this.cardExpirationMonth = cardExpirationMonth;
        this.cardExpirationYear = cardExpirationYear;
        this.cardSwiped = cardSwiped;
        this.consumerId = consumerId;
        this.receiverPhone = receiverPhone;
        this.receiverLegalIdIssueCountry = receiverLegalIdIssueCountry;
        this.thirdPartyPhotoIdType = thirdPartyPhotoIdType;
        this.thirdPartyPhotoIdNumber = thirdPartyPhotoIdNumber;
        this.thirdPartyPhotoIdState = thirdPartyPhotoIdState;
        this.thirdPartyPhotoIdIssueCountry = thirdPartyPhotoIdIssueCountry;
        this.thirdPartyLegalIdIssueCountry = thirdPartyLegalIdIssueCountry;
        this.agentConsumerID = agentConsumerID;
        this.agentTransactionId = agentTransactionId;
        this.mgiTransactionSessionID = mgiTransactionSessionID;
        this.formFreeStaging = formFreeStaging;
        this.timeToLive = timeToLive;
        this.fieldValues = fieldValues;
    }


    /**
     * Gets the operatorName value for this ReceiveValidationRequest.
     * 
     * @return operatorName
     */
    public java.lang.String getOperatorName() {
        return operatorName;
    }


    /**
     * Sets the operatorName value for this ReceiveValidationRequest.
     * 
     * @param operatorName
     */
    public void setOperatorName(java.lang.String operatorName) {
        this.operatorName = operatorName;
    }


    /**
     * Gets the referenceNumber value for this ReceiveValidationRequest.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this ReceiveValidationRequest.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the pin value for this ReceiveValidationRequest.
     * 
     * @return pin
     */
    public java.lang.String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this ReceiveValidationRequest.
     * 
     * @param pin
     */
    public void setPin(java.lang.String pin) {
        this.pin = pin;
    }


    /**
     * Gets the receiveCurrency value for this ReceiveValidationRequest.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this ReceiveValidationRequest.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the agentCheckNumber value for this ReceiveValidationRequest.
     * 
     * @return agentCheckNumber
     */
    public java.lang.String getAgentCheckNumber() {
        return agentCheckNumber;
    }


    /**
     * Sets the agentCheckNumber value for this ReceiveValidationRequest.
     * 
     * @param agentCheckNumber
     */
    public void setAgentCheckNumber(java.lang.String agentCheckNumber) {
        this.agentCheckNumber = agentCheckNumber;
    }


    /**
     * Gets the agentCheckType value for this ReceiveValidationRequest.
     * 
     * @return agentCheckType
     */
    public java.lang.String getAgentCheckType() {
        return agentCheckType;
    }


    /**
     * Sets the agentCheckType value for this ReceiveValidationRequest.
     * 
     * @param agentCheckType
     */
    public void setAgentCheckType(java.lang.String agentCheckType) {
        this.agentCheckType = agentCheckType;
    }


    /**
     * Gets the agentCheckAmount value for this ReceiveValidationRequest.
     * 
     * @return agentCheckAmount
     */
    public java.math.BigDecimal getAgentCheckAmount() {
        return agentCheckAmount;
    }


    /**
     * Sets the agentCheckAmount value for this ReceiveValidationRequest.
     * 
     * @param agentCheckAmount
     */
    public void setAgentCheckAmount(java.math.BigDecimal agentCheckAmount) {
        this.agentCheckAmount = agentCheckAmount;
    }


    /**
     * Gets the customerCheckNumber value for this ReceiveValidationRequest.
     * 
     * @return customerCheckNumber
     */
    public java.lang.String getCustomerCheckNumber() {
        return customerCheckNumber;
    }


    /**
     * Sets the customerCheckNumber value for this ReceiveValidationRequest.
     * 
     * @param customerCheckNumber
     */
    public void setCustomerCheckNumber(java.lang.String customerCheckNumber) {
        this.customerCheckNumber = customerCheckNumber;
    }


    /**
     * Gets the customerCheckType value for this ReceiveValidationRequest.
     * 
     * @return customerCheckType
     */
    public java.lang.String getCustomerCheckType() {
        return customerCheckType;
    }


    /**
     * Sets the customerCheckType value for this ReceiveValidationRequest.
     * 
     * @param customerCheckType
     */
    public void setCustomerCheckType(java.lang.String customerCheckType) {
        this.customerCheckType = customerCheckType;
    }


    /**
     * Gets the customerCheckAmount value for this ReceiveValidationRequest.
     * 
     * @return customerCheckAmount
     */
    public java.math.BigDecimal getCustomerCheckAmount() {
        return customerCheckAmount;
    }


    /**
     * Sets the customerCheckAmount value for this ReceiveValidationRequest.
     * 
     * @param customerCheckAmount
     */
    public void setCustomerCheckAmount(java.math.BigDecimal customerCheckAmount) {
        this.customerCheckAmount = customerCheckAmount;
    }


    /**
     * Gets the receiverAddress value for this ReceiveValidationRequest.
     * 
     * @return receiverAddress
     */
    public java.lang.String getReceiverAddress() {
        return receiverAddress;
    }


    /**
     * Sets the receiverAddress value for this ReceiveValidationRequest.
     * 
     * @param receiverAddress
     */
    public void setReceiverAddress(java.lang.String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }


    /**
     * Gets the receiverAddress2 value for this ReceiveValidationRequest.
     * 
     * @return receiverAddress2
     */
    public java.lang.String getReceiverAddress2() {
        return receiverAddress2;
    }


    /**
     * Sets the receiverAddress2 value for this ReceiveValidationRequest.
     * 
     * @param receiverAddress2
     */
    public void setReceiverAddress2(java.lang.String receiverAddress2) {
        this.receiverAddress2 = receiverAddress2;
    }


    /**
     * Gets the receiverAddress3 value for this ReceiveValidationRequest.
     * 
     * @return receiverAddress3
     */
    public java.lang.String getReceiverAddress3() {
        return receiverAddress3;
    }


    /**
     * Sets the receiverAddress3 value for this ReceiveValidationRequest.
     * 
     * @param receiverAddress3
     */
    public void setReceiverAddress3(java.lang.String receiverAddress3) {
        this.receiverAddress3 = receiverAddress3;
    }


    /**
     * Gets the receiverCity value for this ReceiveValidationRequest.
     * 
     * @return receiverCity
     */
    public java.lang.String getReceiverCity() {
        return receiverCity;
    }


    /**
     * Sets the receiverCity value for this ReceiveValidationRequest.
     * 
     * @param receiverCity
     */
    public void setReceiverCity(java.lang.String receiverCity) {
        this.receiverCity = receiverCity;
    }


    /**
     * Gets the receiverState value for this ReceiveValidationRequest.
     * 
     * @return receiverState
     */
    public java.lang.String getReceiverState() {
        return receiverState;
    }


    /**
     * Sets the receiverState value for this ReceiveValidationRequest.
     * 
     * @param receiverState
     */
    public void setReceiverState(java.lang.String receiverState) {
        this.receiverState = receiverState;
    }


    /**
     * Gets the receiverZipCode value for this ReceiveValidationRequest.
     * 
     * @return receiverZipCode
     */
    public java.lang.String getReceiverZipCode() {
        return receiverZipCode;
    }


    /**
     * Sets the receiverZipCode value for this ReceiveValidationRequest.
     * 
     * @param receiverZipCode
     */
    public void setReceiverZipCode(java.lang.String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
    }


    /**
     * Gets the receiverCountry value for this ReceiveValidationRequest.
     * 
     * @return receiverCountry
     */
    public java.lang.String getReceiverCountry() {
        return receiverCountry;
    }


    /**
     * Sets the receiverCountry value for this ReceiveValidationRequest.
     * 
     * @param receiverCountry
     */
    public void setReceiverCountry(java.lang.String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }


    /**
     * Gets the receiverPhotoIdType value for this ReceiveValidationRequest.
     * 
     * @return receiverPhotoIdType
     */
    public com.mgipaypal.ac1211.client.PhotoIdType getReceiverPhotoIdType() {
        return receiverPhotoIdType;
    }


    /**
     * Sets the receiverPhotoIdType value for this ReceiveValidationRequest.
     * 
     * @param receiverPhotoIdType
     */
    public void setReceiverPhotoIdType(com.mgipaypal.ac1211.client.PhotoIdType receiverPhotoIdType) {
        this.receiverPhotoIdType = receiverPhotoIdType;
    }


    /**
     * Gets the receiverPhotoIdNumber value for this ReceiveValidationRequest.
     * 
     * @return receiverPhotoIdNumber
     */
    public java.lang.String getReceiverPhotoIdNumber() {
        return receiverPhotoIdNumber;
    }


    /**
     * Sets the receiverPhotoIdNumber value for this ReceiveValidationRequest.
     * 
     * @param receiverPhotoIdNumber
     */
    public void setReceiverPhotoIdNumber(java.lang.String receiverPhotoIdNumber) {
        this.receiverPhotoIdNumber = receiverPhotoIdNumber;
    }


    /**
     * Gets the receiverPhotoIdState value for this ReceiveValidationRequest.
     * 
     * @return receiverPhotoIdState
     */
    public java.lang.String getReceiverPhotoIdState() {
        return receiverPhotoIdState;
    }


    /**
     * Sets the receiverPhotoIdState value for this ReceiveValidationRequest.
     * 
     * @param receiverPhotoIdState
     */
    public void setReceiverPhotoIdState(java.lang.String receiverPhotoIdState) {
        this.receiverPhotoIdState = receiverPhotoIdState;
    }


    /**
     * Gets the receiverPhotoIdCountry value for this ReceiveValidationRequest.
     * 
     * @return receiverPhotoIdCountry
     */
    public java.lang.String getReceiverPhotoIdCountry() {
        return receiverPhotoIdCountry;
    }


    /**
     * Sets the receiverPhotoIdCountry value for this ReceiveValidationRequest.
     * 
     * @param receiverPhotoIdCountry
     */
    public void setReceiverPhotoIdCountry(java.lang.String receiverPhotoIdCountry) {
        this.receiverPhotoIdCountry = receiverPhotoIdCountry;
    }


    /**
     * Gets the receiverLegalIdType value for this ReceiveValidationRequest.
     * 
     * @return receiverLegalIdType
     */
    public com.mgipaypal.ac1211.client.LegalIdType getReceiverLegalIdType() {
        return receiverLegalIdType;
    }


    /**
     * Sets the receiverLegalIdType value for this ReceiveValidationRequest.
     * 
     * @param receiverLegalIdType
     */
    public void setReceiverLegalIdType(com.mgipaypal.ac1211.client.LegalIdType receiverLegalIdType) {
        this.receiverLegalIdType = receiverLegalIdType;
    }


    /**
     * Gets the receiverLegalIdNumber value for this ReceiveValidationRequest.
     * 
     * @return receiverLegalIdNumber
     */
    public java.lang.String getReceiverLegalIdNumber() {
        return receiverLegalIdNumber;
    }


    /**
     * Sets the receiverLegalIdNumber value for this ReceiveValidationRequest.
     * 
     * @param receiverLegalIdNumber
     */
    public void setReceiverLegalIdNumber(java.lang.String receiverLegalIdNumber) {
        this.receiverLegalIdNumber = receiverLegalIdNumber;
    }


    /**
     * Gets the receiverDOB value for this ReceiveValidationRequest.
     * 
     * @return receiverDOB
     */
    public java.util.Date getReceiverDOB() {
        return receiverDOB;
    }


    /**
     * Sets the receiverDOB value for this ReceiveValidationRequest.
     * 
     * @param receiverDOB
     */
    public void setReceiverDOB(java.util.Date receiverDOB) {
        this.receiverDOB = receiverDOB;
    }


    /**
     * Gets the receiverOccupation value for this ReceiveValidationRequest.
     * 
     * @return receiverOccupation
     */
    public java.lang.String getReceiverOccupation() {
        return receiverOccupation;
    }


    /**
     * Sets the receiverOccupation value for this ReceiveValidationRequest.
     * 
     * @param receiverOccupation
     */
    public void setReceiverOccupation(java.lang.String receiverOccupation) {
        this.receiverOccupation = receiverOccupation;
    }


    /**
     * Gets the thirdPartyFirstName value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyFirstName
     */
    public java.lang.String getThirdPartyFirstName() {
        return thirdPartyFirstName;
    }


    /**
     * Sets the thirdPartyFirstName value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyFirstName
     */
    public void setThirdPartyFirstName(java.lang.String thirdPartyFirstName) {
        this.thirdPartyFirstName = thirdPartyFirstName;
    }


    /**
     * Gets the thirdPartyMiddleName value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyMiddleName
     */
    public java.lang.String getThirdPartyMiddleName() {
        return thirdPartyMiddleName;
    }


    /**
     * Sets the thirdPartyMiddleName value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyMiddleName
     */
    public void setThirdPartyMiddleName(java.lang.String thirdPartyMiddleName) {
        this.thirdPartyMiddleName = thirdPartyMiddleName;
    }


    /**
     * Gets the thirdPartyLastName value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyLastName
     */
    public java.lang.String getThirdPartyLastName() {
        return thirdPartyLastName;
    }


    /**
     * Sets the thirdPartyLastName value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyLastName
     */
    public void setThirdPartyLastName(java.lang.String thirdPartyLastName) {
        this.thirdPartyLastName = thirdPartyLastName;
    }


    /**
     * Gets the thirdPartyAddress value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyAddress
     */
    public java.lang.String getThirdPartyAddress() {
        return thirdPartyAddress;
    }


    /**
     * Sets the thirdPartyAddress value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyAddress
     */
    public void setThirdPartyAddress(java.lang.String thirdPartyAddress) {
        this.thirdPartyAddress = thirdPartyAddress;
    }


    /**
     * Gets the thirdPartyAddress2 value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyAddress2
     */
    public java.lang.String getThirdPartyAddress2() {
        return thirdPartyAddress2;
    }


    /**
     * Sets the thirdPartyAddress2 value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyAddress2
     */
    public void setThirdPartyAddress2(java.lang.String thirdPartyAddress2) {
        this.thirdPartyAddress2 = thirdPartyAddress2;
    }


    /**
     * Gets the thirdPartyAddress3 value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyAddress3
     */
    public java.lang.String getThirdPartyAddress3() {
        return thirdPartyAddress3;
    }


    /**
     * Sets the thirdPartyAddress3 value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyAddress3
     */
    public void setThirdPartyAddress3(java.lang.String thirdPartyAddress3) {
        this.thirdPartyAddress3 = thirdPartyAddress3;
    }


    /**
     * Gets the thirdPartyCity value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyCity
     */
    public java.lang.String getThirdPartyCity() {
        return thirdPartyCity;
    }


    /**
     * Sets the thirdPartyCity value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyCity
     */
    public void setThirdPartyCity(java.lang.String thirdPartyCity) {
        this.thirdPartyCity = thirdPartyCity;
    }


    /**
     * Gets the thirdPartyState value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyState
     */
    public java.lang.String getThirdPartyState() {
        return thirdPartyState;
    }


    /**
     * Sets the thirdPartyState value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyState
     */
    public void setThirdPartyState(java.lang.String thirdPartyState) {
        this.thirdPartyState = thirdPartyState;
    }


    /**
     * Gets the thirdPartyZipCode value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyZipCode
     */
    public java.lang.String getThirdPartyZipCode() {
        return thirdPartyZipCode;
    }


    /**
     * Sets the thirdPartyZipCode value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyZipCode
     */
    public void setThirdPartyZipCode(java.lang.String thirdPartyZipCode) {
        this.thirdPartyZipCode = thirdPartyZipCode;
    }


    /**
     * Gets the thirdPartyCountry value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyCountry
     */
    public java.lang.String getThirdPartyCountry() {
        return thirdPartyCountry;
    }


    /**
     * Sets the thirdPartyCountry value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyCountry
     */
    public void setThirdPartyCountry(java.lang.String thirdPartyCountry) {
        this.thirdPartyCountry = thirdPartyCountry;
    }


    /**
     * Gets the thirdPartyLegalIdType value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyLegalIdType
     */
    public com.mgipaypal.ac1211.client.LegalIdType getThirdPartyLegalIdType() {
        return thirdPartyLegalIdType;
    }


    /**
     * Sets the thirdPartyLegalIdType value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyLegalIdType
     */
    public void setThirdPartyLegalIdType(com.mgipaypal.ac1211.client.LegalIdType thirdPartyLegalIdType) {
        this.thirdPartyLegalIdType = thirdPartyLegalIdType;
    }


    /**
     * Gets the thirdPartyLegalIdNumber value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyLegalIdNumber
     */
    public java.lang.String getThirdPartyLegalIdNumber() {
        return thirdPartyLegalIdNumber;
    }


    /**
     * Sets the thirdPartyLegalIdNumber value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyLegalIdNumber
     */
    public void setThirdPartyLegalIdNumber(java.lang.String thirdPartyLegalIdNumber) {
        this.thirdPartyLegalIdNumber = thirdPartyLegalIdNumber;
    }


    /**
     * Gets the thirdPartyDOB value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyDOB
     */
    public java.util.Date getThirdPartyDOB() {
        return thirdPartyDOB;
    }


    /**
     * Sets the thirdPartyDOB value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyDOB
     */
    public void setThirdPartyDOB(java.util.Date thirdPartyDOB) {
        this.thirdPartyDOB = thirdPartyDOB;
    }


    /**
     * Gets the thirdPartyOccupation value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyOccupation
     */
    public java.lang.String getThirdPartyOccupation() {
        return thirdPartyOccupation;
    }


    /**
     * Sets the thirdPartyOccupation value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyOccupation
     */
    public void setThirdPartyOccupation(java.lang.String thirdPartyOccupation) {
        this.thirdPartyOccupation = thirdPartyOccupation;
    }


    /**
     * Gets the thirdPartyOrg value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyOrg
     */
    public java.lang.String getThirdPartyOrg() {
        return thirdPartyOrg;
    }


    /**
     * Sets the thirdPartyOrg value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyOrg
     */
    public void setThirdPartyOrg(java.lang.String thirdPartyOrg) {
        this.thirdPartyOrg = thirdPartyOrg;
    }


    /**
     * Gets the receiverBirthCity value for this ReceiveValidationRequest.
     * 
     * @return receiverBirthCity
     */
    public java.lang.String getReceiverBirthCity() {
        return receiverBirthCity;
    }


    /**
     * Sets the receiverBirthCity value for this ReceiveValidationRequest.
     * 
     * @param receiverBirthCity
     */
    public void setReceiverBirthCity(java.lang.String receiverBirthCity) {
        this.receiverBirthCity = receiverBirthCity;
    }


    /**
     * Gets the receiverBirthCountry value for this ReceiveValidationRequest.
     * 
     * @return receiverBirthCountry
     */
    public java.lang.String getReceiverBirthCountry() {
        return receiverBirthCountry;
    }


    /**
     * Sets the receiverBirthCountry value for this ReceiveValidationRequest.
     * 
     * @param receiverBirthCountry
     */
    public void setReceiverBirthCountry(java.lang.String receiverBirthCountry) {
        this.receiverBirthCountry = receiverBirthCountry;
    }


    /**
     * Gets the receiverPassportIssueDate value for this ReceiveValidationRequest.
     * 
     * @return receiverPassportIssueDate
     */
    public java.util.Date getReceiverPassportIssueDate() {
        return receiverPassportIssueDate;
    }


    /**
     * Sets the receiverPassportIssueDate value for this ReceiveValidationRequest.
     * 
     * @param receiverPassportIssueDate
     */
    public void setReceiverPassportIssueDate(java.util.Date receiverPassportIssueDate) {
        this.receiverPassportIssueDate = receiverPassportIssueDate;
    }


    /**
     * Gets the receiverPassportIssueCity value for this ReceiveValidationRequest.
     * 
     * @return receiverPassportIssueCity
     */
    public java.lang.String getReceiverPassportIssueCity() {
        return receiverPassportIssueCity;
    }


    /**
     * Sets the receiverPassportIssueCity value for this ReceiveValidationRequest.
     * 
     * @param receiverPassportIssueCity
     */
    public void setReceiverPassportIssueCity(java.lang.String receiverPassportIssueCity) {
        this.receiverPassportIssueCity = receiverPassportIssueCity;
    }


    /**
     * Gets the receiverPassportIssueCountry value for this ReceiveValidationRequest.
     * 
     * @return receiverPassportIssueCountry
     */
    public java.lang.String getReceiverPassportIssueCountry() {
        return receiverPassportIssueCountry;
    }


    /**
     * Sets the receiverPassportIssueCountry value for this ReceiveValidationRequest.
     * 
     * @param receiverPassportIssueCountry
     */
    public void setReceiverPassportIssueCountry(java.lang.String receiverPassportIssueCountry) {
        this.receiverPassportIssueCountry = receiverPassportIssueCountry;
    }


    /**
     * Gets the pcTerminalNumber value for this ReceiveValidationRequest.
     * 
     * @return pcTerminalNumber
     */
    public java.lang.String getPcTerminalNumber() {
        return pcTerminalNumber;
    }


    /**
     * Sets the pcTerminalNumber value for this ReceiveValidationRequest.
     * 
     * @param pcTerminalNumber
     */
    public void setPcTerminalNumber(java.lang.String pcTerminalNumber) {
        this.pcTerminalNumber = pcTerminalNumber;
    }


    /**
     * Gets the agentUseReceiveData value for this ReceiveValidationRequest.
     * 
     * @return agentUseReceiveData
     */
    public java.lang.String getAgentUseReceiveData() {
        return agentUseReceiveData;
    }


    /**
     * Sets the agentUseReceiveData value for this ReceiveValidationRequest.
     * 
     * @param agentUseReceiveData
     */
    public void setAgentUseReceiveData(java.lang.String agentUseReceiveData) {
        this.agentUseReceiveData = agentUseReceiveData;
    }


    /**
     * Gets the billerAccountNumber value for this ReceiveValidationRequest.
     * 
     * @return billerAccountNumber
     */
    public java.lang.String getBillerAccountNumber() {
        return billerAccountNumber;
    }


    /**
     * Sets the billerAccountNumber value for this ReceiveValidationRequest.
     * 
     * @param billerAccountNumber
     */
    public void setBillerAccountNumber(java.lang.String billerAccountNumber) {
        this.billerAccountNumber = billerAccountNumber;
    }


    /**
     * Gets the otherPayoutType value for this ReceiveValidationRequest.
     * 
     * @return otherPayoutType
     */
    public java.lang.String getOtherPayoutType() {
        return otherPayoutType;
    }


    /**
     * Sets the otherPayoutType value for this ReceiveValidationRequest.
     * 
     * @param otherPayoutType
     */
    public void setOtherPayoutType(java.lang.String otherPayoutType) {
        this.otherPayoutType = otherPayoutType;
    }


    /**
     * Gets the otherPayoutAmount value for this ReceiveValidationRequest.
     * 
     * @return otherPayoutAmount
     */
    public java.math.BigDecimal getOtherPayoutAmount() {
        return otherPayoutAmount;
    }


    /**
     * Sets the otherPayoutAmount value for this ReceiveValidationRequest.
     * 
     * @param otherPayoutAmount
     */
    public void setOtherPayoutAmount(java.math.BigDecimal otherPayoutAmount) {
        this.otherPayoutAmount = otherPayoutAmount;
    }


    /**
     * Gets the cardExpirationMonth value for this ReceiveValidationRequest.
     * 
     * @return cardExpirationMonth
     */
    public java.lang.String getCardExpirationMonth() {
        return cardExpirationMonth;
    }


    /**
     * Sets the cardExpirationMonth value for this ReceiveValidationRequest.
     * 
     * @param cardExpirationMonth
     */
    public void setCardExpirationMonth(java.lang.String cardExpirationMonth) {
        this.cardExpirationMonth = cardExpirationMonth;
    }


    /**
     * Gets the cardExpirationYear value for this ReceiveValidationRequest.
     * 
     * @return cardExpirationYear
     */
    public java.lang.String getCardExpirationYear() {
        return cardExpirationYear;
    }


    /**
     * Sets the cardExpirationYear value for this ReceiveValidationRequest.
     * 
     * @param cardExpirationYear
     */
    public void setCardExpirationYear(java.lang.String cardExpirationYear) {
        this.cardExpirationYear = cardExpirationYear;
    }


    /**
     * Gets the cardSwiped value for this ReceiveValidationRequest.
     * 
     * @return cardSwiped
     */
    public java.lang.Boolean getCardSwiped() {
        return cardSwiped;
    }


    /**
     * Sets the cardSwiped value for this ReceiveValidationRequest.
     * 
     * @param cardSwiped
     */
    public void setCardSwiped(java.lang.Boolean cardSwiped) {
        this.cardSwiped = cardSwiped;
    }


    /**
     * Gets the consumerId value for this ReceiveValidationRequest.
     * 
     * @return consumerId
     */
    public java.lang.String getConsumerId() {
        return consumerId;
    }


    /**
     * Sets the consumerId value for this ReceiveValidationRequest.
     * 
     * @param consumerId
     */
    public void setConsumerId(java.lang.String consumerId) {
        this.consumerId = consumerId;
    }


    /**
     * Gets the receiverPhone value for this ReceiveValidationRequest.
     * 
     * @return receiverPhone
     */
    public java.lang.String getReceiverPhone() {
        return receiverPhone;
    }


    /**
     * Sets the receiverPhone value for this ReceiveValidationRequest.
     * 
     * @param receiverPhone
     */
    public void setReceiverPhone(java.lang.String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }


    /**
     * Gets the receiverLegalIdIssueCountry value for this ReceiveValidationRequest.
     * 
     * @return receiverLegalIdIssueCountry
     */
    public java.lang.String getReceiverLegalIdIssueCountry() {
        return receiverLegalIdIssueCountry;
    }


    /**
     * Sets the receiverLegalIdIssueCountry value for this ReceiveValidationRequest.
     * 
     * @param receiverLegalIdIssueCountry
     */
    public void setReceiverLegalIdIssueCountry(java.lang.String receiverLegalIdIssueCountry) {
        this.receiverLegalIdIssueCountry = receiverLegalIdIssueCountry;
    }


    /**
     * Gets the thirdPartyPhotoIdType value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyPhotoIdType
     */
    public com.mgipaypal.ac1211.client.PhotoIdType getThirdPartyPhotoIdType() {
        return thirdPartyPhotoIdType;
    }


    /**
     * Sets the thirdPartyPhotoIdType value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyPhotoIdType
     */
    public void setThirdPartyPhotoIdType(com.mgipaypal.ac1211.client.PhotoIdType thirdPartyPhotoIdType) {
        this.thirdPartyPhotoIdType = thirdPartyPhotoIdType;
    }


    /**
     * Gets the thirdPartyPhotoIdNumber value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyPhotoIdNumber
     */
    public java.lang.String getThirdPartyPhotoIdNumber() {
        return thirdPartyPhotoIdNumber;
    }


    /**
     * Sets the thirdPartyPhotoIdNumber value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyPhotoIdNumber
     */
    public void setThirdPartyPhotoIdNumber(java.lang.String thirdPartyPhotoIdNumber) {
        this.thirdPartyPhotoIdNumber = thirdPartyPhotoIdNumber;
    }


    /**
     * Gets the thirdPartyPhotoIdState value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyPhotoIdState
     */
    public java.lang.String getThirdPartyPhotoIdState() {
        return thirdPartyPhotoIdState;
    }


    /**
     * Sets the thirdPartyPhotoIdState value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyPhotoIdState
     */
    public void setThirdPartyPhotoIdState(java.lang.String thirdPartyPhotoIdState) {
        this.thirdPartyPhotoIdState = thirdPartyPhotoIdState;
    }


    /**
     * Gets the thirdPartyPhotoIdIssueCountry value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyPhotoIdIssueCountry
     */
    public java.lang.String getThirdPartyPhotoIdIssueCountry() {
        return thirdPartyPhotoIdIssueCountry;
    }


    /**
     * Sets the thirdPartyPhotoIdIssueCountry value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyPhotoIdIssueCountry
     */
    public void setThirdPartyPhotoIdIssueCountry(java.lang.String thirdPartyPhotoIdIssueCountry) {
        this.thirdPartyPhotoIdIssueCountry = thirdPartyPhotoIdIssueCountry;
    }


    /**
     * Gets the thirdPartyLegalIdIssueCountry value for this ReceiveValidationRequest.
     * 
     * @return thirdPartyLegalIdIssueCountry
     */
    public java.lang.String getThirdPartyLegalIdIssueCountry() {
        return thirdPartyLegalIdIssueCountry;
    }


    /**
     * Sets the thirdPartyLegalIdIssueCountry value for this ReceiveValidationRequest.
     * 
     * @param thirdPartyLegalIdIssueCountry
     */
    public void setThirdPartyLegalIdIssueCountry(java.lang.String thirdPartyLegalIdIssueCountry) {
        this.thirdPartyLegalIdIssueCountry = thirdPartyLegalIdIssueCountry;
    }


    /**
     * Gets the agentConsumerID value for this ReceiveValidationRequest.
     * 
     * @return agentConsumerID
     */
    public java.lang.String getAgentConsumerID() {
        return agentConsumerID;
    }


    /**
     * Sets the agentConsumerID value for this ReceiveValidationRequest.
     * 
     * @param agentConsumerID
     */
    public void setAgentConsumerID(java.lang.String agentConsumerID) {
        this.agentConsumerID = agentConsumerID;
    }


    /**
     * Gets the agentTransactionId value for this ReceiveValidationRequest.
     * 
     * @return agentTransactionId
     */
    public java.lang.String getAgentTransactionId() {
        return agentTransactionId;
    }


    /**
     * Sets the agentTransactionId value for this ReceiveValidationRequest.
     * 
     * @param agentTransactionId
     */
    public void setAgentTransactionId(java.lang.String agentTransactionId) {
        this.agentTransactionId = agentTransactionId;
    }


    /**
     * Gets the mgiTransactionSessionID value for this ReceiveValidationRequest.
     * 
     * @return mgiTransactionSessionID
     */
    public java.lang.String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }


    /**
     * Sets the mgiTransactionSessionID value for this ReceiveValidationRequest.
     * 
     * @param mgiTransactionSessionID
     */
    public void setMgiTransactionSessionID(java.lang.String mgiTransactionSessionID) {
        this.mgiTransactionSessionID = mgiTransactionSessionID;
    }


    /**
     * Gets the formFreeStaging value for this ReceiveValidationRequest.
     * 
     * @return formFreeStaging
     */
    public boolean isFormFreeStaging() {
        return formFreeStaging;
    }


    /**
     * Sets the formFreeStaging value for this ReceiveValidationRequest.
     * 
     * @param formFreeStaging
     */
    public void setFormFreeStaging(boolean formFreeStaging) {
        this.formFreeStaging = formFreeStaging;
    }


    /**
     * Gets the timeToLive value for this ReceiveValidationRequest.
     * 
     * @return timeToLive
     */
    public java.math.BigInteger getTimeToLive() {
        return timeToLive;
    }


    /**
     * Sets the timeToLive value for this ReceiveValidationRequest.
     * 
     * @param timeToLive
     */
    public void setTimeToLive(java.math.BigInteger timeToLive) {
        this.timeToLive = timeToLive;
    }


    /**
     * Gets the fieldValues value for this ReceiveValidationRequest.
     * 
     * @return fieldValues
     */
    public com.mgipaypal.ac1211.client.KeyValuePair[] getFieldValues() {
        return fieldValues;
    }


    /**
     * Sets the fieldValues value for this ReceiveValidationRequest.
     * 
     * @param fieldValues
     */
    public void setFieldValues(com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues) {
        this.fieldValues = fieldValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiveValidationRequest)) return false;
        ReceiveValidationRequest other = (ReceiveValidationRequest) obj;
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
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.receiveCurrency==null && other.getReceiveCurrency()==null) || 
             (this.receiveCurrency!=null &&
              this.receiveCurrency.equals(other.getReceiveCurrency()))) &&
            ((this.agentCheckNumber==null && other.getAgentCheckNumber()==null) || 
             (this.agentCheckNumber!=null &&
              this.agentCheckNumber.equals(other.getAgentCheckNumber()))) &&
            ((this.agentCheckType==null && other.getAgentCheckType()==null) || 
             (this.agentCheckType!=null &&
              this.agentCheckType.equals(other.getAgentCheckType()))) &&
            ((this.agentCheckAmount==null && other.getAgentCheckAmount()==null) || 
             (this.agentCheckAmount!=null &&
              this.agentCheckAmount.equals(other.getAgentCheckAmount()))) &&
            ((this.customerCheckNumber==null && other.getCustomerCheckNumber()==null) || 
             (this.customerCheckNumber!=null &&
              this.customerCheckNumber.equals(other.getCustomerCheckNumber()))) &&
            ((this.customerCheckType==null && other.getCustomerCheckType()==null) || 
             (this.customerCheckType!=null &&
              this.customerCheckType.equals(other.getCustomerCheckType()))) &&
            ((this.customerCheckAmount==null && other.getCustomerCheckAmount()==null) || 
             (this.customerCheckAmount!=null &&
              this.customerCheckAmount.equals(other.getCustomerCheckAmount()))) &&
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
            ((this.pcTerminalNumber==null && other.getPcTerminalNumber()==null) || 
             (this.pcTerminalNumber!=null &&
              this.pcTerminalNumber.equals(other.getPcTerminalNumber()))) &&
            ((this.agentUseReceiveData==null && other.getAgentUseReceiveData()==null) || 
             (this.agentUseReceiveData!=null &&
              this.agentUseReceiveData.equals(other.getAgentUseReceiveData()))) &&
            ((this.billerAccountNumber==null && other.getBillerAccountNumber()==null) || 
             (this.billerAccountNumber!=null &&
              this.billerAccountNumber.equals(other.getBillerAccountNumber()))) &&
            ((this.otherPayoutType==null && other.getOtherPayoutType()==null) || 
             (this.otherPayoutType!=null &&
              this.otherPayoutType.equals(other.getOtherPayoutType()))) &&
            ((this.otherPayoutAmount==null && other.getOtherPayoutAmount()==null) || 
             (this.otherPayoutAmount!=null &&
              this.otherPayoutAmount.equals(other.getOtherPayoutAmount()))) &&
            ((this.cardExpirationMonth==null && other.getCardExpirationMonth()==null) || 
             (this.cardExpirationMonth!=null &&
              this.cardExpirationMonth.equals(other.getCardExpirationMonth()))) &&
            ((this.cardExpirationYear==null && other.getCardExpirationYear()==null) || 
             (this.cardExpirationYear!=null &&
              this.cardExpirationYear.equals(other.getCardExpirationYear()))) &&
            ((this.cardSwiped==null && other.getCardSwiped()==null) || 
             (this.cardSwiped!=null &&
              this.cardSwiped.equals(other.getCardSwiped()))) &&
            ((this.consumerId==null && other.getConsumerId()==null) || 
             (this.consumerId!=null &&
              this.consumerId.equals(other.getConsumerId()))) &&
            ((this.receiverPhone==null && other.getReceiverPhone()==null) || 
             (this.receiverPhone!=null &&
              this.receiverPhone.equals(other.getReceiverPhone()))) &&
            ((this.receiverLegalIdIssueCountry==null && other.getReceiverLegalIdIssueCountry()==null) || 
             (this.receiverLegalIdIssueCountry!=null &&
              this.receiverLegalIdIssueCountry.equals(other.getReceiverLegalIdIssueCountry()))) &&
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
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        if (getAgentCheckNumber() != null) {
            _hashCode += getAgentCheckNumber().hashCode();
        }
        if (getAgentCheckType() != null) {
            _hashCode += getAgentCheckType().hashCode();
        }
        if (getAgentCheckAmount() != null) {
            _hashCode += getAgentCheckAmount().hashCode();
        }
        if (getCustomerCheckNumber() != null) {
            _hashCode += getCustomerCheckNumber().hashCode();
        }
        if (getCustomerCheckType() != null) {
            _hashCode += getCustomerCheckType().hashCode();
        }
        if (getCustomerCheckAmount() != null) {
            _hashCode += getCustomerCheckAmount().hashCode();
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
        if (getPcTerminalNumber() != null) {
            _hashCode += getPcTerminalNumber().hashCode();
        }
        if (getAgentUseReceiveData() != null) {
            _hashCode += getAgentUseReceiveData().hashCode();
        }
        if (getBillerAccountNumber() != null) {
            _hashCode += getBillerAccountNumber().hashCode();
        }
        if (getOtherPayoutType() != null) {
            _hashCode += getOtherPayoutType().hashCode();
        }
        if (getOtherPayoutAmount() != null) {
            _hashCode += getOtherPayoutAmount().hashCode();
        }
        if (getCardExpirationMonth() != null) {
            _hashCode += getCardExpirationMonth().hashCode();
        }
        if (getCardExpirationYear() != null) {
            _hashCode += getCardExpirationYear().hashCode();
        }
        if (getCardSwiped() != null) {
            _hashCode += getCardSwiped().hashCode();
        }
        if (getConsumerId() != null) {
            _hashCode += getConsumerId().hashCode();
        }
        if (getReceiverPhone() != null) {
            _hashCode += getReceiverPhone().hashCode();
        }
        if (getReceiverLegalIdIssueCountry() != null) {
            _hashCode += getReceiverLegalIdIssueCountry().hashCode();
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
        new org.apache.axis.description.TypeDesc(ReceiveValidationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveValidationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "operatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "pin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("agentCheckType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentCheckType"));
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
        elemField.setFieldName("customerCheckNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerCheckNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCheckType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerCheckType"));
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
        elemField.setFieldName("pcTerminalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "pcTerminalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentUseReceiveData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentUseReceiveData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPayoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "otherPayoutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPayoutAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "otherPayoutAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("cardSwiped");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cardSwiped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("receiverPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
