/**
 * CheckInResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class CheckInResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String token;

    private com.mgipaypal.ac1211.client.TimeZoneCorrection timeZoneCorrection;

    public CheckInResponse() {
    }

    public CheckInResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String token,
           com.mgipaypal.ac1211.client.TimeZoneCorrection timeZoneCorrection) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.token = token;
        this.timeZoneCorrection = timeZoneCorrection;
    }


    /**
     * Gets the token value for this CheckInResponse.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this CheckInResponse.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the timeZoneCorrection value for this CheckInResponse.
     * 
     * @return timeZoneCorrection
     */
    public com.mgipaypal.ac1211.client.TimeZoneCorrection getTimeZoneCorrection() {
        return timeZoneCorrection;
    }


    /**
     * Sets the timeZoneCorrection value for this CheckInResponse.
     * 
     * @param timeZoneCorrection
     */
    public void setTimeZoneCorrection(com.mgipaypal.ac1211.client.TimeZoneCorrection timeZoneCorrection) {
        this.timeZoneCorrection = timeZoneCorrection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckInResponse)) return false;
        CheckInResponse other = (CheckInResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.timeZoneCorrection==null && other.getTimeZoneCorrection()==null) || 
             (this.timeZoneCorrection!=null &&
              this.timeZoneCorrection.equals(other.getTimeZoneCorrection())));
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
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getTimeZoneCorrection() != null) {
            _hashCode += getTimeZoneCorrection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckInResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CheckInResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneCorrection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "timeZoneCorrection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "timeZoneCorrection"));
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
