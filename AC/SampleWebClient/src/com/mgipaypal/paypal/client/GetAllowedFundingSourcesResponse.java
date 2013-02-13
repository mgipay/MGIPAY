/**
 * GetAllowedFundingSourcesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * The response to get the backup funding sources
 * 						available for a preapproval.
 */
public class GetAllowedFundingSourcesResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.mgipaypal.paypal.client.ResponseEnvelope responseEnvelope;

    private com.mgipaypal.paypal.client.FundingSource[] fundingSource;

    private org.apache.axis.message.MessageElement [] _any;

    public GetAllowedFundingSourcesResponse() {
    }

    public GetAllowedFundingSourcesResponse(
           com.mgipaypal.paypal.client.ResponseEnvelope responseEnvelope,
           com.mgipaypal.paypal.client.FundingSource[] fundingSource,
           org.apache.axis.message.MessageElement [] _any) {
           this.responseEnvelope = responseEnvelope;
           this.fundingSource = fundingSource;
           this._any = _any;
    }


    /**
     * Gets the responseEnvelope value for this GetAllowedFundingSourcesResponse.
     * 
     * @return responseEnvelope
     */
    public com.mgipaypal.paypal.client.ResponseEnvelope getResponseEnvelope() {
        return responseEnvelope;
    }


    /**
     * Sets the responseEnvelope value for this GetAllowedFundingSourcesResponse.
     * 
     * @param responseEnvelope
     */
    public void setResponseEnvelope(com.mgipaypal.paypal.client.ResponseEnvelope responseEnvelope) {
        this.responseEnvelope = responseEnvelope;
    }


    /**
     * Gets the fundingSource value for this GetAllowedFundingSourcesResponse.
     * 
     * @return fundingSource
     */
    public com.mgipaypal.paypal.client.FundingSource[] getFundingSource() {
        return fundingSource;
    }


    /**
     * Sets the fundingSource value for this GetAllowedFundingSourcesResponse.
     * 
     * @param fundingSource
     */
    public void setFundingSource(com.mgipaypal.paypal.client.FundingSource[] fundingSource) {
        this.fundingSource = fundingSource;
    }

    public com.mgipaypal.paypal.client.FundingSource getFundingSource(int i) {
        return this.fundingSource[i];
    }

    public void setFundingSource(int i, com.mgipaypal.paypal.client.FundingSource _value) {
        this.fundingSource[i] = _value;
    }


    /**
     * Gets the _any value for this GetAllowedFundingSourcesResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetAllowedFundingSourcesResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllowedFundingSourcesResponse)) return false;
        GetAllowedFundingSourcesResponse other = (GetAllowedFundingSourcesResponse) obj;
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
            ((this.fundingSource==null && other.getFundingSource()==null) || 
             (this.fundingSource!=null &&
              java.util.Arrays.equals(this.fundingSource, other.getFundingSource()))) &&
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
        if (getFundingSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFundingSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFundingSource(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllowedFundingSourcesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAllowedFundingSourcesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ResponseEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fundingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingSource"));
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
