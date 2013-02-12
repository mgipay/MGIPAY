/**
 * SendReversalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class SendReversalResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.util.Calendar transactionDateTime;

    private java.math.BigDecimal refundTotalAmount;

    private java.math.BigDecimal refundFaceAmount;

    private java.math.BigDecimal refundFeeAmount;

    private java.math.BigDecimal totalCheckAmount;

    private com.mgipaypal.ac1211.client.SendReversalType reversalType;

    private java.lang.String agentCheckAuthorizationNumber;

    public SendReversalResponse() {
    }

    public SendReversalResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.util.Calendar transactionDateTime,
           java.math.BigDecimal refundTotalAmount,
           java.math.BigDecimal refundFaceAmount,
           java.math.BigDecimal refundFeeAmount,
           java.math.BigDecimal totalCheckAmount,
           com.mgipaypal.ac1211.client.SendReversalType reversalType,
           java.lang.String agentCheckAuthorizationNumber) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.transactionDateTime = transactionDateTime;
        this.refundTotalAmount = refundTotalAmount;
        this.refundFaceAmount = refundFaceAmount;
        this.refundFeeAmount = refundFeeAmount;
        this.totalCheckAmount = totalCheckAmount;
        this.reversalType = reversalType;
        this.agentCheckAuthorizationNumber = agentCheckAuthorizationNumber;
    }


    /**
     * Gets the transactionDateTime value for this SendReversalResponse.
     * 
     * @return transactionDateTime
     */
    public java.util.Calendar getTransactionDateTime() {
        return transactionDateTime;
    }


    /**
     * Sets the transactionDateTime value for this SendReversalResponse.
     * 
     * @param transactionDateTime
     */
    public void setTransactionDateTime(java.util.Calendar transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }


    /**
     * Gets the refundTotalAmount value for this SendReversalResponse.
     * 
     * @return refundTotalAmount
     */
    public java.math.BigDecimal getRefundTotalAmount() {
        return refundTotalAmount;
    }


    /**
     * Sets the refundTotalAmount value for this SendReversalResponse.
     * 
     * @param refundTotalAmount
     */
    public void setRefundTotalAmount(java.math.BigDecimal refundTotalAmount) {
        this.refundTotalAmount = refundTotalAmount;
    }


    /**
     * Gets the refundFaceAmount value for this SendReversalResponse.
     * 
     * @return refundFaceAmount
     */
    public java.math.BigDecimal getRefundFaceAmount() {
        return refundFaceAmount;
    }


    /**
     * Sets the refundFaceAmount value for this SendReversalResponse.
     * 
     * @param refundFaceAmount
     */
    public void setRefundFaceAmount(java.math.BigDecimal refundFaceAmount) {
        this.refundFaceAmount = refundFaceAmount;
    }


    /**
     * Gets the refundFeeAmount value for this SendReversalResponse.
     * 
     * @return refundFeeAmount
     */
    public java.math.BigDecimal getRefundFeeAmount() {
        return refundFeeAmount;
    }


    /**
     * Sets the refundFeeAmount value for this SendReversalResponse.
     * 
     * @param refundFeeAmount
     */
    public void setRefundFeeAmount(java.math.BigDecimal refundFeeAmount) {
        this.refundFeeAmount = refundFeeAmount;
    }


    /**
     * Gets the totalCheckAmount value for this SendReversalResponse.
     * 
     * @return totalCheckAmount
     */
    public java.math.BigDecimal getTotalCheckAmount() {
        return totalCheckAmount;
    }


    /**
     * Sets the totalCheckAmount value for this SendReversalResponse.
     * 
     * @param totalCheckAmount
     */
    public void setTotalCheckAmount(java.math.BigDecimal totalCheckAmount) {
        this.totalCheckAmount = totalCheckAmount;
    }


    /**
     * Gets the reversalType value for this SendReversalResponse.
     * 
     * @return reversalType
     */
    public com.mgipaypal.ac1211.client.SendReversalType getReversalType() {
        return reversalType;
    }


    /**
     * Sets the reversalType value for this SendReversalResponse.
     * 
     * @param reversalType
     */
    public void setReversalType(com.mgipaypal.ac1211.client.SendReversalType reversalType) {
        this.reversalType = reversalType;
    }


    /**
     * Gets the agentCheckAuthorizationNumber value for this SendReversalResponse.
     * 
     * @return agentCheckAuthorizationNumber
     */
    public java.lang.String getAgentCheckAuthorizationNumber() {
        return agentCheckAuthorizationNumber;
    }


    /**
     * Sets the agentCheckAuthorizationNumber value for this SendReversalResponse.
     * 
     * @param agentCheckAuthorizationNumber
     */
    public void setAgentCheckAuthorizationNumber(java.lang.String agentCheckAuthorizationNumber) {
        this.agentCheckAuthorizationNumber = agentCheckAuthorizationNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendReversalResponse)) return false;
        SendReversalResponse other = (SendReversalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transactionDateTime==null && other.getTransactionDateTime()==null) || 
             (this.transactionDateTime!=null &&
              this.transactionDateTime.equals(other.getTransactionDateTime()))) &&
            ((this.refundTotalAmount==null && other.getRefundTotalAmount()==null) || 
             (this.refundTotalAmount!=null &&
              this.refundTotalAmount.equals(other.getRefundTotalAmount()))) &&
            ((this.refundFaceAmount==null && other.getRefundFaceAmount()==null) || 
             (this.refundFaceAmount!=null &&
              this.refundFaceAmount.equals(other.getRefundFaceAmount()))) &&
            ((this.refundFeeAmount==null && other.getRefundFeeAmount()==null) || 
             (this.refundFeeAmount!=null &&
              this.refundFeeAmount.equals(other.getRefundFeeAmount()))) &&
            ((this.totalCheckAmount==null && other.getTotalCheckAmount()==null) || 
             (this.totalCheckAmount!=null &&
              this.totalCheckAmount.equals(other.getTotalCheckAmount()))) &&
            ((this.reversalType==null && other.getReversalType()==null) || 
             (this.reversalType!=null &&
              this.reversalType.equals(other.getReversalType()))) &&
            ((this.agentCheckAuthorizationNumber==null && other.getAgentCheckAuthorizationNumber()==null) || 
             (this.agentCheckAuthorizationNumber!=null &&
              this.agentCheckAuthorizationNumber.equals(other.getAgentCheckAuthorizationNumber())));
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
        if (getTransactionDateTime() != null) {
            _hashCode += getTransactionDateTime().hashCode();
        }
        if (getRefundTotalAmount() != null) {
            _hashCode += getRefundTotalAmount().hashCode();
        }
        if (getRefundFaceAmount() != null) {
            _hashCode += getRefundFaceAmount().hashCode();
        }
        if (getRefundFeeAmount() != null) {
            _hashCode += getRefundFeeAmount().hashCode();
        }
        if (getTotalCheckAmount() != null) {
            _hashCode += getTotalCheckAmount().hashCode();
        }
        if (getReversalType() != null) {
            _hashCode += getReversalType().hashCode();
        }
        if (getAgentCheckAuthorizationNumber() != null) {
            _hashCode += getAgentCheckAuthorizationNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendReversalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendReversalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "transactionDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "refundTotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundFaceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "refundFaceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundFeeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "refundFeeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCheckAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "totalCheckAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "reversalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendReversalType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCheckAuthorizationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentCheckAuthorizationNumber"));
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
