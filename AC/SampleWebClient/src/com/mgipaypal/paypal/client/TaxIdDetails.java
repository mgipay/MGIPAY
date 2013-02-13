/**
 * TaxIdDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * Details about the payer's tax info passed in by the merchant or
 * partner.
 */
public class TaxIdDetails  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    /* Tax id of the merchant/business. */
    private java.lang.String taxId;

    /* Tax type of the Tax Id. */
    private java.lang.String taxIdType;

    private org.apache.axis.message.MessageElement [] _any;

    public TaxIdDetails() {
    }

    public TaxIdDetails(
           java.lang.String taxId,
           java.lang.String taxIdType,
           org.apache.axis.message.MessageElement [] _any) {
           this.taxId = taxId;
           this.taxIdType = taxIdType;
           this._any = _any;
    }


    /**
     * Gets the taxId value for this TaxIdDetails.
     * 
     * @return taxId   * Tax id of the merchant/business.
     */
    public java.lang.String getTaxId() {
        return taxId;
    }


    /**
     * Sets the taxId value for this TaxIdDetails.
     * 
     * @param taxId   * Tax id of the merchant/business.
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }


    /**
     * Gets the taxIdType value for this TaxIdDetails.
     * 
     * @return taxIdType   * Tax type of the Tax Id.
     */
    public java.lang.String getTaxIdType() {
        return taxIdType;
    }


    /**
     * Sets the taxIdType value for this TaxIdDetails.
     * 
     * @param taxIdType   * Tax type of the Tax Id.
     */
    public void setTaxIdType(java.lang.String taxIdType) {
        this.taxIdType = taxIdType;
    }


    /**
     * Gets the _any value for this TaxIdDetails.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this TaxIdDetails.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxIdDetails)) return false;
        TaxIdDetails other = (TaxIdDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxId==null && other.getTaxId()==null) || 
             (this.taxId!=null &&
              this.taxId.equals(other.getTaxId()))) &&
            ((this.taxIdType==null && other.getTaxIdType()==null) || 
             (this.taxIdType!=null &&
              this.taxIdType.equals(other.getTaxIdType()))) &&
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
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
        }
        if (getTaxIdType() != null) {
            _hashCode += getTaxIdType().hashCode();
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
        new org.apache.axis.description.TypeDesc(TaxIdDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "TaxIdDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxIdType"));
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
