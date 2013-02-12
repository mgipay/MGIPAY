/**
 * Error.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class Error  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.math.BigInteger errorCode;

    private java.lang.String errorString;

    private java.math.BigInteger subErrorCode;

    private java.lang.String offendingField;

    private java.util.Calendar timeStamp;

    private java.lang.String detailString;

    public Error() {
    }

    public Error(
           java.math.BigInteger errorCode,
           java.lang.String errorString,
           java.math.BigInteger subErrorCode,
           java.lang.String offendingField,
           java.util.Calendar timeStamp,
           java.lang.String detailString) {
        this.errorCode = errorCode;
        this.errorString = errorString;
        this.subErrorCode = subErrorCode;
        this.offendingField = offendingField;
        this.timeStamp = timeStamp;
        this.detailString = detailString;
    }


    /**
     * Gets the errorCode value for this Error.
     * 
     * @return errorCode
     */
    public java.math.BigInteger getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this Error.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.math.BigInteger errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorString value for this Error.
     * 
     * @return errorString
     */
    public java.lang.String getErrorString() {
        return errorString;
    }


    /**
     * Sets the errorString value for this Error.
     * 
     * @param errorString
     */
    public void setErrorString(java.lang.String errorString) {
        this.errorString = errorString;
    }


    /**
     * Gets the subErrorCode value for this Error.
     * 
     * @return subErrorCode
     */
    public java.math.BigInteger getSubErrorCode() {
        return subErrorCode;
    }


    /**
     * Sets the subErrorCode value for this Error.
     * 
     * @param subErrorCode
     */
    public void setSubErrorCode(java.math.BigInteger subErrorCode) {
        this.subErrorCode = subErrorCode;
    }


    /**
     * Gets the offendingField value for this Error.
     * 
     * @return offendingField
     */
    public java.lang.String getOffendingField() {
        return offendingField;
    }


    /**
     * Sets the offendingField value for this Error.
     * 
     * @param offendingField
     */
    public void setOffendingField(java.lang.String offendingField) {
        this.offendingField = offendingField;
    }


    /**
     * Gets the timeStamp value for this Error.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this Error.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the detailString value for this Error.
     * 
     * @return detailString
     */
    public java.lang.String getDetailString() {
        return detailString;
    }


    /**
     * Sets the detailString value for this Error.
     * 
     * @param detailString
     */
    public void setDetailString(java.lang.String detailString) {
        this.detailString = detailString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Error)) return false;
        Error other = (Error) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorString==null && other.getErrorString()==null) || 
             (this.errorString!=null &&
              this.errorString.equals(other.getErrorString()))) &&
            ((this.subErrorCode==null && other.getSubErrorCode()==null) || 
             (this.subErrorCode!=null &&
              this.subErrorCode.equals(other.getSubErrorCode()))) &&
            ((this.offendingField==null && other.getOffendingField()==null) || 
             (this.offendingField!=null &&
              this.offendingField.equals(other.getOffendingField()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.detailString==null && other.getDetailString()==null) || 
             (this.detailString!=null &&
              this.detailString.equals(other.getDetailString())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorString() != null) {
            _hashCode += getErrorString().hashCode();
        }
        if (getSubErrorCode() != null) {
            _hashCode += getSubErrorCode().hashCode();
        }
        if (getOffendingField() != null) {
            _hashCode += getOffendingField().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getDetailString() != null) {
            _hashCode += getDetailString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Error.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "errorString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "subErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offendingField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "offendingField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "detailString"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
