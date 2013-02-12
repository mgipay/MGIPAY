/**
 * FormFreeSendLookupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class FormFreeSendLookupRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String confirmationNumber;

    private java.math.BigDecimal amount;

    private java.math.BigDecimal feeAmount;

    private java.lang.String primaryReceiptLanguage;

    private java.lang.String secondaryReceiptLanguage;

    public FormFreeSendLookupRequest() {
    }

    public FormFreeSendLookupRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String confirmationNumber,
           java.math.BigDecimal amount,
           java.math.BigDecimal feeAmount,
           java.lang.String primaryReceiptLanguage,
           java.lang.String secondaryReceiptLanguage) {
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
        this.confirmationNumber = confirmationNumber;
        this.amount = amount;
        this.feeAmount = feeAmount;
        this.primaryReceiptLanguage = primaryReceiptLanguage;
        this.secondaryReceiptLanguage = secondaryReceiptLanguage;
    }


    /**
     * Gets the confirmationNumber value for this FormFreeSendLookupRequest.
     * 
     * @return confirmationNumber
     */
    public java.lang.String getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this FormFreeSendLookupRequest.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(java.lang.String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }


    /**
     * Gets the amount value for this FormFreeSendLookupRequest.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this FormFreeSendLookupRequest.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the feeAmount value for this FormFreeSendLookupRequest.
     * 
     * @return feeAmount
     */
    public java.math.BigDecimal getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this FormFreeSendLookupRequest.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(java.math.BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the primaryReceiptLanguage value for this FormFreeSendLookupRequest.
     * 
     * @return primaryReceiptLanguage
     */
    public java.lang.String getPrimaryReceiptLanguage() {
        return primaryReceiptLanguage;
    }


    /**
     * Sets the primaryReceiptLanguage value for this FormFreeSendLookupRequest.
     * 
     * @param primaryReceiptLanguage
     */
    public void setPrimaryReceiptLanguage(java.lang.String primaryReceiptLanguage) {
        this.primaryReceiptLanguage = primaryReceiptLanguage;
    }


    /**
     * Gets the secondaryReceiptLanguage value for this FormFreeSendLookupRequest.
     * 
     * @return secondaryReceiptLanguage
     */
    public java.lang.String getSecondaryReceiptLanguage() {
        return secondaryReceiptLanguage;
    }


    /**
     * Sets the secondaryReceiptLanguage value for this FormFreeSendLookupRequest.
     * 
     * @param secondaryReceiptLanguage
     */
    public void setSecondaryReceiptLanguage(java.lang.String secondaryReceiptLanguage) {
        this.secondaryReceiptLanguage = secondaryReceiptLanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormFreeSendLookupRequest)) return false;
        FormFreeSendLookupRequest other = (FormFreeSendLookupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              this.confirmationNumber.equals(other.getConfirmationNumber()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
            ((this.primaryReceiptLanguage==null && other.getPrimaryReceiptLanguage()==null) || 
             (this.primaryReceiptLanguage!=null &&
              this.primaryReceiptLanguage.equals(other.getPrimaryReceiptLanguage()))) &&
            ((this.secondaryReceiptLanguage==null && other.getSecondaryReceiptLanguage()==null) || 
             (this.secondaryReceiptLanguage!=null &&
              this.secondaryReceiptLanguage.equals(other.getSecondaryReceiptLanguage())));
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
        if (getConfirmationNumber() != null) {
            _hashCode += getConfirmationNumber().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getPrimaryReceiptLanguage() != null) {
            _hashCode += getPrimaryReceiptLanguage().hashCode();
        }
        if (getSecondaryReceiptLanguage() != null) {
            _hashCode += getSecondaryReceiptLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormFreeSendLookupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeSendLookupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "confirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
