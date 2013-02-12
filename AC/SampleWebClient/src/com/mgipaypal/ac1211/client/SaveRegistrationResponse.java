/**
 * SaveRegistrationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class SaveRegistrationResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String mgCustomerReceiveNumber;

    private java.math.BigInteger mgCustomerReceiveNumberVersion;

    private java.lang.String registrationStatusCode;

    private boolean verificationRequiredForUse;

    private boolean ofacStatus;

    public SaveRegistrationResponse() {
    }

    public SaveRegistrationResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String mgCustomerReceiveNumber,
           java.math.BigInteger mgCustomerReceiveNumberVersion,
           java.lang.String registrationStatusCode,
           boolean verificationRequiredForUse,
           boolean ofacStatus) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.mgCustomerReceiveNumber = mgCustomerReceiveNumber;
        this.mgCustomerReceiveNumberVersion = mgCustomerReceiveNumberVersion;
        this.registrationStatusCode = registrationStatusCode;
        this.verificationRequiredForUse = verificationRequiredForUse;
        this.ofacStatus = ofacStatus;
    }


    /**
     * Gets the mgCustomerReceiveNumber value for this SaveRegistrationResponse.
     * 
     * @return mgCustomerReceiveNumber
     */
    public java.lang.String getMgCustomerReceiveNumber() {
        return mgCustomerReceiveNumber;
    }


    /**
     * Sets the mgCustomerReceiveNumber value for this SaveRegistrationResponse.
     * 
     * @param mgCustomerReceiveNumber
     */
    public void setMgCustomerReceiveNumber(java.lang.String mgCustomerReceiveNumber) {
        this.mgCustomerReceiveNumber = mgCustomerReceiveNumber;
    }


    /**
     * Gets the mgCustomerReceiveNumberVersion value for this SaveRegistrationResponse.
     * 
     * @return mgCustomerReceiveNumberVersion
     */
    public java.math.BigInteger getMgCustomerReceiveNumberVersion() {
        return mgCustomerReceiveNumberVersion;
    }


    /**
     * Sets the mgCustomerReceiveNumberVersion value for this SaveRegistrationResponse.
     * 
     * @param mgCustomerReceiveNumberVersion
     */
    public void setMgCustomerReceiveNumberVersion(java.math.BigInteger mgCustomerReceiveNumberVersion) {
        this.mgCustomerReceiveNumberVersion = mgCustomerReceiveNumberVersion;
    }


    /**
     * Gets the registrationStatusCode value for this SaveRegistrationResponse.
     * 
     * @return registrationStatusCode
     */
    public java.lang.String getRegistrationStatusCode() {
        return registrationStatusCode;
    }


    /**
     * Sets the registrationStatusCode value for this SaveRegistrationResponse.
     * 
     * @param registrationStatusCode
     */
    public void setRegistrationStatusCode(java.lang.String registrationStatusCode) {
        this.registrationStatusCode = registrationStatusCode;
    }


    /**
     * Gets the verificationRequiredForUse value for this SaveRegistrationResponse.
     * 
     * @return verificationRequiredForUse
     */
    public boolean isVerificationRequiredForUse() {
        return verificationRequiredForUse;
    }


    /**
     * Sets the verificationRequiredForUse value for this SaveRegistrationResponse.
     * 
     * @param verificationRequiredForUse
     */
    public void setVerificationRequiredForUse(boolean verificationRequiredForUse) {
        this.verificationRequiredForUse = verificationRequiredForUse;
    }


    /**
     * Gets the ofacStatus value for this SaveRegistrationResponse.
     * 
     * @return ofacStatus
     */
    public boolean isOfacStatus() {
        return ofacStatus;
    }


    /**
     * Sets the ofacStatus value for this SaveRegistrationResponse.
     * 
     * @param ofacStatus
     */
    public void setOfacStatus(boolean ofacStatus) {
        this.ofacStatus = ofacStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveRegistrationResponse)) return false;
        SaveRegistrationResponse other = (SaveRegistrationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mgCustomerReceiveNumber==null && other.getMgCustomerReceiveNumber()==null) || 
             (this.mgCustomerReceiveNumber!=null &&
              this.mgCustomerReceiveNumber.equals(other.getMgCustomerReceiveNumber()))) &&
            ((this.mgCustomerReceiveNumberVersion==null && other.getMgCustomerReceiveNumberVersion()==null) || 
             (this.mgCustomerReceiveNumberVersion!=null &&
              this.mgCustomerReceiveNumberVersion.equals(other.getMgCustomerReceiveNumberVersion()))) &&
            ((this.registrationStatusCode==null && other.getRegistrationStatusCode()==null) || 
             (this.registrationStatusCode!=null &&
              this.registrationStatusCode.equals(other.getRegistrationStatusCode()))) &&
            this.verificationRequiredForUse == other.isVerificationRequiredForUse() &&
            this.ofacStatus == other.isOfacStatus();
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
        if (getMgCustomerReceiveNumber() != null) {
            _hashCode += getMgCustomerReceiveNumber().hashCode();
        }
        if (getMgCustomerReceiveNumberVersion() != null) {
            _hashCode += getMgCustomerReceiveNumberVersion().hashCode();
        }
        if (getRegistrationStatusCode() != null) {
            _hashCode += getRegistrationStatusCode().hashCode();
        }
        _hashCode += (isVerificationRequiredForUse() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOfacStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveRegistrationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SaveRegistrationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgCustomerReceiveNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgCustomerReceiveNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgCustomerReceiveNumberVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgCustomerReceiveNumberVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "registrationStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationRequiredForUse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "verificationRequiredForUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ofacStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ofacStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
