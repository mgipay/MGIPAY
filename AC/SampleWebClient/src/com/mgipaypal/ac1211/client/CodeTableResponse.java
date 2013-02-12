/**
 * CodeTableResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class CodeTableResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String version;

    private com.mgipaypal.ac1211.client.StateProvinceInfo[] stateProvinceInfo;

    private com.mgipaypal.ac1211.client.CountryInfo[] countryInfo;

    private com.mgipaypal.ac1211.client.CurrencyInfo[] currencyInfo;

    private com.mgipaypal.ac1211.client.CountryCurrencyInfo[] countryCurrencyInfo;

    private com.mgipaypal.ac1211.client.DeliveryOptionInfo[] deliveryOptionInfo;

    private com.mgipaypal.ac1211.client.RewardsInfo[] rewardsInfo;

    private com.mgipaypal.ac1211.client.RewardsCardTypeInfo[] rewardsCardTypeInfo;

    private com.mgipaypal.ac1211.client.RewardsRegistrationInfo[] rewardsRegistrationInfo;

    public CodeTableResponse() {
    }

    public CodeTableResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String version,
           com.mgipaypal.ac1211.client.StateProvinceInfo[] stateProvinceInfo,
           com.mgipaypal.ac1211.client.CountryInfo[] countryInfo,
           com.mgipaypal.ac1211.client.CurrencyInfo[] currencyInfo,
           com.mgipaypal.ac1211.client.CountryCurrencyInfo[] countryCurrencyInfo,
           com.mgipaypal.ac1211.client.DeliveryOptionInfo[] deliveryOptionInfo,
           com.mgipaypal.ac1211.client.RewardsInfo[] rewardsInfo,
           com.mgipaypal.ac1211.client.RewardsCardTypeInfo[] rewardsCardTypeInfo,
           com.mgipaypal.ac1211.client.RewardsRegistrationInfo[] rewardsRegistrationInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.version = version;
        this.stateProvinceInfo = stateProvinceInfo;
        this.countryInfo = countryInfo;
        this.currencyInfo = currencyInfo;
        this.countryCurrencyInfo = countryCurrencyInfo;
        this.deliveryOptionInfo = deliveryOptionInfo;
        this.rewardsInfo = rewardsInfo;
        this.rewardsCardTypeInfo = rewardsCardTypeInfo;
        this.rewardsRegistrationInfo = rewardsRegistrationInfo;
    }


    /**
     * Gets the version value for this CodeTableResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CodeTableResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the stateProvinceInfo value for this CodeTableResponse.
     * 
     * @return stateProvinceInfo
     */
    public com.mgipaypal.ac1211.client.StateProvinceInfo[] getStateProvinceInfo() {
        return stateProvinceInfo;
    }


    /**
     * Sets the stateProvinceInfo value for this CodeTableResponse.
     * 
     * @param stateProvinceInfo
     */
    public void setStateProvinceInfo(com.mgipaypal.ac1211.client.StateProvinceInfo[] stateProvinceInfo) {
        this.stateProvinceInfo = stateProvinceInfo;
    }

    public com.mgipaypal.ac1211.client.StateProvinceInfo getStateProvinceInfo(int i) {
        return this.stateProvinceInfo[i];
    }

    public void setStateProvinceInfo(int i, com.mgipaypal.ac1211.client.StateProvinceInfo _value) {
        this.stateProvinceInfo[i] = _value;
    }


    /**
     * Gets the countryInfo value for this CodeTableResponse.
     * 
     * @return countryInfo
     */
    public com.mgipaypal.ac1211.client.CountryInfo[] getCountryInfo() {
        return countryInfo;
    }


    /**
     * Sets the countryInfo value for this CodeTableResponse.
     * 
     * @param countryInfo
     */
    public void setCountryInfo(com.mgipaypal.ac1211.client.CountryInfo[] countryInfo) {
        this.countryInfo = countryInfo;
    }

    public com.mgipaypal.ac1211.client.CountryInfo getCountryInfo(int i) {
        return this.countryInfo[i];
    }

    public void setCountryInfo(int i, com.mgipaypal.ac1211.client.CountryInfo _value) {
        this.countryInfo[i] = _value;
    }


    /**
     * Gets the currencyInfo value for this CodeTableResponse.
     * 
     * @return currencyInfo
     */
    public com.mgipaypal.ac1211.client.CurrencyInfo[] getCurrencyInfo() {
        return currencyInfo;
    }


    /**
     * Sets the currencyInfo value for this CodeTableResponse.
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


    /**
     * Gets the countryCurrencyInfo value for this CodeTableResponse.
     * 
     * @return countryCurrencyInfo
     */
    public com.mgipaypal.ac1211.client.CountryCurrencyInfo[] getCountryCurrencyInfo() {
        return countryCurrencyInfo;
    }


    /**
     * Sets the countryCurrencyInfo value for this CodeTableResponse.
     * 
     * @param countryCurrencyInfo
     */
    public void setCountryCurrencyInfo(com.mgipaypal.ac1211.client.CountryCurrencyInfo[] countryCurrencyInfo) {
        this.countryCurrencyInfo = countryCurrencyInfo;
    }

    public com.mgipaypal.ac1211.client.CountryCurrencyInfo getCountryCurrencyInfo(int i) {
        return this.countryCurrencyInfo[i];
    }

    public void setCountryCurrencyInfo(int i, com.mgipaypal.ac1211.client.CountryCurrencyInfo _value) {
        this.countryCurrencyInfo[i] = _value;
    }


    /**
     * Gets the deliveryOptionInfo value for this CodeTableResponse.
     * 
     * @return deliveryOptionInfo
     */
    public com.mgipaypal.ac1211.client.DeliveryOptionInfo[] getDeliveryOptionInfo() {
        return deliveryOptionInfo;
    }


    /**
     * Sets the deliveryOptionInfo value for this CodeTableResponse.
     * 
     * @param deliveryOptionInfo
     */
    public void setDeliveryOptionInfo(com.mgipaypal.ac1211.client.DeliveryOptionInfo[] deliveryOptionInfo) {
        this.deliveryOptionInfo = deliveryOptionInfo;
    }

    public com.mgipaypal.ac1211.client.DeliveryOptionInfo getDeliveryOptionInfo(int i) {
        return this.deliveryOptionInfo[i];
    }

    public void setDeliveryOptionInfo(int i, com.mgipaypal.ac1211.client.DeliveryOptionInfo _value) {
        this.deliveryOptionInfo[i] = _value;
    }


    /**
     * Gets the rewardsInfo value for this CodeTableResponse.
     * 
     * @return rewardsInfo
     */
    public com.mgipaypal.ac1211.client.RewardsInfo[] getRewardsInfo() {
        return rewardsInfo;
    }


    /**
     * Sets the rewardsInfo value for this CodeTableResponse.
     * 
     * @param rewardsInfo
     */
    public void setRewardsInfo(com.mgipaypal.ac1211.client.RewardsInfo[] rewardsInfo) {
        this.rewardsInfo = rewardsInfo;
    }

    public com.mgipaypal.ac1211.client.RewardsInfo getRewardsInfo(int i) {
        return this.rewardsInfo[i];
    }

    public void setRewardsInfo(int i, com.mgipaypal.ac1211.client.RewardsInfo _value) {
        this.rewardsInfo[i] = _value;
    }


    /**
     * Gets the rewardsCardTypeInfo value for this CodeTableResponse.
     * 
     * @return rewardsCardTypeInfo
     */
    public com.mgipaypal.ac1211.client.RewardsCardTypeInfo[] getRewardsCardTypeInfo() {
        return rewardsCardTypeInfo;
    }


    /**
     * Sets the rewardsCardTypeInfo value for this CodeTableResponse.
     * 
     * @param rewardsCardTypeInfo
     */
    public void setRewardsCardTypeInfo(com.mgipaypal.ac1211.client.RewardsCardTypeInfo[] rewardsCardTypeInfo) {
        this.rewardsCardTypeInfo = rewardsCardTypeInfo;
    }

    public com.mgipaypal.ac1211.client.RewardsCardTypeInfo getRewardsCardTypeInfo(int i) {
        return this.rewardsCardTypeInfo[i];
    }

    public void setRewardsCardTypeInfo(int i, com.mgipaypal.ac1211.client.RewardsCardTypeInfo _value) {
        this.rewardsCardTypeInfo[i] = _value;
    }


    /**
     * Gets the rewardsRegistrationInfo value for this CodeTableResponse.
     * 
     * @return rewardsRegistrationInfo
     */
    public com.mgipaypal.ac1211.client.RewardsRegistrationInfo[] getRewardsRegistrationInfo() {
        return rewardsRegistrationInfo;
    }


    /**
     * Sets the rewardsRegistrationInfo value for this CodeTableResponse.
     * 
     * @param rewardsRegistrationInfo
     */
    public void setRewardsRegistrationInfo(com.mgipaypal.ac1211.client.RewardsRegistrationInfo[] rewardsRegistrationInfo) {
        this.rewardsRegistrationInfo = rewardsRegistrationInfo;
    }

    public com.mgipaypal.ac1211.client.RewardsRegistrationInfo getRewardsRegistrationInfo(int i) {
        return this.rewardsRegistrationInfo[i];
    }

    public void setRewardsRegistrationInfo(int i, com.mgipaypal.ac1211.client.RewardsRegistrationInfo _value) {
        this.rewardsRegistrationInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodeTableResponse)) return false;
        CodeTableResponse other = (CodeTableResponse) obj;
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
            ((this.stateProvinceInfo==null && other.getStateProvinceInfo()==null) || 
             (this.stateProvinceInfo!=null &&
              java.util.Arrays.equals(this.stateProvinceInfo, other.getStateProvinceInfo()))) &&
            ((this.countryInfo==null && other.getCountryInfo()==null) || 
             (this.countryInfo!=null &&
              java.util.Arrays.equals(this.countryInfo, other.getCountryInfo()))) &&
            ((this.currencyInfo==null && other.getCurrencyInfo()==null) || 
             (this.currencyInfo!=null &&
              java.util.Arrays.equals(this.currencyInfo, other.getCurrencyInfo()))) &&
            ((this.countryCurrencyInfo==null && other.getCountryCurrencyInfo()==null) || 
             (this.countryCurrencyInfo!=null &&
              java.util.Arrays.equals(this.countryCurrencyInfo, other.getCountryCurrencyInfo()))) &&
            ((this.deliveryOptionInfo==null && other.getDeliveryOptionInfo()==null) || 
             (this.deliveryOptionInfo!=null &&
              java.util.Arrays.equals(this.deliveryOptionInfo, other.getDeliveryOptionInfo()))) &&
            ((this.rewardsInfo==null && other.getRewardsInfo()==null) || 
             (this.rewardsInfo!=null &&
              java.util.Arrays.equals(this.rewardsInfo, other.getRewardsInfo()))) &&
            ((this.rewardsCardTypeInfo==null && other.getRewardsCardTypeInfo()==null) || 
             (this.rewardsCardTypeInfo!=null &&
              java.util.Arrays.equals(this.rewardsCardTypeInfo, other.getRewardsCardTypeInfo()))) &&
            ((this.rewardsRegistrationInfo==null && other.getRewardsRegistrationInfo()==null) || 
             (this.rewardsRegistrationInfo!=null &&
              java.util.Arrays.equals(this.rewardsRegistrationInfo, other.getRewardsRegistrationInfo())));
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
        if (getStateProvinceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStateProvinceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStateProvinceInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountryInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getCountryCurrencyInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryCurrencyInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryCurrencyInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeliveryOptionInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryOptionInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveryOptionInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRewardsInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRewardsInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRewardsInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRewardsCardTypeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRewardsCardTypeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRewardsCardTypeInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRewardsRegistrationInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRewardsRegistrationInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRewardsRegistrationInfo(), i);
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
        new org.apache.axis.description.TypeDesc(CodeTableResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CodeTableResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateProvinceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateProvinceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "StateProvinceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "countryInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CountryInfo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "currencyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CurrencyInfo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCurrencyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "countryCurrencyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CountryCurrencyInfo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOptionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "deliveryOptionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DeliveryOptionInfo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rewardsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "rewardsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RewardsInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rewardsCardTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "rewardsCardTypeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RewardsCardTypeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rewardsRegistrationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "rewardsRegistrationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RewardsRegistrationInfo"));
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
