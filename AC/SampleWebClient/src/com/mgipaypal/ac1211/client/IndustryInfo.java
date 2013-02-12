/**
 * IndustryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class IndustryInfo  implements java.io.Serializable {
    private java.lang.String industryID;

    private java.lang.String industryName;

    public IndustryInfo() {
    }

    public IndustryInfo(
           java.lang.String industryID,
           java.lang.String industryName) {
           this.industryID = industryID;
           this.industryName = industryName;
    }


    /**
     * Gets the industryID value for this IndustryInfo.
     * 
     * @return industryID
     */
    public java.lang.String getIndustryID() {
        return industryID;
    }


    /**
     * Sets the industryID value for this IndustryInfo.
     * 
     * @param industryID
     */
    public void setIndustryID(java.lang.String industryID) {
        this.industryID = industryID;
    }


    /**
     * Gets the industryName value for this IndustryInfo.
     * 
     * @return industryName
     */
    public java.lang.String getIndustryName() {
        return industryName;
    }


    /**
     * Sets the industryName value for this IndustryInfo.
     * 
     * @param industryName
     */
    public void setIndustryName(java.lang.String industryName) {
        this.industryName = industryName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndustryInfo)) return false;
        IndustryInfo other = (IndustryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.industryID==null && other.getIndustryID()==null) || 
             (this.industryID!=null &&
              this.industryID.equals(other.getIndustryID()))) &&
            ((this.industryName==null && other.getIndustryName()==null) || 
             (this.industryName!=null &&
              this.industryName.equals(other.getIndustryName())));
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
        if (getIndustryID() != null) {
            _hashCode += getIndustryID().hashCode();
        }
        if (getIndustryName() != null) {
            _hashCode += getIndustryName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndustryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "IndustryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "industryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "industryName"));
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
