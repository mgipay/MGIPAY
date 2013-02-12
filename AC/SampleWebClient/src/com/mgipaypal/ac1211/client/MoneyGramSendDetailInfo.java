/**
 * MoneyGramSendDetailInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class MoneyGramSendDetailInfo  implements java.io.Serializable {
    private java.lang.String referenceNumber;

    private java.math.BigDecimal faceAmount;

    private java.math.BigDecimal feeAmount;

    private java.math.BigDecimal totalAmount;

    private java.lang.String sendCurrency;

    private java.lang.String agentNumber;

    private com.mgipaypal.ac1211.client.PaymentType paymentType;

    private java.lang.String agentName;

    private java.util.Calendar time;

    public MoneyGramSendDetailInfo() {
    }

    public MoneyGramSendDetailInfo(
           java.lang.String referenceNumber,
           java.math.BigDecimal faceAmount,
           java.math.BigDecimal feeAmount,
           java.math.BigDecimal totalAmount,
           java.lang.String sendCurrency,
           java.lang.String agentNumber,
           com.mgipaypal.ac1211.client.PaymentType paymentType,
           java.lang.String agentName,
           java.util.Calendar time) {
           this.referenceNumber = referenceNumber;
           this.faceAmount = faceAmount;
           this.feeAmount = feeAmount;
           this.totalAmount = totalAmount;
           this.sendCurrency = sendCurrency;
           this.agentNumber = agentNumber;
           this.paymentType = paymentType;
           this.agentName = agentName;
           this.time = time;
    }


    /**
     * Gets the referenceNumber value for this MoneyGramSendDetailInfo.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this MoneyGramSendDetailInfo.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the faceAmount value for this MoneyGramSendDetailInfo.
     * 
     * @return faceAmount
     */
    public java.math.BigDecimal getFaceAmount() {
        return faceAmount;
    }


    /**
     * Sets the faceAmount value for this MoneyGramSendDetailInfo.
     * 
     * @param faceAmount
     */
    public void setFaceAmount(java.math.BigDecimal faceAmount) {
        this.faceAmount = faceAmount;
    }


    /**
     * Gets the feeAmount value for this MoneyGramSendDetailInfo.
     * 
     * @return feeAmount
     */
    public java.math.BigDecimal getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this MoneyGramSendDetailInfo.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(java.math.BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the totalAmount value for this MoneyGramSendDetailInfo.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this MoneyGramSendDetailInfo.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the sendCurrency value for this MoneyGramSendDetailInfo.
     * 
     * @return sendCurrency
     */
    public java.lang.String getSendCurrency() {
        return sendCurrency;
    }


    /**
     * Sets the sendCurrency value for this MoneyGramSendDetailInfo.
     * 
     * @param sendCurrency
     */
    public void setSendCurrency(java.lang.String sendCurrency) {
        this.sendCurrency = sendCurrency;
    }


    /**
     * Gets the agentNumber value for this MoneyGramSendDetailInfo.
     * 
     * @return agentNumber
     */
    public java.lang.String getAgentNumber() {
        return agentNumber;
    }


    /**
     * Sets the agentNumber value for this MoneyGramSendDetailInfo.
     * 
     * @param agentNumber
     */
    public void setAgentNumber(java.lang.String agentNumber) {
        this.agentNumber = agentNumber;
    }


    /**
     * Gets the paymentType value for this MoneyGramSendDetailInfo.
     * 
     * @return paymentType
     */
    public com.mgipaypal.ac1211.client.PaymentType getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this MoneyGramSendDetailInfo.
     * 
     * @param paymentType
     */
    public void setPaymentType(com.mgipaypal.ac1211.client.PaymentType paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the agentName value for this MoneyGramSendDetailInfo.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this MoneyGramSendDetailInfo.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }


    /**
     * Gets the time value for this MoneyGramSendDetailInfo.
     * 
     * @return time
     */
    public java.util.Calendar getTime() {
        return time;
    }


    /**
     * Sets the time value for this MoneyGramSendDetailInfo.
     * 
     * @param time
     */
    public void setTime(java.util.Calendar time) {
        this.time = time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoneyGramSendDetailInfo)) return false;
        MoneyGramSendDetailInfo other = (MoneyGramSendDetailInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.faceAmount==null && other.getFaceAmount()==null) || 
             (this.faceAmount!=null &&
              this.faceAmount.equals(other.getFaceAmount()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.sendCurrency==null && other.getSendCurrency()==null) || 
             (this.sendCurrency!=null &&
              this.sendCurrency.equals(other.getSendCurrency()))) &&
            ((this.agentNumber==null && other.getAgentNumber()==null) || 
             (this.agentNumber!=null &&
              this.agentNumber.equals(other.getAgentNumber()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime())));
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
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getFaceAmount() != null) {
            _hashCode += getFaceAmount().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getSendCurrency() != null) {
            _hashCode += getSendCurrency().hashCode();
        }
        if (getAgentNumber() != null) {
            _hashCode += getAgentNumber().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoneyGramSendDetailInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramSendDetailInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "faceAmount"));
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
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "paymentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
