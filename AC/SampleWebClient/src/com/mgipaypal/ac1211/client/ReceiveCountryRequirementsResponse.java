/**
 * ReceiveCountryRequirementsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ReceiveCountryRequirementsResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String version;

    private com.mgipaypal.ac1211.client.ReceiveCountryRequirementsInfo[] receiveCountryRequirementsInfo;

    public ReceiveCountryRequirementsResponse() {
    }

    public ReceiveCountryRequirementsResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String version,
           com.mgipaypal.ac1211.client.ReceiveCountryRequirementsInfo[] receiveCountryRequirementsInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.version = version;
        this.receiveCountryRequirementsInfo = receiveCountryRequirementsInfo;
    }


    /**
     * Gets the version value for this ReceiveCountryRequirementsResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ReceiveCountryRequirementsResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the receiveCountryRequirementsInfo value for this ReceiveCountryRequirementsResponse.
     * 
     * @return receiveCountryRequirementsInfo
     */
    public com.mgipaypal.ac1211.client.ReceiveCountryRequirementsInfo[] getReceiveCountryRequirementsInfo() {
        return receiveCountryRequirementsInfo;
    }


    /**
     * Sets the receiveCountryRequirementsInfo value for this ReceiveCountryRequirementsResponse.
     * 
     * @param receiveCountryRequirementsInfo
     */
    public void setReceiveCountryRequirementsInfo(com.mgipaypal.ac1211.client.ReceiveCountryRequirementsInfo[] receiveCountryRequirementsInfo) {
        this.receiveCountryRequirementsInfo = receiveCountryRequirementsInfo;
    }

    public com.mgipaypal.ac1211.client.ReceiveCountryRequirementsInfo getReceiveCountryRequirementsInfo(int i) {
        return this.receiveCountryRequirementsInfo[i];
    }

    public void setReceiveCountryRequirementsInfo(int i, com.mgipaypal.ac1211.client.ReceiveCountryRequirementsInfo _value) {
        this.receiveCountryRequirementsInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiveCountryRequirementsResponse)) return false;
        ReceiveCountryRequirementsResponse other = (ReceiveCountryRequirementsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.receiveCountryRequirementsInfo==null && other.getReceiveCountryRequirementsInfo()==null) || 
             (this.receiveCountryRequirementsInfo!=null &&
              java.util.Arrays.equals(this.receiveCountryRequirementsInfo, other.getReceiveCountryRequirementsInfo())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getReceiveCountryRequirementsInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiveCountryRequirementsInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiveCountryRequirementsInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ReceiveCountryRequirementsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveCountryRequirementsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCountryRequirementsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCountryRequirementsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveCountryRequirementsInfo"));
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
