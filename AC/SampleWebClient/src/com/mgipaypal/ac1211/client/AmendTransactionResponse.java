/**
 * AmendTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class AmendTransactionResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private boolean transactionSucceeded;

    public AmendTransactionResponse() {
    }

    public AmendTransactionResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           boolean transactionSucceeded) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.transactionSucceeded = transactionSucceeded;
    }


    /**
     * Gets the transactionSucceeded value for this AmendTransactionResponse.
     * 
     * @return transactionSucceeded
     */
    public boolean isTransactionSucceeded() {
        return transactionSucceeded;
    }


    /**
     * Sets the transactionSucceeded value for this AmendTransactionResponse.
     * 
     * @param transactionSucceeded
     */
    public void setTransactionSucceeded(boolean transactionSucceeded) {
        this.transactionSucceeded = transactionSucceeded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AmendTransactionResponse)) return false;
        AmendTransactionResponse other = (AmendTransactionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.transactionSucceeded == other.isTransactionSucceeded();
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
        _hashCode += (isTransactionSucceeded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AmendTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "AmendTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionSucceeded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "transactionSucceeded"));
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
