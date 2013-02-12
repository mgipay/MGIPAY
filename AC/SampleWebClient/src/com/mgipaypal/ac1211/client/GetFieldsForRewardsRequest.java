/**
 * GetFieldsForRewardsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class GetFieldsForRewardsRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String cardTypeCode;

    private java.lang.String programType;

    private com.mgipaypal.ac1211.client.RewardsRequestType rewardsRequestType;

    private java.lang.String freqCustCardNumber;

    private java.lang.String senderCountry;

    public GetFieldsForRewardsRequest() {
    }

    public GetFieldsForRewardsRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String cardTypeCode,
           java.lang.String programType,
           com.mgipaypal.ac1211.client.RewardsRequestType rewardsRequestType,
           java.lang.String freqCustCardNumber,
           java.lang.String senderCountry) {
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
        this.cardTypeCode = cardTypeCode;
        this.programType = programType;
        this.rewardsRequestType = rewardsRequestType;
        this.freqCustCardNumber = freqCustCardNumber;
        this.senderCountry = senderCountry;
    }


    /**
     * Gets the cardTypeCode value for this GetFieldsForRewardsRequest.
     * 
     * @return cardTypeCode
     */
    public java.lang.String getCardTypeCode() {
        return cardTypeCode;
    }


    /**
     * Sets the cardTypeCode value for this GetFieldsForRewardsRequest.
     * 
     * @param cardTypeCode
     */
    public void setCardTypeCode(java.lang.String cardTypeCode) {
        this.cardTypeCode = cardTypeCode;
    }


    /**
     * Gets the programType value for this GetFieldsForRewardsRequest.
     * 
     * @return programType
     */
    public java.lang.String getProgramType() {
        return programType;
    }


    /**
     * Sets the programType value for this GetFieldsForRewardsRequest.
     * 
     * @param programType
     */
    public void setProgramType(java.lang.String programType) {
        this.programType = programType;
    }


    /**
     * Gets the rewardsRequestType value for this GetFieldsForRewardsRequest.
     * 
     * @return rewardsRequestType
     */
    public com.mgipaypal.ac1211.client.RewardsRequestType getRewardsRequestType() {
        return rewardsRequestType;
    }


    /**
     * Sets the rewardsRequestType value for this GetFieldsForRewardsRequest.
     * 
     * @param rewardsRequestType
     */
    public void setRewardsRequestType(com.mgipaypal.ac1211.client.RewardsRequestType rewardsRequestType) {
        this.rewardsRequestType = rewardsRequestType;
    }


    /**
     * Gets the freqCustCardNumber value for this GetFieldsForRewardsRequest.
     * 
     * @return freqCustCardNumber
     */
    public java.lang.String getFreqCustCardNumber() {
        return freqCustCardNumber;
    }


    /**
     * Sets the freqCustCardNumber value for this GetFieldsForRewardsRequest.
     * 
     * @param freqCustCardNumber
     */
    public void setFreqCustCardNumber(java.lang.String freqCustCardNumber) {
        this.freqCustCardNumber = freqCustCardNumber;
    }


    /**
     * Gets the senderCountry value for this GetFieldsForRewardsRequest.
     * 
     * @return senderCountry
     */
    public java.lang.String getSenderCountry() {
        return senderCountry;
    }


    /**
     * Sets the senderCountry value for this GetFieldsForRewardsRequest.
     * 
     * @param senderCountry
     */
    public void setSenderCountry(java.lang.String senderCountry) {
        this.senderCountry = senderCountry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFieldsForRewardsRequest)) return false;
        GetFieldsForRewardsRequest other = (GetFieldsForRewardsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cardTypeCode==null && other.getCardTypeCode()==null) || 
             (this.cardTypeCode!=null &&
              this.cardTypeCode.equals(other.getCardTypeCode()))) &&
            ((this.programType==null && other.getProgramType()==null) || 
             (this.programType!=null &&
              this.programType.equals(other.getProgramType()))) &&
            ((this.rewardsRequestType==null && other.getRewardsRequestType()==null) || 
             (this.rewardsRequestType!=null &&
              this.rewardsRequestType.equals(other.getRewardsRequestType()))) &&
            ((this.freqCustCardNumber==null && other.getFreqCustCardNumber()==null) || 
             (this.freqCustCardNumber!=null &&
              this.freqCustCardNumber.equals(other.getFreqCustCardNumber()))) &&
            ((this.senderCountry==null && other.getSenderCountry()==null) || 
             (this.senderCountry!=null &&
              this.senderCountry.equals(other.getSenderCountry())));
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
        if (getCardTypeCode() != null) {
            _hashCode += getCardTypeCode().hashCode();
        }
        if (getProgramType() != null) {
            _hashCode += getProgramType().hashCode();
        }
        if (getRewardsRequestType() != null) {
            _hashCode += getRewardsRequestType().hashCode();
        }
        if (getFreqCustCardNumber() != null) {
            _hashCode += getFreqCustCardNumber().hashCode();
        }
        if (getSenderCountry() != null) {
            _hashCode += getSenderCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFieldsForRewardsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFieldsForRewardsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cardTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "programType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rewardsRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "rewardsRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "rewardsRequestType"));
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
        elemField.setFieldName("senderCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderCountry"));
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
