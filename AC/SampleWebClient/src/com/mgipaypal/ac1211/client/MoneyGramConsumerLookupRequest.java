/**
 * MoneyGramConsumerLookupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class MoneyGramConsumerLookupRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String customerPhone;

    private java.lang.String freqCustCardNumber;

    private java.lang.String agentFrequentCustomerNumber;

    private java.math.BigInteger maxSendersToReturn;

    private java.math.BigInteger maxReceiversToReturn;

    public MoneyGramConsumerLookupRequest() {
    }

    public MoneyGramConsumerLookupRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String customerPhone,
           java.lang.String freqCustCardNumber,
           java.lang.String agentFrequentCustomerNumber,
           java.math.BigInteger maxSendersToReturn,
           java.math.BigInteger maxReceiversToReturn) {
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
        this.customerPhone = customerPhone;
        this.freqCustCardNumber = freqCustCardNumber;
        this.agentFrequentCustomerNumber = agentFrequentCustomerNumber;
        this.maxSendersToReturn = maxSendersToReturn;
        this.maxReceiversToReturn = maxReceiversToReturn;
    }


    /**
     * Gets the customerPhone value for this MoneyGramConsumerLookupRequest.
     * 
     * @return customerPhone
     */
    public java.lang.String getCustomerPhone() {
        return customerPhone;
    }


    /**
     * Sets the customerPhone value for this MoneyGramConsumerLookupRequest.
     * 
     * @param customerPhone
     */
    public void setCustomerPhone(java.lang.String customerPhone) {
        this.customerPhone = customerPhone;
    }


    /**
     * Gets the freqCustCardNumber value for this MoneyGramConsumerLookupRequest.
     * 
     * @return freqCustCardNumber
     */
    public java.lang.String getFreqCustCardNumber() {
        return freqCustCardNumber;
    }


    /**
     * Sets the freqCustCardNumber value for this MoneyGramConsumerLookupRequest.
     * 
     * @param freqCustCardNumber
     */
    public void setFreqCustCardNumber(java.lang.String freqCustCardNumber) {
        this.freqCustCardNumber = freqCustCardNumber;
    }


    /**
     * Gets the agentFrequentCustomerNumber value for this MoneyGramConsumerLookupRequest.
     * 
     * @return agentFrequentCustomerNumber
     */
    public java.lang.String getAgentFrequentCustomerNumber() {
        return agentFrequentCustomerNumber;
    }


    /**
     * Sets the agentFrequentCustomerNumber value for this MoneyGramConsumerLookupRequest.
     * 
     * @param agentFrequentCustomerNumber
     */
    public void setAgentFrequentCustomerNumber(java.lang.String agentFrequentCustomerNumber) {
        this.agentFrequentCustomerNumber = agentFrequentCustomerNumber;
    }


    /**
     * Gets the maxSendersToReturn value for this MoneyGramConsumerLookupRequest.
     * 
     * @return maxSendersToReturn
     */
    public java.math.BigInteger getMaxSendersToReturn() {
        return maxSendersToReturn;
    }


    /**
     * Sets the maxSendersToReturn value for this MoneyGramConsumerLookupRequest.
     * 
     * @param maxSendersToReturn
     */
    public void setMaxSendersToReturn(java.math.BigInteger maxSendersToReturn) {
        this.maxSendersToReturn = maxSendersToReturn;
    }


    /**
     * Gets the maxReceiversToReturn value for this MoneyGramConsumerLookupRequest.
     * 
     * @return maxReceiversToReturn
     */
    public java.math.BigInteger getMaxReceiversToReturn() {
        return maxReceiversToReturn;
    }


    /**
     * Sets the maxReceiversToReturn value for this MoneyGramConsumerLookupRequest.
     * 
     * @param maxReceiversToReturn
     */
    public void setMaxReceiversToReturn(java.math.BigInteger maxReceiversToReturn) {
        this.maxReceiversToReturn = maxReceiversToReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoneyGramConsumerLookupRequest)) return false;
        MoneyGramConsumerLookupRequest other = (MoneyGramConsumerLookupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customerPhone==null && other.getCustomerPhone()==null) || 
             (this.customerPhone!=null &&
              this.customerPhone.equals(other.getCustomerPhone()))) &&
            ((this.freqCustCardNumber==null && other.getFreqCustCardNumber()==null) || 
             (this.freqCustCardNumber!=null &&
              this.freqCustCardNumber.equals(other.getFreqCustCardNumber()))) &&
            ((this.agentFrequentCustomerNumber==null && other.getAgentFrequentCustomerNumber()==null) || 
             (this.agentFrequentCustomerNumber!=null &&
              this.agentFrequentCustomerNumber.equals(other.getAgentFrequentCustomerNumber()))) &&
            ((this.maxSendersToReturn==null && other.getMaxSendersToReturn()==null) || 
             (this.maxSendersToReturn!=null &&
              this.maxSendersToReturn.equals(other.getMaxSendersToReturn()))) &&
            ((this.maxReceiversToReturn==null && other.getMaxReceiversToReturn()==null) || 
             (this.maxReceiversToReturn!=null &&
              this.maxReceiversToReturn.equals(other.getMaxReceiversToReturn())));
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
        if (getCustomerPhone() != null) {
            _hashCode += getCustomerPhone().hashCode();
        }
        if (getFreqCustCardNumber() != null) {
            _hashCode += getFreqCustCardNumber().hashCode();
        }
        if (getAgentFrequentCustomerNumber() != null) {
            _hashCode += getAgentFrequentCustomerNumber().hashCode();
        }
        if (getMaxSendersToReturn() != null) {
            _hashCode += getMaxSendersToReturn().hashCode();
        }
        if (getMaxReceiversToReturn() != null) {
            _hashCode += getMaxReceiversToReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoneyGramConsumerLookupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramConsumerLookupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freqCustCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "freqCustCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentFrequentCustomerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentFrequentCustomerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSendersToReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "maxSendersToReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxReceiversToReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "maxReceiversToReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
