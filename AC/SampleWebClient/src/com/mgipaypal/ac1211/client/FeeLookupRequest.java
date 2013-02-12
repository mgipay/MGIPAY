/**
 * FeeLookupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class FeeLookupRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private com.mgipaypal.ac1211.client.ProductType productType;

    private com.mgipaypal.ac1211.client.ProductVariant productVariant;

    private java.lang.String operatorName;

    private java.math.BigDecimal amountIncludingFee;

    private java.math.BigDecimal amountExcludingFee;

    private java.math.BigDecimal receiveAmount;

    private java.lang.String receiveCountry;

    private java.lang.String deliveryOption;

    private java.lang.String mgiRewardsNumber;

    private java.lang.String receiveCode;

    private java.lang.String indicativeReceiveCurrency;

    private java.lang.String receiveAgentID;

    private java.lang.String receiveCurrency;

    private java.lang.String sendCurrency;

    private java.lang.String mgCustomerReceiveNumber;

    private java.math.BigDecimal defaultInformationalFee;

    private java.lang.String serviceOfferingID;

    private java.lang.Boolean defaultMaxFee;

    private boolean allOptions;

    private java.lang.String[] promoCodeValues;

    public FeeLookupRequest() {
    }

    public FeeLookupRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           com.mgipaypal.ac1211.client.ProductType productType,
           com.mgipaypal.ac1211.client.ProductVariant productVariant,
           java.lang.String operatorName,
           java.math.BigDecimal amountIncludingFee,
           java.math.BigDecimal amountExcludingFee,
           java.math.BigDecimal receiveAmount,
           java.lang.String receiveCountry,
           java.lang.String deliveryOption,
           java.lang.String mgiRewardsNumber,
           java.lang.String receiveCode,
           java.lang.String indicativeReceiveCurrency,
           java.lang.String receiveAgentID,
           java.lang.String receiveCurrency,
           java.lang.String sendCurrency,
           java.lang.String mgCustomerReceiveNumber,
           java.math.BigDecimal defaultInformationalFee,
           java.lang.String serviceOfferingID,
           java.lang.Boolean defaultMaxFee,
           boolean allOptions,
           java.lang.String[] promoCodeValues) {
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
        this.productType = productType;
        this.productVariant = productVariant;
        this.operatorName = operatorName;
        this.amountIncludingFee = amountIncludingFee;
        this.amountExcludingFee = amountExcludingFee;
        this.receiveAmount = receiveAmount;
        this.receiveCountry = receiveCountry;
        this.deliveryOption = deliveryOption;
        this.mgiRewardsNumber = mgiRewardsNumber;
        this.receiveCode = receiveCode;
        this.indicativeReceiveCurrency = indicativeReceiveCurrency;
        this.receiveAgentID = receiveAgentID;
        this.receiveCurrency = receiveCurrency;
        this.sendCurrency = sendCurrency;
        this.mgCustomerReceiveNumber = mgCustomerReceiveNumber;
        this.defaultInformationalFee = defaultInformationalFee;
        this.serviceOfferingID = serviceOfferingID;
        this.defaultMaxFee = defaultMaxFee;
        this.allOptions = allOptions;
        this.promoCodeValues = promoCodeValues;
    }


    /**
     * Gets the productType value for this FeeLookupRequest.
     * 
     * @return productType
     */
    public com.mgipaypal.ac1211.client.ProductType getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this FeeLookupRequest.
     * 
     * @param productType
     */
    public void setProductType(com.mgipaypal.ac1211.client.ProductType productType) {
        this.productType = productType;
    }


    /**
     * Gets the productVariant value for this FeeLookupRequest.
     * 
     * @return productVariant
     */
    public com.mgipaypal.ac1211.client.ProductVariant getProductVariant() {
        return productVariant;
    }


    /**
     * Sets the productVariant value for this FeeLookupRequest.
     * 
     * @param productVariant
     */
    public void setProductVariant(com.mgipaypal.ac1211.client.ProductVariant productVariant) {
        this.productVariant = productVariant;
    }


    /**
     * Gets the operatorName value for this FeeLookupRequest.
     * 
     * @return operatorName
     */
    public java.lang.String getOperatorName() {
        return operatorName;
    }


    /**
     * Sets the operatorName value for this FeeLookupRequest.
     * 
     * @param operatorName
     */
    public void setOperatorName(java.lang.String operatorName) {
        this.operatorName = operatorName;
    }


    /**
     * Gets the amountIncludingFee value for this FeeLookupRequest.
     * 
     * @return amountIncludingFee
     */
    public java.math.BigDecimal getAmountIncludingFee() {
        return amountIncludingFee;
    }


    /**
     * Sets the amountIncludingFee value for this FeeLookupRequest.
     * 
     * @param amountIncludingFee
     */
    public void setAmountIncludingFee(java.math.BigDecimal amountIncludingFee) {
        this.amountIncludingFee = amountIncludingFee;
    }


    /**
     * Gets the amountExcludingFee value for this FeeLookupRequest.
     * 
     * @return amountExcludingFee
     */
    public java.math.BigDecimal getAmountExcludingFee() {
        return amountExcludingFee;
    }


    /**
     * Sets the amountExcludingFee value for this FeeLookupRequest.
     * 
     * @param amountExcludingFee
     */
    public void setAmountExcludingFee(java.math.BigDecimal amountExcludingFee) {
        this.amountExcludingFee = amountExcludingFee;
    }


    /**
     * Gets the receiveAmount value for this FeeLookupRequest.
     * 
     * @return receiveAmount
     */
    public java.math.BigDecimal getReceiveAmount() {
        return receiveAmount;
    }


    /**
     * Sets the receiveAmount value for this FeeLookupRequest.
     * 
     * @param receiveAmount
     */
    public void setReceiveAmount(java.math.BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }


    /**
     * Gets the receiveCountry value for this FeeLookupRequest.
     * 
     * @return receiveCountry
     */
    public java.lang.String getReceiveCountry() {
        return receiveCountry;
    }


    /**
     * Sets the receiveCountry value for this FeeLookupRequest.
     * 
     * @param receiveCountry
     */
    public void setReceiveCountry(java.lang.String receiveCountry) {
        this.receiveCountry = receiveCountry;
    }


    /**
     * Gets the deliveryOption value for this FeeLookupRequest.
     * 
     * @return deliveryOption
     */
    public java.lang.String getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this FeeLookupRequest.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(java.lang.String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the mgiRewardsNumber value for this FeeLookupRequest.
     * 
     * @return mgiRewardsNumber
     */
    public java.lang.String getMgiRewardsNumber() {
        return mgiRewardsNumber;
    }


    /**
     * Sets the mgiRewardsNumber value for this FeeLookupRequest.
     * 
     * @param mgiRewardsNumber
     */
    public void setMgiRewardsNumber(java.lang.String mgiRewardsNumber) {
        this.mgiRewardsNumber = mgiRewardsNumber;
    }


    /**
     * Gets the receiveCode value for this FeeLookupRequest.
     * 
     * @return receiveCode
     */
    public java.lang.String getReceiveCode() {
        return receiveCode;
    }


    /**
     * Sets the receiveCode value for this FeeLookupRequest.
     * 
     * @param receiveCode
     */
    public void setReceiveCode(java.lang.String receiveCode) {
        this.receiveCode = receiveCode;
    }


    /**
     * Gets the indicativeReceiveCurrency value for this FeeLookupRequest.
     * 
     * @return indicativeReceiveCurrency
     */
    public java.lang.String getIndicativeReceiveCurrency() {
        return indicativeReceiveCurrency;
    }


    /**
     * Sets the indicativeReceiveCurrency value for this FeeLookupRequest.
     * 
     * @param indicativeReceiveCurrency
     */
    public void setIndicativeReceiveCurrency(java.lang.String indicativeReceiveCurrency) {
        this.indicativeReceiveCurrency = indicativeReceiveCurrency;
    }


    /**
     * Gets the receiveAgentID value for this FeeLookupRequest.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this FeeLookupRequest.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the receiveCurrency value for this FeeLookupRequest.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this FeeLookupRequest.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the sendCurrency value for this FeeLookupRequest.
     * 
     * @return sendCurrency
     */
    public java.lang.String getSendCurrency() {
        return sendCurrency;
    }


    /**
     * Sets the sendCurrency value for this FeeLookupRequest.
     * 
     * @param sendCurrency
     */
    public void setSendCurrency(java.lang.String sendCurrency) {
        this.sendCurrency = sendCurrency;
    }


    /**
     * Gets the mgCustomerReceiveNumber value for this FeeLookupRequest.
     * 
     * @return mgCustomerReceiveNumber
     */
    public java.lang.String getMgCustomerReceiveNumber() {
        return mgCustomerReceiveNumber;
    }


    /**
     * Sets the mgCustomerReceiveNumber value for this FeeLookupRequest.
     * 
     * @param mgCustomerReceiveNumber
     */
    public void setMgCustomerReceiveNumber(java.lang.String mgCustomerReceiveNumber) {
        this.mgCustomerReceiveNumber = mgCustomerReceiveNumber;
    }


    /**
     * Gets the defaultInformationalFee value for this FeeLookupRequest.
     * 
     * @return defaultInformationalFee
     */
    public java.math.BigDecimal getDefaultInformationalFee() {
        return defaultInformationalFee;
    }


    /**
     * Sets the defaultInformationalFee value for this FeeLookupRequest.
     * 
     * @param defaultInformationalFee
     */
    public void setDefaultInformationalFee(java.math.BigDecimal defaultInformationalFee) {
        this.defaultInformationalFee = defaultInformationalFee;
    }


    /**
     * Gets the serviceOfferingID value for this FeeLookupRequest.
     * 
     * @return serviceOfferingID
     */
    public java.lang.String getServiceOfferingID() {
        return serviceOfferingID;
    }


    /**
     * Sets the serviceOfferingID value for this FeeLookupRequest.
     * 
     * @param serviceOfferingID
     */
    public void setServiceOfferingID(java.lang.String serviceOfferingID) {
        this.serviceOfferingID = serviceOfferingID;
    }


    /**
     * Gets the defaultMaxFee value for this FeeLookupRequest.
     * 
     * @return defaultMaxFee
     */
    public java.lang.Boolean getDefaultMaxFee() {
        return defaultMaxFee;
    }


    /**
     * Sets the defaultMaxFee value for this FeeLookupRequest.
     * 
     * @param defaultMaxFee
     */
    public void setDefaultMaxFee(java.lang.Boolean defaultMaxFee) {
        this.defaultMaxFee = defaultMaxFee;
    }


    /**
     * Gets the allOptions value for this FeeLookupRequest.
     * 
     * @return allOptions
     */
    public boolean isAllOptions() {
        return allOptions;
    }


    /**
     * Sets the allOptions value for this FeeLookupRequest.
     * 
     * @param allOptions
     */
    public void setAllOptions(boolean allOptions) {
        this.allOptions = allOptions;
    }


    /**
     * Gets the promoCodeValues value for this FeeLookupRequest.
     * 
     * @return promoCodeValues
     */
    public java.lang.String[] getPromoCodeValues() {
        return promoCodeValues;
    }


    /**
     * Sets the promoCodeValues value for this FeeLookupRequest.
     * 
     * @param promoCodeValues
     */
    public void setPromoCodeValues(java.lang.String[] promoCodeValues) {
        this.promoCodeValues = promoCodeValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeLookupRequest)) return false;
        FeeLookupRequest other = (FeeLookupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.productVariant==null && other.getProductVariant()==null) || 
             (this.productVariant!=null &&
              this.productVariant.equals(other.getProductVariant()))) &&
            ((this.operatorName==null && other.getOperatorName()==null) || 
             (this.operatorName!=null &&
              this.operatorName.equals(other.getOperatorName()))) &&
            ((this.amountIncludingFee==null && other.getAmountIncludingFee()==null) || 
             (this.amountIncludingFee!=null &&
              this.amountIncludingFee.equals(other.getAmountIncludingFee()))) &&
            ((this.amountExcludingFee==null && other.getAmountExcludingFee()==null) || 
             (this.amountExcludingFee!=null &&
              this.amountExcludingFee.equals(other.getAmountExcludingFee()))) &&
            ((this.receiveAmount==null && other.getReceiveAmount()==null) || 
             (this.receiveAmount!=null &&
              this.receiveAmount.equals(other.getReceiveAmount()))) &&
            ((this.receiveCountry==null && other.getReceiveCountry()==null) || 
             (this.receiveCountry!=null &&
              this.receiveCountry.equals(other.getReceiveCountry()))) &&
            ((this.deliveryOption==null && other.getDeliveryOption()==null) || 
             (this.deliveryOption!=null &&
              this.deliveryOption.equals(other.getDeliveryOption()))) &&
            ((this.mgiRewardsNumber==null && other.getMgiRewardsNumber()==null) || 
             (this.mgiRewardsNumber!=null &&
              this.mgiRewardsNumber.equals(other.getMgiRewardsNumber()))) &&
            ((this.receiveCode==null && other.getReceiveCode()==null) || 
             (this.receiveCode!=null &&
              this.receiveCode.equals(other.getReceiveCode()))) &&
            ((this.indicativeReceiveCurrency==null && other.getIndicativeReceiveCurrency()==null) || 
             (this.indicativeReceiveCurrency!=null &&
              this.indicativeReceiveCurrency.equals(other.getIndicativeReceiveCurrency()))) &&
            ((this.receiveAgentID==null && other.getReceiveAgentID()==null) || 
             (this.receiveAgentID!=null &&
              this.receiveAgentID.equals(other.getReceiveAgentID()))) &&
            ((this.receiveCurrency==null && other.getReceiveCurrency()==null) || 
             (this.receiveCurrency!=null &&
              this.receiveCurrency.equals(other.getReceiveCurrency()))) &&
            ((this.sendCurrency==null && other.getSendCurrency()==null) || 
             (this.sendCurrency!=null &&
              this.sendCurrency.equals(other.getSendCurrency()))) &&
            ((this.mgCustomerReceiveNumber==null && other.getMgCustomerReceiveNumber()==null) || 
             (this.mgCustomerReceiveNumber!=null &&
              this.mgCustomerReceiveNumber.equals(other.getMgCustomerReceiveNumber()))) &&
            ((this.defaultInformationalFee==null && other.getDefaultInformationalFee()==null) || 
             (this.defaultInformationalFee!=null &&
              this.defaultInformationalFee.equals(other.getDefaultInformationalFee()))) &&
            ((this.serviceOfferingID==null && other.getServiceOfferingID()==null) || 
             (this.serviceOfferingID!=null &&
              this.serviceOfferingID.equals(other.getServiceOfferingID()))) &&
            ((this.defaultMaxFee==null && other.getDefaultMaxFee()==null) || 
             (this.defaultMaxFee!=null &&
              this.defaultMaxFee.equals(other.getDefaultMaxFee()))) &&
            this.allOptions == other.isAllOptions() &&
            ((this.promoCodeValues==null && other.getPromoCodeValues()==null) || 
             (this.promoCodeValues!=null &&
              java.util.Arrays.equals(this.promoCodeValues, other.getPromoCodeValues())));
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
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getProductVariant() != null) {
            _hashCode += getProductVariant().hashCode();
        }
        if (getOperatorName() != null) {
            _hashCode += getOperatorName().hashCode();
        }
        if (getAmountIncludingFee() != null) {
            _hashCode += getAmountIncludingFee().hashCode();
        }
        if (getAmountExcludingFee() != null) {
            _hashCode += getAmountExcludingFee().hashCode();
        }
        if (getReceiveAmount() != null) {
            _hashCode += getReceiveAmount().hashCode();
        }
        if (getReceiveCountry() != null) {
            _hashCode += getReceiveCountry().hashCode();
        }
        if (getDeliveryOption() != null) {
            _hashCode += getDeliveryOption().hashCode();
        }
        if (getMgiRewardsNumber() != null) {
            _hashCode += getMgiRewardsNumber().hashCode();
        }
        if (getReceiveCode() != null) {
            _hashCode += getReceiveCode().hashCode();
        }
        if (getIndicativeReceiveCurrency() != null) {
            _hashCode += getIndicativeReceiveCurrency().hashCode();
        }
        if (getReceiveAgentID() != null) {
            _hashCode += getReceiveAgentID().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        if (getSendCurrency() != null) {
            _hashCode += getSendCurrency().hashCode();
        }
        if (getMgCustomerReceiveNumber() != null) {
            _hashCode += getMgCustomerReceiveNumber().hashCode();
        }
        if (getDefaultInformationalFee() != null) {
            _hashCode += getDefaultInformationalFee().hashCode();
        }
        if (getServiceOfferingID() != null) {
            _hashCode += getServiceOfferingID().hashCode();
        }
        if (getDefaultMaxFee() != null) {
            _hashCode += getDefaultMaxFee().hashCode();
        }
        _hashCode += (isAllOptions() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeeLookupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FeeLookupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant"));
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
        elemField.setFieldName("amountIncludingFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "amountIncludingFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountExcludingFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "amountExcludingFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("mgiRewardsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgiRewardsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("indicativeReceiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "indicativeReceiveCurrency"));
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
        elemField.setFieldName("receiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("defaultInformationalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "defaultInformationalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("defaultMaxFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "defaultMaxFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "allOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
