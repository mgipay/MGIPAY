/**
 * ReceiveReversalRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ReceiveReversalRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.math.BigDecimal receiveAmount;

    private java.lang.String referenceNumber;

    private java.lang.String operatorName;

    private java.lang.Boolean communicationRetryIndicator;

    private com.mgipaypal.ac1211.client.ReceiveReversalReasonCode receiveReversalReason;

    public ReceiveReversalRequest() {
    }

    public ReceiveReversalRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.math.BigDecimal receiveAmount,
           java.lang.String referenceNumber,
           java.lang.String operatorName,
           java.lang.Boolean communicationRetryIndicator,
           com.mgipaypal.ac1211.client.ReceiveReversalReasonCode receiveReversalReason) {
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
        this.receiveAmount = receiveAmount;
        this.referenceNumber = referenceNumber;
        this.operatorName = operatorName;
        this.communicationRetryIndicator = communicationRetryIndicator;
        this.receiveReversalReason = receiveReversalReason;
    }


    /**
     * Gets the receiveAmount value for this ReceiveReversalRequest.
     * 
     * @return receiveAmount
     */
    public java.math.BigDecimal getReceiveAmount() {
        return receiveAmount;
    }


    /**
     * Sets the receiveAmount value for this ReceiveReversalRequest.
     * 
     * @param receiveAmount
     */
    public void setReceiveAmount(java.math.BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }


    /**
     * Gets the referenceNumber value for this ReceiveReversalRequest.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this ReceiveReversalRequest.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the operatorName value for this ReceiveReversalRequest.
     * 
     * @return operatorName
     */
    public java.lang.String getOperatorName() {
        return operatorName;
    }


    /**
     * Sets the operatorName value for this ReceiveReversalRequest.
     * 
     * @param operatorName
     */
    public void setOperatorName(java.lang.String operatorName) {
        this.operatorName = operatorName;
    }


    /**
     * Gets the communicationRetryIndicator value for this ReceiveReversalRequest.
     * 
     * @return communicationRetryIndicator
     */
    public java.lang.Boolean getCommunicationRetryIndicator() {
        return communicationRetryIndicator;
    }


    /**
     * Sets the communicationRetryIndicator value for this ReceiveReversalRequest.
     * 
     * @param communicationRetryIndicator
     */
    public void setCommunicationRetryIndicator(java.lang.Boolean communicationRetryIndicator) {
        this.communicationRetryIndicator = communicationRetryIndicator;
    }


    /**
     * Gets the receiveReversalReason value for this ReceiveReversalRequest.
     * 
     * @return receiveReversalReason
     */
    public com.mgipaypal.ac1211.client.ReceiveReversalReasonCode getReceiveReversalReason() {
        return receiveReversalReason;
    }


    /**
     * Sets the receiveReversalReason value for this ReceiveReversalRequest.
     * 
     * @param receiveReversalReason
     */
    public void setReceiveReversalReason(com.mgipaypal.ac1211.client.ReceiveReversalReasonCode receiveReversalReason) {
        this.receiveReversalReason = receiveReversalReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiveReversalRequest)) return false;
        ReceiveReversalRequest other = (ReceiveReversalRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.receiveAmount==null && other.getReceiveAmount()==null) || 
             (this.receiveAmount!=null &&
              this.receiveAmount.equals(other.getReceiveAmount()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.operatorName==null && other.getOperatorName()==null) || 
             (this.operatorName!=null &&
              this.operatorName.equals(other.getOperatorName()))) &&
            ((this.communicationRetryIndicator==null && other.getCommunicationRetryIndicator()==null) || 
             (this.communicationRetryIndicator!=null &&
              this.communicationRetryIndicator.equals(other.getCommunicationRetryIndicator()))) &&
            ((this.receiveReversalReason==null && other.getReceiveReversalReason()==null) || 
             (this.receiveReversalReason!=null &&
              this.receiveReversalReason.equals(other.getReceiveReversalReason())));
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
        if (getReceiveAmount() != null) {
            _hashCode += getReceiveAmount().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getOperatorName() != null) {
            _hashCode += getOperatorName().hashCode();
        }
        if (getCommunicationRetryIndicator() != null) {
            _hashCode += getCommunicationRetryIndicator().hashCode();
        }
        if (getReceiveReversalReason() != null) {
            _hashCode += getReceiveReversalReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceiveReversalRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveReversalRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("communicationRetryIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "communicationRetryIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveReversalReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveReversalReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveReversalReasonCode"));
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
