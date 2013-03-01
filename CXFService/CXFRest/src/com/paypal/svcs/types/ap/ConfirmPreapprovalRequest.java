/**
 * ConfirmPreapprovalRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.svcs.types.ap;


/**
 * The request to confirm a Preapproval.
 */
public class ConfirmPreapprovalRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.svcs.types.common.RequestEnvelope requestEnvelope;

    private java.lang.String preapprovalKey;

    private java.lang.String fundingSourceId;

    private java.lang.String pin;

    private org.apache.axis.message.MessageElement [] _any;

    public ConfirmPreapprovalRequest() {
    }

    public ConfirmPreapprovalRequest(
           com.paypal.svcs.types.common.RequestEnvelope requestEnvelope,
           java.lang.String preapprovalKey,
           java.lang.String fundingSourceId,
           java.lang.String pin,
           org.apache.axis.message.MessageElement [] _any) {
           this.requestEnvelope = requestEnvelope;
           this.preapprovalKey = preapprovalKey;
           this.fundingSourceId = fundingSourceId;
           this.pin = pin;
           this._any = _any;
    }


    /**
     * Gets the requestEnvelope value for this ConfirmPreapprovalRequest.
     * 
     * @return requestEnvelope
     */
    public com.paypal.svcs.types.common.RequestEnvelope getRequestEnvelope() {
        return requestEnvelope;
    }


    /**
     * Sets the requestEnvelope value for this ConfirmPreapprovalRequest.
     * 
     * @param requestEnvelope
     */
    public void setRequestEnvelope(com.paypal.svcs.types.common.RequestEnvelope requestEnvelope) {
        this.requestEnvelope = requestEnvelope;
    }


    /**
     * Gets the preapprovalKey value for this ConfirmPreapprovalRequest.
     * 
     * @return preapprovalKey
     */
    public java.lang.String getPreapprovalKey() {
        return preapprovalKey;
    }


    /**
     * Sets the preapprovalKey value for this ConfirmPreapprovalRequest.
     * 
     * @param preapprovalKey
     */
    public void setPreapprovalKey(java.lang.String preapprovalKey) {
        this.preapprovalKey = preapprovalKey;
    }


    /**
     * Gets the fundingSourceId value for this ConfirmPreapprovalRequest.
     * 
     * @return fundingSourceId
     */
    public java.lang.String getFundingSourceId() {
        return fundingSourceId;
    }


    /**
     * Sets the fundingSourceId value for this ConfirmPreapprovalRequest.
     * 
     * @param fundingSourceId
     */
    public void setFundingSourceId(java.lang.String fundingSourceId) {
        this.fundingSourceId = fundingSourceId;
    }


    /**
     * Gets the pin value for this ConfirmPreapprovalRequest.
     * 
     * @return pin
     */
    public java.lang.String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this ConfirmPreapprovalRequest.
     * 
     * @param pin
     */
    public void setPin(java.lang.String pin) {
        this.pin = pin;
    }


    /**
     * Gets the _any value for this ConfirmPreapprovalRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ConfirmPreapprovalRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmPreapprovalRequest)) return false;
        ConfirmPreapprovalRequest other = (ConfirmPreapprovalRequest) obj;
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
            ((this.preapprovalKey==null && other.getPreapprovalKey()==null) || 
             (this.preapprovalKey!=null &&
              this.preapprovalKey.equals(other.getPreapprovalKey()))) &&
            ((this.fundingSourceId==null && other.getFundingSourceId()==null) || 
             (this.fundingSourceId!=null &&
              this.fundingSourceId.equals(other.getFundingSourceId()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
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
        if (getRequestEnvelope() != null) {
            _hashCode += getRequestEnvelope().hashCode();
        }
        if (getPreapprovalKey() != null) {
            _hashCode += getPreapprovalKey().hashCode();
        }
        if (getFundingSourceId() != null) {
            _hashCode += getFundingSourceId().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
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
        new org.apache.axis.description.TypeDesc(ConfirmPreapprovalRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ConfirmPreapprovalRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "RequestEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preapprovalKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preapprovalKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingSourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fundingSourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pin"));
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
