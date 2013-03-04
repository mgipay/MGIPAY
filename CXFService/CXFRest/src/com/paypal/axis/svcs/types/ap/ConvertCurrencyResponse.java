/**
 * ConvertCurrencyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * A response that contains a table of estimated
 * 						converted currencies based on the Convert
 * 						Currency Request.
 */
public class ConvertCurrencyResponse  implements java.io.Serializable {
    private com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope;

    private com.paypal.axis.svcs.types.ap.CurrencyConversionList[] estimatedAmountTable;

    public ConvertCurrencyResponse() {
    }

    public ConvertCurrencyResponse(
           com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope,
           com.paypal.axis.svcs.types.ap.CurrencyConversionList[] estimatedAmountTable) {
           this.responseEnvelope = responseEnvelope;
           this.estimatedAmountTable = estimatedAmountTable;
    }


    /**
     * Gets the responseEnvelope value for this ConvertCurrencyResponse.
     * 
     * @return responseEnvelope
     */
    public com.paypal.axis.svcs.types.common.ResponseEnvelope getResponseEnvelope() {
        return responseEnvelope;
    }


    /**
     * Sets the responseEnvelope value for this ConvertCurrencyResponse.
     * 
     * @param responseEnvelope
     */
    public void setResponseEnvelope(com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope) {
        this.responseEnvelope = responseEnvelope;
    }


    /**
     * Gets the estimatedAmountTable value for this ConvertCurrencyResponse.
     * 
     * @return estimatedAmountTable
     */
    public com.paypal.axis.svcs.types.ap.CurrencyConversionList[] getEstimatedAmountTable() {
        return estimatedAmountTable;
    }


    /**
     * Sets the estimatedAmountTable value for this ConvertCurrencyResponse.
     * 
     * @param estimatedAmountTable
     */
    public void setEstimatedAmountTable(com.paypal.axis.svcs.types.ap.CurrencyConversionList[] estimatedAmountTable) {
        this.estimatedAmountTable = estimatedAmountTable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConvertCurrencyResponse)) return false;
        ConvertCurrencyResponse other = (ConvertCurrencyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseEnvelope==null && other.getResponseEnvelope()==null) || 
             (this.responseEnvelope!=null &&
              this.responseEnvelope.equals(other.getResponseEnvelope()))) &&
            ((this.estimatedAmountTable==null && other.getEstimatedAmountTable()==null) || 
             (this.estimatedAmountTable!=null &&
              java.util.Arrays.equals(this.estimatedAmountTable, other.getEstimatedAmountTable())));
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
        if (getResponseEnvelope() != null) {
            _hashCode += getResponseEnvelope().hashCode();
        }
        if (getEstimatedAmountTable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedAmountTable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedAmountTable(), i);
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
        new org.apache.axis.description.TypeDesc(ConvertCurrencyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConvertCurrencyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ResponseEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedAmountTable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimatedAmountTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CurrencyConversionList"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "currencyConversionList"));
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
