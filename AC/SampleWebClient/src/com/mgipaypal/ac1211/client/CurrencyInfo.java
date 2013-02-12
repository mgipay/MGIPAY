/**
 * CurrencyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class CurrencyInfo  implements java.io.Serializable {
    private java.lang.String currencyCode;

    private java.lang.String currencyName;

    private java.math.BigInteger currencyPrecision;

    public CurrencyInfo() {
    }

    public CurrencyInfo(
           java.lang.String currencyCode,
           java.lang.String currencyName,
           java.math.BigInteger currencyPrecision) {
           this.currencyCode = currencyCode;
           this.currencyName = currencyName;
           this.currencyPrecision = currencyPrecision;
    }


    /**
     * Gets the currencyCode value for this CurrencyInfo.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this CurrencyInfo.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the currencyName value for this CurrencyInfo.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this CurrencyInfo.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the currencyPrecision value for this CurrencyInfo.
     * 
     * @return currencyPrecision
     */
    public java.math.BigInteger getCurrencyPrecision() {
        return currencyPrecision;
    }


    /**
     * Sets the currencyPrecision value for this CurrencyInfo.
     * 
     * @param currencyPrecision
     */
    public void setCurrencyPrecision(java.math.BigInteger currencyPrecision) {
        this.currencyPrecision = currencyPrecision;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyInfo)) return false;
        CurrencyInfo other = (CurrencyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.currencyPrecision==null && other.getCurrencyPrecision()==null) || 
             (this.currencyPrecision!=null &&
              this.currencyPrecision.equals(other.getCurrencyPrecision())));
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getCurrencyPrecision() != null) {
            _hashCode += getCurrencyPrecision().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CurrencyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyPrecision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "currencyPrecision"));
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
