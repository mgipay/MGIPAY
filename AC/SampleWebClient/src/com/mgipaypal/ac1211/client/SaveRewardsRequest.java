/**
 * SaveRewardsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class SaveRewardsRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String cardTypeCode;

    private java.lang.String freqCustCardNumber;

    private java.lang.String operatorID;

    private java.lang.String consumerTitle;

    private java.lang.String consumerFirstName;

    private java.lang.String consumerMiddleName;

    private java.lang.String consumerLastName;

    private java.lang.String consumerAddress;

    private java.lang.String consumerAddress2;

    private java.lang.String consumerAddress3;

    private java.lang.String consumerCity;

    private java.lang.String consumerState;

    private java.lang.String consumerZipCode;

    private java.lang.String consumerCountry;

    private java.lang.String consumerHomePhone;

    private org.apache.axis.types.Token consumerEmailAddress;

    private java.lang.String consumerMobilePhone;

    private java.lang.String personalIdNumber1;

    private java.lang.String personalIdTypeCode1;

    private java.lang.String personalIdIssueOfficeCode1;

    private java.lang.String personalIdIssueCity1;

    private java.lang.String personalIdIssueState1;

    private java.lang.String personalIdIssueCountry1;

    private java.lang.String personalIdIssueMonth1;

    private java.lang.String personalIdIssueDay1;

    private java.lang.String personalIdIssueYear1;

    private java.lang.String personalIdExpirationMonth1;

    private java.lang.String personalIdExpirationDay1;

    private java.lang.String personalIdExpirationYear1;

    private java.lang.String personalIdNumber2;

    private java.lang.String personalIdTypeCode2;

    private java.lang.String personalIdIssueOfficeCode2;

    private java.lang.String personalIdIssueCity2;

    private java.lang.String personalIdIssueState2;

    private java.lang.String personalIdIssueCountry2;

    private java.lang.String personalIdIssueMonth2;

    private java.lang.String personalIdIssueDay2;

    private java.lang.String personalIdIssueYear2;

    private java.lang.String personalIdExpirationMonth2;

    private java.lang.String personalIdExpirationDay2;

    private java.lang.String personalIdExpirationYear2;

    private java.lang.String personalIdNumber3;

    private java.lang.String personalIdTypeCode3;

    private java.lang.String personalIdIssueOfficeCode3;

    private java.lang.String personalIdIssueCity3;

    private java.lang.String personalIdIssueState3;

    private java.lang.String personalIdIssueCountry3;

    private java.lang.String personalIdIssueMonth3;

    private java.lang.String personalIdIssueDay3;

    private java.lang.String personalIdIssueYear3;

    private java.lang.String personalIdExpirationMonth3;

    private java.lang.String personalIdExpirationDay3;

    private java.lang.String personalIdExpirationYear3;

    private java.util.Date consumerDOB;

    private java.lang.String consumerBirthCity;

    private java.lang.String consumerBirthState;

    private java.lang.String consumerBirthCountry;

    private com.mgipaypal.ac1211.client.GenderType gender;

    private java.lang.Boolean marketingOptIn;

    private java.lang.Boolean marketingByCellPhone;

    private java.lang.Boolean marketingByEmail;

    private java.lang.Boolean marketingByHomePhone;

    private java.lang.Boolean marketingByMail;

    private java.lang.Boolean marketingBySMS;

    private java.lang.String marketingLanguage;

    private java.lang.Boolean receiveNoticeOptIn;

    private org.apache.axis.types.Token receiveNoticeEmailAddress;

    private java.lang.Boolean receiveNoticeViaEMail;

    private java.lang.Boolean receiveNoticeViaSMS;

    private java.lang.String receiveNoticeMobilePhone;

    private java.lang.String receiveNoticeLanguage;

    private java.lang.Boolean quarterlyStatements;

    private java.lang.Boolean quarterlyStatementsByEmail;

    private java.lang.Boolean quarterlyStatementsByMail;

    private java.lang.Boolean consentOfPersonalInformationThirdParty;

    private java.lang.Boolean agentAcknowledgement;

    public SaveRewardsRequest() {
    }

    public SaveRewardsRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String cardTypeCode,
           java.lang.String freqCustCardNumber,
           java.lang.String operatorID,
           java.lang.String consumerTitle,
           java.lang.String consumerFirstName,
           java.lang.String consumerMiddleName,
           java.lang.String consumerLastName,
           java.lang.String consumerAddress,
           java.lang.String consumerAddress2,
           java.lang.String consumerAddress3,
           java.lang.String consumerCity,
           java.lang.String consumerState,
           java.lang.String consumerZipCode,
           java.lang.String consumerCountry,
           java.lang.String consumerHomePhone,
           org.apache.axis.types.Token consumerEmailAddress,
           java.lang.String consumerMobilePhone,
           java.lang.String personalIdNumber1,
           java.lang.String personalIdTypeCode1,
           java.lang.String personalIdIssueOfficeCode1,
           java.lang.String personalIdIssueCity1,
           java.lang.String personalIdIssueState1,
           java.lang.String personalIdIssueCountry1,
           java.lang.String personalIdIssueMonth1,
           java.lang.String personalIdIssueDay1,
           java.lang.String personalIdIssueYear1,
           java.lang.String personalIdExpirationMonth1,
           java.lang.String personalIdExpirationDay1,
           java.lang.String personalIdExpirationYear1,
           java.lang.String personalIdNumber2,
           java.lang.String personalIdTypeCode2,
           java.lang.String personalIdIssueOfficeCode2,
           java.lang.String personalIdIssueCity2,
           java.lang.String personalIdIssueState2,
           java.lang.String personalIdIssueCountry2,
           java.lang.String personalIdIssueMonth2,
           java.lang.String personalIdIssueDay2,
           java.lang.String personalIdIssueYear2,
           java.lang.String personalIdExpirationMonth2,
           java.lang.String personalIdExpirationDay2,
           java.lang.String personalIdExpirationYear2,
           java.lang.String personalIdNumber3,
           java.lang.String personalIdTypeCode3,
           java.lang.String personalIdIssueOfficeCode3,
           java.lang.String personalIdIssueCity3,
           java.lang.String personalIdIssueState3,
           java.lang.String personalIdIssueCountry3,
           java.lang.String personalIdIssueMonth3,
           java.lang.String personalIdIssueDay3,
           java.lang.String personalIdIssueYear3,
           java.lang.String personalIdExpirationMonth3,
           java.lang.String personalIdExpirationDay3,
           java.lang.String personalIdExpirationYear3,
           java.util.Date consumerDOB,
           java.lang.String consumerBirthCity,
           java.lang.String consumerBirthState,
           java.lang.String consumerBirthCountry,
           com.mgipaypal.ac1211.client.GenderType gender,
           java.lang.Boolean marketingOptIn,
           java.lang.Boolean marketingByCellPhone,
           java.lang.Boolean marketingByEmail,
           java.lang.Boolean marketingByHomePhone,
           java.lang.Boolean marketingByMail,
           java.lang.Boolean marketingBySMS,
           java.lang.String marketingLanguage,
           java.lang.Boolean receiveNoticeOptIn,
           org.apache.axis.types.Token receiveNoticeEmailAddress,
           java.lang.Boolean receiveNoticeViaEMail,
           java.lang.Boolean receiveNoticeViaSMS,
           java.lang.String receiveNoticeMobilePhone,
           java.lang.String receiveNoticeLanguage,
           java.lang.Boolean quarterlyStatements,
           java.lang.Boolean quarterlyStatementsByEmail,
           java.lang.Boolean quarterlyStatementsByMail,
           java.lang.Boolean consentOfPersonalInformationThirdParty,
           java.lang.Boolean agentAcknowledgement) {
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
        this.cardTypeCode = cardTypeCode;
        this.freqCustCardNumber = freqCustCardNumber;
        this.operatorID = operatorID;
        this.consumerTitle = consumerTitle;
        this.consumerFirstName = consumerFirstName;
        this.consumerMiddleName = consumerMiddleName;
        this.consumerLastName = consumerLastName;
        this.consumerAddress = consumerAddress;
        this.consumerAddress2 = consumerAddress2;
        this.consumerAddress3 = consumerAddress3;
        this.consumerCity = consumerCity;
        this.consumerState = consumerState;
        this.consumerZipCode = consumerZipCode;
        this.consumerCountry = consumerCountry;
        this.consumerHomePhone = consumerHomePhone;
        this.consumerEmailAddress = consumerEmailAddress;
        this.consumerMobilePhone = consumerMobilePhone;
        this.personalIdNumber1 = personalIdNumber1;
        this.personalIdTypeCode1 = personalIdTypeCode1;
        this.personalIdIssueOfficeCode1 = personalIdIssueOfficeCode1;
        this.personalIdIssueCity1 = personalIdIssueCity1;
        this.personalIdIssueState1 = personalIdIssueState1;
        this.personalIdIssueCountry1 = personalIdIssueCountry1;
        this.personalIdIssueMonth1 = personalIdIssueMonth1;
        this.personalIdIssueDay1 = personalIdIssueDay1;
        this.personalIdIssueYear1 = personalIdIssueYear1;
        this.personalIdExpirationMonth1 = personalIdExpirationMonth1;
        this.personalIdExpirationDay1 = personalIdExpirationDay1;
        this.personalIdExpirationYear1 = personalIdExpirationYear1;
        this.personalIdNumber2 = personalIdNumber2;
        this.personalIdTypeCode2 = personalIdTypeCode2;
        this.personalIdIssueOfficeCode2 = personalIdIssueOfficeCode2;
        this.personalIdIssueCity2 = personalIdIssueCity2;
        this.personalIdIssueState2 = personalIdIssueState2;
        this.personalIdIssueCountry2 = personalIdIssueCountry2;
        this.personalIdIssueMonth2 = personalIdIssueMonth2;
        this.personalIdIssueDay2 = personalIdIssueDay2;
        this.personalIdIssueYear2 = personalIdIssueYear2;
        this.personalIdExpirationMonth2 = personalIdExpirationMonth2;
        this.personalIdExpirationDay2 = personalIdExpirationDay2;
        this.personalIdExpirationYear2 = personalIdExpirationYear2;
        this.personalIdNumber3 = personalIdNumber3;
        this.personalIdTypeCode3 = personalIdTypeCode3;
        this.personalIdIssueOfficeCode3 = personalIdIssueOfficeCode3;
        this.personalIdIssueCity3 = personalIdIssueCity3;
        this.personalIdIssueState3 = personalIdIssueState3;
        this.personalIdIssueCountry3 = personalIdIssueCountry3;
        this.personalIdIssueMonth3 = personalIdIssueMonth3;
        this.personalIdIssueDay3 = personalIdIssueDay3;
        this.personalIdIssueYear3 = personalIdIssueYear3;
        this.personalIdExpirationMonth3 = personalIdExpirationMonth3;
        this.personalIdExpirationDay3 = personalIdExpirationDay3;
        this.personalIdExpirationYear3 = personalIdExpirationYear3;
        this.consumerDOB = consumerDOB;
        this.consumerBirthCity = consumerBirthCity;
        this.consumerBirthState = consumerBirthState;
        this.consumerBirthCountry = consumerBirthCountry;
        this.gender = gender;
        this.marketingOptIn = marketingOptIn;
        this.marketingByCellPhone = marketingByCellPhone;
        this.marketingByEmail = marketingByEmail;
        this.marketingByHomePhone = marketingByHomePhone;
        this.marketingByMail = marketingByMail;
        this.marketingBySMS = marketingBySMS;
        this.marketingLanguage = marketingLanguage;
        this.receiveNoticeOptIn = receiveNoticeOptIn;
        this.receiveNoticeEmailAddress = receiveNoticeEmailAddress;
        this.receiveNoticeViaEMail = receiveNoticeViaEMail;
        this.receiveNoticeViaSMS = receiveNoticeViaSMS;
        this.receiveNoticeMobilePhone = receiveNoticeMobilePhone;
        this.receiveNoticeLanguage = receiveNoticeLanguage;
        this.quarterlyStatements = quarterlyStatements;
        this.quarterlyStatementsByEmail = quarterlyStatementsByEmail;
        this.quarterlyStatementsByMail = quarterlyStatementsByMail;
        this.consentOfPersonalInformationThirdParty = consentOfPersonalInformationThirdParty;
        this.agentAcknowledgement = agentAcknowledgement;
    }


    /**
     * Gets the cardTypeCode value for this SaveRewardsRequest.
     * 
     * @return cardTypeCode
     */
    public java.lang.String getCardTypeCode() {
        return cardTypeCode;
    }


    /**
     * Sets the cardTypeCode value for this SaveRewardsRequest.
     * 
     * @param cardTypeCode
     */
    public void setCardTypeCode(java.lang.String cardTypeCode) {
        this.cardTypeCode = cardTypeCode;
    }


    /**
     * Gets the freqCustCardNumber value for this SaveRewardsRequest.
     * 
     * @return freqCustCardNumber
     */
    public java.lang.String getFreqCustCardNumber() {
        return freqCustCardNumber;
    }


    /**
     * Sets the freqCustCardNumber value for this SaveRewardsRequest.
     * 
     * @param freqCustCardNumber
     */
    public void setFreqCustCardNumber(java.lang.String freqCustCardNumber) {
        this.freqCustCardNumber = freqCustCardNumber;
    }


    /**
     * Gets the operatorID value for this SaveRewardsRequest.
     * 
     * @return operatorID
     */
    public java.lang.String getOperatorID() {
        return operatorID;
    }


    /**
     * Sets the operatorID value for this SaveRewardsRequest.
     * 
     * @param operatorID
     */
    public void setOperatorID(java.lang.String operatorID) {
        this.operatorID = operatorID;
    }


    /**
     * Gets the consumerTitle value for this SaveRewardsRequest.
     * 
     * @return consumerTitle
     */
    public java.lang.String getConsumerTitle() {
        return consumerTitle;
    }


    /**
     * Sets the consumerTitle value for this SaveRewardsRequest.
     * 
     * @param consumerTitle
     */
    public void setConsumerTitle(java.lang.String consumerTitle) {
        this.consumerTitle = consumerTitle;
    }


    /**
     * Gets the consumerFirstName value for this SaveRewardsRequest.
     * 
     * @return consumerFirstName
     */
    public java.lang.String getConsumerFirstName() {
        return consumerFirstName;
    }


    /**
     * Sets the consumerFirstName value for this SaveRewardsRequest.
     * 
     * @param consumerFirstName
     */
    public void setConsumerFirstName(java.lang.String consumerFirstName) {
        this.consumerFirstName = consumerFirstName;
    }


    /**
     * Gets the consumerMiddleName value for this SaveRewardsRequest.
     * 
     * @return consumerMiddleName
     */
    public java.lang.String getConsumerMiddleName() {
        return consumerMiddleName;
    }


    /**
     * Sets the consumerMiddleName value for this SaveRewardsRequest.
     * 
     * @param consumerMiddleName
     */
    public void setConsumerMiddleName(java.lang.String consumerMiddleName) {
        this.consumerMiddleName = consumerMiddleName;
    }


    /**
     * Gets the consumerLastName value for this SaveRewardsRequest.
     * 
     * @return consumerLastName
     */
    public java.lang.String getConsumerLastName() {
        return consumerLastName;
    }


    /**
     * Sets the consumerLastName value for this SaveRewardsRequest.
     * 
     * @param consumerLastName
     */
    public void setConsumerLastName(java.lang.String consumerLastName) {
        this.consumerLastName = consumerLastName;
    }


    /**
     * Gets the consumerAddress value for this SaveRewardsRequest.
     * 
     * @return consumerAddress
     */
    public java.lang.String getConsumerAddress() {
        return consumerAddress;
    }


    /**
     * Sets the consumerAddress value for this SaveRewardsRequest.
     * 
     * @param consumerAddress
     */
    public void setConsumerAddress(java.lang.String consumerAddress) {
        this.consumerAddress = consumerAddress;
    }


    /**
     * Gets the consumerAddress2 value for this SaveRewardsRequest.
     * 
     * @return consumerAddress2
     */
    public java.lang.String getConsumerAddress2() {
        return consumerAddress2;
    }


    /**
     * Sets the consumerAddress2 value for this SaveRewardsRequest.
     * 
     * @param consumerAddress2
     */
    public void setConsumerAddress2(java.lang.String consumerAddress2) {
        this.consumerAddress2 = consumerAddress2;
    }


    /**
     * Gets the consumerAddress3 value for this SaveRewardsRequest.
     * 
     * @return consumerAddress3
     */
    public java.lang.String getConsumerAddress3() {
        return consumerAddress3;
    }


    /**
     * Sets the consumerAddress3 value for this SaveRewardsRequest.
     * 
     * @param consumerAddress3
     */
    public void setConsumerAddress3(java.lang.String consumerAddress3) {
        this.consumerAddress3 = consumerAddress3;
    }


    /**
     * Gets the consumerCity value for this SaveRewardsRequest.
     * 
     * @return consumerCity
     */
    public java.lang.String getConsumerCity() {
        return consumerCity;
    }


    /**
     * Sets the consumerCity value for this SaveRewardsRequest.
     * 
     * @param consumerCity
     */
    public void setConsumerCity(java.lang.String consumerCity) {
        this.consumerCity = consumerCity;
    }


    /**
     * Gets the consumerState value for this SaveRewardsRequest.
     * 
     * @return consumerState
     */
    public java.lang.String getConsumerState() {
        return consumerState;
    }


    /**
     * Sets the consumerState value for this SaveRewardsRequest.
     * 
     * @param consumerState
     */
    public void setConsumerState(java.lang.String consumerState) {
        this.consumerState = consumerState;
    }


    /**
     * Gets the consumerZipCode value for this SaveRewardsRequest.
     * 
     * @return consumerZipCode
     */
    public java.lang.String getConsumerZipCode() {
        return consumerZipCode;
    }


    /**
     * Sets the consumerZipCode value for this SaveRewardsRequest.
     * 
     * @param consumerZipCode
     */
    public void setConsumerZipCode(java.lang.String consumerZipCode) {
        this.consumerZipCode = consumerZipCode;
    }


    /**
     * Gets the consumerCountry value for this SaveRewardsRequest.
     * 
     * @return consumerCountry
     */
    public java.lang.String getConsumerCountry() {
        return consumerCountry;
    }


    /**
     * Sets the consumerCountry value for this SaveRewardsRequest.
     * 
     * @param consumerCountry
     */
    public void setConsumerCountry(java.lang.String consumerCountry) {
        this.consumerCountry = consumerCountry;
    }


    /**
     * Gets the consumerHomePhone value for this SaveRewardsRequest.
     * 
     * @return consumerHomePhone
     */
    public java.lang.String getConsumerHomePhone() {
        return consumerHomePhone;
    }


    /**
     * Sets the consumerHomePhone value for this SaveRewardsRequest.
     * 
     * @param consumerHomePhone
     */
    public void setConsumerHomePhone(java.lang.String consumerHomePhone) {
        this.consumerHomePhone = consumerHomePhone;
    }


    /**
     * Gets the consumerEmailAddress value for this SaveRewardsRequest.
     * 
     * @return consumerEmailAddress
     */
    public org.apache.axis.types.Token getConsumerEmailAddress() {
        return consumerEmailAddress;
    }


    /**
     * Sets the consumerEmailAddress value for this SaveRewardsRequest.
     * 
     * @param consumerEmailAddress
     */
    public void setConsumerEmailAddress(org.apache.axis.types.Token consumerEmailAddress) {
        this.consumerEmailAddress = consumerEmailAddress;
    }


    /**
     * Gets the consumerMobilePhone value for this SaveRewardsRequest.
     * 
     * @return consumerMobilePhone
     */
    public java.lang.String getConsumerMobilePhone() {
        return consumerMobilePhone;
    }


    /**
     * Sets the consumerMobilePhone value for this SaveRewardsRequest.
     * 
     * @param consumerMobilePhone
     */
    public void setConsumerMobilePhone(java.lang.String consumerMobilePhone) {
        this.consumerMobilePhone = consumerMobilePhone;
    }


    /**
     * Gets the personalIdNumber1 value for this SaveRewardsRequest.
     * 
     * @return personalIdNumber1
     */
    public java.lang.String getPersonalIdNumber1() {
        return personalIdNumber1;
    }


    /**
     * Sets the personalIdNumber1 value for this SaveRewardsRequest.
     * 
     * @param personalIdNumber1
     */
    public void setPersonalIdNumber1(java.lang.String personalIdNumber1) {
        this.personalIdNumber1 = personalIdNumber1;
    }


    /**
     * Gets the personalIdTypeCode1 value for this SaveRewardsRequest.
     * 
     * @return personalIdTypeCode1
     */
    public java.lang.String getPersonalIdTypeCode1() {
        return personalIdTypeCode1;
    }


    /**
     * Sets the personalIdTypeCode1 value for this SaveRewardsRequest.
     * 
     * @param personalIdTypeCode1
     */
    public void setPersonalIdTypeCode1(java.lang.String personalIdTypeCode1) {
        this.personalIdTypeCode1 = personalIdTypeCode1;
    }


    /**
     * Gets the personalIdIssueOfficeCode1 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueOfficeCode1
     */
    public java.lang.String getPersonalIdIssueOfficeCode1() {
        return personalIdIssueOfficeCode1;
    }


    /**
     * Sets the personalIdIssueOfficeCode1 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueOfficeCode1
     */
    public void setPersonalIdIssueOfficeCode1(java.lang.String personalIdIssueOfficeCode1) {
        this.personalIdIssueOfficeCode1 = personalIdIssueOfficeCode1;
    }


    /**
     * Gets the personalIdIssueCity1 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueCity1
     */
    public java.lang.String getPersonalIdIssueCity1() {
        return personalIdIssueCity1;
    }


    /**
     * Sets the personalIdIssueCity1 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueCity1
     */
    public void setPersonalIdIssueCity1(java.lang.String personalIdIssueCity1) {
        this.personalIdIssueCity1 = personalIdIssueCity1;
    }


    /**
     * Gets the personalIdIssueState1 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueState1
     */
    public java.lang.String getPersonalIdIssueState1() {
        return personalIdIssueState1;
    }


    /**
     * Sets the personalIdIssueState1 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueState1
     */
    public void setPersonalIdIssueState1(java.lang.String personalIdIssueState1) {
        this.personalIdIssueState1 = personalIdIssueState1;
    }


    /**
     * Gets the personalIdIssueCountry1 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueCountry1
     */
    public java.lang.String getPersonalIdIssueCountry1() {
        return personalIdIssueCountry1;
    }


    /**
     * Sets the personalIdIssueCountry1 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueCountry1
     */
    public void setPersonalIdIssueCountry1(java.lang.String personalIdIssueCountry1) {
        this.personalIdIssueCountry1 = personalIdIssueCountry1;
    }


    /**
     * Gets the personalIdIssueMonth1 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueMonth1
     */
    public java.lang.String getPersonalIdIssueMonth1() {
        return personalIdIssueMonth1;
    }


    /**
     * Sets the personalIdIssueMonth1 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueMonth1
     */
    public void setPersonalIdIssueMonth1(java.lang.String personalIdIssueMonth1) {
        this.personalIdIssueMonth1 = personalIdIssueMonth1;
    }


    /**
     * Gets the personalIdIssueDay1 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueDay1
     */
    public java.lang.String getPersonalIdIssueDay1() {
        return personalIdIssueDay1;
    }


    /**
     * Sets the personalIdIssueDay1 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueDay1
     */
    public void setPersonalIdIssueDay1(java.lang.String personalIdIssueDay1) {
        this.personalIdIssueDay1 = personalIdIssueDay1;
    }


    /**
     * Gets the personalIdIssueYear1 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueYear1
     */
    public java.lang.String getPersonalIdIssueYear1() {
        return personalIdIssueYear1;
    }


    /**
     * Sets the personalIdIssueYear1 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueYear1
     */
    public void setPersonalIdIssueYear1(java.lang.String personalIdIssueYear1) {
        this.personalIdIssueYear1 = personalIdIssueYear1;
    }


    /**
     * Gets the personalIdExpirationMonth1 value for this SaveRewardsRequest.
     * 
     * @return personalIdExpirationMonth1
     */
    public java.lang.String getPersonalIdExpirationMonth1() {
        return personalIdExpirationMonth1;
    }


    /**
     * Sets the personalIdExpirationMonth1 value for this SaveRewardsRequest.
     * 
     * @param personalIdExpirationMonth1
     */
    public void setPersonalIdExpirationMonth1(java.lang.String personalIdExpirationMonth1) {
        this.personalIdExpirationMonth1 = personalIdExpirationMonth1;
    }


    /**
     * Gets the personalIdExpirationDay1 value for this SaveRewardsRequest.
     * 
     * @return personalIdExpirationDay1
     */
    public java.lang.String getPersonalIdExpirationDay1() {
        return personalIdExpirationDay1;
    }


    /**
     * Sets the personalIdExpirationDay1 value for this SaveRewardsRequest.
     * 
     * @param personalIdExpirationDay1
     */
    public void setPersonalIdExpirationDay1(java.lang.String personalIdExpirationDay1) {
        this.personalIdExpirationDay1 = personalIdExpirationDay1;
    }


    /**
     * Gets the personalIdExpirationYear1 value for this SaveRewardsRequest.
     * 
     * @return personalIdExpirationYear1
     */
    public java.lang.String getPersonalIdExpirationYear1() {
        return personalIdExpirationYear1;
    }


    /**
     * Sets the personalIdExpirationYear1 value for this SaveRewardsRequest.
     * 
     * @param personalIdExpirationYear1
     */
    public void setPersonalIdExpirationYear1(java.lang.String personalIdExpirationYear1) {
        this.personalIdExpirationYear1 = personalIdExpirationYear1;
    }


    /**
     * Gets the personalIdNumber2 value for this SaveRewardsRequest.
     * 
     * @return personalIdNumber2
     */
    public java.lang.String getPersonalIdNumber2() {
        return personalIdNumber2;
    }


    /**
     * Sets the personalIdNumber2 value for this SaveRewardsRequest.
     * 
     * @param personalIdNumber2
     */
    public void setPersonalIdNumber2(java.lang.String personalIdNumber2) {
        this.personalIdNumber2 = personalIdNumber2;
    }


    /**
     * Gets the personalIdTypeCode2 value for this SaveRewardsRequest.
     * 
     * @return personalIdTypeCode2
     */
    public java.lang.String getPersonalIdTypeCode2() {
        return personalIdTypeCode2;
    }


    /**
     * Sets the personalIdTypeCode2 value for this SaveRewardsRequest.
     * 
     * @param personalIdTypeCode2
     */
    public void setPersonalIdTypeCode2(java.lang.String personalIdTypeCode2) {
        this.personalIdTypeCode2 = personalIdTypeCode2;
    }


    /**
     * Gets the personalIdIssueOfficeCode2 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueOfficeCode2
     */
    public java.lang.String getPersonalIdIssueOfficeCode2() {
        return personalIdIssueOfficeCode2;
    }


    /**
     * Sets the personalIdIssueOfficeCode2 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueOfficeCode2
     */
    public void setPersonalIdIssueOfficeCode2(java.lang.String personalIdIssueOfficeCode2) {
        this.personalIdIssueOfficeCode2 = personalIdIssueOfficeCode2;
    }


    /**
     * Gets the personalIdIssueCity2 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueCity2
     */
    public java.lang.String getPersonalIdIssueCity2() {
        return personalIdIssueCity2;
    }


    /**
     * Sets the personalIdIssueCity2 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueCity2
     */
    public void setPersonalIdIssueCity2(java.lang.String personalIdIssueCity2) {
        this.personalIdIssueCity2 = personalIdIssueCity2;
    }


    /**
     * Gets the personalIdIssueState2 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueState2
     */
    public java.lang.String getPersonalIdIssueState2() {
        return personalIdIssueState2;
    }


    /**
     * Sets the personalIdIssueState2 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueState2
     */
    public void setPersonalIdIssueState2(java.lang.String personalIdIssueState2) {
        this.personalIdIssueState2 = personalIdIssueState2;
    }


    /**
     * Gets the personalIdIssueCountry2 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueCountry2
     */
    public java.lang.String getPersonalIdIssueCountry2() {
        return personalIdIssueCountry2;
    }


    /**
     * Sets the personalIdIssueCountry2 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueCountry2
     */
    public void setPersonalIdIssueCountry2(java.lang.String personalIdIssueCountry2) {
        this.personalIdIssueCountry2 = personalIdIssueCountry2;
    }


    /**
     * Gets the personalIdIssueMonth2 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueMonth2
     */
    public java.lang.String getPersonalIdIssueMonth2() {
        return personalIdIssueMonth2;
    }


    /**
     * Sets the personalIdIssueMonth2 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueMonth2
     */
    public void setPersonalIdIssueMonth2(java.lang.String personalIdIssueMonth2) {
        this.personalIdIssueMonth2 = personalIdIssueMonth2;
    }


    /**
     * Gets the personalIdIssueDay2 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueDay2
     */
    public java.lang.String getPersonalIdIssueDay2() {
        return personalIdIssueDay2;
    }


    /**
     * Sets the personalIdIssueDay2 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueDay2
     */
    public void setPersonalIdIssueDay2(java.lang.String personalIdIssueDay2) {
        this.personalIdIssueDay2 = personalIdIssueDay2;
    }


    /**
     * Gets the personalIdIssueYear2 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueYear2
     */
    public java.lang.String getPersonalIdIssueYear2() {
        return personalIdIssueYear2;
    }


    /**
     * Sets the personalIdIssueYear2 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueYear2
     */
    public void setPersonalIdIssueYear2(java.lang.String personalIdIssueYear2) {
        this.personalIdIssueYear2 = personalIdIssueYear2;
    }


    /**
     * Gets the personalIdExpirationMonth2 value for this SaveRewardsRequest.
     * 
     * @return personalIdExpirationMonth2
     */
    public java.lang.String getPersonalIdExpirationMonth2() {
        return personalIdExpirationMonth2;
    }


    /**
     * Sets the personalIdExpirationMonth2 value for this SaveRewardsRequest.
     * 
     * @param personalIdExpirationMonth2
     */
    public void setPersonalIdExpirationMonth2(java.lang.String personalIdExpirationMonth2) {
        this.personalIdExpirationMonth2 = personalIdExpirationMonth2;
    }


    /**
     * Gets the personalIdExpirationDay2 value for this SaveRewardsRequest.
     * 
     * @return personalIdExpirationDay2
     */
    public java.lang.String getPersonalIdExpirationDay2() {
        return personalIdExpirationDay2;
    }


    /**
     * Sets the personalIdExpirationDay2 value for this SaveRewardsRequest.
     * 
     * @param personalIdExpirationDay2
     */
    public void setPersonalIdExpirationDay2(java.lang.String personalIdExpirationDay2) {
        this.personalIdExpirationDay2 = personalIdExpirationDay2;
    }


    /**
     * Gets the personalIdExpirationYear2 value for this SaveRewardsRequest.
     * 
     * @return personalIdExpirationYear2
     */
    public java.lang.String getPersonalIdExpirationYear2() {
        return personalIdExpirationYear2;
    }


    /**
     * Sets the personalIdExpirationYear2 value for this SaveRewardsRequest.
     * 
     * @param personalIdExpirationYear2
     */
    public void setPersonalIdExpirationYear2(java.lang.String personalIdExpirationYear2) {
        this.personalIdExpirationYear2 = personalIdExpirationYear2;
    }


    /**
     * Gets the personalIdNumber3 value for this SaveRewardsRequest.
     * 
     * @return personalIdNumber3
     */
    public java.lang.String getPersonalIdNumber3() {
        return personalIdNumber3;
    }


    /**
     * Sets the personalIdNumber3 value for this SaveRewardsRequest.
     * 
     * @param personalIdNumber3
     */
    public void setPersonalIdNumber3(java.lang.String personalIdNumber3) {
        this.personalIdNumber3 = personalIdNumber3;
    }


    /**
     * Gets the personalIdTypeCode3 value for this SaveRewardsRequest.
     * 
     * @return personalIdTypeCode3
     */
    public java.lang.String getPersonalIdTypeCode3() {
        return personalIdTypeCode3;
    }


    /**
     * Sets the personalIdTypeCode3 value for this SaveRewardsRequest.
     * 
     * @param personalIdTypeCode3
     */
    public void setPersonalIdTypeCode3(java.lang.String personalIdTypeCode3) {
        this.personalIdTypeCode3 = personalIdTypeCode3;
    }


    /**
     * Gets the personalIdIssueOfficeCode3 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueOfficeCode3
     */
    public java.lang.String getPersonalIdIssueOfficeCode3() {
        return personalIdIssueOfficeCode3;
    }


    /**
     * Sets the personalIdIssueOfficeCode3 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueOfficeCode3
     */
    public void setPersonalIdIssueOfficeCode3(java.lang.String personalIdIssueOfficeCode3) {
        this.personalIdIssueOfficeCode3 = personalIdIssueOfficeCode3;
    }


    /**
     * Gets the personalIdIssueCity3 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueCity3
     */
    public java.lang.String getPersonalIdIssueCity3() {
        return personalIdIssueCity3;
    }


    /**
     * Sets the personalIdIssueCity3 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueCity3
     */
    public void setPersonalIdIssueCity3(java.lang.String personalIdIssueCity3) {
        this.personalIdIssueCity3 = personalIdIssueCity3;
    }


    /**
     * Gets the personalIdIssueState3 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueState3
     */
    public java.lang.String getPersonalIdIssueState3() {
        return personalIdIssueState3;
    }


    /**
     * Sets the personalIdIssueState3 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueState3
     */
    public void setPersonalIdIssueState3(java.lang.String personalIdIssueState3) {
        this.personalIdIssueState3 = personalIdIssueState3;
    }


    /**
     * Gets the personalIdIssueCountry3 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueCountry3
     */
    public java.lang.String getPersonalIdIssueCountry3() {
        return personalIdIssueCountry3;
    }


    /**
     * Sets the personalIdIssueCountry3 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueCountry3
     */
    public void setPersonalIdIssueCountry3(java.lang.String personalIdIssueCountry3) {
        this.personalIdIssueCountry3 = personalIdIssueCountry3;
    }


    /**
     * Gets the personalIdIssueMonth3 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueMonth3
     */
    public java.lang.String getPersonalIdIssueMonth3() {
        return personalIdIssueMonth3;
    }


    /**
     * Sets the personalIdIssueMonth3 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueMonth3
     */
    public void setPersonalIdIssueMonth3(java.lang.String personalIdIssueMonth3) {
        this.personalIdIssueMonth3 = personalIdIssueMonth3;
    }


    /**
     * Gets the personalIdIssueDay3 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueDay3
     */
    public java.lang.String getPersonalIdIssueDay3() {
        return personalIdIssueDay3;
    }


    /**
     * Sets the personalIdIssueDay3 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueDay3
     */
    public void setPersonalIdIssueDay3(java.lang.String personalIdIssueDay3) {
        this.personalIdIssueDay3 = personalIdIssueDay3;
    }


    /**
     * Gets the personalIdIssueYear3 value for this SaveRewardsRequest.
     * 
     * @return personalIdIssueYear3
     */
    public java.lang.String getPersonalIdIssueYear3() {
        return personalIdIssueYear3;
    }


    /**
     * Sets the personalIdIssueYear3 value for this SaveRewardsRequest.
     * 
     * @param personalIdIssueYear3
     */
    public void setPersonalIdIssueYear3(java.lang.String personalIdIssueYear3) {
        this.personalIdIssueYear3 = personalIdIssueYear3;
    }


    /**
     * Gets the personalIdExpirationMonth3 value for this SaveRewardsRequest.
     * 
     * @return personalIdExpirationMonth3
     */
    public java.lang.String getPersonalIdExpirationMonth3() {
        return personalIdExpirationMonth3;
    }


    /**
     * Sets the personalIdExpirationMonth3 value for this SaveRewardsRequest.
     * 
     * @param personalIdExpirationMonth3
     */
    public void setPersonalIdExpirationMonth3(java.lang.String personalIdExpirationMonth3) {
        this.personalIdExpirationMonth3 = personalIdExpirationMonth3;
    }


    /**
     * Gets the personalIdExpirationDay3 value for this SaveRewardsRequest.
     * 
     * @return personalIdExpirationDay3
     */
    public java.lang.String getPersonalIdExpirationDay3() {
        return personalIdExpirationDay3;
    }


    /**
     * Sets the personalIdExpirationDay3 value for this SaveRewardsRequest.
     * 
     * @param personalIdExpirationDay3
     */
    public void setPersonalIdExpirationDay3(java.lang.String personalIdExpirationDay3) {
        this.personalIdExpirationDay3 = personalIdExpirationDay3;
    }


    /**
     * Gets the personalIdExpirationYear3 value for this SaveRewardsRequest.
     * 
     * @return personalIdExpirationYear3
     */
    public java.lang.String getPersonalIdExpirationYear3() {
        return personalIdExpirationYear3;
    }


    /**
     * Sets the personalIdExpirationYear3 value for this SaveRewardsRequest.
     * 
     * @param personalIdExpirationYear3
     */
    public void setPersonalIdExpirationYear3(java.lang.String personalIdExpirationYear3) {
        this.personalIdExpirationYear3 = personalIdExpirationYear3;
    }


    /**
     * Gets the consumerDOB value for this SaveRewardsRequest.
     * 
     * @return consumerDOB
     */
    public java.util.Date getConsumerDOB() {
        return consumerDOB;
    }


    /**
     * Sets the consumerDOB value for this SaveRewardsRequest.
     * 
     * @param consumerDOB
     */
    public void setConsumerDOB(java.util.Date consumerDOB) {
        this.consumerDOB = consumerDOB;
    }


    /**
     * Gets the consumerBirthCity value for this SaveRewardsRequest.
     * 
     * @return consumerBirthCity
     */
    public java.lang.String getConsumerBirthCity() {
        return consumerBirthCity;
    }


    /**
     * Sets the consumerBirthCity value for this SaveRewardsRequest.
     * 
     * @param consumerBirthCity
     */
    public void setConsumerBirthCity(java.lang.String consumerBirthCity) {
        this.consumerBirthCity = consumerBirthCity;
    }


    /**
     * Gets the consumerBirthState value for this SaveRewardsRequest.
     * 
     * @return consumerBirthState
     */
    public java.lang.String getConsumerBirthState() {
        return consumerBirthState;
    }


    /**
     * Sets the consumerBirthState value for this SaveRewardsRequest.
     * 
     * @param consumerBirthState
     */
    public void setConsumerBirthState(java.lang.String consumerBirthState) {
        this.consumerBirthState = consumerBirthState;
    }


    /**
     * Gets the consumerBirthCountry value for this SaveRewardsRequest.
     * 
     * @return consumerBirthCountry
     */
    public java.lang.String getConsumerBirthCountry() {
        return consumerBirthCountry;
    }


    /**
     * Sets the consumerBirthCountry value for this SaveRewardsRequest.
     * 
     * @param consumerBirthCountry
     */
    public void setConsumerBirthCountry(java.lang.String consumerBirthCountry) {
        this.consumerBirthCountry = consumerBirthCountry;
    }


    /**
     * Gets the gender value for this SaveRewardsRequest.
     * 
     * @return gender
     */
    public com.mgipaypal.ac1211.client.GenderType getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this SaveRewardsRequest.
     * 
     * @param gender
     */
    public void setGender(com.mgipaypal.ac1211.client.GenderType gender) {
        this.gender = gender;
    }


    /**
     * Gets the marketingOptIn value for this SaveRewardsRequest.
     * 
     * @return marketingOptIn
     */
    public java.lang.Boolean getMarketingOptIn() {
        return marketingOptIn;
    }


    /**
     * Sets the marketingOptIn value for this SaveRewardsRequest.
     * 
     * @param marketingOptIn
     */
    public void setMarketingOptIn(java.lang.Boolean marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
    }


    /**
     * Gets the marketingByCellPhone value for this SaveRewardsRequest.
     * 
     * @return marketingByCellPhone
     */
    public java.lang.Boolean getMarketingByCellPhone() {
        return marketingByCellPhone;
    }


    /**
     * Sets the marketingByCellPhone value for this SaveRewardsRequest.
     * 
     * @param marketingByCellPhone
     */
    public void setMarketingByCellPhone(java.lang.Boolean marketingByCellPhone) {
        this.marketingByCellPhone = marketingByCellPhone;
    }


    /**
     * Gets the marketingByEmail value for this SaveRewardsRequest.
     * 
     * @return marketingByEmail
     */
    public java.lang.Boolean getMarketingByEmail() {
        return marketingByEmail;
    }


    /**
     * Sets the marketingByEmail value for this SaveRewardsRequest.
     * 
     * @param marketingByEmail
     */
    public void setMarketingByEmail(java.lang.Boolean marketingByEmail) {
        this.marketingByEmail = marketingByEmail;
    }


    /**
     * Gets the marketingByHomePhone value for this SaveRewardsRequest.
     * 
     * @return marketingByHomePhone
     */
    public java.lang.Boolean getMarketingByHomePhone() {
        return marketingByHomePhone;
    }


    /**
     * Sets the marketingByHomePhone value for this SaveRewardsRequest.
     * 
     * @param marketingByHomePhone
     */
    public void setMarketingByHomePhone(java.lang.Boolean marketingByHomePhone) {
        this.marketingByHomePhone = marketingByHomePhone;
    }


    /**
     * Gets the marketingByMail value for this SaveRewardsRequest.
     * 
     * @return marketingByMail
     */
    public java.lang.Boolean getMarketingByMail() {
        return marketingByMail;
    }


    /**
     * Sets the marketingByMail value for this SaveRewardsRequest.
     * 
     * @param marketingByMail
     */
    public void setMarketingByMail(java.lang.Boolean marketingByMail) {
        this.marketingByMail = marketingByMail;
    }


    /**
     * Gets the marketingBySMS value for this SaveRewardsRequest.
     * 
     * @return marketingBySMS
     */
    public java.lang.Boolean getMarketingBySMS() {
        return marketingBySMS;
    }


    /**
     * Sets the marketingBySMS value for this SaveRewardsRequest.
     * 
     * @param marketingBySMS
     */
    public void setMarketingBySMS(java.lang.Boolean marketingBySMS) {
        this.marketingBySMS = marketingBySMS;
    }


    /**
     * Gets the marketingLanguage value for this SaveRewardsRequest.
     * 
     * @return marketingLanguage
     */
    public java.lang.String getMarketingLanguage() {
        return marketingLanguage;
    }


    /**
     * Sets the marketingLanguage value for this SaveRewardsRequest.
     * 
     * @param marketingLanguage
     */
    public void setMarketingLanguage(java.lang.String marketingLanguage) {
        this.marketingLanguage = marketingLanguage;
    }


    /**
     * Gets the receiveNoticeOptIn value for this SaveRewardsRequest.
     * 
     * @return receiveNoticeOptIn
     */
    public java.lang.Boolean getReceiveNoticeOptIn() {
        return receiveNoticeOptIn;
    }


    /**
     * Sets the receiveNoticeOptIn value for this SaveRewardsRequest.
     * 
     * @param receiveNoticeOptIn
     */
    public void setReceiveNoticeOptIn(java.lang.Boolean receiveNoticeOptIn) {
        this.receiveNoticeOptIn = receiveNoticeOptIn;
    }


    /**
     * Gets the receiveNoticeEmailAddress value for this SaveRewardsRequest.
     * 
     * @return receiveNoticeEmailAddress
     */
    public org.apache.axis.types.Token getReceiveNoticeEmailAddress() {
        return receiveNoticeEmailAddress;
    }


    /**
     * Sets the receiveNoticeEmailAddress value for this SaveRewardsRequest.
     * 
     * @param receiveNoticeEmailAddress
     */
    public void setReceiveNoticeEmailAddress(org.apache.axis.types.Token receiveNoticeEmailAddress) {
        this.receiveNoticeEmailAddress = receiveNoticeEmailAddress;
    }


    /**
     * Gets the receiveNoticeViaEMail value for this SaveRewardsRequest.
     * 
     * @return receiveNoticeViaEMail
     */
    public java.lang.Boolean getReceiveNoticeViaEMail() {
        return receiveNoticeViaEMail;
    }


    /**
     * Sets the receiveNoticeViaEMail value for this SaveRewardsRequest.
     * 
     * @param receiveNoticeViaEMail
     */
    public void setReceiveNoticeViaEMail(java.lang.Boolean receiveNoticeViaEMail) {
        this.receiveNoticeViaEMail = receiveNoticeViaEMail;
    }


    /**
     * Gets the receiveNoticeViaSMS value for this SaveRewardsRequest.
     * 
     * @return receiveNoticeViaSMS
     */
    public java.lang.Boolean getReceiveNoticeViaSMS() {
        return receiveNoticeViaSMS;
    }


    /**
     * Sets the receiveNoticeViaSMS value for this SaveRewardsRequest.
     * 
     * @param receiveNoticeViaSMS
     */
    public void setReceiveNoticeViaSMS(java.lang.Boolean receiveNoticeViaSMS) {
        this.receiveNoticeViaSMS = receiveNoticeViaSMS;
    }


    /**
     * Gets the receiveNoticeMobilePhone value for this SaveRewardsRequest.
     * 
     * @return receiveNoticeMobilePhone
     */
    public java.lang.String getReceiveNoticeMobilePhone() {
        return receiveNoticeMobilePhone;
    }


    /**
     * Sets the receiveNoticeMobilePhone value for this SaveRewardsRequest.
     * 
     * @param receiveNoticeMobilePhone
     */
    public void setReceiveNoticeMobilePhone(java.lang.String receiveNoticeMobilePhone) {
        this.receiveNoticeMobilePhone = receiveNoticeMobilePhone;
    }


    /**
     * Gets the receiveNoticeLanguage value for this SaveRewardsRequest.
     * 
     * @return receiveNoticeLanguage
     */
    public java.lang.String getReceiveNoticeLanguage() {
        return receiveNoticeLanguage;
    }


    /**
     * Sets the receiveNoticeLanguage value for this SaveRewardsRequest.
     * 
     * @param receiveNoticeLanguage
     */
    public void setReceiveNoticeLanguage(java.lang.String receiveNoticeLanguage) {
        this.receiveNoticeLanguage = receiveNoticeLanguage;
    }


    /**
     * Gets the quarterlyStatements value for this SaveRewardsRequest.
     * 
     * @return quarterlyStatements
     */
    public java.lang.Boolean getQuarterlyStatements() {
        return quarterlyStatements;
    }


    /**
     * Sets the quarterlyStatements value for this SaveRewardsRequest.
     * 
     * @param quarterlyStatements
     */
    public void setQuarterlyStatements(java.lang.Boolean quarterlyStatements) {
        this.quarterlyStatements = quarterlyStatements;
    }


    /**
     * Gets the quarterlyStatementsByEmail value for this SaveRewardsRequest.
     * 
     * @return quarterlyStatementsByEmail
     */
    public java.lang.Boolean getQuarterlyStatementsByEmail() {
        return quarterlyStatementsByEmail;
    }


    /**
     * Sets the quarterlyStatementsByEmail value for this SaveRewardsRequest.
     * 
     * @param quarterlyStatementsByEmail
     */
    public void setQuarterlyStatementsByEmail(java.lang.Boolean quarterlyStatementsByEmail) {
        this.quarterlyStatementsByEmail = quarterlyStatementsByEmail;
    }


    /**
     * Gets the quarterlyStatementsByMail value for this SaveRewardsRequest.
     * 
     * @return quarterlyStatementsByMail
     */
    public java.lang.Boolean getQuarterlyStatementsByMail() {
        return quarterlyStatementsByMail;
    }


    /**
     * Sets the quarterlyStatementsByMail value for this SaveRewardsRequest.
     * 
     * @param quarterlyStatementsByMail
     */
    public void setQuarterlyStatementsByMail(java.lang.Boolean quarterlyStatementsByMail) {
        this.quarterlyStatementsByMail = quarterlyStatementsByMail;
    }


    /**
     * Gets the consentOfPersonalInformationThirdParty value for this SaveRewardsRequest.
     * 
     * @return consentOfPersonalInformationThirdParty
     */
    public java.lang.Boolean getConsentOfPersonalInformationThirdParty() {
        return consentOfPersonalInformationThirdParty;
    }


    /**
     * Sets the consentOfPersonalInformationThirdParty value for this SaveRewardsRequest.
     * 
     * @param consentOfPersonalInformationThirdParty
     */
    public void setConsentOfPersonalInformationThirdParty(java.lang.Boolean consentOfPersonalInformationThirdParty) {
        this.consentOfPersonalInformationThirdParty = consentOfPersonalInformationThirdParty;
    }


    /**
     * Gets the agentAcknowledgement value for this SaveRewardsRequest.
     * 
     * @return agentAcknowledgement
     */
    public java.lang.Boolean getAgentAcknowledgement() {
        return agentAcknowledgement;
    }


    /**
     * Sets the agentAcknowledgement value for this SaveRewardsRequest.
     * 
     * @param agentAcknowledgement
     */
    public void setAgentAcknowledgement(java.lang.Boolean agentAcknowledgement) {
        this.agentAcknowledgement = agentAcknowledgement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveRewardsRequest)) return false;
        SaveRewardsRequest other = (SaveRewardsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cardTypeCode==null && other.getCardTypeCode()==null) || 
             (this.cardTypeCode!=null &&
              this.cardTypeCode.equals(other.getCardTypeCode()))) &&
            ((this.freqCustCardNumber==null && other.getFreqCustCardNumber()==null) || 
             (this.freqCustCardNumber!=null &&
              this.freqCustCardNumber.equals(other.getFreqCustCardNumber()))) &&
            ((this.operatorID==null && other.getOperatorID()==null) || 
             (this.operatorID!=null &&
              this.operatorID.equals(other.getOperatorID()))) &&
            ((this.consumerTitle==null && other.getConsumerTitle()==null) || 
             (this.consumerTitle!=null &&
              this.consumerTitle.equals(other.getConsumerTitle()))) &&
            ((this.consumerFirstName==null && other.getConsumerFirstName()==null) || 
             (this.consumerFirstName!=null &&
              this.consumerFirstName.equals(other.getConsumerFirstName()))) &&
            ((this.consumerMiddleName==null && other.getConsumerMiddleName()==null) || 
             (this.consumerMiddleName!=null &&
              this.consumerMiddleName.equals(other.getConsumerMiddleName()))) &&
            ((this.consumerLastName==null && other.getConsumerLastName()==null) || 
             (this.consumerLastName!=null &&
              this.consumerLastName.equals(other.getConsumerLastName()))) &&
            ((this.consumerAddress==null && other.getConsumerAddress()==null) || 
             (this.consumerAddress!=null &&
              this.consumerAddress.equals(other.getConsumerAddress()))) &&
            ((this.consumerAddress2==null && other.getConsumerAddress2()==null) || 
             (this.consumerAddress2!=null &&
              this.consumerAddress2.equals(other.getConsumerAddress2()))) &&
            ((this.consumerAddress3==null && other.getConsumerAddress3()==null) || 
             (this.consumerAddress3!=null &&
              this.consumerAddress3.equals(other.getConsumerAddress3()))) &&
            ((this.consumerCity==null && other.getConsumerCity()==null) || 
             (this.consumerCity!=null &&
              this.consumerCity.equals(other.getConsumerCity()))) &&
            ((this.consumerState==null && other.getConsumerState()==null) || 
             (this.consumerState!=null &&
              this.consumerState.equals(other.getConsumerState()))) &&
            ((this.consumerZipCode==null && other.getConsumerZipCode()==null) || 
             (this.consumerZipCode!=null &&
              this.consumerZipCode.equals(other.getConsumerZipCode()))) &&
            ((this.consumerCountry==null && other.getConsumerCountry()==null) || 
             (this.consumerCountry!=null &&
              this.consumerCountry.equals(other.getConsumerCountry()))) &&
            ((this.consumerHomePhone==null && other.getConsumerHomePhone()==null) || 
             (this.consumerHomePhone!=null &&
              this.consumerHomePhone.equals(other.getConsumerHomePhone()))) &&
            ((this.consumerEmailAddress==null && other.getConsumerEmailAddress()==null) || 
             (this.consumerEmailAddress!=null &&
              this.consumerEmailAddress.equals(other.getConsumerEmailAddress()))) &&
            ((this.consumerMobilePhone==null && other.getConsumerMobilePhone()==null) || 
             (this.consumerMobilePhone!=null &&
              this.consumerMobilePhone.equals(other.getConsumerMobilePhone()))) &&
            ((this.personalIdNumber1==null && other.getPersonalIdNumber1()==null) || 
             (this.personalIdNumber1!=null &&
              this.personalIdNumber1.equals(other.getPersonalIdNumber1()))) &&
            ((this.personalIdTypeCode1==null && other.getPersonalIdTypeCode1()==null) || 
             (this.personalIdTypeCode1!=null &&
              this.personalIdTypeCode1.equals(other.getPersonalIdTypeCode1()))) &&
            ((this.personalIdIssueOfficeCode1==null && other.getPersonalIdIssueOfficeCode1()==null) || 
             (this.personalIdIssueOfficeCode1!=null &&
              this.personalIdIssueOfficeCode1.equals(other.getPersonalIdIssueOfficeCode1()))) &&
            ((this.personalIdIssueCity1==null && other.getPersonalIdIssueCity1()==null) || 
             (this.personalIdIssueCity1!=null &&
              this.personalIdIssueCity1.equals(other.getPersonalIdIssueCity1()))) &&
            ((this.personalIdIssueState1==null && other.getPersonalIdIssueState1()==null) || 
             (this.personalIdIssueState1!=null &&
              this.personalIdIssueState1.equals(other.getPersonalIdIssueState1()))) &&
            ((this.personalIdIssueCountry1==null && other.getPersonalIdIssueCountry1()==null) || 
             (this.personalIdIssueCountry1!=null &&
              this.personalIdIssueCountry1.equals(other.getPersonalIdIssueCountry1()))) &&
            ((this.personalIdIssueMonth1==null && other.getPersonalIdIssueMonth1()==null) || 
             (this.personalIdIssueMonth1!=null &&
              this.personalIdIssueMonth1.equals(other.getPersonalIdIssueMonth1()))) &&
            ((this.personalIdIssueDay1==null && other.getPersonalIdIssueDay1()==null) || 
             (this.personalIdIssueDay1!=null &&
              this.personalIdIssueDay1.equals(other.getPersonalIdIssueDay1()))) &&
            ((this.personalIdIssueYear1==null && other.getPersonalIdIssueYear1()==null) || 
             (this.personalIdIssueYear1!=null &&
              this.personalIdIssueYear1.equals(other.getPersonalIdIssueYear1()))) &&
            ((this.personalIdExpirationMonth1==null && other.getPersonalIdExpirationMonth1()==null) || 
             (this.personalIdExpirationMonth1!=null &&
              this.personalIdExpirationMonth1.equals(other.getPersonalIdExpirationMonth1()))) &&
            ((this.personalIdExpirationDay1==null && other.getPersonalIdExpirationDay1()==null) || 
             (this.personalIdExpirationDay1!=null &&
              this.personalIdExpirationDay1.equals(other.getPersonalIdExpirationDay1()))) &&
            ((this.personalIdExpirationYear1==null && other.getPersonalIdExpirationYear1()==null) || 
             (this.personalIdExpirationYear1!=null &&
              this.personalIdExpirationYear1.equals(other.getPersonalIdExpirationYear1()))) &&
            ((this.personalIdNumber2==null && other.getPersonalIdNumber2()==null) || 
             (this.personalIdNumber2!=null &&
              this.personalIdNumber2.equals(other.getPersonalIdNumber2()))) &&
            ((this.personalIdTypeCode2==null && other.getPersonalIdTypeCode2()==null) || 
             (this.personalIdTypeCode2!=null &&
              this.personalIdTypeCode2.equals(other.getPersonalIdTypeCode2()))) &&
            ((this.personalIdIssueOfficeCode2==null && other.getPersonalIdIssueOfficeCode2()==null) || 
             (this.personalIdIssueOfficeCode2!=null &&
              this.personalIdIssueOfficeCode2.equals(other.getPersonalIdIssueOfficeCode2()))) &&
            ((this.personalIdIssueCity2==null && other.getPersonalIdIssueCity2()==null) || 
             (this.personalIdIssueCity2!=null &&
              this.personalIdIssueCity2.equals(other.getPersonalIdIssueCity2()))) &&
            ((this.personalIdIssueState2==null && other.getPersonalIdIssueState2()==null) || 
             (this.personalIdIssueState2!=null &&
              this.personalIdIssueState2.equals(other.getPersonalIdIssueState2()))) &&
            ((this.personalIdIssueCountry2==null && other.getPersonalIdIssueCountry2()==null) || 
             (this.personalIdIssueCountry2!=null &&
              this.personalIdIssueCountry2.equals(other.getPersonalIdIssueCountry2()))) &&
            ((this.personalIdIssueMonth2==null && other.getPersonalIdIssueMonth2()==null) || 
             (this.personalIdIssueMonth2!=null &&
              this.personalIdIssueMonth2.equals(other.getPersonalIdIssueMonth2()))) &&
            ((this.personalIdIssueDay2==null && other.getPersonalIdIssueDay2()==null) || 
             (this.personalIdIssueDay2!=null &&
              this.personalIdIssueDay2.equals(other.getPersonalIdIssueDay2()))) &&
            ((this.personalIdIssueYear2==null && other.getPersonalIdIssueYear2()==null) || 
             (this.personalIdIssueYear2!=null &&
              this.personalIdIssueYear2.equals(other.getPersonalIdIssueYear2()))) &&
            ((this.personalIdExpirationMonth2==null && other.getPersonalIdExpirationMonth2()==null) || 
             (this.personalIdExpirationMonth2!=null &&
              this.personalIdExpirationMonth2.equals(other.getPersonalIdExpirationMonth2()))) &&
            ((this.personalIdExpirationDay2==null && other.getPersonalIdExpirationDay2()==null) || 
             (this.personalIdExpirationDay2!=null &&
              this.personalIdExpirationDay2.equals(other.getPersonalIdExpirationDay2()))) &&
            ((this.personalIdExpirationYear2==null && other.getPersonalIdExpirationYear2()==null) || 
             (this.personalIdExpirationYear2!=null &&
              this.personalIdExpirationYear2.equals(other.getPersonalIdExpirationYear2()))) &&
            ((this.personalIdNumber3==null && other.getPersonalIdNumber3()==null) || 
             (this.personalIdNumber3!=null &&
              this.personalIdNumber3.equals(other.getPersonalIdNumber3()))) &&
            ((this.personalIdTypeCode3==null && other.getPersonalIdTypeCode3()==null) || 
             (this.personalIdTypeCode3!=null &&
              this.personalIdTypeCode3.equals(other.getPersonalIdTypeCode3()))) &&
            ((this.personalIdIssueOfficeCode3==null && other.getPersonalIdIssueOfficeCode3()==null) || 
             (this.personalIdIssueOfficeCode3!=null &&
              this.personalIdIssueOfficeCode3.equals(other.getPersonalIdIssueOfficeCode3()))) &&
            ((this.personalIdIssueCity3==null && other.getPersonalIdIssueCity3()==null) || 
             (this.personalIdIssueCity3!=null &&
              this.personalIdIssueCity3.equals(other.getPersonalIdIssueCity3()))) &&
            ((this.personalIdIssueState3==null && other.getPersonalIdIssueState3()==null) || 
             (this.personalIdIssueState3!=null &&
              this.personalIdIssueState3.equals(other.getPersonalIdIssueState3()))) &&
            ((this.personalIdIssueCountry3==null && other.getPersonalIdIssueCountry3()==null) || 
             (this.personalIdIssueCountry3!=null &&
              this.personalIdIssueCountry3.equals(other.getPersonalIdIssueCountry3()))) &&
            ((this.personalIdIssueMonth3==null && other.getPersonalIdIssueMonth3()==null) || 
             (this.personalIdIssueMonth3!=null &&
              this.personalIdIssueMonth3.equals(other.getPersonalIdIssueMonth3()))) &&
            ((this.personalIdIssueDay3==null && other.getPersonalIdIssueDay3()==null) || 
             (this.personalIdIssueDay3!=null &&
              this.personalIdIssueDay3.equals(other.getPersonalIdIssueDay3()))) &&
            ((this.personalIdIssueYear3==null && other.getPersonalIdIssueYear3()==null) || 
             (this.personalIdIssueYear3!=null &&
              this.personalIdIssueYear3.equals(other.getPersonalIdIssueYear3()))) &&
            ((this.personalIdExpirationMonth3==null && other.getPersonalIdExpirationMonth3()==null) || 
             (this.personalIdExpirationMonth3!=null &&
              this.personalIdExpirationMonth3.equals(other.getPersonalIdExpirationMonth3()))) &&
            ((this.personalIdExpirationDay3==null && other.getPersonalIdExpirationDay3()==null) || 
             (this.personalIdExpirationDay3!=null &&
              this.personalIdExpirationDay3.equals(other.getPersonalIdExpirationDay3()))) &&
            ((this.personalIdExpirationYear3==null && other.getPersonalIdExpirationYear3()==null) || 
             (this.personalIdExpirationYear3!=null &&
              this.personalIdExpirationYear3.equals(other.getPersonalIdExpirationYear3()))) &&
            ((this.consumerDOB==null && other.getConsumerDOB()==null) || 
             (this.consumerDOB!=null &&
              this.consumerDOB.equals(other.getConsumerDOB()))) &&
            ((this.consumerBirthCity==null && other.getConsumerBirthCity()==null) || 
             (this.consumerBirthCity!=null &&
              this.consumerBirthCity.equals(other.getConsumerBirthCity()))) &&
            ((this.consumerBirthState==null && other.getConsumerBirthState()==null) || 
             (this.consumerBirthState!=null &&
              this.consumerBirthState.equals(other.getConsumerBirthState()))) &&
            ((this.consumerBirthCountry==null && other.getConsumerBirthCountry()==null) || 
             (this.consumerBirthCountry!=null &&
              this.consumerBirthCountry.equals(other.getConsumerBirthCountry()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.marketingOptIn==null && other.getMarketingOptIn()==null) || 
             (this.marketingOptIn!=null &&
              this.marketingOptIn.equals(other.getMarketingOptIn()))) &&
            ((this.marketingByCellPhone==null && other.getMarketingByCellPhone()==null) || 
             (this.marketingByCellPhone!=null &&
              this.marketingByCellPhone.equals(other.getMarketingByCellPhone()))) &&
            ((this.marketingByEmail==null && other.getMarketingByEmail()==null) || 
             (this.marketingByEmail!=null &&
              this.marketingByEmail.equals(other.getMarketingByEmail()))) &&
            ((this.marketingByHomePhone==null && other.getMarketingByHomePhone()==null) || 
             (this.marketingByHomePhone!=null &&
              this.marketingByHomePhone.equals(other.getMarketingByHomePhone()))) &&
            ((this.marketingByMail==null && other.getMarketingByMail()==null) || 
             (this.marketingByMail!=null &&
              this.marketingByMail.equals(other.getMarketingByMail()))) &&
            ((this.marketingBySMS==null && other.getMarketingBySMS()==null) || 
             (this.marketingBySMS!=null &&
              this.marketingBySMS.equals(other.getMarketingBySMS()))) &&
            ((this.marketingLanguage==null && other.getMarketingLanguage()==null) || 
             (this.marketingLanguage!=null &&
              this.marketingLanguage.equals(other.getMarketingLanguage()))) &&
            ((this.receiveNoticeOptIn==null && other.getReceiveNoticeOptIn()==null) || 
             (this.receiveNoticeOptIn!=null &&
              this.receiveNoticeOptIn.equals(other.getReceiveNoticeOptIn()))) &&
            ((this.receiveNoticeEmailAddress==null && other.getReceiveNoticeEmailAddress()==null) || 
             (this.receiveNoticeEmailAddress!=null &&
              this.receiveNoticeEmailAddress.equals(other.getReceiveNoticeEmailAddress()))) &&
            ((this.receiveNoticeViaEMail==null && other.getReceiveNoticeViaEMail()==null) || 
             (this.receiveNoticeViaEMail!=null &&
              this.receiveNoticeViaEMail.equals(other.getReceiveNoticeViaEMail()))) &&
            ((this.receiveNoticeViaSMS==null && other.getReceiveNoticeViaSMS()==null) || 
             (this.receiveNoticeViaSMS!=null &&
              this.receiveNoticeViaSMS.equals(other.getReceiveNoticeViaSMS()))) &&
            ((this.receiveNoticeMobilePhone==null && other.getReceiveNoticeMobilePhone()==null) || 
             (this.receiveNoticeMobilePhone!=null &&
              this.receiveNoticeMobilePhone.equals(other.getReceiveNoticeMobilePhone()))) &&
            ((this.receiveNoticeLanguage==null && other.getReceiveNoticeLanguage()==null) || 
             (this.receiveNoticeLanguage!=null &&
              this.receiveNoticeLanguage.equals(other.getReceiveNoticeLanguage()))) &&
            ((this.quarterlyStatements==null && other.getQuarterlyStatements()==null) || 
             (this.quarterlyStatements!=null &&
              this.quarterlyStatements.equals(other.getQuarterlyStatements()))) &&
            ((this.quarterlyStatementsByEmail==null && other.getQuarterlyStatementsByEmail()==null) || 
             (this.quarterlyStatementsByEmail!=null &&
              this.quarterlyStatementsByEmail.equals(other.getQuarterlyStatementsByEmail()))) &&
            ((this.quarterlyStatementsByMail==null && other.getQuarterlyStatementsByMail()==null) || 
             (this.quarterlyStatementsByMail!=null &&
              this.quarterlyStatementsByMail.equals(other.getQuarterlyStatementsByMail()))) &&
            ((this.consentOfPersonalInformationThirdParty==null && other.getConsentOfPersonalInformationThirdParty()==null) || 
             (this.consentOfPersonalInformationThirdParty!=null &&
              this.consentOfPersonalInformationThirdParty.equals(other.getConsentOfPersonalInformationThirdParty()))) &&
            ((this.agentAcknowledgement==null && other.getAgentAcknowledgement()==null) || 
             (this.agentAcknowledgement!=null &&
              this.agentAcknowledgement.equals(other.getAgentAcknowledgement())));
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
        if (getCardTypeCode() != null) {
            _hashCode += getCardTypeCode().hashCode();
        }
        if (getFreqCustCardNumber() != null) {
            _hashCode += getFreqCustCardNumber().hashCode();
        }
        if (getOperatorID() != null) {
            _hashCode += getOperatorID().hashCode();
        }
        if (getConsumerTitle() != null) {
            _hashCode += getConsumerTitle().hashCode();
        }
        if (getConsumerFirstName() != null) {
            _hashCode += getConsumerFirstName().hashCode();
        }
        if (getConsumerMiddleName() != null) {
            _hashCode += getConsumerMiddleName().hashCode();
        }
        if (getConsumerLastName() != null) {
            _hashCode += getConsumerLastName().hashCode();
        }
        if (getConsumerAddress() != null) {
            _hashCode += getConsumerAddress().hashCode();
        }
        if (getConsumerAddress2() != null) {
            _hashCode += getConsumerAddress2().hashCode();
        }
        if (getConsumerAddress3() != null) {
            _hashCode += getConsumerAddress3().hashCode();
        }
        if (getConsumerCity() != null) {
            _hashCode += getConsumerCity().hashCode();
        }
        if (getConsumerState() != null) {
            _hashCode += getConsumerState().hashCode();
        }
        if (getConsumerZipCode() != null) {
            _hashCode += getConsumerZipCode().hashCode();
        }
        if (getConsumerCountry() != null) {
            _hashCode += getConsumerCountry().hashCode();
        }
        if (getConsumerHomePhone() != null) {
            _hashCode += getConsumerHomePhone().hashCode();
        }
        if (getConsumerEmailAddress() != null) {
            _hashCode += getConsumerEmailAddress().hashCode();
        }
        if (getConsumerMobilePhone() != null) {
            _hashCode += getConsumerMobilePhone().hashCode();
        }
        if (getPersonalIdNumber1() != null) {
            _hashCode += getPersonalIdNumber1().hashCode();
        }
        if (getPersonalIdTypeCode1() != null) {
            _hashCode += getPersonalIdTypeCode1().hashCode();
        }
        if (getPersonalIdIssueOfficeCode1() != null) {
            _hashCode += getPersonalIdIssueOfficeCode1().hashCode();
        }
        if (getPersonalIdIssueCity1() != null) {
            _hashCode += getPersonalIdIssueCity1().hashCode();
        }
        if (getPersonalIdIssueState1() != null) {
            _hashCode += getPersonalIdIssueState1().hashCode();
        }
        if (getPersonalIdIssueCountry1() != null) {
            _hashCode += getPersonalIdIssueCountry1().hashCode();
        }
        if (getPersonalIdIssueMonth1() != null) {
            _hashCode += getPersonalIdIssueMonth1().hashCode();
        }
        if (getPersonalIdIssueDay1() != null) {
            _hashCode += getPersonalIdIssueDay1().hashCode();
        }
        if (getPersonalIdIssueYear1() != null) {
            _hashCode += getPersonalIdIssueYear1().hashCode();
        }
        if (getPersonalIdExpirationMonth1() != null) {
            _hashCode += getPersonalIdExpirationMonth1().hashCode();
        }
        if (getPersonalIdExpirationDay1() != null) {
            _hashCode += getPersonalIdExpirationDay1().hashCode();
        }
        if (getPersonalIdExpirationYear1() != null) {
            _hashCode += getPersonalIdExpirationYear1().hashCode();
        }
        if (getPersonalIdNumber2() != null) {
            _hashCode += getPersonalIdNumber2().hashCode();
        }
        if (getPersonalIdTypeCode2() != null) {
            _hashCode += getPersonalIdTypeCode2().hashCode();
        }
        if (getPersonalIdIssueOfficeCode2() != null) {
            _hashCode += getPersonalIdIssueOfficeCode2().hashCode();
        }
        if (getPersonalIdIssueCity2() != null) {
            _hashCode += getPersonalIdIssueCity2().hashCode();
        }
        if (getPersonalIdIssueState2() != null) {
            _hashCode += getPersonalIdIssueState2().hashCode();
        }
        if (getPersonalIdIssueCountry2() != null) {
            _hashCode += getPersonalIdIssueCountry2().hashCode();
        }
        if (getPersonalIdIssueMonth2() != null) {
            _hashCode += getPersonalIdIssueMonth2().hashCode();
        }
        if (getPersonalIdIssueDay2() != null) {
            _hashCode += getPersonalIdIssueDay2().hashCode();
        }
        if (getPersonalIdIssueYear2() != null) {
            _hashCode += getPersonalIdIssueYear2().hashCode();
        }
        if (getPersonalIdExpirationMonth2() != null) {
            _hashCode += getPersonalIdExpirationMonth2().hashCode();
        }
        if (getPersonalIdExpirationDay2() != null) {
            _hashCode += getPersonalIdExpirationDay2().hashCode();
        }
        if (getPersonalIdExpirationYear2() != null) {
            _hashCode += getPersonalIdExpirationYear2().hashCode();
        }
        if (getPersonalIdNumber3() != null) {
            _hashCode += getPersonalIdNumber3().hashCode();
        }
        if (getPersonalIdTypeCode3() != null) {
            _hashCode += getPersonalIdTypeCode3().hashCode();
        }
        if (getPersonalIdIssueOfficeCode3() != null) {
            _hashCode += getPersonalIdIssueOfficeCode3().hashCode();
        }
        if (getPersonalIdIssueCity3() != null) {
            _hashCode += getPersonalIdIssueCity3().hashCode();
        }
        if (getPersonalIdIssueState3() != null) {
            _hashCode += getPersonalIdIssueState3().hashCode();
        }
        if (getPersonalIdIssueCountry3() != null) {
            _hashCode += getPersonalIdIssueCountry3().hashCode();
        }
        if (getPersonalIdIssueMonth3() != null) {
            _hashCode += getPersonalIdIssueMonth3().hashCode();
        }
        if (getPersonalIdIssueDay3() != null) {
            _hashCode += getPersonalIdIssueDay3().hashCode();
        }
        if (getPersonalIdIssueYear3() != null) {
            _hashCode += getPersonalIdIssueYear3().hashCode();
        }
        if (getPersonalIdExpirationMonth3() != null) {
            _hashCode += getPersonalIdExpirationMonth3().hashCode();
        }
        if (getPersonalIdExpirationDay3() != null) {
            _hashCode += getPersonalIdExpirationDay3().hashCode();
        }
        if (getPersonalIdExpirationYear3() != null) {
            _hashCode += getPersonalIdExpirationYear3().hashCode();
        }
        if (getConsumerDOB() != null) {
            _hashCode += getConsumerDOB().hashCode();
        }
        if (getConsumerBirthCity() != null) {
            _hashCode += getConsumerBirthCity().hashCode();
        }
        if (getConsumerBirthState() != null) {
            _hashCode += getConsumerBirthState().hashCode();
        }
        if (getConsumerBirthCountry() != null) {
            _hashCode += getConsumerBirthCountry().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getMarketingOptIn() != null) {
            _hashCode += getMarketingOptIn().hashCode();
        }
        if (getMarketingByCellPhone() != null) {
            _hashCode += getMarketingByCellPhone().hashCode();
        }
        if (getMarketingByEmail() != null) {
            _hashCode += getMarketingByEmail().hashCode();
        }
        if (getMarketingByHomePhone() != null) {
            _hashCode += getMarketingByHomePhone().hashCode();
        }
        if (getMarketingByMail() != null) {
            _hashCode += getMarketingByMail().hashCode();
        }
        if (getMarketingBySMS() != null) {
            _hashCode += getMarketingBySMS().hashCode();
        }
        if (getMarketingLanguage() != null) {
            _hashCode += getMarketingLanguage().hashCode();
        }
        if (getReceiveNoticeOptIn() != null) {
            _hashCode += getReceiveNoticeOptIn().hashCode();
        }
        if (getReceiveNoticeEmailAddress() != null) {
            _hashCode += getReceiveNoticeEmailAddress().hashCode();
        }
        if (getReceiveNoticeViaEMail() != null) {
            _hashCode += getReceiveNoticeViaEMail().hashCode();
        }
        if (getReceiveNoticeViaSMS() != null) {
            _hashCode += getReceiveNoticeViaSMS().hashCode();
        }
        if (getReceiveNoticeMobilePhone() != null) {
            _hashCode += getReceiveNoticeMobilePhone().hashCode();
        }
        if (getReceiveNoticeLanguage() != null) {
            _hashCode += getReceiveNoticeLanguage().hashCode();
        }
        if (getQuarterlyStatements() != null) {
            _hashCode += getQuarterlyStatements().hashCode();
        }
        if (getQuarterlyStatementsByEmail() != null) {
            _hashCode += getQuarterlyStatementsByEmail().hashCode();
        }
        if (getQuarterlyStatementsByMail() != null) {
            _hashCode += getQuarterlyStatementsByMail().hashCode();
        }
        if (getConsentOfPersonalInformationThirdParty() != null) {
            _hashCode += getConsentOfPersonalInformationThirdParty().hashCode();
        }
        if (getAgentAcknowledgement() != null) {
            _hashCode += getAgentAcknowledgement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveRewardsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SaveRewardsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cardTypeCode"));
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
        elemField.setFieldName("operatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "operatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerMiddleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerMiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerHomePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerHomePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerMobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerMobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdNumber1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdNumber1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdTypeCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdTypeCode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueOfficeCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueOfficeCode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueCity1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueCity1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueState1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueState1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueCountry1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueCountry1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueMonth1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueMonth1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueDay1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueDay1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueYear1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueYear1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdExpirationMonth1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdExpirationMonth1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdExpirationDay1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdExpirationDay1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdExpirationYear1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdExpirationYear1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdNumber2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdNumber2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdTypeCode2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdTypeCode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueOfficeCode2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueOfficeCode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueCity2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueCity2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueState2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueState2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueCountry2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueCountry2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueMonth2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueMonth2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueDay2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueDay2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueYear2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueYear2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdExpirationMonth2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdExpirationMonth2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdExpirationDay2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdExpirationDay2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdExpirationYear2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdExpirationYear2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdNumber3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdNumber3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdTypeCode3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdTypeCode3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueOfficeCode3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueOfficeCode3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueCity3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueCity3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueState3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueState3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueCountry3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueCountry3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueMonth3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueMonth3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueDay3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueDay3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdIssueYear3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdIssueYear3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdExpirationMonth3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdExpirationMonth3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdExpirationDay3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdExpirationDay3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdExpirationYear3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdExpirationYear3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerDOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerDOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerBirthCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerBirthCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerBirthState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerBirthState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerBirthCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerBirthCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "genderType"));
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
        elemField.setFieldName("marketingByCellPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "marketingByCellPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingByEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "marketingByEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingByHomePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "marketingByHomePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingByMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "marketingByMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingBySMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "marketingBySMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "marketingLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveNoticeOptIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveNoticeOptIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveNoticeEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveNoticeEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveNoticeViaEMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveNoticeViaEMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveNoticeViaSMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveNoticeViaSMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveNoticeMobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveNoticeMobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveNoticeLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveNoticeLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quarterlyStatements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "quarterlyStatements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quarterlyStatementsByEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "quarterlyStatementsByEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quarterlyStatementsByMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "quarterlyStatementsByMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consentOfPersonalInformationThirdParty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consentOfPersonalInformationThirdParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentAcknowledgement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentAcknowledgement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
