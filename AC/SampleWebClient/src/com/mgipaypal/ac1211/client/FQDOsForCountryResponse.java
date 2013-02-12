/**
 * FQDOsForCountryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class FQDOsForCountryResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private com.mgipaypal.ac1211.client.FQDOInfo[] fqdoInfo;

    public FQDOsForCountryResponse() {
    }

    public FQDOsForCountryResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.mgipaypal.ac1211.client.FQDOInfo[] fqdoInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.fqdoInfo = fqdoInfo;
    }


    /**
     * Gets the fqdoInfo value for this FQDOsForCountryResponse.
     * 
     * @return fqdoInfo
     */
    public com.mgipaypal.ac1211.client.FQDOInfo[] getFqdoInfo() {
        return fqdoInfo;
    }


    /**
     * Sets the fqdoInfo value for this FQDOsForCountryResponse.
     * 
     * @param fqdoInfo
     */
    public void setFqdoInfo(com.mgipaypal.ac1211.client.FQDOInfo[] fqdoInfo) {
        this.fqdoInfo = fqdoInfo;
    }

    public com.mgipaypal.ac1211.client.FQDOInfo getFqdoInfo(int i) {
        return this.fqdoInfo[i];
    }

    public void setFqdoInfo(int i, com.mgipaypal.ac1211.client.FQDOInfo _value) {
        this.fqdoInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FQDOsForCountryResponse)) return false;
        FQDOsForCountryResponse other = (FQDOsForCountryResponse) obj;
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
              java.util.Arrays.equals(this.fqdoInfo, other.getFqdoInfo())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFqdoInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFqdoInfo(), i);
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
        new org.apache.axis.description.TypeDesc(FQDOsForCountryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FQDOsForCountryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fqdoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fqdoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FQDOInfo"));
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
