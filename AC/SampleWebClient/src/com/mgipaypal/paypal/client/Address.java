/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;

public class Address  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String addresseeName;

    private com.mgipaypal.paypal.client.BaseAddress baseAddress;

    private java.lang.String addressId;

    private org.apache.axis.message.MessageElement [] _any;

    public Address() {
    }

    public Address(
           java.lang.String addresseeName,
           com.mgipaypal.paypal.client.BaseAddress baseAddress,
           java.lang.String addressId,
           org.apache.axis.message.MessageElement [] _any) {
           this.addresseeName = addresseeName;
           this.baseAddress = baseAddress;
           this.addressId = addressId;
           this._any = _any;
    }


    /**
     * Gets the addresseeName value for this Address.
     * 
     * @return addresseeName
     */
    public java.lang.String getAddresseeName() {
        return addresseeName;
    }


    /**
     * Sets the addresseeName value for this Address.
     * 
     * @param addresseeName
     */
    public void setAddresseeName(java.lang.String addresseeName) {
        this.addresseeName = addresseeName;
    }


    /**
     * Gets the baseAddress value for this Address.
     * 
     * @return baseAddress
     */
    public com.mgipaypal.paypal.client.BaseAddress getBaseAddress() {
        return baseAddress;
    }


    /**
     * Sets the baseAddress value for this Address.
     * 
     * @param baseAddress
     */
    public void setBaseAddress(com.mgipaypal.paypal.client.BaseAddress baseAddress) {
        this.baseAddress = baseAddress;
    }


    /**
     * Gets the addressId value for this Address.
     * 
     * @return addressId
     */
    public java.lang.String getAddressId() {
        return addressId;
    }


    /**
     * Sets the addressId value for this Address.
     * 
     * @param addressId
     */
    public void setAddressId(java.lang.String addressId) {
        this.addressId = addressId;
    }


    /**
     * Gets the _any value for this Address.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this Address.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Address)) return false;
        Address other = (Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addresseeName==null && other.getAddresseeName()==null) || 
             (this.addresseeName!=null &&
              this.addresseeName.equals(other.getAddresseeName()))) &&
            ((this.baseAddress==null && other.getBaseAddress()==null) || 
             (this.baseAddress!=null &&
              this.baseAddress.equals(other.getBaseAddress()))) &&
            ((this.addressId==null && other.getAddressId()==null) || 
             (this.addressId!=null &&
              this.addressId.equals(other.getAddressId()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getAddresseeName() != null) {
            _hashCode += getAddresseeName().hashCode();
        }
        if (getBaseAddress() != null) {
            _hashCode += getBaseAddress().hashCode();
        }
        if (getAddressId() != null) {
            _hashCode += getAddressId().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "Address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresseeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addresseeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "baseAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "BaseAddress"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressId"));
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
