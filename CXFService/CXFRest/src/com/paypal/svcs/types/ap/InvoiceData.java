/**
 * InvoiceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.svcs.types.ap;


/**
 * Describes a payment for a particular receiver
 * 						(merchant), contains list of additional per item
 * 						details.
 */
public class InvoiceData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.svcs.types.ap.InvoiceItem[] item;

    private java.math.BigDecimal totalTax;

    private java.math.BigDecimal totalShipping;

    private org.apache.axis.message.MessageElement [] _any;

    public InvoiceData() {
    }

    public InvoiceData(
           com.paypal.svcs.types.ap.InvoiceItem[] item,
           java.math.BigDecimal totalTax,
           java.math.BigDecimal totalShipping,
           org.apache.axis.message.MessageElement [] _any) {
           this.item = item;
           this.totalTax = totalTax;
           this.totalShipping = totalShipping;
           this._any = _any;
    }


    /**
     * Gets the item value for this InvoiceData.
     * 
     * @return item
     */
    public com.paypal.svcs.types.ap.InvoiceItem[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this InvoiceData.
     * 
     * @param item
     */
    public void setItem(com.paypal.svcs.types.ap.InvoiceItem[] item) {
        this.item = item;
    }

    public com.paypal.svcs.types.ap.InvoiceItem getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.paypal.svcs.types.ap.InvoiceItem _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the totalTax value for this InvoiceData.
     * 
     * @return totalTax
     */
    public java.math.BigDecimal getTotalTax() {
        return totalTax;
    }


    /**
     * Sets the totalTax value for this InvoiceData.
     * 
     * @param totalTax
     */
    public void setTotalTax(java.math.BigDecimal totalTax) {
        this.totalTax = totalTax;
    }


    /**
     * Gets the totalShipping value for this InvoiceData.
     * 
     * @return totalShipping
     */
    public java.math.BigDecimal getTotalShipping() {
        return totalShipping;
    }


    /**
     * Sets the totalShipping value for this InvoiceData.
     * 
     * @param totalShipping
     */
    public void setTotalShipping(java.math.BigDecimal totalShipping) {
        this.totalShipping = totalShipping;
    }


    /**
     * Gets the _any value for this InvoiceData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this InvoiceData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceData)) return false;
        InvoiceData other = (InvoiceData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.totalTax==null && other.getTotalTax()==null) || 
             (this.totalTax!=null &&
              this.totalTax.equals(other.getTotalTax()))) &&
            ((this.totalShipping==null && other.getTotalShipping()==null) || 
             (this.totalShipping!=null &&
              this.totalShipping.equals(other.getTotalShipping()))) &&
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
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalTax() != null) {
            _hashCode += getTotalTax().hashCode();
        }
        if (getTotalShipping() != null) {
            _hashCode += getTotalShipping().hashCode();
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
        new org.apache.axis.description.TypeDesc(InvoiceData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "InvoiceData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "InvoiceItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
