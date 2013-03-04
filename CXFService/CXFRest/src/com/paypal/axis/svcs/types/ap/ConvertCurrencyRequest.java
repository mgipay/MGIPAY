/**
 * ConvertCurrencyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * A request to convert one or more currencies into
 * 						their estimated values in other currencies.
 */
public class ConvertCurrencyRequest  implements java.io.Serializable {
    private com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope;

    private com.paypal.axis.svcs.types.common.CurrencyType[] baseAmountList;

    private java.lang.String[] convertToCurrencyList;

    /* The two-character ISO country code where
     * 								fx suppposed to happen */
    private java.lang.String countryCode;

    private java.lang.String conversionType;

    public ConvertCurrencyRequest() {
    }

    public ConvertCurrencyRequest(
           com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope,
           com.paypal.axis.svcs.types.common.CurrencyType[] baseAmountList,
           java.lang.String[] convertToCurrencyList,
           java.lang.String countryCode,
           java.lang.String conversionType) {
           this.requestEnvelope = requestEnvelope;
           this.baseAmountList = baseAmountList;
           this.convertToCurrencyList = convertToCurrencyList;
           this.countryCode = countryCode;
           this.conversionType = conversionType;
    }


    /**
     * Gets the requestEnvelope value for this ConvertCurrencyRequest.
     * 
     * @return requestEnvelope
     */
    public com.paypal.axis.svcs.types.common.RequestEnvelope getRequestEnvelope() {
        return requestEnvelope;
    }


    /**
     * Sets the requestEnvelope value for this ConvertCurrencyRequest.
     * 
     * @param requestEnvelope
     */
    public void setRequestEnvelope(com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope) {
        this.requestEnvelope = requestEnvelope;
    }


    /**
     * Gets the baseAmountList value for this ConvertCurrencyRequest.
     * 
     * @return baseAmountList
     */
    public com.paypal.axis.svcs.types.common.CurrencyType[] getBaseAmountList() {
        return baseAmountList;
    }


    /**
     * Sets the baseAmountList value for this ConvertCurrencyRequest.
     * 
     * @param baseAmountList
     */
    public void setBaseAmountList(com.paypal.axis.svcs.types.common.CurrencyType[] baseAmountList) {
        this.baseAmountList = baseAmountList;
    }


    /**
     * Gets the convertToCurrencyList value for this ConvertCurrencyRequest.
     * 
     * @return convertToCurrencyList
     */
    public java.lang.String[] getConvertToCurrencyList() {
        return convertToCurrencyList;
    }


    /**
     * Sets the convertToCurrencyList value for this ConvertCurrencyRequest.
     * 
     * @param convertToCurrencyList
     */
    public void setConvertToCurrencyList(java.lang.String[] convertToCurrencyList) {
        this.convertToCurrencyList = convertToCurrencyList;
    }


    /**
     * Gets the countryCode value for this ConvertCurrencyRequest.
     * 
     * @return countryCode   * The two-character ISO country code where
     * 								fx suppposed to happen
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this ConvertCurrencyRequest.
     * 
     * @param countryCode   * The two-character ISO country code where
     * 								fx suppposed to happen
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the conversionType value for this ConvertCurrencyRequest.
     * 
     * @return conversionType
     */
    public java.lang.String getConversionType() {
        return conversionType;
    }


    /**
     * Sets the conversionType value for this ConvertCurrencyRequest.
     * 
     * @param conversionType
     */
    public void setConversionType(java.lang.String conversionType) {
        this.conversionType = conversionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConvertCurrencyRequest)) return false;
        ConvertCurrencyRequest other = (ConvertCurrencyRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestEnvelope==null && other.getRequestEnvelope()==null) || 
             (this.requestEnvelope!=null &&
              this.requestEnvelope.equals(other.getRequestEnvelope()))) &&
            ((this.baseAmountList==null && other.getBaseAmountList()==null) || 
             (this.baseAmountList!=null &&
              java.util.Arrays.equals(this.baseAmountList, other.getBaseAmountList()))) &&
            ((this.convertToCurrencyList==null && other.getConvertToCurrencyList()==null) || 
             (this.convertToCurrencyList!=null &&
              java.util.Arrays.equals(this.convertToCurrencyList, other.getConvertToCurrencyList()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.conversionType==null && other.getConversionType()==null) || 
             (this.conversionType!=null &&
              this.conversionType.equals(other.getConversionType())));
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
        if (getRequestEnvelope() != null) {
            _hashCode += getRequestEnvelope().hashCode();
        }
        if (getBaseAmountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaseAmountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaseAmountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConvertToCurrencyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConvertToCurrencyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConvertToCurrencyList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getConversionType() != null) {
            _hashCode += getConversionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConvertCurrencyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConvertCurrencyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "RequestEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAmountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "baseAmountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "CurrencyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "currency"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertToCurrencyList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "convertToCurrencyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "currencyCode"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conversionType"));
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
