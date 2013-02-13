/**
 * GetAvailableShippingAddressesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * The response to get the shipping addresses
 * 						available for a payment.
 */
public class GetAvailableShippingAddressesResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.mgipaypal.paypal.client.ResponseEnvelope responseEnvelope;

    private com.mgipaypal.paypal.client.Address[] availableAddress;

    private org.apache.axis.message.MessageElement [] _any;

    public GetAvailableShippingAddressesResponse() {
    }

    public GetAvailableShippingAddressesResponse(
           com.mgipaypal.paypal.client.ResponseEnvelope responseEnvelope,
           com.mgipaypal.paypal.client.Address[] availableAddress,
           org.apache.axis.message.MessageElement [] _any) {
           this.responseEnvelope = responseEnvelope;
           this.availableAddress = availableAddress;
           this._any = _any;
    }


    /**
     * Gets the responseEnvelope value for this GetAvailableShippingAddressesResponse.
     * 
     * @return responseEnvelope
     */
    public com.mgipaypal.paypal.client.ResponseEnvelope getResponseEnvelope() {
        return responseEnvelope;
    }


    /**
     * Sets the responseEnvelope value for this GetAvailableShippingAddressesResponse.
     * 
     * @param responseEnvelope
     */
    public void setResponseEnvelope(com.mgipaypal.paypal.client.ResponseEnvelope responseEnvelope) {
        this.responseEnvelope = responseEnvelope;
    }


    /**
     * Gets the availableAddress value for this GetAvailableShippingAddressesResponse.
     * 
     * @return availableAddress
     */
    public com.mgipaypal.paypal.client.Address[] getAvailableAddress() {
        return availableAddress;
    }


    /**
     * Sets the availableAddress value for this GetAvailableShippingAddressesResponse.
     * 
     * @param availableAddress
     */
    public void setAvailableAddress(com.mgipaypal.paypal.client.Address[] availableAddress) {
        this.availableAddress = availableAddress;
    }

    public com.mgipaypal.paypal.client.Address getAvailableAddress(int i) {
        return this.availableAddress[i];
    }

    public void setAvailableAddress(int i, com.mgipaypal.paypal.client.Address _value) {
        this.availableAddress[i] = _value;
    }


    /**
     * Gets the _any value for this GetAvailableShippingAddressesResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetAvailableShippingAddressesResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAvailableShippingAddressesResponse)) return false;
        GetAvailableShippingAddressesResponse other = (GetAvailableShippingAddressesResponse) obj;
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
            ((this.availableAddress==null && other.getAvailableAddress()==null) || 
             (this.availableAddress!=null &&
              java.util.Arrays.equals(this.availableAddress, other.getAvailableAddress()))) &&
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
        if (getResponseEnvelope() != null) {
            _hashCode += getResponseEnvelope().hashCode();
        }
        if (getAvailableAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(GetAvailableShippingAddressesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAvailableShippingAddressesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ResponseEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availableAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "Address"));
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
