/**
 * GetFQDOByCustomerReceiveNumberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class GetFQDOByCustomerReceiveNumberRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String mgCustomerReceiveNumber;

    public GetFQDOByCustomerReceiveNumberRequest() {
    }

    public GetFQDOByCustomerReceiveNumberRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String mgCustomerReceiveNumber) {
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
        this.mgCustomerReceiveNumber = mgCustomerReceiveNumber;
    }


    /**
     * Gets the mgCustomerReceiveNumber value for this GetFQDOByCustomerReceiveNumberRequest.
     * 
     * @return mgCustomerReceiveNumber
     */
    public java.lang.String getMgCustomerReceiveNumber() {
        return mgCustomerReceiveNumber;
    }


    /**
     * Sets the mgCustomerReceiveNumber value for this GetFQDOByCustomerReceiveNumberRequest.
     * 
     * @param mgCustomerReceiveNumber
     */
    public void setMgCustomerReceiveNumber(java.lang.String mgCustomerReceiveNumber) {
        this.mgCustomerReceiveNumber = mgCustomerReceiveNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFQDOByCustomerReceiveNumberRequest)) return false;
        GetFQDOByCustomerReceiveNumberRequest other = (GetFQDOByCustomerReceiveNumberRequest) obj;
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
              this.mgCustomerReceiveNumber.equals(other.getMgCustomerReceiveNumber())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFQDOByCustomerReceiveNumberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFQDOByCustomerReceiveNumberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgCustomerReceiveNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgCustomerReceiveNumber"));
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
