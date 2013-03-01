/**
 * SenderIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.svcs.types.ap;


/**
 * The sender identifier type contains information
 * 						to identify a PayPal account.
 */
public class SenderIdentifier  extends com.paypal.svcs.types.common.AccountIdentifier  implements java.io.Serializable {
    private java.lang.Boolean useCredentials;

    private com.paypal.svcs.types.ap.TaxIdDetails taxIdDetails;

    public SenderIdentifier() {
    }

    public SenderIdentifier(
           java.lang.String email,
           com.paypal.svcs.types.common.PhoneNumberType phone,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.Boolean useCredentials,
           com.paypal.svcs.types.ap.TaxIdDetails taxIdDetails) {
        super(
            email,
            phone,
            _any);
        this.useCredentials = useCredentials;
        this.taxIdDetails = taxIdDetails;
    }


    /**
     * Gets the useCredentials value for this SenderIdentifier.
     * 
     * @return useCredentials
     */
    public java.lang.Boolean getUseCredentials() {
        return useCredentials;
    }


    /**
     * Sets the useCredentials value for this SenderIdentifier.
     * 
     * @param useCredentials
     */
    public void setUseCredentials(java.lang.Boolean useCredentials) {
        this.useCredentials = useCredentials;
    }


    /**
     * Gets the taxIdDetails value for this SenderIdentifier.
     * 
     * @return taxIdDetails
     */
    public com.paypal.svcs.types.ap.TaxIdDetails getTaxIdDetails() {
        return taxIdDetails;
    }


    /**
     * Sets the taxIdDetails value for this SenderIdentifier.
     * 
     * @param taxIdDetails
     */
    public void setTaxIdDetails(com.paypal.svcs.types.ap.TaxIdDetails taxIdDetails) {
        this.taxIdDetails = taxIdDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SenderIdentifier)) return false;
        SenderIdentifier other = (SenderIdentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.useCredentials==null && other.getUseCredentials()==null) || 
             (this.useCredentials!=null &&
              this.useCredentials.equals(other.getUseCredentials()))) &&
            ((this.taxIdDetails==null && other.getTaxIdDetails()==null) || 
             (this.taxIdDetails!=null &&
              this.taxIdDetails.equals(other.getTaxIdDetails())));
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
        if (getUseCredentials() != null) {
            _hashCode += getUseCredentials().hashCode();
        }
        if (getTaxIdDetails() != null) {
            _hashCode += getTaxIdDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SenderIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "SenderIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useCredentials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useCredentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIdDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxIdDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "TaxIdDetails"));
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
