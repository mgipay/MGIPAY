/**
 * ReferenceNumberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ReferenceNumberRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String referenceNumber;

    private java.lang.String pin;

    private java.lang.String operatorName;

    public ReferenceNumberRequest() {
    }

    public ReferenceNumberRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String referenceNumber,
           java.lang.String pin,
           java.lang.String operatorName) {
        super(
            unitProfileID,
            agentID,
            agentSequence,
            token,
            language,
            timeStamp,
            apiVersion,
            clientSoftwareVersion,
            userID);
        this.referenceNumber = referenceNumber;
        this.pin = pin;
        this.operatorName = operatorName;
    }


    /**
     * Gets the referenceNumber value for this ReferenceNumberRequest.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this ReferenceNumberRequest.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the pin value for this ReferenceNumberRequest.
     * 
     * @return pin
     */
    public java.lang.String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this ReferenceNumberRequest.
     * 
     * @param pin
     */
    public void setPin(java.lang.String pin) {
        this.pin = pin;
    }


    /**
     * Gets the operatorName value for this ReferenceNumberRequest.
     * 
     * @return operatorName
     */
    public java.lang.String getOperatorName() {
        return operatorName;
    }


    /**
     * Sets the operatorName value for this ReferenceNumberRequest.
     * 
     * @param operatorName
     */
    public void setOperatorName(java.lang.String operatorName) {
        this.operatorName = operatorName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReferenceNumberRequest)) return false;
        ReferenceNumberRequest other = (ReferenceNumberRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.operatorName==null && other.getOperatorName()==null) || 
             (this.operatorName!=null &&
              this.operatorName.equals(other.getOperatorName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getOperatorName() != null) {
            _hashCode += getOperatorName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReferenceNumberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "pin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "operatorName"));
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
