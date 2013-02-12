/**
 * VersionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class VersionInfo  implements java.io.Serializable {
    private java.lang.String versionType;

    private java.lang.String versionLevel;

    public VersionInfo() {
    }

    public VersionInfo(
           java.lang.String versionType,
           java.lang.String versionLevel) {
           this.versionType = versionType;
           this.versionLevel = versionLevel;
    }


    /**
     * Gets the versionType value for this VersionInfo.
     * 
     * @return versionType
     */
    public java.lang.String getVersionType() {
        return versionType;
    }


    /**
     * Sets the versionType value for this VersionInfo.
     * 
     * @param versionType
     */
    public void setVersionType(java.lang.String versionType) {
        this.versionType = versionType;
    }


    /**
     * Gets the versionLevel value for this VersionInfo.
     * 
     * @return versionLevel
     */
    public java.lang.String getVersionLevel() {
        return versionLevel;
    }


    /**
     * Sets the versionLevel value for this VersionInfo.
     * 
     * @param versionLevel
     */
    public void setVersionLevel(java.lang.String versionLevel) {
        this.versionLevel = versionLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VersionInfo)) return false;
        VersionInfo other = (VersionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.versionType==null && other.getVersionType()==null) || 
             (this.versionType!=null &&
              this.versionType.equals(other.getVersionType()))) &&
            ((this.versionLevel==null && other.getVersionLevel()==null) || 
             (this.versionLevel!=null &&
              this.versionLevel.equals(other.getVersionLevel())));
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
        if (getVersionType() != null) {
            _hashCode += getVersionType().hashCode();
        }
        if (getVersionLevel() != null) {
            _hashCode += getVersionLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VersionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "VersionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "versionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "versionLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
