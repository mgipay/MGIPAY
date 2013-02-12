/**
 * BillPaymentCancelRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class BillPaymentCancelRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String referenceNumber;

    private com.mgipaypal.ac1211.client.ProductVariant productVariant;

    private com.mgipaypal.ac1211.client.BillPayCancelReasonType reasonDetailCode;

    private java.math.BigDecimal sendAmount;

    private java.math.BigDecimal feeAmount;

    private java.lang.String sendCurrency;

    public BillPaymentCancelRequest() {
    }

    public BillPaymentCancelRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String referenceNumber,
           com.mgipaypal.ac1211.client.ProductVariant productVariant,
           com.mgipaypal.ac1211.client.BillPayCancelReasonType reasonDetailCode,
           java.math.BigDecimal sendAmount,
           java.math.BigDecimal feeAmount,
           java.lang.String sendCurrency) {
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
        this.referenceNumber = referenceNumber;
        this.productVariant = productVariant;
        this.reasonDetailCode = reasonDetailCode;
        this.sendAmount = sendAmount;
        this.feeAmount = feeAmount;
        this.sendCurrency = sendCurrency;
    }


    /**
     * Gets the referenceNumber value for this BillPaymentCancelRequest.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this BillPaymentCancelRequest.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the productVariant value for this BillPaymentCancelRequest.
     * 
     * @return productVariant
     */
    public com.mgipaypal.ac1211.client.ProductVariant getProductVariant() {
        return productVariant;
    }


    /**
     * Sets the productVariant value for this BillPaymentCancelRequest.
     * 
     * @param productVariant
     */
    public void setProductVariant(com.mgipaypal.ac1211.client.ProductVariant productVariant) {
        this.productVariant = productVariant;
    }


    /**
     * Gets the reasonDetailCode value for this BillPaymentCancelRequest.
     * 
     * @return reasonDetailCode
     */
    public com.mgipaypal.ac1211.client.BillPayCancelReasonType getReasonDetailCode() {
        return reasonDetailCode;
    }


    /**
     * Sets the reasonDetailCode value for this BillPaymentCancelRequest.
     * 
     * @param reasonDetailCode
     */
    public void setReasonDetailCode(com.mgipaypal.ac1211.client.BillPayCancelReasonType reasonDetailCode) {
        this.reasonDetailCode = reasonDetailCode;
    }


    /**
     * Gets the sendAmount value for this BillPaymentCancelRequest.
     * 
     * @return sendAmount
     */
    public java.math.BigDecimal getSendAmount() {
        return sendAmount;
    }


    /**
     * Sets the sendAmount value for this BillPaymentCancelRequest.
     * 
     * @param sendAmount
     */
    public void setSendAmount(java.math.BigDecimal sendAmount) {
        this.sendAmount = sendAmount;
    }


    /**
     * Gets the feeAmount value for this BillPaymentCancelRequest.
     * 
     * @return feeAmount
     */
    public java.math.BigDecimal getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this BillPaymentCancelRequest.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(java.math.BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the sendCurrency value for this BillPaymentCancelRequest.
     * 
     * @return sendCurrency
     */
    public java.lang.String getSendCurrency() {
        return sendCurrency;
    }


    /**
     * Sets the sendCurrency value for this BillPaymentCancelRequest.
     * 
     * @param sendCurrency
     */
    public void setSendCurrency(java.lang.String sendCurrency) {
        this.sendCurrency = sendCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentCancelRequest)) return false;
        BillPaymentCancelRequest other = (BillPaymentCancelRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.productVariant==null && other.getProductVariant()==null) || 
             (this.productVariant!=null &&
              this.productVariant.equals(other.getProductVariant()))) &&
            ((this.reasonDetailCode==null && other.getReasonDetailCode()==null) || 
             (this.reasonDetailCode!=null &&
              this.reasonDetailCode.equals(other.getReasonDetailCode()))) &&
            ((this.sendAmount==null && other.getSendAmount()==null) || 
             (this.sendAmount!=null &&
              this.sendAmount.equals(other.getSendAmount()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
            ((this.sendCurrency==null && other.getSendCurrency()==null) || 
             (this.sendCurrency!=null &&
              this.sendCurrency.equals(other.getSendCurrency())));
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
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getProductVariant() != null) {
            _hashCode += getProductVariant().hashCode();
        }
        if (getReasonDetailCode() != null) {
            _hashCode += getReasonDetailCode().hashCode();
        }
        if (getSendAmount() != null) {
            _hashCode += getSendAmount().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getSendCurrency() != null) {
            _hashCode += getSendCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillPaymentCancelRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentCancelRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonDetailCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "reasonDetailCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billPayCancelReasonType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "feeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
