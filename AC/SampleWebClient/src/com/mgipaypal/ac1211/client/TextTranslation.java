/**
 * TextTranslation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class TextTranslation  implements java.io.Serializable {
    private java.lang.String longLanguageCode;

    private java.lang.String textTranslation;

    public TextTranslation() {
    }

    public TextTranslation(
           java.lang.String longLanguageCode,
           java.lang.String textTranslation) {
           this.longLanguageCode = longLanguageCode;
           this.textTranslation = textTranslation;
    }


    /**
     * Gets the longLanguageCode value for this TextTranslation.
     * 
     * @return longLanguageCode
     */
    public java.lang.String getLongLanguageCode() {
        return longLanguageCode;
    }


    /**
     * Sets the longLanguageCode value for this TextTranslation.
     * 
     * @param longLanguageCode
     */
    public void setLongLanguageCode(java.lang.String longLanguageCode) {
        this.longLanguageCode = longLanguageCode;
    }


    /**
     * Gets the textTranslation value for this TextTranslation.
     * 
     * @return textTranslation
     */
    public java.lang.String getTextTranslation() {
        return textTranslation;
    }


    /**
     * Sets the textTranslation value for this TextTranslation.
     * 
     * @param textTranslation
     */
    public void setTextTranslation(java.lang.String textTranslation) {
        this.textTranslation = textTranslation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TextTranslation)) return false;
        TextTranslation other = (TextTranslation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.longLanguageCode==null && other.getLongLanguageCode()==null) || 
             (this.longLanguageCode!=null &&
              this.longLanguageCode.equals(other.getLongLanguageCode()))) &&
            ((this.textTranslation==null && other.getTextTranslation()==null) || 
             (this.textTranslation!=null &&
              this.textTranslation.equals(other.getTextTranslation())));
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
        if (getLongLanguageCode() != null) {
            _hashCode += getLongLanguageCode().hashCode();
        }
        if (getTextTranslation() != null) {
            _hashCode += getTextTranslation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TextTranslation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longLanguageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "longLanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textTranslation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "textTranslation"));
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
