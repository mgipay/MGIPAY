/**
 * ReceiverOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * Options that apply to the receiver of a payment,
 * 						allows setting additional details for payment
 * 						using invoice.
 */
public class ReceiverOptions  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String description;

    private java.lang.String customId;

    private com.paypal.axis.svcs.types.ap.InvoiceData invoiceData;

    private com.paypal.axis.svcs.types.ap.ReceiverIdentifier receiver;

    private java.lang.String referrerCode;

    private org.apache.axis.message.MessageElement [] _any;

    public ReceiverOptions() {
    }

    public ReceiverOptions(
           java.lang.String description,
           java.lang.String customId,
           com.paypal.axis.svcs.types.ap.InvoiceData invoiceData,
           com.paypal.axis.svcs.types.ap.ReceiverIdentifier receiver,
           java.lang.String referrerCode,
           org.apache.axis.message.MessageElement [] _any) {
           this.description = description;
           this.customId = customId;
           this.invoiceData = invoiceData;
           this.receiver = receiver;
           this.referrerCode = referrerCode;
           this._any = _any;
    }


    /**
     * Gets the description value for this ReceiverOptions.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ReceiverOptions.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the customId value for this ReceiverOptions.
     * 
     * @return customId
     */
    public java.lang.String getCustomId() {
        return customId;
    }


    /**
     * Sets the customId value for this ReceiverOptions.
     * 
     * @param customId
     */
    public void setCustomId(java.lang.String customId) {
        this.customId = customId;
    }


    /**
     * Gets the invoiceData value for this ReceiverOptions.
     * 
     * @return invoiceData
     */
    public com.paypal.axis.svcs.types.ap.InvoiceData getInvoiceData() {
        return invoiceData;
    }


    /**
     * Sets the invoiceData value for this ReceiverOptions.
     * 
     * @param invoiceData
     */
    public void setInvoiceData(com.paypal.axis.svcs.types.ap.InvoiceData invoiceData) {
        this.invoiceData = invoiceData;
    }


    /**
     * Gets the receiver value for this ReceiverOptions.
     * 
     * @return receiver
     */
    public com.paypal.axis.svcs.types.ap.ReceiverIdentifier getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this ReceiverOptions.
     * 
     * @param receiver
     */
    public void setReceiver(com.paypal.axis.svcs.types.ap.ReceiverIdentifier receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the referrerCode value for this ReceiverOptions.
     * 
     * @return referrerCode
     */
    public java.lang.String getReferrerCode() {
        return referrerCode;
    }


    /**
     * Sets the referrerCode value for this ReceiverOptions.
     * 
     * @param referrerCode
     */
    public void setReferrerCode(java.lang.String referrerCode) {
        this.referrerCode = referrerCode;
    }


    /**
     * Gets the _any value for this ReceiverOptions.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ReceiverOptions.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiverOptions)) return false;
        ReceiverOptions other = (ReceiverOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.customId==null && other.getCustomId()==null) || 
             (this.customId!=null &&
              this.customId.equals(other.getCustomId()))) &&
            ((this.invoiceData==null && other.getInvoiceData()==null) || 
             (this.invoiceData!=null &&
              this.invoiceData.equals(other.getInvoiceData()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.referrerCode==null && other.getReferrerCode()==null) || 
             (this.referrerCode!=null &&
              this.referrerCode.equals(other.getReferrerCode()))) &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCustomId() != null) {
            _hashCode += getCustomId().hashCode();
        }
        if (getInvoiceData() != null) {
            _hashCode += getInvoiceData().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getReferrerCode() != null) {
            _hashCode += getReferrerCode().hashCode();
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
        new org.apache.axis.description.TypeDesc(ReceiverOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ReceiverOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "InvoiceData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ReceiverIdentifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referrerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referrerCode"));
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
