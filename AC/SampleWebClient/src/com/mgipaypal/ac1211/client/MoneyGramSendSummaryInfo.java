/**
 * MoneyGramSendSummaryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class MoneyGramSendSummaryInfo  implements java.io.Serializable {
    private java.math.BigDecimal faceAmount;

    private java.math.BigDecimal feeAmount;

    private java.math.BigDecimal totalAmount;

    private java.lang.String sendCurrency;

    private java.lang.String agentNumber;

    private java.lang.String agentName;

    public MoneyGramSendSummaryInfo() {
    }

    public MoneyGramSendSummaryInfo(
           java.math.BigDecimal faceAmount,
           java.math.BigDecimal feeAmount,
           java.math.BigDecimal totalAmount,
           java.lang.String sendCurrency,
           java.lang.String agentNumber,
           java.lang.String agentName) {
           this.faceAmount = faceAmount;
           this.feeAmount = feeAmount;
           this.totalAmount = totalAmount;
           this.sendCurrency = sendCurrency;
           this.agentNumber = agentNumber;
           this.agentName = agentName;
    }


    /**
     * Gets the faceAmount value for this MoneyGramSendSummaryInfo.
     * 
     * @return faceAmount
     */
    public java.math.BigDecimal getFaceAmount() {
        return faceAmount;
    }


    /**
     * Sets the faceAmount value for this MoneyGramSendSummaryInfo.
     * 
     * @param faceAmount
     */
    public void setFaceAmount(java.math.BigDecimal faceAmount) {
        this.faceAmount = faceAmount;
    }


    /**
     * Gets the feeAmount value for this MoneyGramSendSummaryInfo.
     * 
     * @return feeAmount
     */
    public java.math.BigDecimal getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this MoneyGramSendSummaryInfo.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(java.math.BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the totalAmount value for this MoneyGramSendSummaryInfo.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this MoneyGramSendSummaryInfo.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the sendCurrency value for this MoneyGramSendSummaryInfo.
     * 
     * @return sendCurrency
     */
    public java.lang.String getSendCurrency() {
        return sendCurrency;
    }


    /**
     * Sets the sendCurrency value for this MoneyGramSendSummaryInfo.
     * 
     * @param sendCurrency
     */
    public void setSendCurrency(java.lang.String sendCurrency) {
        this.sendCurrency = sendCurrency;
    }


    /**
     * Gets the agentNumber value for this MoneyGramSendSummaryInfo.
     * 
     * @return agentNumber
     */
    public java.lang.String getAgentNumber() {
        return agentNumber;
    }


    /**
     * Sets the agentNumber value for this MoneyGramSendSummaryInfo.
     * 
     * @param agentNumber
     */
    public void setAgentNumber(java.lang.String agentNumber) {
        this.agentNumber = agentNumber;
    }


    /**
     * Gets the agentName value for this MoneyGramSendSummaryInfo.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this MoneyGramSendSummaryInfo.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoneyGramSendSummaryInfo)) return false;
        MoneyGramSendSummaryInfo other = (MoneyGramSendSummaryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName())));
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
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoneyGramSendSummaryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramSendSummaryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentName"));
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
