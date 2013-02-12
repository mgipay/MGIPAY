/**
 * BpValidationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class BpValidationResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String mgiTransactionSessionID;

    private java.math.BigDecimal totalSendAmount;

    private java.lang.String mgiRewardsNumber;

    private com.mgipaypal.ac1211.client.ProductVariant productVariant;

    private java.lang.String serviceOfferingID;

    private java.lang.String billerWebsite;

    private java.lang.String billerPhone;

    private com.mgipaypal.ac1211.client.TextTranslation[] expectedPostingTimeFrame;

    private java.lang.String billerCutoffTime;

    private com.mgipaypal.ac1211.client.TextTranslation[] billerNotes;

    private com.mgipaypal.ac1211.client.TextTranslation[] serviceOfferingDescription;

    private com.mgipaypal.ac1211.client.TextTranslation[] customerTips;

    private java.lang.String billerAddress;

    private java.lang.String billerAddress2;

    private java.lang.String billerAddress3;

    private java.lang.String billerCity;

    private java.lang.String billerState;

    private java.lang.String billerZip;

    private java.lang.Boolean printMGICustomerServiceNumber;

    private java.lang.String agentTransactionId;

    private com.mgipaypal.ac1211.client.PromotionInfo[] promotionInfo;

    private com.mgipaypal.ac1211.client.TextTranslation[] promotionalMessage;

    private java.lang.Boolean readyForCommit;

    private com.mgipaypal.ac1211.client.TextTranslation[] disclosureText;

    private com.mgipaypal.ac1211.client.ProductFieldInfo[] additionalFieldsToCollect;

    private java.math.BigDecimal processingFee;

    private java.lang.Boolean infoFeeIndicator;

    private com.mgipaypal.ac1211.client.SendAmountInfo sendAmounts;

    private com.mgipaypal.ac1211.client.ReceiveAmountInfo receiveAmounts;

    private java.math.BigDecimal exchangeRateApplied;

    private java.lang.String confirmationNumber;

    public BpValidationResponse() {
    }

    public BpValidationResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String mgiTransactionSessionID,
           java.math.BigDecimal totalSendAmount,
           java.lang.String mgiRewardsNumber,
           com.mgipaypal.ac1211.client.ProductVariant productVariant,
           java.lang.String serviceOfferingID,
           java.lang.String billerWebsite,
           java.lang.String billerPhone,
           com.mgipaypal.ac1211.client.TextTranslation[] expectedPostingTimeFrame,
           java.lang.String billerCutoffTime,
           com.mgipaypal.ac1211.client.TextTranslation[] billerNotes,
           com.mgipaypal.ac1211.client.TextTranslation[] serviceOfferingDescription,
           com.mgipaypal.ac1211.client.TextTranslation[] customerTips,
           java.lang.String billerAddress,
           java.lang.String billerAddress2,
           java.lang.String billerAddress3,
           java.lang.String billerCity,
           java.lang.String billerState,
           java.lang.String billerZip,
           java.lang.Boolean printMGICustomerServiceNumber,
           java.lang.String agentTransactionId,
           com.mgipaypal.ac1211.client.PromotionInfo[] promotionInfo,
           com.mgipaypal.ac1211.client.TextTranslation[] promotionalMessage,
           java.lang.Boolean readyForCommit,
           com.mgipaypal.ac1211.client.TextTranslation[] disclosureText,
           com.mgipaypal.ac1211.client.ProductFieldInfo[] additionalFieldsToCollect,
           java.math.BigDecimal processingFee,
           java.lang.Boolean infoFeeIndicator,
           com.mgipaypal.ac1211.client.SendAmountInfo sendAmounts,
           com.mgipaypal.ac1211.client.ReceiveAmountInfo receiveAmounts,
           java.math.BigDecimal exchangeRateApplied,
           java.lang.String confirmationNumber) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.mgiTransactionSessionID = mgiTransactionSessionID;
        this.totalSendAmount = totalSendAmount;
        this.mgiRewardsNumber = mgiRewardsNumber;
        this.productVariant = productVariant;
        this.serviceOfferingID = serviceOfferingID;
        this.billerWebsite = billerWebsite;
        this.billerPhone = billerPhone;
        this.expectedPostingTimeFrame = expectedPostingTimeFrame;
        this.billerCutoffTime = billerCutoffTime;
        this.billerNotes = billerNotes;
        this.serviceOfferingDescription = serviceOfferingDescription;
        this.customerTips = customerTips;
        this.billerAddress = billerAddress;
        this.billerAddress2 = billerAddress2;
        this.billerAddress3 = billerAddress3;
        this.billerCity = billerCity;
        this.billerState = billerState;
        this.billerZip = billerZip;
        this.printMGICustomerServiceNumber = printMGICustomerServiceNumber;
        this.agentTransactionId = agentTransactionId;
        this.promotionInfo = promotionInfo;
        this.promotionalMessage = promotionalMessage;
        this.readyForCommit = readyForCommit;
        this.disclosureText = disclosureText;
        this.additionalFieldsToCollect = additionalFieldsToCollect;
        this.processingFee = processingFee;
        this.infoFeeIndicator = infoFeeIndicator;
        this.sendAmounts = sendAmounts;
        this.receiveAmounts = receiveAmounts;
        this.exchangeRateApplied = exchangeRateApplied;
        this.confirmationNumber = confirmationNumber;
    }


    /**
     * Gets the mgiTransactionSessionID value for this BpValidationResponse.
     * 
     * @return mgiTransactionSessionID
     */
    public java.lang.String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }


    /**
     * Sets the mgiTransactionSessionID value for this BpValidationResponse.
     * 
     * @param mgiTransactionSessionID
     */
    public void setMgiTransactionSessionID(java.lang.String mgiTransactionSessionID) {
        this.mgiTransactionSessionID = mgiTransactionSessionID;
    }


    /**
     * Gets the totalSendAmount value for this BpValidationResponse.
     * 
     * @return totalSendAmount
     */
    public java.math.BigDecimal getTotalSendAmount() {
        return totalSendAmount;
    }


    /**
     * Sets the totalSendAmount value for this BpValidationResponse.
     * 
     * @param totalSendAmount
     */
    public void setTotalSendAmount(java.math.BigDecimal totalSendAmount) {
        this.totalSendAmount = totalSendAmount;
    }


    /**
     * Gets the mgiRewardsNumber value for this BpValidationResponse.
     * 
     * @return mgiRewardsNumber
     */
    public java.lang.String getMgiRewardsNumber() {
        return mgiRewardsNumber;
    }


    /**
     * Sets the mgiRewardsNumber value for this BpValidationResponse.
     * 
     * @param mgiRewardsNumber
     */
    public void setMgiRewardsNumber(java.lang.String mgiRewardsNumber) {
        this.mgiRewardsNumber = mgiRewardsNumber;
    }


    /**
     * Gets the productVariant value for this BpValidationResponse.
     * 
     * @return productVariant
     */
    public com.mgipaypal.ac1211.client.ProductVariant getProductVariant() {
        return productVariant;
    }


    /**
     * Sets the productVariant value for this BpValidationResponse.
     * 
     * @param productVariant
     */
    public void setProductVariant(com.mgipaypal.ac1211.client.ProductVariant productVariant) {
        this.productVariant = productVariant;
    }


    /**
     * Gets the serviceOfferingID value for this BpValidationResponse.
     * 
     * @return serviceOfferingID
     */
    public java.lang.String getServiceOfferingID() {
        return serviceOfferingID;
    }


    /**
     * Sets the serviceOfferingID value for this BpValidationResponse.
     * 
     * @param serviceOfferingID
     */
    public void setServiceOfferingID(java.lang.String serviceOfferingID) {
        this.serviceOfferingID = serviceOfferingID;
    }


    /**
     * Gets the billerWebsite value for this BpValidationResponse.
     * 
     * @return billerWebsite
     */
    public java.lang.String getBillerWebsite() {
        return billerWebsite;
    }


    /**
     * Sets the billerWebsite value for this BpValidationResponse.
     * 
     * @param billerWebsite
     */
    public void setBillerWebsite(java.lang.String billerWebsite) {
        this.billerWebsite = billerWebsite;
    }


    /**
     * Gets the billerPhone value for this BpValidationResponse.
     * 
     * @return billerPhone
     */
    public java.lang.String getBillerPhone() {
        return billerPhone;
    }


    /**
     * Sets the billerPhone value for this BpValidationResponse.
     * 
     * @param billerPhone
     */
    public void setBillerPhone(java.lang.String billerPhone) {
        this.billerPhone = billerPhone;
    }


    /**
     * Gets the expectedPostingTimeFrame value for this BpValidationResponse.
     * 
     * @return expectedPostingTimeFrame
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getExpectedPostingTimeFrame() {
        return expectedPostingTimeFrame;
    }


    /**
     * Sets the expectedPostingTimeFrame value for this BpValidationResponse.
     * 
     * @param expectedPostingTimeFrame
     */
    public void setExpectedPostingTimeFrame(com.mgipaypal.ac1211.client.TextTranslation[] expectedPostingTimeFrame) {
        this.expectedPostingTimeFrame = expectedPostingTimeFrame;
    }

    public com.mgipaypal.ac1211.client.TextTranslation getExpectedPostingTimeFrame(int i) {
        return this.expectedPostingTimeFrame[i];
    }

    public void setExpectedPostingTimeFrame(int i, com.mgipaypal.ac1211.client.TextTranslation _value) {
        this.expectedPostingTimeFrame[i] = _value;
    }


    /**
     * Gets the billerCutoffTime value for this BpValidationResponse.
     * 
     * @return billerCutoffTime
     */
    public java.lang.String getBillerCutoffTime() {
        return billerCutoffTime;
    }


    /**
     * Sets the billerCutoffTime value for this BpValidationResponse.
     * 
     * @param billerCutoffTime
     */
    public void setBillerCutoffTime(java.lang.String billerCutoffTime) {
        this.billerCutoffTime = billerCutoffTime;
    }


    /**
     * Gets the billerNotes value for this BpValidationResponse.
     * 
     * @return billerNotes
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getBillerNotes() {
        return billerNotes;
    }


    /**
     * Sets the billerNotes value for this BpValidationResponse.
     * 
     * @param billerNotes
     */
    public void setBillerNotes(com.mgipaypal.ac1211.client.TextTranslation[] billerNotes) {
        this.billerNotes = billerNotes;
    }

    public com.mgipaypal.ac1211.client.TextTranslation getBillerNotes(int i) {
        return this.billerNotes[i];
    }

    public void setBillerNotes(int i, com.mgipaypal.ac1211.client.TextTranslation _value) {
        this.billerNotes[i] = _value;
    }


    /**
     * Gets the serviceOfferingDescription value for this BpValidationResponse.
     * 
     * @return serviceOfferingDescription
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getServiceOfferingDescription() {
        return serviceOfferingDescription;
    }


    /**
     * Sets the serviceOfferingDescription value for this BpValidationResponse.
     * 
     * @param serviceOfferingDescription
     */
    public void setServiceOfferingDescription(com.mgipaypal.ac1211.client.TextTranslation[] serviceOfferingDescription) {
        this.serviceOfferingDescription = serviceOfferingDescription;
    }

    public com.mgipaypal.ac1211.client.TextTranslation getServiceOfferingDescription(int i) {
        return this.serviceOfferingDescription[i];
    }

    public void setServiceOfferingDescription(int i, com.mgipaypal.ac1211.client.TextTranslation _value) {
        this.serviceOfferingDescription[i] = _value;
    }


    /**
     * Gets the customerTips value for this BpValidationResponse.
     * 
     * @return customerTips
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getCustomerTips() {
        return customerTips;
    }


    /**
     * Sets the customerTips value for this BpValidationResponse.
     * 
     * @param customerTips
     */
    public void setCustomerTips(com.mgipaypal.ac1211.client.TextTranslation[] customerTips) {
        this.customerTips = customerTips;
    }

    public com.mgipaypal.ac1211.client.TextTranslation getCustomerTips(int i) {
        return this.customerTips[i];
    }

    public void setCustomerTips(int i, com.mgipaypal.ac1211.client.TextTranslation _value) {
        this.customerTips[i] = _value;
    }


    /**
     * Gets the billerAddress value for this BpValidationResponse.
     * 
     * @return billerAddress
     */
    public java.lang.String getBillerAddress() {
        return billerAddress;
    }


    /**
     * Sets the billerAddress value for this BpValidationResponse.
     * 
     * @param billerAddress
     */
    public void setBillerAddress(java.lang.String billerAddress) {
        this.billerAddress = billerAddress;
    }


    /**
     * Gets the billerAddress2 value for this BpValidationResponse.
     * 
     * @return billerAddress2
     */
    public java.lang.String getBillerAddress2() {
        return billerAddress2;
    }


    /**
     * Sets the billerAddress2 value for this BpValidationResponse.
     * 
     * @param billerAddress2
     */
    public void setBillerAddress2(java.lang.String billerAddress2) {
        this.billerAddress2 = billerAddress2;
    }


    /**
     * Gets the billerAddress3 value for this BpValidationResponse.
     * 
     * @return billerAddress3
     */
    public java.lang.String getBillerAddress3() {
        return billerAddress3;
    }


    /**
     * Sets the billerAddress3 value for this BpValidationResponse.
     * 
     * @param billerAddress3
     */
    public void setBillerAddress3(java.lang.String billerAddress3) {
        this.billerAddress3 = billerAddress3;
    }


    /**
     * Gets the billerCity value for this BpValidationResponse.
     * 
     * @return billerCity
     */
    public java.lang.String getBillerCity() {
        return billerCity;
    }


    /**
     * Sets the billerCity value for this BpValidationResponse.
     * 
     * @param billerCity
     */
    public void setBillerCity(java.lang.String billerCity) {
        this.billerCity = billerCity;
    }


    /**
     * Gets the billerState value for this BpValidationResponse.
     * 
     * @return billerState
     */
    public java.lang.String getBillerState() {
        return billerState;
    }


    /**
     * Sets the billerState value for this BpValidationResponse.
     * 
     * @param billerState
     */
    public void setBillerState(java.lang.String billerState) {
        this.billerState = billerState;
    }


    /**
     * Gets the billerZip value for this BpValidationResponse.
     * 
     * @return billerZip
     */
    public java.lang.String getBillerZip() {
        return billerZip;
    }


    /**
     * Sets the billerZip value for this BpValidationResponse.
     * 
     * @param billerZip
     */
    public void setBillerZip(java.lang.String billerZip) {
        this.billerZip = billerZip;
    }


    /**
     * Gets the printMGICustomerServiceNumber value for this BpValidationResponse.
     * 
     * @return printMGICustomerServiceNumber
     */
    public java.lang.Boolean getPrintMGICustomerServiceNumber() {
        return printMGICustomerServiceNumber;
    }


    /**
     * Sets the printMGICustomerServiceNumber value for this BpValidationResponse.
     * 
     * @param printMGICustomerServiceNumber
     */
    public void setPrintMGICustomerServiceNumber(java.lang.Boolean printMGICustomerServiceNumber) {
        this.printMGICustomerServiceNumber = printMGICustomerServiceNumber;
    }


    /**
     * Gets the agentTransactionId value for this BpValidationResponse.
     * 
     * @return agentTransactionId
     */
    public java.lang.String getAgentTransactionId() {
        return agentTransactionId;
    }


    /**
     * Sets the agentTransactionId value for this BpValidationResponse.
     * 
     * @param agentTransactionId
     */
    public void setAgentTransactionId(java.lang.String agentTransactionId) {
        this.agentTransactionId = agentTransactionId;
    }


    /**
     * Gets the promotionInfo value for this BpValidationResponse.
     * 
     * @return promotionInfo
     */
    public com.mgipaypal.ac1211.client.PromotionInfo[] getPromotionInfo() {
        return promotionInfo;
    }


    /**
     * Sets the promotionInfo value for this BpValidationResponse.
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
     * Gets the promotionalMessage value for this BpValidationResponse.
     * 
     * @return promotionalMessage
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getPromotionalMessage() {
        return promotionalMessage;
    }


    /**
     * Sets the promotionalMessage value for this BpValidationResponse.
     * 
     * @param promotionalMessage
     */
    public void setPromotionalMessage(com.mgipaypal.ac1211.client.TextTranslation[] promotionalMessage) {
        this.promotionalMessage = promotionalMessage;
    }

    public com.mgipaypal.ac1211.client.TextTranslation getPromotionalMessage(int i) {
        return this.promotionalMessage[i];
    }

    public void setPromotionalMessage(int i, com.mgipaypal.ac1211.client.TextTranslation _value) {
        this.promotionalMessage[i] = _value;
    }


    /**
     * Gets the readyForCommit value for this BpValidationResponse.
     * 
     * @return readyForCommit
     */
    public java.lang.Boolean getReadyForCommit() {
        return readyForCommit;
    }


    /**
     * Sets the readyForCommit value for this BpValidationResponse.
     * 
     * @param readyForCommit
     */
    public void setReadyForCommit(java.lang.Boolean readyForCommit) {
        this.readyForCommit = readyForCommit;
    }


    /**
     * Gets the disclosureText value for this BpValidationResponse.
     * 
     * @return disclosureText
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getDisclosureText() {
        return disclosureText;
    }


    /**
     * Sets the disclosureText value for this BpValidationResponse.
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
     * Gets the additionalFieldsToCollect value for this BpValidationResponse.
     * 
     * @return additionalFieldsToCollect
     */
    public com.mgipaypal.ac1211.client.ProductFieldInfo[] getAdditionalFieldsToCollect() {
        return additionalFieldsToCollect;
    }


    /**
     * Sets the additionalFieldsToCollect value for this BpValidationResponse.
     * 
     * @param additionalFieldsToCollect
     */
    public void setAdditionalFieldsToCollect(com.mgipaypal.ac1211.client.ProductFieldInfo[] additionalFieldsToCollect) {
        this.additionalFieldsToCollect = additionalFieldsToCollect;
    }

    public com.mgipaypal.ac1211.client.ProductFieldInfo getAdditionalFieldsToCollect(int i) {
        return this.additionalFieldsToCollect[i];
    }

    public void setAdditionalFieldsToCollect(int i, com.mgipaypal.ac1211.client.ProductFieldInfo _value) {
        this.additionalFieldsToCollect[i] = _value;
    }


    /**
     * Gets the processingFee value for this BpValidationResponse.
     * 
     * @return processingFee
     */
    public java.math.BigDecimal getProcessingFee() {
        return processingFee;
    }


    /**
     * Sets the processingFee value for this BpValidationResponse.
     * 
     * @param processingFee
     */
    public void setProcessingFee(java.math.BigDecimal processingFee) {
        this.processingFee = processingFee;
    }


    /**
     * Gets the infoFeeIndicator value for this BpValidationResponse.
     * 
     * @return infoFeeIndicator
     */
    public java.lang.Boolean getInfoFeeIndicator() {
        return infoFeeIndicator;
    }


    /**
     * Sets the infoFeeIndicator value for this BpValidationResponse.
     * 
     * @param infoFeeIndicator
     */
    public void setInfoFeeIndicator(java.lang.Boolean infoFeeIndicator) {
        this.infoFeeIndicator = infoFeeIndicator;
    }


    /**
     * Gets the sendAmounts value for this BpValidationResponse.
     * 
     * @return sendAmounts
     */
    public com.mgipaypal.ac1211.client.SendAmountInfo getSendAmounts() {
        return sendAmounts;
    }


    /**
     * Sets the sendAmounts value for this BpValidationResponse.
     * 
     * @param sendAmounts
     */
    public void setSendAmounts(com.mgipaypal.ac1211.client.SendAmountInfo sendAmounts) {
        this.sendAmounts = sendAmounts;
    }


    /**
     * Gets the receiveAmounts value for this BpValidationResponse.
     * 
     * @return receiveAmounts
     */
    public com.mgipaypal.ac1211.client.ReceiveAmountInfo getReceiveAmounts() {
        return receiveAmounts;
    }


    /**
     * Sets the receiveAmounts value for this BpValidationResponse.
     * 
     * @param receiveAmounts
     */
    public void setReceiveAmounts(com.mgipaypal.ac1211.client.ReceiveAmountInfo receiveAmounts) {
        this.receiveAmounts = receiveAmounts;
    }


    /**
     * Gets the exchangeRateApplied value for this BpValidationResponse.
     * 
     * @return exchangeRateApplied
     */
    public java.math.BigDecimal getExchangeRateApplied() {
        return exchangeRateApplied;
    }


    /**
     * Sets the exchangeRateApplied value for this BpValidationResponse.
     * 
     * @param exchangeRateApplied
     */
    public void setExchangeRateApplied(java.math.BigDecimal exchangeRateApplied) {
        this.exchangeRateApplied = exchangeRateApplied;
    }


    /**
     * Gets the confirmationNumber value for this BpValidationResponse.
     * 
     * @return confirmationNumber
     */
    public java.lang.String getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this BpValidationResponse.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(java.lang.String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BpValidationResponse)) return false;
        BpValidationResponse other = (BpValidationResponse) obj;
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
            ((this.totalSendAmount==null && other.getTotalSendAmount()==null) || 
             (this.totalSendAmount!=null &&
              this.totalSendAmount.equals(other.getTotalSendAmount()))) &&
            ((this.mgiRewardsNumber==null && other.getMgiRewardsNumber()==null) || 
             (this.mgiRewardsNumber!=null &&
              this.mgiRewardsNumber.equals(other.getMgiRewardsNumber()))) &&
            ((this.productVariant==null && other.getProductVariant()==null) || 
             (this.productVariant!=null &&
              this.productVariant.equals(other.getProductVariant()))) &&
            ((this.serviceOfferingID==null && other.getServiceOfferingID()==null) || 
             (this.serviceOfferingID!=null &&
              this.serviceOfferingID.equals(other.getServiceOfferingID()))) &&
            ((this.billerWebsite==null && other.getBillerWebsite()==null) || 
             (this.billerWebsite!=null &&
              this.billerWebsite.equals(other.getBillerWebsite()))) &&
            ((this.billerPhone==null && other.getBillerPhone()==null) || 
             (this.billerPhone!=null &&
              this.billerPhone.equals(other.getBillerPhone()))) &&
            ((this.expectedPostingTimeFrame==null && other.getExpectedPostingTimeFrame()==null) || 
             (this.expectedPostingTimeFrame!=null &&
              java.util.Arrays.equals(this.expectedPostingTimeFrame, other.getExpectedPostingTimeFrame()))) &&
            ((this.billerCutoffTime==null && other.getBillerCutoffTime()==null) || 
             (this.billerCutoffTime!=null &&
              this.billerCutoffTime.equals(other.getBillerCutoffTime()))) &&
            ((this.billerNotes==null && other.getBillerNotes()==null) || 
             (this.billerNotes!=null &&
              java.util.Arrays.equals(this.billerNotes, other.getBillerNotes()))) &&
            ((this.serviceOfferingDescription==null && other.getServiceOfferingDescription()==null) || 
             (this.serviceOfferingDescription!=null &&
              java.util.Arrays.equals(this.serviceOfferingDescription, other.getServiceOfferingDescription()))) &&
            ((this.customerTips==null && other.getCustomerTips()==null) || 
             (this.customerTips!=null &&
              java.util.Arrays.equals(this.customerTips, other.getCustomerTips()))) &&
            ((this.billerAddress==null && other.getBillerAddress()==null) || 
             (this.billerAddress!=null &&
              this.billerAddress.equals(other.getBillerAddress()))) &&
            ((this.billerAddress2==null && other.getBillerAddress2()==null) || 
             (this.billerAddress2!=null &&
              this.billerAddress2.equals(other.getBillerAddress2()))) &&
            ((this.billerAddress3==null && other.getBillerAddress3()==null) || 
             (this.billerAddress3!=null &&
              this.billerAddress3.equals(other.getBillerAddress3()))) &&
            ((this.billerCity==null && other.getBillerCity()==null) || 
             (this.billerCity!=null &&
              this.billerCity.equals(other.getBillerCity()))) &&
            ((this.billerState==null && other.getBillerState()==null) || 
             (this.billerState!=null &&
              this.billerState.equals(other.getBillerState()))) &&
            ((this.billerZip==null && other.getBillerZip()==null) || 
             (this.billerZip!=null &&
              this.billerZip.equals(other.getBillerZip()))) &&
            ((this.printMGICustomerServiceNumber==null && other.getPrintMGICustomerServiceNumber()==null) || 
             (this.printMGICustomerServiceNumber!=null &&
              this.printMGICustomerServiceNumber.equals(other.getPrintMGICustomerServiceNumber()))) &&
            ((this.agentTransactionId==null && other.getAgentTransactionId()==null) || 
             (this.agentTransactionId!=null &&
              this.agentTransactionId.equals(other.getAgentTransactionId()))) &&
            ((this.promotionInfo==null && other.getPromotionInfo()==null) || 
             (this.promotionInfo!=null &&
              java.util.Arrays.equals(this.promotionInfo, other.getPromotionInfo()))) &&
            ((this.promotionalMessage==null && other.getPromotionalMessage()==null) || 
             (this.promotionalMessage!=null &&
              java.util.Arrays.equals(this.promotionalMessage, other.getPromotionalMessage()))) &&
            ((this.readyForCommit==null && other.getReadyForCommit()==null) || 
             (this.readyForCommit!=null &&
              this.readyForCommit.equals(other.getReadyForCommit()))) &&
            ((this.disclosureText==null && other.getDisclosureText()==null) || 
             (this.disclosureText!=null &&
              java.util.Arrays.equals(this.disclosureText, other.getDisclosureText()))) &&
            ((this.additionalFieldsToCollect==null && other.getAdditionalFieldsToCollect()==null) || 
             (this.additionalFieldsToCollect!=null &&
              java.util.Arrays.equals(this.additionalFieldsToCollect, other.getAdditionalFieldsToCollect()))) &&
            ((this.processingFee==null && other.getProcessingFee()==null) || 
             (this.processingFee!=null &&
              this.processingFee.equals(other.getProcessingFee()))) &&
            ((this.infoFeeIndicator==null && other.getInfoFeeIndicator()==null) || 
             (this.infoFeeIndicator!=null &&
              this.infoFeeIndicator.equals(other.getInfoFeeIndicator()))) &&
            ((this.sendAmounts==null && other.getSendAmounts()==null) || 
             (this.sendAmounts!=null &&
              this.sendAmounts.equals(other.getSendAmounts()))) &&
            ((this.receiveAmounts==null && other.getReceiveAmounts()==null) || 
             (this.receiveAmounts!=null &&
              this.receiveAmounts.equals(other.getReceiveAmounts()))) &&
            ((this.exchangeRateApplied==null && other.getExchangeRateApplied()==null) || 
             (this.exchangeRateApplied!=null &&
              this.exchangeRateApplied.equals(other.getExchangeRateApplied()))) &&
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              this.confirmationNumber.equals(other.getConfirmationNumber())));
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
        if (getTotalSendAmount() != null) {
            _hashCode += getTotalSendAmount().hashCode();
        }
        if (getMgiRewardsNumber() != null) {
            _hashCode += getMgiRewardsNumber().hashCode();
        }
        if (getProductVariant() != null) {
            _hashCode += getProductVariant().hashCode();
        }
        if (getServiceOfferingID() != null) {
            _hashCode += getServiceOfferingID().hashCode();
        }
        if (getBillerWebsite() != null) {
            _hashCode += getBillerWebsite().hashCode();
        }
        if (getBillerPhone() != null) {
            _hashCode += getBillerPhone().hashCode();
        }
        if (getExpectedPostingTimeFrame() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpectedPostingTimeFrame());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpectedPostingTimeFrame(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillerCutoffTime() != null) {
            _hashCode += getBillerCutoffTime().hashCode();
        }
        if (getBillerNotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillerNotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillerNotes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceOfferingDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceOfferingDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceOfferingDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerTips() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerTips());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerTips(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillerAddress() != null) {
            _hashCode += getBillerAddress().hashCode();
        }
        if (getBillerAddress2() != null) {
            _hashCode += getBillerAddress2().hashCode();
        }
        if (getBillerAddress3() != null) {
            _hashCode += getBillerAddress3().hashCode();
        }
        if (getBillerCity() != null) {
            _hashCode += getBillerCity().hashCode();
        }
        if (getBillerState() != null) {
            _hashCode += getBillerState().hashCode();
        }
        if (getBillerZip() != null) {
            _hashCode += getBillerZip().hashCode();
        }
        if (getPrintMGICustomerServiceNumber() != null) {
            _hashCode += getPrintMGICustomerServiceNumber().hashCode();
        }
        if (getAgentTransactionId() != null) {
            _hashCode += getAgentTransactionId().hashCode();
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
        if (getPromotionalMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotionalMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotionalMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReadyForCommit() != null) {
            _hashCode += getReadyForCommit().hashCode();
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
        if (getAdditionalFieldsToCollect() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalFieldsToCollect());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalFieldsToCollect(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcessingFee() != null) {
            _hashCode += getProcessingFee().hashCode();
        }
        if (getInfoFeeIndicator() != null) {
            _hashCode += getInfoFeeIndicator().hashCode();
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
        if (getConfirmationNumber() != null) {
            _hashCode += getConfirmationNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BpValidationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BpValidationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgiTransactionSessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgiTransactionSessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSendAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "totalSendAmount"));
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
        elemField.setFieldName("billerWebsite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerWebsite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedPostingTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "expectedPostingTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerCutoffTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerCutoffTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOfferingDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "serviceOfferingDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerTips");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerTips"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerZip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printMGICustomerServiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "printMGICustomerServiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("promotionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promotionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "PromotionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionalMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promotionalMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readyForCommit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "readyForCommit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("additionalFieldsToCollect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "additionalFieldsToCollect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProductFieldInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "processingFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoFeeIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "infoFeeIndicator"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "confirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
