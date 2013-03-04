/**
 * CurrencyConversionList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * A list of estimated currency conversions for a
 * 						base currency.
 */
public class CurrencyConversionList  implements java.io.Serializable {
    private com.paypal.axis.svcs.types.common.CurrencyType baseAmount;

    private com.paypal.axis.svcs.types.common.CurrencyType[] currencyList;

    public CurrencyConversionList() {
    }

    public CurrencyConversionList(
           com.paypal.axis.svcs.types.common.CurrencyType baseAmount,
           com.paypal.axis.svcs.types.common.CurrencyType[] currencyList) {
           this.baseAmount = baseAmount;
           this.currencyList = currencyList;
    }


    /**
     * Gets the baseAmount value for this CurrencyConversionList.
     * 
     * @return baseAmount
     */
    public com.paypal.axis.svcs.types.common.CurrencyType getBaseAmount() {
        return baseAmount;
    }


    /**
     * Sets the baseAmount value for this CurrencyConversionList.
     * 
     * @param baseAmount
     */
    public void setBaseAmount(com.paypal.axis.svcs.types.common.CurrencyType baseAmount) {
        this.baseAmount = baseAmount;
    }


    /**
     * Gets the currencyList value for this CurrencyConversionList.
     * 
     * @return currencyList
     */
    public com.paypal.axis.svcs.types.common.CurrencyType[] getCurrencyList() {
        return currencyList;
    }


    /**
     * Sets the currencyList value for this CurrencyConversionList.
     * 
     * @param currencyList
     */
    public void setCurrencyList(com.paypal.axis.svcs.types.common.CurrencyType[] currencyList) {
        this.currencyList = currencyList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyConversionList)) return false;
        CurrencyConversionList other = (CurrencyConversionList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseAmount==null && other.getBaseAmount()==null) || 
             (this.baseAmount!=null &&
              this.baseAmount.equals(other.getBaseAmount()))) &&
            ((this.currencyList==null && other.getCurrencyList()==null) || 
             (this.currencyList!=null &&
              java.util.Arrays.equals(this.currencyList, other.getCurrencyList())));
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
        if (getBaseAmount() != null) {
            _hashCode += getBaseAmount().hashCode();
        }
        if (getCurrencyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrencyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrencyList(), i);
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
        new org.apache.axis.description.TypeDesc(CurrencyConversionList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CurrencyConversionList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "baseAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "CurrencyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "CurrencyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "currency"));
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
