/**
 * RedirectInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class RedirectInfo  implements java.io.Serializable {
    private java.math.BigDecimal originalSendAmount;

    private java.lang.String originalSendCurrency;

    private java.math.BigDecimal originalSendFee;

    private java.math.BigDecimal originalExchangeRate;

    private java.math.BigDecimal originalReceiveAmount;

    private java.lang.String originalReceiveCurrency;

    private java.lang.String originalReceiveCountry;

    private java.math.BigDecimal newSendFee;

    private java.math.BigDecimal newExchangeRate;

    private java.math.BigDecimal newReceiveAmount;

    private java.lang.String newReceiveCurrency;

    private java.math.BigDecimal feeDifference;

    private com.mgipaypal.ac1211.client.RedirectInfoRedirectType redirectType;

    public RedirectInfo() {
    }

    public RedirectInfo(
           java.math.BigDecimal originalSendAmount,
           java.lang.String originalSendCurrency,
           java.math.BigDecimal originalSendFee,
           java.math.BigDecimal originalExchangeRate,
           java.math.BigDecimal originalReceiveAmount,
           java.lang.String originalReceiveCurrency,
           java.lang.String originalReceiveCountry,
           java.math.BigDecimal newSendFee,
           java.math.BigDecimal newExchangeRate,
           java.math.BigDecimal newReceiveAmount,
           java.lang.String newReceiveCurrency,
           java.math.BigDecimal feeDifference,
           com.mgipaypal.ac1211.client.RedirectInfoRedirectType redirectType) {
           this.originalSendAmount = originalSendAmount;
           this.originalSendCurrency = originalSendCurrency;
           this.originalSendFee = originalSendFee;
           this.originalExchangeRate = originalExchangeRate;
           this.originalReceiveAmount = originalReceiveAmount;
           this.originalReceiveCurrency = originalReceiveCurrency;
           this.originalReceiveCountry = originalReceiveCountry;
           this.newSendFee = newSendFee;
           this.newExchangeRate = newExchangeRate;
           this.newReceiveAmount = newReceiveAmount;
           this.newReceiveCurrency = newReceiveCurrency;
           this.feeDifference = feeDifference;
           this.redirectType = redirectType;
    }


    /**
     * Gets the originalSendAmount value for this RedirectInfo.
     * 
     * @return originalSendAmount
     */
    public java.math.BigDecimal getOriginalSendAmount() {
        return originalSendAmount;
    }


    /**
     * Sets the originalSendAmount value for this RedirectInfo.
     * 
     * @param originalSendAmount
     */
    public void setOriginalSendAmount(java.math.BigDecimal originalSendAmount) {
        this.originalSendAmount = originalSendAmount;
    }


    /**
     * Gets the originalSendCurrency value for this RedirectInfo.
     * 
     * @return originalSendCurrency
     */
    public java.lang.String getOriginalSendCurrency() {
        return originalSendCurrency;
    }


    /**
     * Sets the originalSendCurrency value for this RedirectInfo.
     * 
     * @param originalSendCurrency
     */
    public void setOriginalSendCurrency(java.lang.String originalSendCurrency) {
        this.originalSendCurrency = originalSendCurrency;
    }


    /**
     * Gets the originalSendFee value for this RedirectInfo.
     * 
     * @return originalSendFee
     */
    public java.math.BigDecimal getOriginalSendFee() {
        return originalSendFee;
    }


    /**
     * Sets the originalSendFee value for this RedirectInfo.
     * 
     * @param originalSendFee
     */
    public void setOriginalSendFee(java.math.BigDecimal originalSendFee) {
        this.originalSendFee = originalSendFee;
    }


    /**
     * Gets the originalExchangeRate value for this RedirectInfo.
     * 
     * @return originalExchangeRate
     */
    public java.math.BigDecimal getOriginalExchangeRate() {
        return originalExchangeRate;
    }


    /**
     * Sets the originalExchangeRate value for this RedirectInfo.
     * 
     * @param originalExchangeRate
     */
    public void setOriginalExchangeRate(java.math.BigDecimal originalExchangeRate) {
        this.originalExchangeRate = originalExchangeRate;
    }


    /**
     * Gets the originalReceiveAmount value for this RedirectInfo.
     * 
     * @return originalReceiveAmount
     */
    public java.math.BigDecimal getOriginalReceiveAmount() {
        return originalReceiveAmount;
    }


    /**
     * Sets the originalReceiveAmount value for this RedirectInfo.
     * 
     * @param originalReceiveAmount
     */
    public void setOriginalReceiveAmount(java.math.BigDecimal originalReceiveAmount) {
        this.originalReceiveAmount = originalReceiveAmount;
    }


    /**
     * Gets the originalReceiveCurrency value for this RedirectInfo.
     * 
     * @return originalReceiveCurrency
     */
    public java.lang.String getOriginalReceiveCurrency() {
        return originalReceiveCurrency;
    }


    /**
     * Sets the originalReceiveCurrency value for this RedirectInfo.
     * 
     * @param originalReceiveCurrency
     */
    public void setOriginalReceiveCurrency(java.lang.String originalReceiveCurrency) {
        this.originalReceiveCurrency = originalReceiveCurrency;
    }


    /**
     * Gets the originalReceiveCountry value for this RedirectInfo.
     * 
     * @return originalReceiveCountry
     */
    public java.lang.String getOriginalReceiveCountry() {
        return originalReceiveCountry;
    }


    /**
     * Sets the originalReceiveCountry value for this RedirectInfo.
     * 
     * @param originalReceiveCountry
     */
    public void setOriginalReceiveCountry(java.lang.String originalReceiveCountry) {
        this.originalReceiveCountry = originalReceiveCountry;
    }


    /**
     * Gets the newSendFee value for this RedirectInfo.
     * 
     * @return newSendFee
     */
    public java.math.BigDecimal getNewSendFee() {
        return newSendFee;
    }


    /**
     * Sets the newSendFee value for this RedirectInfo.
     * 
     * @param newSendFee
     */
    public void setNewSendFee(java.math.BigDecimal newSendFee) {
        this.newSendFee = newSendFee;
    }


    /**
     * Gets the newExchangeRate value for this RedirectInfo.
     * 
     * @return newExchangeRate
     */
    public java.math.BigDecimal getNewExchangeRate() {
        return newExchangeRate;
    }


    /**
     * Sets the newExchangeRate value for this RedirectInfo.
     * 
     * @param newExchangeRate
     */
    public void setNewExchangeRate(java.math.BigDecimal newExchangeRate) {
        this.newExchangeRate = newExchangeRate;
    }


    /**
     * Gets the newReceiveAmount value for this RedirectInfo.
     * 
     * @return newReceiveAmount
     */
    public java.math.BigDecimal getNewReceiveAmount() {
        return newReceiveAmount;
    }


    /**
     * Sets the newReceiveAmount value for this RedirectInfo.
     * 
     * @param newReceiveAmount
     */
    public void setNewReceiveAmount(java.math.BigDecimal newReceiveAmount) {
        this.newReceiveAmount = newReceiveAmount;
    }


    /**
     * Gets the newReceiveCurrency value for this RedirectInfo.
     * 
     * @return newReceiveCurrency
     */
    public java.lang.String getNewReceiveCurrency() {
        return newReceiveCurrency;
    }


    /**
     * Sets the newReceiveCurrency value for this RedirectInfo.
     * 
     * @param newReceiveCurrency
     */
    public void setNewReceiveCurrency(java.lang.String newReceiveCurrency) {
        this.newReceiveCurrency = newReceiveCurrency;
    }


    /**
     * Gets the feeDifference value for this RedirectInfo.
     * 
     * @return feeDifference
     */
    public java.math.BigDecimal getFeeDifference() {
        return feeDifference;
    }


    /**
     * Sets the feeDifference value for this RedirectInfo.
     * 
     * @param feeDifference
     */
    public void setFeeDifference(java.math.BigDecimal feeDifference) {
        this.feeDifference = feeDifference;
    }


    /**
     * Gets the redirectType value for this RedirectInfo.
     * 
     * @return redirectType
     */
    public com.mgipaypal.ac1211.client.RedirectInfoRedirectType getRedirectType() {
        return redirectType;
    }


    /**
     * Sets the redirectType value for this RedirectInfo.
     * 
     * @param redirectType
     */
    public void setRedirectType(com.mgipaypal.ac1211.client.RedirectInfoRedirectType redirectType) {
        this.redirectType = redirectType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RedirectInfo)) return false;
        RedirectInfo other = (RedirectInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
            ((this.originalReceiveAmount==null && other.getOriginalReceiveAmount()==null) || 
             (this.originalReceiveAmount!=null &&
              this.originalReceiveAmount.equals(other.getOriginalReceiveAmount()))) &&
            ((this.originalReceiveCurrency==null && other.getOriginalReceiveCurrency()==null) || 
             (this.originalReceiveCurrency!=null &&
              this.originalReceiveCurrency.equals(other.getOriginalReceiveCurrency()))) &&
            ((this.originalReceiveCountry==null && other.getOriginalReceiveCountry()==null) || 
             (this.originalReceiveCountry!=null &&
              this.originalReceiveCountry.equals(other.getOriginalReceiveCountry()))) &&
            ((this.newSendFee==null && other.getNewSendFee()==null) || 
             (this.newSendFee!=null &&
              this.newSendFee.equals(other.getNewSendFee()))) &&
            ((this.newExchangeRate==null && other.getNewExchangeRate()==null) || 
             (this.newExchangeRate!=null &&
              this.newExchangeRate.equals(other.getNewExchangeRate()))) &&
            ((this.newReceiveAmount==null && other.getNewReceiveAmount()==null) || 
             (this.newReceiveAmount!=null &&
              this.newReceiveAmount.equals(other.getNewReceiveAmount()))) &&
            ((this.newReceiveCurrency==null && other.getNewReceiveCurrency()==null) || 
             (this.newReceiveCurrency!=null &&
              this.newReceiveCurrency.equals(other.getNewReceiveCurrency()))) &&
            ((this.feeDifference==null && other.getFeeDifference()==null) || 
             (this.feeDifference!=null &&
              this.feeDifference.equals(other.getFeeDifference()))) &&
            ((this.redirectType==null && other.getRedirectType()==null) || 
             (this.redirectType!=null &&
              this.redirectType.equals(other.getRedirectType())));
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
        if (getOriginalReceiveAmount() != null) {
            _hashCode += getOriginalReceiveAmount().hashCode();
        }
        if (getOriginalReceiveCurrency() != null) {
            _hashCode += getOriginalReceiveCurrency().hashCode();
        }
        if (getOriginalReceiveCountry() != null) {
            _hashCode += getOriginalReceiveCountry().hashCode();
        }
        if (getNewSendFee() != null) {
            _hashCode += getNewSendFee().hashCode();
        }
        if (getNewExchangeRate() != null) {
            _hashCode += getNewExchangeRate().hashCode();
        }
        if (getNewReceiveAmount() != null) {
            _hashCode += getNewReceiveAmount().hashCode();
        }
        if (getNewReceiveCurrency() != null) {
            _hashCode += getNewReceiveCurrency().hashCode();
        }
        if (getFeeDifference() != null) {
            _hashCode += getFeeDifference().hashCode();
        }
        if (getRedirectType() != null) {
            _hashCode += getRedirectType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RedirectInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RedirectInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("originalReceiveAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "originalReceiveAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalReceiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "originalReceiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalReceiveCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "originalReceiveCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSendFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "newSendFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "newExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newReceiveAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "newReceiveAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newReceiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "newReceiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeDifference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "feeDifference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "redirectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RedirectInfoRedirectType"));
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
