/**
 * SendReversalRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class SendReversalRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.math.BigDecimal sendAmount;

    private java.math.BigDecimal feeAmount;

    private java.lang.String sendCurrency;

    private java.lang.String referenceNumber;

    private java.lang.String operatorName;

    private com.mgipaypal.ac1211.client.SendReversalType reversalType;

    private com.mgipaypal.ac1211.client.SendReversalReasonCode sendReversalReason;

    private java.lang.String feeRefund;

    private java.lang.String agentCheckType;

    private java.lang.String agentCheckNumber;

    private java.math.BigDecimal agentCheckAmount;

    private java.lang.String customerCheckType;

    private java.lang.String customerCheckNumber;

    private java.math.BigDecimal customerCheckAmount;

    private java.lang.Boolean communicationRetryIndicator;

    public SendReversalRequest() {
    }

    public SendReversalRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.math.BigDecimal sendAmount,
           java.math.BigDecimal feeAmount,
           java.lang.String sendCurrency,
           java.lang.String referenceNumber,
           java.lang.String operatorName,
           com.mgipaypal.ac1211.client.SendReversalType reversalType,
           com.mgipaypal.ac1211.client.SendReversalReasonCode sendReversalReason,
           java.lang.String feeRefund,
           java.lang.String agentCheckType,
           java.lang.String agentCheckNumber,
           java.math.BigDecimal agentCheckAmount,
           java.lang.String customerCheckType,
           java.lang.String customerCheckNumber,
           java.math.BigDecimal customerCheckAmount,
           java.lang.Boolean communicationRetryIndicator) {
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
        this.sendAmount = sendAmount;
        this.feeAmount = feeAmount;
        this.sendCurrency = sendCurrency;
        this.referenceNumber = referenceNumber;
        this.operatorName = operatorName;
        this.reversalType = reversalType;
        this.sendReversalReason = sendReversalReason;
        this.feeRefund = feeRefund;
        this.agentCheckType = agentCheckType;
        this.agentCheckNumber = agentCheckNumber;
        this.agentCheckAmount = agentCheckAmount;
        this.customerCheckType = customerCheckType;
        this.customerCheckNumber = customerCheckNumber;
        this.customerCheckAmount = customerCheckAmount;
        this.communicationRetryIndicator = communicationRetryIndicator;
    }


    /**
     * Gets the sendAmount value for this SendReversalRequest.
     * 
     * @return sendAmount
     */
    public java.math.BigDecimal getSendAmount() {
        return sendAmount;
    }


    /**
     * Sets the sendAmount value for this SendReversalRequest.
     * 
     * @param sendAmount
     */
    public void setSendAmount(java.math.BigDecimal sendAmount) {
        this.sendAmount = sendAmount;
    }


    /**
     * Gets the feeAmount value for this SendReversalRequest.
     * 
     * @return feeAmount
     */
    public java.math.BigDecimal getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this SendReversalRequest.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(java.math.BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the sendCurrency value for this SendReversalRequest.
     * 
     * @return sendCurrency
     */
    public java.lang.String getSendCurrency() {
        return sendCurrency;
    }


    /**
     * Sets the sendCurrency value for this SendReversalRequest.
     * 
     * @param sendCurrency
     */
    public void setSendCurrency(java.lang.String sendCurrency) {
        this.sendCurrency = sendCurrency;
    }


    /**
     * Gets the referenceNumber value for this SendReversalRequest.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this SendReversalRequest.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the operatorName value for this SendReversalRequest.
     * 
     * @return operatorName
     */
    public java.lang.String getOperatorName() {
        return operatorName;
    }


    /**
     * Sets the operatorName value for this SendReversalRequest.
     * 
     * @param operatorName
     */
    public void setOperatorName(java.lang.String operatorName) {
        this.operatorName = operatorName;
    }


    /**
     * Gets the reversalType value for this SendReversalRequest.
     * 
     * @return reversalType
     */
    public com.mgipaypal.ac1211.client.SendReversalType getReversalType() {
        return reversalType;
    }


    /**
     * Sets the reversalType value for this SendReversalRequest.
     * 
     * @param reversalType
     */
    public void setReversalType(com.mgipaypal.ac1211.client.SendReversalType reversalType) {
        this.reversalType = reversalType;
    }


    /**
     * Gets the sendReversalReason value for this SendReversalRequest.
     * 
     * @return sendReversalReason
     */
    public com.mgipaypal.ac1211.client.SendReversalReasonCode getSendReversalReason() {
        return sendReversalReason;
    }


    /**
     * Sets the sendReversalReason value for this SendReversalRequest.
     * 
     * @param sendReversalReason
     */
    public void setSendReversalReason(com.mgipaypal.ac1211.client.SendReversalReasonCode sendReversalReason) {
        this.sendReversalReason = sendReversalReason;
    }


    /**
     * Gets the feeRefund value for this SendReversalRequest.
     * 
     * @return feeRefund
     */
    public java.lang.String getFeeRefund() {
        return feeRefund;
    }


    /**
     * Sets the feeRefund value for this SendReversalRequest.
     * 
     * @param feeRefund
     */
    public void setFeeRefund(java.lang.String feeRefund) {
        this.feeRefund = feeRefund;
    }


    /**
     * Gets the agentCheckType value for this SendReversalRequest.
     * 
     * @return agentCheckType
     */
    public java.lang.String getAgentCheckType() {
        return agentCheckType;
    }


    /**
     * Sets the agentCheckType value for this SendReversalRequest.
     * 
     * @param agentCheckType
     */
    public void setAgentCheckType(java.lang.String agentCheckType) {
        this.agentCheckType = agentCheckType;
    }


    /**
     * Gets the agentCheckNumber value for this SendReversalRequest.
     * 
     * @return agentCheckNumber
     */
    public java.lang.String getAgentCheckNumber() {
        return agentCheckNumber;
    }


    /**
     * Sets the agentCheckNumber value for this SendReversalRequest.
     * 
     * @param agentCheckNumber
     */
    public void setAgentCheckNumber(java.lang.String agentCheckNumber) {
        this.agentCheckNumber = agentCheckNumber;
    }


    /**
     * Gets the agentCheckAmount value for this SendReversalRequest.
     * 
     * @return agentCheckAmount
     */
    public java.math.BigDecimal getAgentCheckAmount() {
        return agentCheckAmount;
    }


    /**
     * Sets the agentCheckAmount value for this SendReversalRequest.
     * 
     * @param agentCheckAmount
     */
    public void setAgentCheckAmount(java.math.BigDecimal agentCheckAmount) {
        this.agentCheckAmount = agentCheckAmount;
    }


    /**
     * Gets the customerCheckType value for this SendReversalRequest.
     * 
     * @return customerCheckType
     */
    public java.lang.String getCustomerCheckType() {
        return customerCheckType;
    }


    /**
     * Sets the customerCheckType value for this SendReversalRequest.
     * 
     * @param customerCheckType
     */
    public void setCustomerCheckType(java.lang.String customerCheckType) {
        this.customerCheckType = customerCheckType;
    }


    /**
     * Gets the customerCheckNumber value for this SendReversalRequest.
     * 
     * @return customerCheckNumber
     */
    public java.lang.String getCustomerCheckNumber() {
        return customerCheckNumber;
    }


    /**
     * Sets the customerCheckNumber value for this SendReversalRequest.
     * 
     * @param customerCheckNumber
     */
    public void setCustomerCheckNumber(java.lang.String customerCheckNumber) {
        this.customerCheckNumber = customerCheckNumber;
    }


    /**
     * Gets the customerCheckAmount value for this SendReversalRequest.
     * 
     * @return customerCheckAmount
     */
    public java.math.BigDecimal getCustomerCheckAmount() {
        return customerCheckAmount;
    }


    /**
     * Sets the customerCheckAmount value for this SendReversalRequest.
     * 
     * @param customerCheckAmount
     */
    public void setCustomerCheckAmount(java.math.BigDecimal customerCheckAmount) {
        this.customerCheckAmount = customerCheckAmount;
    }


    /**
     * Gets the communicationRetryIndicator value for this SendReversalRequest.
     * 
     * @return communicationRetryIndicator
     */
    public java.lang.Boolean getCommunicationRetryIndicator() {
        return communicationRetryIndicator;
    }


    /**
     * Sets the communicationRetryIndicator value for this SendReversalRequest.
     * 
     * @param communicationRetryIndicator
     */
    public void setCommunicationRetryIndicator(java.lang.Boolean communicationRetryIndicator) {
        this.communicationRetryIndicator = communicationRetryIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendReversalRequest)) return false;
        SendReversalRequest other = (SendReversalRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sendAmount==null && other.getSendAmount()==null) || 
             (this.sendAmount!=null &&
              this.sendAmount.equals(other.getSendAmount()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
            ((this.sendCurrency==null && other.getSendCurrency()==null) || 
             (this.sendCurrency!=null &&
              this.sendCurrency.equals(other.getSendCurrency()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.operatorName==null && other.getOperatorName()==null) || 
             (this.operatorName!=null &&
              this.operatorName.equals(other.getOperatorName()))) &&
            ((this.reversalType==null && other.getReversalType()==null) || 
             (this.reversalType!=null &&
              this.reversalType.equals(other.getReversalType()))) &&
            ((this.sendReversalReason==null && other.getSendReversalReason()==null) || 
             (this.sendReversalReason!=null &&
              this.sendReversalReason.equals(other.getSendReversalReason()))) &&
            ((this.feeRefund==null && other.getFeeRefund()==null) || 
             (this.feeRefund!=null &&
              this.feeRefund.equals(other.getFeeRefund()))) &&
            ((this.agentCheckType==null && other.getAgentCheckType()==null) || 
             (this.agentCheckType!=null &&
              this.agentCheckType.equals(other.getAgentCheckType()))) &&
            ((this.agentCheckNumber==null && other.getAgentCheckNumber()==null) || 
             (this.agentCheckNumber!=null &&
              this.agentCheckNumber.equals(other.getAgentCheckNumber()))) &&
            ((this.agentCheckAmount==null && other.getAgentCheckAmount()==null) || 
             (this.agentCheckAmount!=null &&
              this.agentCheckAmount.equals(other.getAgentCheckAmount()))) &&
            ((this.customerCheckType==null && other.getCustomerCheckType()==null) || 
             (this.customerCheckType!=null &&
              this.customerCheckType.equals(other.getCustomerCheckType()))) &&
            ((this.customerCheckNumber==null && other.getCustomerCheckNumber()==null) || 
             (this.customerCheckNumber!=null &&
              this.customerCheckNumber.equals(other.getCustomerCheckNumber()))) &&
            ((this.customerCheckAmount==null && other.getCustomerCheckAmount()==null) || 
             (this.customerCheckAmount!=null &&
              this.customerCheckAmount.equals(other.getCustomerCheckAmount()))) &&
            ((this.communicationRetryIndicator==null && other.getCommunicationRetryIndicator()==null) || 
             (this.communicationRetryIndicator!=null &&
              this.communicationRetryIndicator.equals(other.getCommunicationRetryIndicator())));
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
        if (getSendAmount() != null) {
            _hashCode += getSendAmount().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getSendCurrency() != null) {
            _hashCode += getSendCurrency().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getOperatorName() != null) {
            _hashCode += getOperatorName().hashCode();
        }
        if (getReversalType() != null) {
            _hashCode += getReversalType().hashCode();
        }
        if (getSendReversalReason() != null) {
            _hashCode += getSendReversalReason().hashCode();
        }
        if (getFeeRefund() != null) {
            _hashCode += getFeeRefund().hashCode();
        }
        if (getAgentCheckType() != null) {
            _hashCode += getAgentCheckType().hashCode();
        }
        if (getAgentCheckNumber() != null) {
            _hashCode += getAgentCheckNumber().hashCode();
        }
        if (getAgentCheckAmount() != null) {
            _hashCode += getAgentCheckAmount().hashCode();
        }
        if (getCustomerCheckType() != null) {
            _hashCode += getCustomerCheckType().hashCode();
        }
        if (getCustomerCheckNumber() != null) {
            _hashCode += getCustomerCheckNumber().hashCode();
        }
        if (getCustomerCheckAmount() != null) {
            _hashCode += getCustomerCheckAmount().hashCode();
        }
        if (getCommunicationRetryIndicator() != null) {
            _hashCode += getCommunicationRetryIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendReversalRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendReversalRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("reversalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "reversalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendReversalType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendReversalReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendReversalReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendReversalReasonCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeRefund");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "feeRefund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCheckType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentCheckType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCheckNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentCheckNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCheckAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentCheckAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCheckType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerCheckType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCheckNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerCheckNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCheckAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerCheckAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationRetryIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "communicationRetryIndicator"));
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
