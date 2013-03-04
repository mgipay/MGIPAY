/**
 * GetUserLimitsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * A response that contains a list of remaining
 * 						limits
 */
public class GetUserLimitsResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope;

    private com.paypal.axis.svcs.types.ap.UserLimit[] userLimit;

    private com.paypal.axis.svcs.types.ap.WarningData[] warningDataList;

    private org.apache.axis.message.MessageElement [] _any;

    public GetUserLimitsResponse() {
    }

    public GetUserLimitsResponse(
           com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope,
           com.paypal.axis.svcs.types.ap.UserLimit[] userLimit,
           com.paypal.axis.svcs.types.ap.WarningData[] warningDataList,
           org.apache.axis.message.MessageElement [] _any) {
           this.responseEnvelope = responseEnvelope;
           this.userLimit = userLimit;
           this.warningDataList = warningDataList;
           this._any = _any;
    }


    /**
     * Gets the responseEnvelope value for this GetUserLimitsResponse.
     * 
     * @return responseEnvelope
     */
    public com.paypal.axis.svcs.types.common.ResponseEnvelope getResponseEnvelope() {
        return responseEnvelope;
    }


    /**
     * Sets the responseEnvelope value for this GetUserLimitsResponse.
     * 
     * @param responseEnvelope
     */
    public void setResponseEnvelope(com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope) {
        this.responseEnvelope = responseEnvelope;
    }


    /**
     * Gets the userLimit value for this GetUserLimitsResponse.
     * 
     * @return userLimit
     */
    public com.paypal.axis.svcs.types.ap.UserLimit[] getUserLimit() {
        return userLimit;
    }


    /**
     * Sets the userLimit value for this GetUserLimitsResponse.
     * 
     * @param userLimit
     */
    public void setUserLimit(com.paypal.axis.svcs.types.ap.UserLimit[] userLimit) {
        this.userLimit = userLimit;
    }

    public com.paypal.axis.svcs.types.ap.UserLimit getUserLimit(int i) {
        return this.userLimit[i];
    }

    public void setUserLimit(int i, com.paypal.axis.svcs.types.ap.UserLimit _value) {
        this.userLimit[i] = _value;
    }


    /**
     * Gets the warningDataList value for this GetUserLimitsResponse.
     * 
     * @return warningDataList
     */
    public com.paypal.axis.svcs.types.ap.WarningData[] getWarningDataList() {
        return warningDataList;
    }


    /**
     * Sets the warningDataList value for this GetUserLimitsResponse.
     * 
     * @param warningDataList
     */
    public void setWarningDataList(com.paypal.axis.svcs.types.ap.WarningData[] warningDataList) {
        this.warningDataList = warningDataList;
    }


    /**
     * Gets the _any value for this GetUserLimitsResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetUserLimitsResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserLimitsResponse)) return false;
        GetUserLimitsResponse other = (GetUserLimitsResponse) obj;
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
            ((this.userLimit==null && other.getUserLimit()==null) || 
             (this.userLimit!=null &&
              java.util.Arrays.equals(this.userLimit, other.getUserLimit()))) &&
            ((this.warningDataList==null && other.getWarningDataList()==null) || 
             (this.warningDataList!=null &&
              java.util.Arrays.equals(this.warningDataList, other.getWarningDataList()))) &&
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
        if (getUserLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserLimit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWarningDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarningDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarningDataList(), i);
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
        new org.apache.axis.description.TypeDesc(GetUserLimitsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetUserLimitsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ResponseEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "UserLimit"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warningDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "WarningData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "warningData"));
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
