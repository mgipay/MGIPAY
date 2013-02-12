/**
 * KeyValuePair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class KeyValuePair  implements java.io.Serializable {
    private java.lang.String xmlTag;

    private java.lang.String fieldValue;

    public KeyValuePair() {
    }

    public KeyValuePair(
           java.lang.String xmlTag,
           java.lang.String fieldValue) {
           this.xmlTag = xmlTag;
           this.fieldValue = fieldValue;
    }


    /**
     * Gets the xmlTag value for this KeyValuePair.
     * 
     * @return xmlTag
     */
    public java.lang.String getXmlTag() {
        return xmlTag;
    }


    /**
     * Sets the xmlTag value for this KeyValuePair.
     * 
     * @param xmlTag
     */
    public void setXmlTag(java.lang.String xmlTag) {
        this.xmlTag = xmlTag;
    }


    /**
     * Gets the fieldValue value for this KeyValuePair.
     * 
     * @return fieldValue
     */
    public java.lang.String getFieldValue() {
        return fieldValue;
    }


    /**
     * Sets the fieldValue value for this KeyValuePair.
     * 
     * @param fieldValue
     */
    public void setFieldValue(java.lang.String fieldValue) {
        this.fieldValue = fieldValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeyValuePair)) return false;
        KeyValuePair other = (KeyValuePair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xmlTag==null && other.getXmlTag()==null) || 
             (this.xmlTag!=null &&
              this.xmlTag.equals(other.getXmlTag()))) &&
            ((this.fieldValue==null && other.getFieldValue()==null) || 
             (this.fieldValue!=null &&
              this.fieldValue.equals(other.getFieldValue())));
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
        if (getXmlTag() != null) {
            _hashCode += getXmlTag().hashCode();
        }
        if (getFieldValue() != null) {
            _hashCode += getFieldValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeyValuePair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "KeyValuePair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "xmlTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
