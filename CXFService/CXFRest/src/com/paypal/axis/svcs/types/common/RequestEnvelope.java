/**
 * RequestEnvelope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.common;


/**
 * This specifies the list of parameters with every
 * 						request to the service.
 */
public class RequestEnvelope  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    /* This specifies the required detail level
     * 								that is needed by a client application
     * 								pertaining to a particular data
     * 								component (e.g., Item, Transaction,
     * 								etc.). The detail level is specified in
     * 								the DetailLevelCodeType which has all
     * 								the enumerated values of the detail
     * 								level for each component. */
    private com.paypal.axis.svcs.types.common.DetailLevelCode detailLevel;

    /* This should be the standard RFC 3066
     * 								language identification tag, e.g.,
     * 								en_US. */
    private java.lang.String errorLanguage;

    private org.apache.axis.message.MessageElement [] _any;

    public RequestEnvelope() {
    }

    public RequestEnvelope(
           com.paypal.axis.svcs.types.common.DetailLevelCode detailLevel,
           java.lang.String errorLanguage,
           org.apache.axis.message.MessageElement [] _any) {
           this.detailLevel = detailLevel;
           this.errorLanguage = errorLanguage;
           this._any = _any;
    }


    /**
     * Gets the detailLevel value for this RequestEnvelope.
     * 
     * @return detailLevel   * This specifies the required detail level
     * 								that is needed by a client application
     * 								pertaining to a particular data
     * 								component (e.g., Item, Transaction,
     * 								etc.). The detail level is specified in
     * 								the DetailLevelCodeType which has all
     * 								the enumerated values of the detail
     * 								level for each component.
     */
    public com.paypal.axis.svcs.types.common.DetailLevelCode getDetailLevel() {
        return detailLevel;
    }


    /**
     * Sets the detailLevel value for this RequestEnvelope.
     * 
     * @param detailLevel   * This specifies the required detail level
     * 								that is needed by a client application
     * 								pertaining to a particular data
     * 								component (e.g., Item, Transaction,
     * 								etc.). The detail level is specified in
     * 								the DetailLevelCodeType which has all
     * 								the enumerated values of the detail
     * 								level for each component.
     */
    public void setDetailLevel(com.paypal.axis.svcs.types.common.DetailLevelCode detailLevel) {
        this.detailLevel = detailLevel;
    }


    /**
     * Gets the errorLanguage value for this RequestEnvelope.
     * 
     * @return errorLanguage   * This should be the standard RFC 3066
     * 								language identification tag, e.g.,
     * 								en_US.
     */
    public java.lang.String getErrorLanguage() {
        return errorLanguage;
    }


    /**
     * Sets the errorLanguage value for this RequestEnvelope.
     * 
     * @param errorLanguage   * This should be the standard RFC 3066
     * 								language identification tag, e.g.,
     * 								en_US.
     */
    public void setErrorLanguage(java.lang.String errorLanguage) {
        this.errorLanguage = errorLanguage;
    }


    /**
     * Gets the _any value for this RequestEnvelope.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this RequestEnvelope.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEnvelope)) return false;
        RequestEnvelope other = (RequestEnvelope) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detailLevel==null && other.getDetailLevel()==null) || 
             (this.detailLevel!=null &&
              this.detailLevel.equals(other.getDetailLevel()))) &&
            ((this.errorLanguage==null && other.getErrorLanguage()==null) || 
             (this.errorLanguage!=null &&
              this.errorLanguage.equals(other.getErrorLanguage()))) &&
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
        if (getDetailLevel() != null) {
            _hashCode += getDetailLevel().hashCode();
        }
        if (getErrorLanguage() != null) {
            _hashCode += getErrorLanguage().hashCode();
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
        new org.apache.axis.description.TypeDesc(RequestEnvelope.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "RequestEnvelope"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detailLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "DetailLevelCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
