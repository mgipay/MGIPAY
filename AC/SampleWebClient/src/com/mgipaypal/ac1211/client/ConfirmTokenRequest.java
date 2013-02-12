/**
 * ConfirmTokenRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ConfirmTokenRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String codeTableVersion;

    private com.mgipaypal.ac1211.client.VersionInfo[] clientTableVersions;

    public ConfirmTokenRequest() {
    }

    public ConfirmTokenRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String codeTableVersion,
           com.mgipaypal.ac1211.client.VersionInfo[] clientTableVersions) {
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
        this.codeTableVersion = codeTableVersion;
        this.clientTableVersions = clientTableVersions;
    }


    /**
     * Gets the codeTableVersion value for this ConfirmTokenRequest.
     * 
     * @return codeTableVersion
     */
    public java.lang.String getCodeTableVersion() {
        return codeTableVersion;
    }


    /**
     * Sets the codeTableVersion value for this ConfirmTokenRequest.
     * 
     * @param codeTableVersion
     */
    public void setCodeTableVersion(java.lang.String codeTableVersion) {
        this.codeTableVersion = codeTableVersion;
    }


    /**
     * Gets the clientTableVersions value for this ConfirmTokenRequest.
     * 
     * @return clientTableVersions
     */
    public com.mgipaypal.ac1211.client.VersionInfo[] getClientTableVersions() {
        return clientTableVersions;
    }


    /**
     * Sets the clientTableVersions value for this ConfirmTokenRequest.
     * 
     * @param clientTableVersions
     */
    public void setClientTableVersions(com.mgipaypal.ac1211.client.VersionInfo[] clientTableVersions) {
        this.clientTableVersions = clientTableVersions;
    }

    public com.mgipaypal.ac1211.client.VersionInfo getClientTableVersions(int i) {
        return this.clientTableVersions[i];
    }

    public void setClientTableVersions(int i, com.mgipaypal.ac1211.client.VersionInfo _value) {
        this.clientTableVersions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmTokenRequest)) return false;
        ConfirmTokenRequest other = (ConfirmTokenRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codeTableVersion==null && other.getCodeTableVersion()==null) || 
             (this.codeTableVersion!=null &&
              this.codeTableVersion.equals(other.getCodeTableVersion()))) &&
            ((this.clientTableVersions==null && other.getClientTableVersions()==null) || 
             (this.clientTableVersions!=null &&
              java.util.Arrays.equals(this.clientTableVersions, other.getClientTableVersions())));
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
        if (getCodeTableVersion() != null) {
            _hashCode += getCodeTableVersion().hashCode();
        }
        if (getClientTableVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientTableVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientTableVersions(), i);
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
        new org.apache.axis.description.TypeDesc(ConfirmTokenRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ConfirmTokenRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeTableVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "codeTableVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientTableVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "clientTableVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "VersionInfo"));
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
