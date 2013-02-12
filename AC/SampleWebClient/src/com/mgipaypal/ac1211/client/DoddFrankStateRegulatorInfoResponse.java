/**
 * DoddFrankStateRegulatorInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class DoddFrankStateRegulatorInfoResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String version;

    private com.mgipaypal.ac1211.client.StateRegulatorInfo[] stateRegulatorInfo;

    public DoddFrankStateRegulatorInfoResponse() {
    }

    public DoddFrankStateRegulatorInfoResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String version,
           com.mgipaypal.ac1211.client.StateRegulatorInfo[] stateRegulatorInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.version = version;
        this.stateRegulatorInfo = stateRegulatorInfo;
    }


    /**
     * Gets the version value for this DoddFrankStateRegulatorInfoResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this DoddFrankStateRegulatorInfoResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the stateRegulatorInfo value for this DoddFrankStateRegulatorInfoResponse.
     * 
     * @return stateRegulatorInfo
     */
    public com.mgipaypal.ac1211.client.StateRegulatorInfo[] getStateRegulatorInfo() {
        return stateRegulatorInfo;
    }


    /**
     * Sets the stateRegulatorInfo value for this DoddFrankStateRegulatorInfoResponse.
     * 
     * @param stateRegulatorInfo
     */
    public void setStateRegulatorInfo(com.mgipaypal.ac1211.client.StateRegulatorInfo[] stateRegulatorInfo) {
        this.stateRegulatorInfo = stateRegulatorInfo;
    }

    public com.mgipaypal.ac1211.client.StateRegulatorInfo getStateRegulatorInfo(int i) {
        return this.stateRegulatorInfo[i];
    }

    public void setStateRegulatorInfo(int i, com.mgipaypal.ac1211.client.StateRegulatorInfo _value) {
        this.stateRegulatorInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoddFrankStateRegulatorInfoResponse)) return false;
        DoddFrankStateRegulatorInfoResponse other = (DoddFrankStateRegulatorInfoResponse) obj;
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
            ((this.stateRegulatorInfo==null && other.getStateRegulatorInfo()==null) || 
             (this.stateRegulatorInfo!=null &&
              java.util.Arrays.equals(this.stateRegulatorInfo, other.getStateRegulatorInfo())));
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
        if (getStateRegulatorInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStateRegulatorInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStateRegulatorInfo(), i);
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
        new org.apache.axis.description.TypeDesc(DoddFrankStateRegulatorInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DoddFrankStateRegulatorInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateRegulatorInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateRegulatorInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateRegulatorInfo"));
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
