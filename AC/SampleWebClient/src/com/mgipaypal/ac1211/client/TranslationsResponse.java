/**
 * TranslationsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class TranslationsResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String translationsVersion;

    private com.mgipaypal.ac1211.client.CountryTranslation[] countryTranslations;

    private com.mgipaypal.ac1211.client.DeliveryOptionTranslation[] deliveryOptionTranslations;

    private com.mgipaypal.ac1211.client.CurrencyTranslation[] currencyTranslations;

    private com.mgipaypal.ac1211.client.FQDOTextTranslation[] fqdoTextTranslations;

    private com.mgipaypal.ac1211.client.IndustryTranslation[] industryTranslations;

    public TranslationsResponse() {
    }

    public TranslationsResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String translationsVersion,
           com.mgipaypal.ac1211.client.CountryTranslation[] countryTranslations,
           com.mgipaypal.ac1211.client.DeliveryOptionTranslation[] deliveryOptionTranslations,
           com.mgipaypal.ac1211.client.CurrencyTranslation[] currencyTranslations,
           com.mgipaypal.ac1211.client.FQDOTextTranslation[] fqdoTextTranslations,
           com.mgipaypal.ac1211.client.IndustryTranslation[] industryTranslations) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.translationsVersion = translationsVersion;
        this.countryTranslations = countryTranslations;
        this.deliveryOptionTranslations = deliveryOptionTranslations;
        this.currencyTranslations = currencyTranslations;
        this.fqdoTextTranslations = fqdoTextTranslations;
        this.industryTranslations = industryTranslations;
    }


    /**
     * Gets the translationsVersion value for this TranslationsResponse.
     * 
     * @return translationsVersion
     */
    public java.lang.String getTranslationsVersion() {
        return translationsVersion;
    }


    /**
     * Sets the translationsVersion value for this TranslationsResponse.
     * 
     * @param translationsVersion
     */
    public void setTranslationsVersion(java.lang.String translationsVersion) {
        this.translationsVersion = translationsVersion;
    }


    /**
     * Gets the countryTranslations value for this TranslationsResponse.
     * 
     * @return countryTranslations
     */
    public com.mgipaypal.ac1211.client.CountryTranslation[] getCountryTranslations() {
        return countryTranslations;
    }


    /**
     * Sets the countryTranslations value for this TranslationsResponse.
     * 
     * @param countryTranslations
     */
    public void setCountryTranslations(com.mgipaypal.ac1211.client.CountryTranslation[] countryTranslations) {
        this.countryTranslations = countryTranslations;
    }

    public com.mgipaypal.ac1211.client.CountryTranslation getCountryTranslations(int i) {
        return this.countryTranslations[i];
    }

    public void setCountryTranslations(int i, com.mgipaypal.ac1211.client.CountryTranslation _value) {
        this.countryTranslations[i] = _value;
    }


    /**
     * Gets the deliveryOptionTranslations value for this TranslationsResponse.
     * 
     * @return deliveryOptionTranslations
     */
    public com.mgipaypal.ac1211.client.DeliveryOptionTranslation[] getDeliveryOptionTranslations() {
        return deliveryOptionTranslations;
    }


    /**
     * Sets the deliveryOptionTranslations value for this TranslationsResponse.
     * 
     * @param deliveryOptionTranslations
     */
    public void setDeliveryOptionTranslations(com.mgipaypal.ac1211.client.DeliveryOptionTranslation[] deliveryOptionTranslations) {
        this.deliveryOptionTranslations = deliveryOptionTranslations;
    }

    public com.mgipaypal.ac1211.client.DeliveryOptionTranslation getDeliveryOptionTranslations(int i) {
        return this.deliveryOptionTranslations[i];
    }

    public void setDeliveryOptionTranslations(int i, com.mgipaypal.ac1211.client.DeliveryOptionTranslation _value) {
        this.deliveryOptionTranslations[i] = _value;
    }


    /**
     * Gets the currencyTranslations value for this TranslationsResponse.
     * 
     * @return currencyTranslations
     */
    public com.mgipaypal.ac1211.client.CurrencyTranslation[] getCurrencyTranslations() {
        return currencyTranslations;
    }


    /**
     * Sets the currencyTranslations value for this TranslationsResponse.
     * 
     * @param currencyTranslations
     */
    public void setCurrencyTranslations(com.mgipaypal.ac1211.client.CurrencyTranslation[] currencyTranslations) {
        this.currencyTranslations = currencyTranslations;
    }

    public com.mgipaypal.ac1211.client.CurrencyTranslation getCurrencyTranslations(int i) {
        return this.currencyTranslations[i];
    }

    public void setCurrencyTranslations(int i, com.mgipaypal.ac1211.client.CurrencyTranslation _value) {
        this.currencyTranslations[i] = _value;
    }


    /**
     * Gets the fqdoTextTranslations value for this TranslationsResponse.
     * 
     * @return fqdoTextTranslations
     */
    public com.mgipaypal.ac1211.client.FQDOTextTranslation[] getFqdoTextTranslations() {
        return fqdoTextTranslations;
    }


    /**
     * Sets the fqdoTextTranslations value for this TranslationsResponse.
     * 
     * @param fqdoTextTranslations
     */
    public void setFqdoTextTranslations(com.mgipaypal.ac1211.client.FQDOTextTranslation[] fqdoTextTranslations) {
        this.fqdoTextTranslations = fqdoTextTranslations;
    }

    public com.mgipaypal.ac1211.client.FQDOTextTranslation getFqdoTextTranslations(int i) {
        return this.fqdoTextTranslations[i];
    }

    public void setFqdoTextTranslations(int i, com.mgipaypal.ac1211.client.FQDOTextTranslation _value) {
        this.fqdoTextTranslations[i] = _value;
    }


    /**
     * Gets the industryTranslations value for this TranslationsResponse.
     * 
     * @return industryTranslations
     */
    public com.mgipaypal.ac1211.client.IndustryTranslation[] getIndustryTranslations() {
        return industryTranslations;
    }


    /**
     * Sets the industryTranslations value for this TranslationsResponse.
     * 
     * @param industryTranslations
     */
    public void setIndustryTranslations(com.mgipaypal.ac1211.client.IndustryTranslation[] industryTranslations) {
        this.industryTranslations = industryTranslations;
    }

    public com.mgipaypal.ac1211.client.IndustryTranslation getIndustryTranslations(int i) {
        return this.industryTranslations[i];
    }

    public void setIndustryTranslations(int i, com.mgipaypal.ac1211.client.IndustryTranslation _value) {
        this.industryTranslations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TranslationsResponse)) return false;
        TranslationsResponse other = (TranslationsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.translationsVersion==null && other.getTranslationsVersion()==null) || 
             (this.translationsVersion!=null &&
              this.translationsVersion.equals(other.getTranslationsVersion()))) &&
            ((this.countryTranslations==null && other.getCountryTranslations()==null) || 
             (this.countryTranslations!=null &&
              java.util.Arrays.equals(this.countryTranslations, other.getCountryTranslations()))) &&
            ((this.deliveryOptionTranslations==null && other.getDeliveryOptionTranslations()==null) || 
             (this.deliveryOptionTranslations!=null &&
              java.util.Arrays.equals(this.deliveryOptionTranslations, other.getDeliveryOptionTranslations()))) &&
            ((this.currencyTranslations==null && other.getCurrencyTranslations()==null) || 
             (this.currencyTranslations!=null &&
              java.util.Arrays.equals(this.currencyTranslations, other.getCurrencyTranslations()))) &&
            ((this.fqdoTextTranslations==null && other.getFqdoTextTranslations()==null) || 
             (this.fqdoTextTranslations!=null &&
              java.util.Arrays.equals(this.fqdoTextTranslations, other.getFqdoTextTranslations()))) &&
            ((this.industryTranslations==null && other.getIndustryTranslations()==null) || 
             (this.industryTranslations!=null &&
              java.util.Arrays.equals(this.industryTranslations, other.getIndustryTranslations())));
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
        if (getTranslationsVersion() != null) {
            _hashCode += getTranslationsVersion().hashCode();
        }
        if (getCountryTranslations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryTranslations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryTranslations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeliveryOptionTranslations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryOptionTranslations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveryOptionTranslations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrencyTranslations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrencyTranslations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrencyTranslations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFqdoTextTranslations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFqdoTextTranslations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFqdoTextTranslations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndustryTranslations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndustryTranslations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndustryTranslations(), i);
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
        new org.apache.axis.description.TypeDesc(TranslationsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TranslationsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationsVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "translationsVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryTranslations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "countryTranslations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CountryTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOptionTranslations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "deliveryOptionTranslations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DeliveryOptionTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyTranslations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "currencyTranslations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CurrencyTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fqdoTextTranslations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fqdoTextTranslations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FQDOTextTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryTranslations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "industryTranslations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "IndustryTranslation"));
        elemField.setMinOccurs(0);
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
