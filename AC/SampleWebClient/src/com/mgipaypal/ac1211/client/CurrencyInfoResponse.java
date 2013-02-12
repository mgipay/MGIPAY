/**
 * CurrencyInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class CurrencyInfoResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String version;

    private com.mgipaypal.ac1211.client.CurrencyInfo[] currencyInfo;

    public CurrencyInfoResponse() {
    }

    public CurrencyInfoResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String version,
           com.mgipaypal.ac1211.client.CurrencyInfo[] currencyInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.version = version;
        this.currencyInfo = currencyInfo;
    }


    /**
     * Gets the version value for this CurrencyInfoResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CurrencyInfoResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the currencyInfo value for this CurrencyInfoResponse.
     * 
     * @return currencyInfo
     */
    public com.mgipaypal.ac1211.client.CurrencyInfo[] getCurrencyInfo() {
        return currencyInfo;
    }


    /**
     * Sets the currencyInfo value for this CurrencyInfoResponse.
     * 
     * @param currencyInfo
     */
    public void setCurrencyInfo(com.mgipaypal.ac1211.client.CurrencyInfo[] currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    public com.mgipaypal.ac1211.client.CurrencyInfo getCurrencyInfo(int i) {
        return this.currencyInfo[i];
    }

    public void setCurrencyInfo(int i, com.mgipaypal.ac1211.client.CurrencyInfo _value) {
        this.currencyInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyInfoResponse)) return false;
        CurrencyInfoResponse other = (CurrencyInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.currencyInfo==null && other.getCurrencyInfo()==null) || 
             (this.currencyInfo!=null &&
              java.util.Arrays.equals(this.currencyInfo, other.getCurrencyInfo())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getCurrencyInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrencyInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrencyInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CurrencyInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "currencyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CurrencyInfo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
