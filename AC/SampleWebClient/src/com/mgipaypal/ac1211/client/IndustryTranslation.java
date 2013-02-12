/**
 * IndustryTranslation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class IndustryTranslation  implements java.io.Serializable {
    private java.lang.String industryId;

    private java.lang.String displayName;

    private java.lang.String languageCode;

    private java.lang.String longLanguageCode;

    public IndustryTranslation() {
    }

    public IndustryTranslation(
           java.lang.String industryId,
           java.lang.String displayName,
           java.lang.String languageCode,
           java.lang.String longLanguageCode) {
           this.industryId = industryId;
           this.displayName = displayName;
           this.languageCode = languageCode;
           this.longLanguageCode = longLanguageCode;
    }


    /**
     * Gets the industryId value for this IndustryTranslation.
     * 
     * @return industryId
     */
    public java.lang.String getIndustryId() {
        return industryId;
    }


    /**
     * Sets the industryId value for this IndustryTranslation.
     * 
     * @param industryId
     */
    public void setIndustryId(java.lang.String industryId) {
        this.industryId = industryId;
    }


    /**
     * Gets the displayName value for this IndustryTranslation.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this IndustryTranslation.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the languageCode value for this IndustryTranslation.
     * 
     * @return languageCode
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this IndustryTranslation.
     * 
     * @param languageCode
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the longLanguageCode value for this IndustryTranslation.
     * 
     * @return longLanguageCode
     */
    public java.lang.String getLongLanguageCode() {
        return longLanguageCode;
    }


    /**
     * Sets the longLanguageCode value for this IndustryTranslation.
     * 
     * @param longLanguageCode
     */
    public void setLongLanguageCode(java.lang.String longLanguageCode) {
        this.longLanguageCode = longLanguageCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndustryTranslation)) return false;
        IndustryTranslation other = (IndustryTranslation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.industryId==null && other.getIndustryId()==null) || 
             (this.industryId!=null &&
              this.industryId.equals(other.getIndustryId()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.longLanguageCode==null && other.getLongLanguageCode()==null) || 
             (this.longLanguageCode!=null &&
              this.longLanguageCode.equals(other.getLongLanguageCode())));
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
        if (getIndustryId() != null) {
            _hashCode += getIndustryId().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getLongLanguageCode() != null) {
            _hashCode += getLongLanguageCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndustryTranslation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "IndustryTranslation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "industryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "languageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longLanguageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "longLanguageCode"));
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
