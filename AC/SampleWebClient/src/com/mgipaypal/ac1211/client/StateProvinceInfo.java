/**
 * StateProvinceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class StateProvinceInfo  implements java.io.Serializable {
    private java.lang.String countryCode;

    private java.lang.String stateProvinceCode;

    private java.lang.String stateProvinceName;

    public StateProvinceInfo() {
    }

    public StateProvinceInfo(
           java.lang.String countryCode,
           java.lang.String stateProvinceCode,
           java.lang.String stateProvinceName) {
           this.countryCode = countryCode;
           this.stateProvinceCode = stateProvinceCode;
           this.stateProvinceName = stateProvinceName;
    }


    /**
     * Gets the countryCode value for this StateProvinceInfo.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this StateProvinceInfo.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the stateProvinceCode value for this StateProvinceInfo.
     * 
     * @return stateProvinceCode
     */
    public java.lang.String getStateProvinceCode() {
        return stateProvinceCode;
    }


    /**
     * Sets the stateProvinceCode value for this StateProvinceInfo.
     * 
     * @param stateProvinceCode
     */
    public void setStateProvinceCode(java.lang.String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }


    /**
     * Gets the stateProvinceName value for this StateProvinceInfo.
     * 
     * @return stateProvinceName
     */
    public java.lang.String getStateProvinceName() {
        return stateProvinceName;
    }


    /**
     * Sets the stateProvinceName value for this StateProvinceInfo.
     * 
     * @param stateProvinceName
     */
    public void setStateProvinceName(java.lang.String stateProvinceName) {
        this.stateProvinceName = stateProvinceName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StateProvinceInfo)) return false;
        StateProvinceInfo other = (StateProvinceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.stateProvinceCode==null && other.getStateProvinceCode()==null) || 
             (this.stateProvinceCode!=null &&
              this.stateProvinceCode.equals(other.getStateProvinceCode()))) &&
            ((this.stateProvinceName==null && other.getStateProvinceName()==null) || 
             (this.stateProvinceName!=null &&
              this.stateProvinceName.equals(other.getStateProvinceName())));
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
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getStateProvinceCode() != null) {
            _hashCode += getStateProvinceCode().hashCode();
        }
        if (getStateProvinceName() != null) {
            _hashCode += getStateProvinceName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StateProvinceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "StateProvinceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateProvinceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateProvinceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateProvinceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateProvinceName"));
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
