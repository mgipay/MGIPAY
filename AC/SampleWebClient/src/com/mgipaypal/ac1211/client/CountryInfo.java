/**
 * CountryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class CountryInfo  implements java.io.Serializable {
    private java.lang.String countryCode;

    private java.lang.String countryName;

    private java.lang.String countryLegacyCode;

    private boolean sendActive;

    private boolean receiveActive;

    private boolean directedSendCountry;

    private boolean mgDirectedSendCountry;

    private java.lang.String baseReceiveCurrency;

    public CountryInfo() {
    }

    public CountryInfo(
           java.lang.String countryCode,
           java.lang.String countryName,
           java.lang.String countryLegacyCode,
           boolean sendActive,
           boolean receiveActive,
           boolean directedSendCountry,
           boolean mgDirectedSendCountry,
           java.lang.String baseReceiveCurrency) {
           this.countryCode = countryCode;
           this.countryName = countryName;
           this.countryLegacyCode = countryLegacyCode;
           this.sendActive = sendActive;
           this.receiveActive = receiveActive;
           this.directedSendCountry = directedSendCountry;
           this.mgDirectedSendCountry = mgDirectedSendCountry;
           this.baseReceiveCurrency = baseReceiveCurrency;
    }


    /**
     * Gets the countryCode value for this CountryInfo.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this CountryInfo.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the countryName value for this CountryInfo.
     * 
     * @return countryName
     */
    public java.lang.String getCountryName() {
        return countryName;
    }


    /**
     * Sets the countryName value for this CountryInfo.
     * 
     * @param countryName
     */
    public void setCountryName(java.lang.String countryName) {
        this.countryName = countryName;
    }


    /**
     * Gets the countryLegacyCode value for this CountryInfo.
     * 
     * @return countryLegacyCode
     */
    public java.lang.String getCountryLegacyCode() {
        return countryLegacyCode;
    }


    /**
     * Sets the countryLegacyCode value for this CountryInfo.
     * 
     * @param countryLegacyCode
     */
    public void setCountryLegacyCode(java.lang.String countryLegacyCode) {
        this.countryLegacyCode = countryLegacyCode;
    }


    /**
     * Gets the sendActive value for this CountryInfo.
     * 
     * @return sendActive
     */
    public boolean isSendActive() {
        return sendActive;
    }


    /**
     * Sets the sendActive value for this CountryInfo.
     * 
     * @param sendActive
     */
    public void setSendActive(boolean sendActive) {
        this.sendActive = sendActive;
    }


    /**
     * Gets the receiveActive value for this CountryInfo.
     * 
     * @return receiveActive
     */
    public boolean isReceiveActive() {
        return receiveActive;
    }


    /**
     * Sets the receiveActive value for this CountryInfo.
     * 
     * @param receiveActive
     */
    public void setReceiveActive(boolean receiveActive) {
        this.receiveActive = receiveActive;
    }


    /**
     * Gets the directedSendCountry value for this CountryInfo.
     * 
     * @return directedSendCountry
     */
    public boolean isDirectedSendCountry() {
        return directedSendCountry;
    }


    /**
     * Sets the directedSendCountry value for this CountryInfo.
     * 
     * @param directedSendCountry
     */
    public void setDirectedSendCountry(boolean directedSendCountry) {
        this.directedSendCountry = directedSendCountry;
    }


    /**
     * Gets the mgDirectedSendCountry value for this CountryInfo.
     * 
     * @return mgDirectedSendCountry
     */
    public boolean isMgDirectedSendCountry() {
        return mgDirectedSendCountry;
    }


    /**
     * Sets the mgDirectedSendCountry value for this CountryInfo.
     * 
     * @param mgDirectedSendCountry
     */
    public void setMgDirectedSendCountry(boolean mgDirectedSendCountry) {
        this.mgDirectedSendCountry = mgDirectedSendCountry;
    }


    /**
     * Gets the baseReceiveCurrency value for this CountryInfo.
     * 
     * @return baseReceiveCurrency
     */
    public java.lang.String getBaseReceiveCurrency() {
        return baseReceiveCurrency;
    }


    /**
     * Sets the baseReceiveCurrency value for this CountryInfo.
     * 
     * @param baseReceiveCurrency
     */
    public void setBaseReceiveCurrency(java.lang.String baseReceiveCurrency) {
        this.baseReceiveCurrency = baseReceiveCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CountryInfo)) return false;
        CountryInfo other = (CountryInfo) obj;
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
            ((this.countryName==null && other.getCountryName()==null) || 
             (this.countryName!=null &&
              this.countryName.equals(other.getCountryName()))) &&
            ((this.countryLegacyCode==null && other.getCountryLegacyCode()==null) || 
             (this.countryLegacyCode!=null &&
              this.countryLegacyCode.equals(other.getCountryLegacyCode()))) &&
            this.sendActive == other.isSendActive() &&
            this.receiveActive == other.isReceiveActive() &&
            this.directedSendCountry == other.isDirectedSendCountry() &&
            this.mgDirectedSendCountry == other.isMgDirectedSendCountry() &&
            ((this.baseReceiveCurrency==null && other.getBaseReceiveCurrency()==null) || 
             (this.baseReceiveCurrency!=null &&
              this.baseReceiveCurrency.equals(other.getBaseReceiveCurrency())));
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
        if (getCountryName() != null) {
            _hashCode += getCountryName().hashCode();
        }
        if (getCountryLegacyCode() != null) {
            _hashCode += getCountryLegacyCode().hashCode();
        }
        _hashCode += (isSendActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReceiveActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDirectedSendCountry() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMgDirectedSendCountry() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBaseReceiveCurrency() != null) {
            _hashCode += getBaseReceiveCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CountryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CountryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "countryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryLegacyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "countryLegacyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directedSendCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "directedSendCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgDirectedSendCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgDirectedSendCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseReceiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "baseReceiveCurrency"));
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
