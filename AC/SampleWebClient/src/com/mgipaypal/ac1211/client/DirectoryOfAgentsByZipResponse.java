/**
 * DirectoryOfAgentsByZipResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class DirectoryOfAgentsByZipResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private com.mgipaypal.ac1211.client.AgentInfo[] agentInfo;

    public DirectoryOfAgentsByZipResponse() {
    }

    public DirectoryOfAgentsByZipResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.mgipaypal.ac1211.client.AgentInfo[] agentInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.agentInfo = agentInfo;
    }


    /**
     * Gets the agentInfo value for this DirectoryOfAgentsByZipResponse.
     * 
     * @return agentInfo
     */
    public com.mgipaypal.ac1211.client.AgentInfo[] getAgentInfo() {
        return agentInfo;
    }


    /**
     * Sets the agentInfo value for this DirectoryOfAgentsByZipResponse.
     * 
     * @param agentInfo
     */
    public void setAgentInfo(com.mgipaypal.ac1211.client.AgentInfo[] agentInfo) {
        this.agentInfo = agentInfo;
    }

    public com.mgipaypal.ac1211.client.AgentInfo getAgentInfo(int i) {
        return this.agentInfo[i];
    }

    public void setAgentInfo(int i, com.mgipaypal.ac1211.client.AgentInfo _value) {
        this.agentInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DirectoryOfAgentsByZipResponse)) return false;
        DirectoryOfAgentsByZipResponse other = (DirectoryOfAgentsByZipResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.agentInfo==null && other.getAgentInfo()==null) || 
             (this.agentInfo!=null &&
              java.util.Arrays.equals(this.agentInfo, other.getAgentInfo())));
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
        if (getAgentInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgentInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgentInfo(), i);
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
        new org.apache.axis.description.TypeDesc(DirectoryOfAgentsByZipResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByZipResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "AgentInfo"));
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
