/**
 * Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class Response  implements java.io.Serializable {
    private boolean doCheckIn;

    private java.util.Calendar timeStamp;

    /* encodes bitset, sum of:
     * 					1=code tables
     * 					2=profile
     * 					4=receive country requirements
     * 					8=software version
     * 					16=language translations */
    private int flags;

    public Response() {
    }

    public Response(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags) {
           this.doCheckIn = doCheckIn;
           this.timeStamp = timeStamp;
           this.flags = flags;
    }


    /**
     * Gets the doCheckIn value for this Response.
     * 
     * @return doCheckIn
     */
    public boolean isDoCheckIn() {
        return doCheckIn;
    }


    /**
     * Sets the doCheckIn value for this Response.
     * 
     * @param doCheckIn
     */
    public void setDoCheckIn(boolean doCheckIn) {
        this.doCheckIn = doCheckIn;
    }


    /**
     * Gets the timeStamp value for this Response.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this Response.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the flags value for this Response.
     * 
     * @return flags   * encodes bitset, sum of:
     * 					1=code tables
     * 					2=profile
     * 					4=receive country requirements
     * 					8=software version
     * 					16=language translations
     */
    public int getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Response.
     * 
     * @param flags   * encodes bitset, sum of:
     * 					1=code tables
     * 					2=profile
     * 					4=receive country requirements
     * 					8=software version
     * 					16=language translations
     */
    public void setFlags(int flags) {
        this.flags = flags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Response)) return false;
        Response other = (Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.doCheckIn == other.isDoCheckIn() &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            this.flags == other.getFlags();
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
        _hashCode += (isDoCheckIn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        _hashCode += getFlags();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doCheckIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "doCheckIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
