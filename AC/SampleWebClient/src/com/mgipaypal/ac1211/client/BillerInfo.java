/**
 * BillerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class BillerInfo  implements java.io.Serializable {
    private java.lang.String receiveAgentID;

    private java.lang.String receiveCode;

    private java.lang.String billerGroupID;

    private java.lang.String billerGroupName;

    private java.lang.String billerName;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String address3;

    private java.lang.String billerCity;

    private java.lang.String billerState;

    private java.lang.String serviceOfferingID;

    private java.lang.String serviceOffering;

    private java.lang.String serviceOfferingSecondary;

    private java.lang.String serviceOfferingShort;

    private java.lang.String serviceOfferingShortSecondary;

    private java.lang.String[] industryID;

    private java.lang.String expectedPostingTimeFrame;

    private java.lang.String expectedPostingTimeFrameSecondary;

    private java.lang.String billerNotes;

    private java.lang.String billerNotesSecondary;

    private java.lang.String secondaryLang;

    private com.mgipaypal.ac1211.client.ProductVariant productVariant;

    private java.lang.String billerCutoffTime;

    private java.lang.String billerWebsite;

    private java.lang.String billerPhoneNumber;

    private java.lang.Boolean maskAccountNumber;

    private java.lang.Boolean nationalBillerFlag;

    private java.lang.Boolean useStandardUBPFields;

    private java.lang.Boolean acctNumberNumericOnly;

    private java.lang.Boolean sendFixedAmountFlag;

    private java.lang.Boolean cancelWarnFlag;

    private java.lang.Boolean refundWarnFlag;

    private java.lang.Boolean doubleAcctNumberEntryFlag;

    private java.math.BigDecimal minimumFeeAmt;

    private com.mgipaypal.ac1211.client.FeeType feeType;

    private java.lang.String consolidatorLocationId;

    private java.lang.String consolidatorName;

    private java.lang.String classOfTradeCode;

    private java.lang.Boolean expeditedEligibleFlag;

    public BillerInfo() {
    }

    public BillerInfo(
           java.lang.String receiveAgentID,
           java.lang.String receiveCode,
           java.lang.String billerGroupID,
           java.lang.String billerGroupName,
           java.lang.String billerName,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String address3,
           java.lang.String billerCity,
           java.lang.String billerState,
           java.lang.String serviceOfferingID,
           java.lang.String serviceOffering,
           java.lang.String serviceOfferingSecondary,
           java.lang.String serviceOfferingShort,
           java.lang.String serviceOfferingShortSecondary,
           java.lang.String[] industryID,
           java.lang.String expectedPostingTimeFrame,
           java.lang.String expectedPostingTimeFrameSecondary,
           java.lang.String billerNotes,
           java.lang.String billerNotesSecondary,
           java.lang.String secondaryLang,
           com.mgipaypal.ac1211.client.ProductVariant productVariant,
           java.lang.String billerCutoffTime,
           java.lang.String billerWebsite,
           java.lang.String billerPhoneNumber,
           java.lang.Boolean maskAccountNumber,
           java.lang.Boolean nationalBillerFlag,
           java.lang.Boolean useStandardUBPFields,
           java.lang.Boolean acctNumberNumericOnly,
           java.lang.Boolean sendFixedAmountFlag,
           java.lang.Boolean cancelWarnFlag,
           java.lang.Boolean refundWarnFlag,
           java.lang.Boolean doubleAcctNumberEntryFlag,
           java.math.BigDecimal minimumFeeAmt,
           com.mgipaypal.ac1211.client.FeeType feeType,
           java.lang.String consolidatorLocationId,
           java.lang.String consolidatorName,
           java.lang.String classOfTradeCode,
           java.lang.Boolean expeditedEligibleFlag) {
           this.receiveAgentID = receiveAgentID;
           this.receiveCode = receiveCode;
           this.billerGroupID = billerGroupID;
           this.billerGroupName = billerGroupName;
           this.billerName = billerName;
           this.address1 = address1;
           this.address2 = address2;
           this.address3 = address3;
           this.billerCity = billerCity;
           this.billerState = billerState;
           this.serviceOfferingID = serviceOfferingID;
           this.serviceOffering = serviceOffering;
           this.serviceOfferingSecondary = serviceOfferingSecondary;
           this.serviceOfferingShort = serviceOfferingShort;
           this.serviceOfferingShortSecondary = serviceOfferingShortSecondary;
           this.industryID = industryID;
           this.expectedPostingTimeFrame = expectedPostingTimeFrame;
           this.expectedPostingTimeFrameSecondary = expectedPostingTimeFrameSecondary;
           this.billerNotes = billerNotes;
           this.billerNotesSecondary = billerNotesSecondary;
           this.secondaryLang = secondaryLang;
           this.productVariant = productVariant;
           this.billerCutoffTime = billerCutoffTime;
           this.billerWebsite = billerWebsite;
           this.billerPhoneNumber = billerPhoneNumber;
           this.maskAccountNumber = maskAccountNumber;
           this.nationalBillerFlag = nationalBillerFlag;
           this.useStandardUBPFields = useStandardUBPFields;
           this.acctNumberNumericOnly = acctNumberNumericOnly;
           this.sendFixedAmountFlag = sendFixedAmountFlag;
           this.cancelWarnFlag = cancelWarnFlag;
           this.refundWarnFlag = refundWarnFlag;
           this.doubleAcctNumberEntryFlag = doubleAcctNumberEntryFlag;
           this.minimumFeeAmt = minimumFeeAmt;
           this.feeType = feeType;
           this.consolidatorLocationId = consolidatorLocationId;
           this.consolidatorName = consolidatorName;
           this.classOfTradeCode = classOfTradeCode;
           this.expeditedEligibleFlag = expeditedEligibleFlag;
    }


    /**
     * Gets the receiveAgentID value for this BillerInfo.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this BillerInfo.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the receiveCode value for this BillerInfo.
     * 
     * @return receiveCode
     */
    public java.lang.String getReceiveCode() {
        return receiveCode;
    }


    /**
     * Sets the receiveCode value for this BillerInfo.
     * 
     * @param receiveCode
     */
    public void setReceiveCode(java.lang.String receiveCode) {
        this.receiveCode = receiveCode;
    }


    /**
     * Gets the billerGroupID value for this BillerInfo.
     * 
     * @return billerGroupID
     */
    public java.lang.String getBillerGroupID() {
        return billerGroupID;
    }


    /**
     * Sets the billerGroupID value for this BillerInfo.
     * 
     * @param billerGroupID
     */
    public void setBillerGroupID(java.lang.String billerGroupID) {
        this.billerGroupID = billerGroupID;
    }


    /**
     * Gets the billerGroupName value for this BillerInfo.
     * 
     * @return billerGroupName
     */
    public java.lang.String getBillerGroupName() {
        return billerGroupName;
    }


    /**
     * Sets the billerGroupName value for this BillerInfo.
     * 
     * @param billerGroupName
     */
    public void setBillerGroupName(java.lang.String billerGroupName) {
        this.billerGroupName = billerGroupName;
    }


    /**
     * Gets the billerName value for this BillerInfo.
     * 
     * @return billerName
     */
    public java.lang.String getBillerName() {
        return billerName;
    }


    /**
     * Sets the billerName value for this BillerInfo.
     * 
     * @param billerName
     */
    public void setBillerName(java.lang.String billerName) {
        this.billerName = billerName;
    }


    /**
     * Gets the address1 value for this BillerInfo.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this BillerInfo.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this BillerInfo.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this BillerInfo.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the address3 value for this BillerInfo.
     * 
     * @return address3
     */
    public java.lang.String getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this BillerInfo.
     * 
     * @param address3
     */
    public void setAddress3(java.lang.String address3) {
        this.address3 = address3;
    }


    /**
     * Gets the billerCity value for this BillerInfo.
     * 
     * @return billerCity
     */
    public java.lang.String getBillerCity() {
        return billerCity;
    }


    /**
     * Sets the billerCity value for this BillerInfo.
     * 
     * @param billerCity
     */
    public void setBillerCity(java.lang.String billerCity) {
        this.billerCity = billerCity;
    }


    /**
     * Gets the billerState value for this BillerInfo.
     * 
     * @return billerState
     */
    public java.lang.String getBillerState() {
        return billerState;
    }


    /**
     * Sets the billerState value for this BillerInfo.
     * 
     * @param billerState
     */
    public void setBillerState(java.lang.String billerState) {
        this.billerState = billerState;
    }


    /**
     * Gets the serviceOfferingID value for this BillerInfo.
     * 
     * @return serviceOfferingID
     */
    public java.lang.String getServiceOfferingID() {
        return serviceOfferingID;
    }


    /**
     * Sets the serviceOfferingID value for this BillerInfo.
     * 
     * @param serviceOfferingID
     */
    public void setServiceOfferingID(java.lang.String serviceOfferingID) {
        this.serviceOfferingID = serviceOfferingID;
    }


    /**
     * Gets the serviceOffering value for this BillerInfo.
     * 
     * @return serviceOffering
     */
    public java.lang.String getServiceOffering() {
        return serviceOffering;
    }


    /**
     * Sets the serviceOffering value for this BillerInfo.
     * 
     * @param serviceOffering
     */
    public void setServiceOffering(java.lang.String serviceOffering) {
        this.serviceOffering = serviceOffering;
    }


    /**
     * Gets the serviceOfferingSecondary value for this BillerInfo.
     * 
     * @return serviceOfferingSecondary
     */
    public java.lang.String getServiceOfferingSecondary() {
        return serviceOfferingSecondary;
    }


    /**
     * Sets the serviceOfferingSecondary value for this BillerInfo.
     * 
     * @param serviceOfferingSecondary
     */
    public void setServiceOfferingSecondary(java.lang.String serviceOfferingSecondary) {
        this.serviceOfferingSecondary = serviceOfferingSecondary;
    }


    /**
     * Gets the serviceOfferingShort value for this BillerInfo.
     * 
     * @return serviceOfferingShort
     */
    public java.lang.String getServiceOfferingShort() {
        return serviceOfferingShort;
    }


    /**
     * Sets the serviceOfferingShort value for this BillerInfo.
     * 
     * @param serviceOfferingShort
     */
    public void setServiceOfferingShort(java.lang.String serviceOfferingShort) {
        this.serviceOfferingShort = serviceOfferingShort;
    }


    /**
     * Gets the serviceOfferingShortSecondary value for this BillerInfo.
     * 
     * @return serviceOfferingShortSecondary
     */
    public java.lang.String getServiceOfferingShortSecondary() {
        return serviceOfferingShortSecondary;
    }


    /**
     * Sets the serviceOfferingShortSecondary value for this BillerInfo.
     * 
     * @param serviceOfferingShortSecondary
     */
    public void setServiceOfferingShortSecondary(java.lang.String serviceOfferingShortSecondary) {
        this.serviceOfferingShortSecondary = serviceOfferingShortSecondary;
    }


    /**
     * Gets the industryID value for this BillerInfo.
     * 
     * @return industryID
     */
    public java.lang.String[] getIndustryID() {
        return industryID;
    }


    /**
     * Sets the industryID value for this BillerInfo.
     * 
     * @param industryID
     */
    public void setIndustryID(java.lang.String[] industryID) {
        this.industryID = industryID;
    }

    public java.lang.String getIndustryID(int i) {
        return this.industryID[i];
    }

    public void setIndustryID(int i, java.lang.String _value) {
        this.industryID[i] = _value;
    }


    /**
     * Gets the expectedPostingTimeFrame value for this BillerInfo.
     * 
     * @return expectedPostingTimeFrame
     */
    public java.lang.String getExpectedPostingTimeFrame() {
        return expectedPostingTimeFrame;
    }


    /**
     * Sets the expectedPostingTimeFrame value for this BillerInfo.
     * 
     * @param expectedPostingTimeFrame
     */
    public void setExpectedPostingTimeFrame(java.lang.String expectedPostingTimeFrame) {
        this.expectedPostingTimeFrame = expectedPostingTimeFrame;
    }


    /**
     * Gets the expectedPostingTimeFrameSecondary value for this BillerInfo.
     * 
     * @return expectedPostingTimeFrameSecondary
     */
    public java.lang.String getExpectedPostingTimeFrameSecondary() {
        return expectedPostingTimeFrameSecondary;
    }


    /**
     * Sets the expectedPostingTimeFrameSecondary value for this BillerInfo.
     * 
     * @param expectedPostingTimeFrameSecondary
     */
    public void setExpectedPostingTimeFrameSecondary(java.lang.String expectedPostingTimeFrameSecondary) {
        this.expectedPostingTimeFrameSecondary = expectedPostingTimeFrameSecondary;
    }


    /**
     * Gets the billerNotes value for this BillerInfo.
     * 
     * @return billerNotes
     */
    public java.lang.String getBillerNotes() {
        return billerNotes;
    }


    /**
     * Sets the billerNotes value for this BillerInfo.
     * 
     * @param billerNotes
     */
    public void setBillerNotes(java.lang.String billerNotes) {
        this.billerNotes = billerNotes;
    }


    /**
     * Gets the billerNotesSecondary value for this BillerInfo.
     * 
     * @return billerNotesSecondary
     */
    public java.lang.String getBillerNotesSecondary() {
        return billerNotesSecondary;
    }


    /**
     * Sets the billerNotesSecondary value for this BillerInfo.
     * 
     * @param billerNotesSecondary
     */
    public void setBillerNotesSecondary(java.lang.String billerNotesSecondary) {
        this.billerNotesSecondary = billerNotesSecondary;
    }


    /**
     * Gets the secondaryLang value for this BillerInfo.
     * 
     * @return secondaryLang
     */
    public java.lang.String getSecondaryLang() {
        return secondaryLang;
    }


    /**
     * Sets the secondaryLang value for this BillerInfo.
     * 
     * @param secondaryLang
     */
    public void setSecondaryLang(java.lang.String secondaryLang) {
        this.secondaryLang = secondaryLang;
    }


    /**
     * Gets the productVariant value for this BillerInfo.
     * 
     * @return productVariant
     */
    public com.mgipaypal.ac1211.client.ProductVariant getProductVariant() {
        return productVariant;
    }


    /**
     * Sets the productVariant value for this BillerInfo.
     * 
     * @param productVariant
     */
    public void setProductVariant(com.mgipaypal.ac1211.client.ProductVariant productVariant) {
        this.productVariant = productVariant;
    }


    /**
     * Gets the billerCutoffTime value for this BillerInfo.
     * 
     * @return billerCutoffTime
     */
    public java.lang.String getBillerCutoffTime() {
        return billerCutoffTime;
    }


    /**
     * Sets the billerCutoffTime value for this BillerInfo.
     * 
     * @param billerCutoffTime
     */
    public void setBillerCutoffTime(java.lang.String billerCutoffTime) {
        this.billerCutoffTime = billerCutoffTime;
    }


    /**
     * Gets the billerWebsite value for this BillerInfo.
     * 
     * @return billerWebsite
     */
    public java.lang.String getBillerWebsite() {
        return billerWebsite;
    }


    /**
     * Sets the billerWebsite value for this BillerInfo.
     * 
     * @param billerWebsite
     */
    public void setBillerWebsite(java.lang.String billerWebsite) {
        this.billerWebsite = billerWebsite;
    }


    /**
     * Gets the billerPhoneNumber value for this BillerInfo.
     * 
     * @return billerPhoneNumber
     */
    public java.lang.String getBillerPhoneNumber() {
        return billerPhoneNumber;
    }


    /**
     * Sets the billerPhoneNumber value for this BillerInfo.
     * 
     * @param billerPhoneNumber
     */
    public void setBillerPhoneNumber(java.lang.String billerPhoneNumber) {
        this.billerPhoneNumber = billerPhoneNumber;
    }


    /**
     * Gets the maskAccountNumber value for this BillerInfo.
     * 
     * @return maskAccountNumber
     */
    public java.lang.Boolean getMaskAccountNumber() {
        return maskAccountNumber;
    }


    /**
     * Sets the maskAccountNumber value for this BillerInfo.
     * 
     * @param maskAccountNumber
     */
    public void setMaskAccountNumber(java.lang.Boolean maskAccountNumber) {
        this.maskAccountNumber = maskAccountNumber;
    }


    /**
     * Gets the nationalBillerFlag value for this BillerInfo.
     * 
     * @return nationalBillerFlag
     */
    public java.lang.Boolean getNationalBillerFlag() {
        return nationalBillerFlag;
    }


    /**
     * Sets the nationalBillerFlag value for this BillerInfo.
     * 
     * @param nationalBillerFlag
     */
    public void setNationalBillerFlag(java.lang.Boolean nationalBillerFlag) {
        this.nationalBillerFlag = nationalBillerFlag;
    }


    /**
     * Gets the useStandardUBPFields value for this BillerInfo.
     * 
     * @return useStandardUBPFields
     */
    public java.lang.Boolean getUseStandardUBPFields() {
        return useStandardUBPFields;
    }


    /**
     * Sets the useStandardUBPFields value for this BillerInfo.
     * 
     * @param useStandardUBPFields
     */
    public void setUseStandardUBPFields(java.lang.Boolean useStandardUBPFields) {
        this.useStandardUBPFields = useStandardUBPFields;
    }


    /**
     * Gets the acctNumberNumericOnly value for this BillerInfo.
     * 
     * @return acctNumberNumericOnly
     */
    public java.lang.Boolean getAcctNumberNumericOnly() {
        return acctNumberNumericOnly;
    }


    /**
     * Sets the acctNumberNumericOnly value for this BillerInfo.
     * 
     * @param acctNumberNumericOnly
     */
    public void setAcctNumberNumericOnly(java.lang.Boolean acctNumberNumericOnly) {
        this.acctNumberNumericOnly = acctNumberNumericOnly;
    }


    /**
     * Gets the sendFixedAmountFlag value for this BillerInfo.
     * 
     * @return sendFixedAmountFlag
     */
    public java.lang.Boolean getSendFixedAmountFlag() {
        return sendFixedAmountFlag;
    }


    /**
     * Sets the sendFixedAmountFlag value for this BillerInfo.
     * 
     * @param sendFixedAmountFlag
     */
    public void setSendFixedAmountFlag(java.lang.Boolean sendFixedAmountFlag) {
        this.sendFixedAmountFlag = sendFixedAmountFlag;
    }


    /**
     * Gets the cancelWarnFlag value for this BillerInfo.
     * 
     * @return cancelWarnFlag
     */
    public java.lang.Boolean getCancelWarnFlag() {
        return cancelWarnFlag;
    }


    /**
     * Sets the cancelWarnFlag value for this BillerInfo.
     * 
     * @param cancelWarnFlag
     */
    public void setCancelWarnFlag(java.lang.Boolean cancelWarnFlag) {
        this.cancelWarnFlag = cancelWarnFlag;
    }


    /**
     * Gets the refundWarnFlag value for this BillerInfo.
     * 
     * @return refundWarnFlag
     */
    public java.lang.Boolean getRefundWarnFlag() {
        return refundWarnFlag;
    }


    /**
     * Sets the refundWarnFlag value for this BillerInfo.
     * 
     * @param refundWarnFlag
     */
    public void setRefundWarnFlag(java.lang.Boolean refundWarnFlag) {
        this.refundWarnFlag = refundWarnFlag;
    }


    /**
     * Gets the doubleAcctNumberEntryFlag value for this BillerInfo.
     * 
     * @return doubleAcctNumberEntryFlag
     */
    public java.lang.Boolean getDoubleAcctNumberEntryFlag() {
        return doubleAcctNumberEntryFlag;
    }


    /**
     * Sets the doubleAcctNumberEntryFlag value for this BillerInfo.
     * 
     * @param doubleAcctNumberEntryFlag
     */
    public void setDoubleAcctNumberEntryFlag(java.lang.Boolean doubleAcctNumberEntryFlag) {
        this.doubleAcctNumberEntryFlag = doubleAcctNumberEntryFlag;
    }


    /**
     * Gets the minimumFeeAmt value for this BillerInfo.
     * 
     * @return minimumFeeAmt
     */
    public java.math.BigDecimal getMinimumFeeAmt() {
        return minimumFeeAmt;
    }


    /**
     * Sets the minimumFeeAmt value for this BillerInfo.
     * 
     * @param minimumFeeAmt
     */
    public void setMinimumFeeAmt(java.math.BigDecimal minimumFeeAmt) {
        this.minimumFeeAmt = minimumFeeAmt;
    }


    /**
     * Gets the feeType value for this BillerInfo.
     * 
     * @return feeType
     */
    public com.mgipaypal.ac1211.client.FeeType getFeeType() {
        return feeType;
    }


    /**
     * Sets the feeType value for this BillerInfo.
     * 
     * @param feeType
     */
    public void setFeeType(com.mgipaypal.ac1211.client.FeeType feeType) {
        this.feeType = feeType;
    }


    /**
     * Gets the consolidatorLocationId value for this BillerInfo.
     * 
     * @return consolidatorLocationId
     */
    public java.lang.String getConsolidatorLocationId() {
        return consolidatorLocationId;
    }


    /**
     * Sets the consolidatorLocationId value for this BillerInfo.
     * 
     * @param consolidatorLocationId
     */
    public void setConsolidatorLocationId(java.lang.String consolidatorLocationId) {
        this.consolidatorLocationId = consolidatorLocationId;
    }


    /**
     * Gets the consolidatorName value for this BillerInfo.
     * 
     * @return consolidatorName
     */
    public java.lang.String getConsolidatorName() {
        return consolidatorName;
    }


    /**
     * Sets the consolidatorName value for this BillerInfo.
     * 
     * @param consolidatorName
     */
    public void setConsolidatorName(java.lang.String consolidatorName) {
        this.consolidatorName = consolidatorName;
    }


    /**
     * Gets the classOfTradeCode value for this BillerInfo.
     * 
     * @return classOfTradeCode
     */
    public java.lang.String getClassOfTradeCode() {
        return classOfTradeCode;
    }


    /**
     * Sets the classOfTradeCode value for this BillerInfo.
     * 
     * @param classOfTradeCode
     */
    public void setClassOfTradeCode(java.lang.String classOfTradeCode) {
        this.classOfTradeCode = classOfTradeCode;
    }


    /**
     * Gets the expeditedEligibleFlag value for this BillerInfo.
     * 
     * @return expeditedEligibleFlag
     */
    public java.lang.Boolean getExpeditedEligibleFlag() {
        return expeditedEligibleFlag;
    }


    /**
     * Sets the expeditedEligibleFlag value for this BillerInfo.
     * 
     * @param expeditedEligibleFlag
     */
    public void setExpeditedEligibleFlag(java.lang.Boolean expeditedEligibleFlag) {
        this.expeditedEligibleFlag = expeditedEligibleFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillerInfo)) return false;
        BillerInfo other = (BillerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiveAgentID==null && other.getReceiveAgentID()==null) || 
             (this.receiveAgentID!=null &&
              this.receiveAgentID.equals(other.getReceiveAgentID()))) &&
            ((this.receiveCode==null && other.getReceiveCode()==null) || 
             (this.receiveCode!=null &&
              this.receiveCode.equals(other.getReceiveCode()))) &&
            ((this.billerGroupID==null && other.getBillerGroupID()==null) || 
             (this.billerGroupID!=null &&
              this.billerGroupID.equals(other.getBillerGroupID()))) &&
            ((this.billerGroupName==null && other.getBillerGroupName()==null) || 
             (this.billerGroupName!=null &&
              this.billerGroupName.equals(other.getBillerGroupName()))) &&
            ((this.billerName==null && other.getBillerName()==null) || 
             (this.billerName!=null &&
              this.billerName.equals(other.getBillerName()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              this.address3.equals(other.getAddress3()))) &&
            ((this.billerCity==null && other.getBillerCity()==null) || 
             (this.billerCity!=null &&
              this.billerCity.equals(other.getBillerCity()))) &&
            ((this.billerState==null && other.getBillerState()==null) || 
             (this.billerState!=null &&
              this.billerState.equals(other.getBillerState()))) &&
            ((this.serviceOfferingID==null && other.getServiceOfferingID()==null) || 
             (this.serviceOfferingID!=null &&
              this.serviceOfferingID.equals(other.getServiceOfferingID()))) &&
            ((this.serviceOffering==null && other.getServiceOffering()==null) || 
             (this.serviceOffering!=null &&
              this.serviceOffering.equals(other.getServiceOffering()))) &&
            ((this.serviceOfferingSecondary==null && other.getServiceOfferingSecondary()==null) || 
             (this.serviceOfferingSecondary!=null &&
              this.serviceOfferingSecondary.equals(other.getServiceOfferingSecondary()))) &&
            ((this.serviceOfferingShort==null && other.getServiceOfferingShort()==null) || 
             (this.serviceOfferingShort!=null &&
              this.serviceOfferingShort.equals(other.getServiceOfferingShort()))) &&
            ((this.serviceOfferingShortSecondary==null && other.getServiceOfferingShortSecondary()==null) || 
             (this.serviceOfferingShortSecondary!=null &&
              this.serviceOfferingShortSecondary.equals(other.getServiceOfferingShortSecondary()))) &&
            ((this.industryID==null && other.getIndustryID()==null) || 
             (this.industryID!=null &&
              java.util.Arrays.equals(this.industryID, other.getIndustryID()))) &&
            ((this.expectedPostingTimeFrame==null && other.getExpectedPostingTimeFrame()==null) || 
             (this.expectedPostingTimeFrame!=null &&
              this.expectedPostingTimeFrame.equals(other.getExpectedPostingTimeFrame()))) &&
            ((this.expectedPostingTimeFrameSecondary==null && other.getExpectedPostingTimeFrameSecondary()==null) || 
             (this.expectedPostingTimeFrameSecondary!=null &&
              this.expectedPostingTimeFrameSecondary.equals(other.getExpectedPostingTimeFrameSecondary()))) &&
            ((this.billerNotes==null && other.getBillerNotes()==null) || 
             (this.billerNotes!=null &&
              this.billerNotes.equals(other.getBillerNotes()))) &&
            ((this.billerNotesSecondary==null && other.getBillerNotesSecondary()==null) || 
             (this.billerNotesSecondary!=null &&
              this.billerNotesSecondary.equals(other.getBillerNotesSecondary()))) &&
            ((this.secondaryLang==null && other.getSecondaryLang()==null) || 
             (this.secondaryLang!=null &&
              this.secondaryLang.equals(other.getSecondaryLang()))) &&
            ((this.productVariant==null && other.getProductVariant()==null) || 
             (this.productVariant!=null &&
              this.productVariant.equals(other.getProductVariant()))) &&
            ((this.billerCutoffTime==null && other.getBillerCutoffTime()==null) || 
             (this.billerCutoffTime!=null &&
              this.billerCutoffTime.equals(other.getBillerCutoffTime()))) &&
            ((this.billerWebsite==null && other.getBillerWebsite()==null) || 
             (this.billerWebsite!=null &&
              this.billerWebsite.equals(other.getBillerWebsite()))) &&
            ((this.billerPhoneNumber==null && other.getBillerPhoneNumber()==null) || 
             (this.billerPhoneNumber!=null &&
              this.billerPhoneNumber.equals(other.getBillerPhoneNumber()))) &&
            ((this.maskAccountNumber==null && other.getMaskAccountNumber()==null) || 
             (this.maskAccountNumber!=null &&
              this.maskAccountNumber.equals(other.getMaskAccountNumber()))) &&
            ((this.nationalBillerFlag==null && other.getNationalBillerFlag()==null) || 
             (this.nationalBillerFlag!=null &&
              this.nationalBillerFlag.equals(other.getNationalBillerFlag()))) &&
            ((this.useStandardUBPFields==null && other.getUseStandardUBPFields()==null) || 
             (this.useStandardUBPFields!=null &&
              this.useStandardUBPFields.equals(other.getUseStandardUBPFields()))) &&
            ((this.acctNumberNumericOnly==null && other.getAcctNumberNumericOnly()==null) || 
             (this.acctNumberNumericOnly!=null &&
              this.acctNumberNumericOnly.equals(other.getAcctNumberNumericOnly()))) &&
            ((this.sendFixedAmountFlag==null && other.getSendFixedAmountFlag()==null) || 
             (this.sendFixedAmountFlag!=null &&
              this.sendFixedAmountFlag.equals(other.getSendFixedAmountFlag()))) &&
            ((this.cancelWarnFlag==null && other.getCancelWarnFlag()==null) || 
             (this.cancelWarnFlag!=null &&
              this.cancelWarnFlag.equals(other.getCancelWarnFlag()))) &&
            ((this.refundWarnFlag==null && other.getRefundWarnFlag()==null) || 
             (this.refundWarnFlag!=null &&
              this.refundWarnFlag.equals(other.getRefundWarnFlag()))) &&
            ((this.doubleAcctNumberEntryFlag==null && other.getDoubleAcctNumberEntryFlag()==null) || 
             (this.doubleAcctNumberEntryFlag!=null &&
              this.doubleAcctNumberEntryFlag.equals(other.getDoubleAcctNumberEntryFlag()))) &&
            ((this.minimumFeeAmt==null && other.getMinimumFeeAmt()==null) || 
             (this.minimumFeeAmt!=null &&
              this.minimumFeeAmt.equals(other.getMinimumFeeAmt()))) &&
            ((this.feeType==null && other.getFeeType()==null) || 
             (this.feeType!=null &&
              this.feeType.equals(other.getFeeType()))) &&
            ((this.consolidatorLocationId==null && other.getConsolidatorLocationId()==null) || 
             (this.consolidatorLocationId!=null &&
              this.consolidatorLocationId.equals(other.getConsolidatorLocationId()))) &&
            ((this.consolidatorName==null && other.getConsolidatorName()==null) || 
             (this.consolidatorName!=null &&
              this.consolidatorName.equals(other.getConsolidatorName()))) &&
            ((this.classOfTradeCode==null && other.getClassOfTradeCode()==null) || 
             (this.classOfTradeCode!=null &&
              this.classOfTradeCode.equals(other.getClassOfTradeCode()))) &&
            ((this.expeditedEligibleFlag==null && other.getExpeditedEligibleFlag()==null) || 
             (this.expeditedEligibleFlag!=null &&
              this.expeditedEligibleFlag.equals(other.getExpeditedEligibleFlag())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getReceiveAgentID() != null) {
            _hashCode += getReceiveAgentID().hashCode();
        }
        if (getReceiveCode() != null) {
            _hashCode += getReceiveCode().hashCode();
        }
        if (getBillerGroupID() != null) {
            _hashCode += getBillerGroupID().hashCode();
        }
        if (getBillerGroupName() != null) {
            _hashCode += getBillerGroupName().hashCode();
        }
        if (getBillerName() != null) {
            _hashCode += getBillerName().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getAddress3() != null) {
            _hashCode += getAddress3().hashCode();
        }
        if (getBillerCity() != null) {
            _hashCode += getBillerCity().hashCode();
        }
        if (getBillerState() != null) {
            _hashCode += getBillerState().hashCode();
        }
        if (getServiceOfferingID() != null) {
            _hashCode += getServiceOfferingID().hashCode();
        }
        if (getServiceOffering() != null) {
            _hashCode += getServiceOffering().hashCode();
        }
        if (getServiceOfferingSecondary() != null) {
            _hashCode += getServiceOfferingSecondary().hashCode();
        }
        if (getServiceOfferingShort() != null) {
            _hashCode += getServiceOfferingShort().hashCode();
        }
        if (getServiceOfferingShortSecondary() != null) {
            _hashCode += getServiceOfferingShortSecondary().hashCode();
        }
        if (getIndustryID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndustryID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndustryID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpectedPostingTimeFrame() != null) {
            _hashCode += getExpectedPostingTimeFrame().hashCode();
        }
        if (getExpectedPostingTimeFrameSecondary() != null) {
            _hashCode += getExpectedPostingTimeFrameSecondary().hashCode();
        }
        if (getBillerNotes() != null) {
            _hashCode += getBillerNotes().hashCode();
        }
        if (getBillerNotesSecondary() != null) {
            _hashCode += getBillerNotesSecondary().hashCode();
        }
        if (getSecondaryLang() != null) {
            _hashCode += getSecondaryLang().hashCode();
        }
        if (getProductVariant() != null) {
            _hashCode += getProductVariant().hashCode();
        }
        if (getBillerCutoffTime() != null) {
            _hashCode += getBillerCutoffTime().hashCode();
        }
        if (getBillerWebsite() != null) {
            _hashCode += getBillerWebsite().hashCode();
        }
        if (getBillerPhoneNumber() != null) {
            _hashCode += getBillerPhoneNumber().hashCode();
        }
        if (getMaskAccountNumber() != null) {
            _hashCode += getMaskAccountNumber().hashCode();
        }
        if (getNationalBillerFlag() != null) {
            _hashCode += getNationalBillerFlag().hashCode();
        }
        if (getUseStandardUBPFields() != null) {
            _hashCode += getUseStandardUBPFields().hashCode();
        }
        if (getAcctNumberNumericOnly() != null) {
            _hashCode += getAcctNumberNumericOnly().hashCode();
        }
        if (getSendFixedAmountFlag() != null) {
            _hashCode += getSendFixedAmountFlag().hashCode();
        }
        if (getCancelWarnFlag() != null) {
            _hashCode += getCancelWarnFlag().hashCode();
        }
        if (getRefundWarnFlag() != null) {
            _hashCode += getRefundWarnFlag().hashCode();
        }
        if (getDoubleAcctNumberEntryFlag() != null) {
            _hashCode += getDoubleAcctNumberEntryFlag().hashCode();
        }
        if (getMinimumFeeAmt() != null) {
            _hashCode += getMinimumFeeAmt().hashCode();
        }
        if (getFeeType() != null) {
            _hashCode += getFeeType().hashCode();
        }
        if (getConsolidatorLocationId() != null) {
            _hashCode += getConsolidatorLocationId().hashCode();
        }
        if (getConsolidatorName() != null) {
            _hashCode += getConsolidatorName().hashCode();
        }
        if (getClassOfTradeCode() != null) {
            _hashCode += getClassOfTradeCode().hashCode();
        }
        if (getExpeditedEligibleFlag() != null) {
            _hashCode += getExpeditedEligibleFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAgentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAgentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerGroupID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerGroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "address3"));
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
        elemField.setFieldName("serviceOfferingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "serviceOfferingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "serviceOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOfferingSecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "serviceOfferingSecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOfferingShort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "serviceOfferingShort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOfferingShortSecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "serviceOfferingShortSecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "industryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "industryID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedPostingTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "expectedPostingTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedPostingTimeFrameSecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "expectedPostingTimeFrameSecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerNotesSecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerNotesSecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "secondaryLang"));
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
        elemField.setFieldName("billerCutoffTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerCutoffTime"));
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
        elemField.setFieldName("billerPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "maskAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalBillerFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "nationalBillerFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useStandardUBPFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "useStandardUBPFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctNumberNumericOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "acctNumberNumericOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendFixedAmountFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendFixedAmountFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelWarnFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cancelWarnFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundWarnFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "refundWarnFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doubleAcctNumberEntryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "doubleAcctNumberEntryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumFeeAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "minimumFeeAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "feeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "feeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatorLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consolidatorLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consolidatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classOfTradeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "classOfTradeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expeditedEligibleFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "expeditedEligibleFlag"));
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
