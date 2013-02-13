/**
 * ExecutePaymentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * The request to execute the payment request.
 */
public class ExecutePaymentRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.mgipaypal.paypal.client.RequestEnvelope requestEnvelope;

    private java.lang.String payKey;

    /* Describes the action that is performed
     * 								by this API */
    private java.lang.String actionType;

    private java.lang.String fundingPlanId;

    private org.apache.axis.message.MessageElement [] _any;

    public ExecutePaymentRequest() {
    }

    public ExecutePaymentRequest(
           com.mgipaypal.paypal.client.RequestEnvelope requestEnvelope,
           java.lang.String payKey,
           java.lang.String actionType,
           java.lang.String fundingPlanId,
           org.apache.axis.message.MessageElement [] _any) {
           this.requestEnvelope = requestEnvelope;
           this.payKey = payKey;
           this.actionType = actionType;
           this.fundingPlanId = fundingPlanId;
           this._any = _any;
    }


    /**
     * Gets the requestEnvelope value for this ExecutePaymentRequest.
     * 
     * @return requestEnvelope
     */
    public com.mgipaypal.paypal.client.RequestEnvelope getRequestEnvelope() {
        return requestEnvelope;
    }


    /**
     * Sets the requestEnvelope value for this ExecutePaymentRequest.
     * 
     * @param requestEnvelope
     */
    public void setRequestEnvelope(com.mgipaypal.paypal.client.RequestEnvelope requestEnvelope) {
        this.requestEnvelope = requestEnvelope;
    }


    /**
     * Gets the payKey value for this ExecutePaymentRequest.
     * 
     * @return payKey
     */
    public java.lang.String getPayKey() {
        return payKey;
    }


    /**
     * Sets the payKey value for this ExecutePaymentRequest.
     * 
     * @param payKey
     */
    public void setPayKey(java.lang.String payKey) {
        this.payKey = payKey;
    }


    /**
     * Gets the actionType value for this ExecutePaymentRequest.
     * 
     * @return actionType   * Describes the action that is performed
     * 								by this API
     */
    public java.lang.String getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this ExecutePaymentRequest.
     * 
     * @param actionType   * Describes the action that is performed
     * 								by this API
     */
    public void setActionType(java.lang.String actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the fundingPlanId value for this ExecutePaymentRequest.
     * 
     * @return fundingPlanId
     */
    public java.lang.String getFundingPlanId() {
        return fundingPlanId;
    }


    /**
     * Sets the fundingPlanId value for this ExecutePaymentRequest.
     * 
     * @param fundingPlanId
     */
    public void setFundingPlanId(java.lang.String fundingPlanId) {
        this.fundingPlanId = fundingPlanId;
    }


    /**
     * Gets the _any value for this ExecutePaymentRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ExecutePaymentRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecutePaymentRequest)) return false;
        ExecutePaymentRequest other = (ExecutePaymentRequest) obj;
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
            ((this.payKey==null && other.getPayKey()==null) || 
             (this.payKey!=null &&
              this.payKey.equals(other.getPayKey()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.fundingPlanId==null && other.getFundingPlanId()==null) || 
             (this.fundingPlanId!=null &&
              this.fundingPlanId.equals(other.getFundingPlanId()))) &&
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
        if (getPayKey() != null) {
            _hashCode += getPayKey().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getFundingPlanId() != null) {
            _hashCode += getFundingPlanId().hashCode();
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
        new org.apache.axis.description.TypeDesc(ExecutePaymentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ExecutePaymentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "RequestEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fundingPlanId"));
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
