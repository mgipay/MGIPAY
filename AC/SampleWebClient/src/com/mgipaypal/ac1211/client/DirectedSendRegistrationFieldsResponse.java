/**
 * DirectedSendRegistrationFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class DirectedSendRegistrationFieldsResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private com.mgipaypal.ac1211.client.FQDOInfo fqdoInfo;

    private com.mgipaypal.ac1211.client.RegistrationFieldInfo[] registrationFieldInfo;

    public DirectedSendRegistrationFieldsResponse() {
    }

    public DirectedSendRegistrationFieldsResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.mgipaypal.ac1211.client.FQDOInfo fqdoInfo,
           com.mgipaypal.ac1211.client.RegistrationFieldInfo[] registrationFieldInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.fqdoInfo = fqdoInfo;
        this.registrationFieldInfo = registrationFieldInfo;
    }


    /**
     * Gets the fqdoInfo value for this DirectedSendRegistrationFieldsResponse.
     * 
     * @return fqdoInfo
     */
    public com.mgipaypal.ac1211.client.FQDOInfo getFqdoInfo() {
        return fqdoInfo;
    }


    /**
     * Sets the fqdoInfo value for this DirectedSendRegistrationFieldsResponse.
     * 
     * @param fqdoInfo
     */
    public void setFqdoInfo(com.mgipaypal.ac1211.client.FQDOInfo fqdoInfo) {
        this.fqdoInfo = fqdoInfo;
    }


    /**
     * Gets the registrationFieldInfo value for this DirectedSendRegistrationFieldsResponse.
     * 
     * @return registrationFieldInfo
     */
    public com.mgipaypal.ac1211.client.RegistrationFieldInfo[] getRegistrationFieldInfo() {
        return registrationFieldInfo;
    }


    /**
     * Sets the registrationFieldInfo value for this DirectedSendRegistrationFieldsResponse.
     * 
     * @param registrationFieldInfo
     */
    public void setRegistrationFieldInfo(com.mgipaypal.ac1211.client.RegistrationFieldInfo[] registrationFieldInfo) {
        this.registrationFieldInfo = registrationFieldInfo;
    }

    public com.mgipaypal.ac1211.client.RegistrationFieldInfo getRegistrationFieldInfo(int i) {
        return this.registrationFieldInfo[i];
    }

    public void setRegistrationFieldInfo(int i, com.mgipaypal.ac1211.client.RegistrationFieldInfo _value) {
        this.registrationFieldInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DirectedSendRegistrationFieldsResponse)) return false;
        DirectedSendRegistrationFieldsResponse other = (DirectedSendRegistrationFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fqdoInfo==null && other.getFqdoInfo()==null) || 
             (this.fqdoInfo!=null &&
              this.fqdoInfo.equals(other.getFqdoInfo()))) &&
            ((this.registrationFieldInfo==null && other.getRegistrationFieldInfo()==null) || 
             (this.registrationFieldInfo!=null &&
              java.util.Arrays.equals(this.registrationFieldInfo, other.getRegistrationFieldInfo())));
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
        if (getFqdoInfo() != null) {
            _hashCode += getFqdoInfo().hashCode();
        }
        if (getRegistrationFieldInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistrationFieldInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistrationFieldInfo(), i);
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
        new org.apache.axis.description.TypeDesc(DirectedSendRegistrationFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectedSendRegistrationFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fqdoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fqdoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FQDOInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationFieldInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "registrationFieldInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RegistrationFieldInfo"));
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
