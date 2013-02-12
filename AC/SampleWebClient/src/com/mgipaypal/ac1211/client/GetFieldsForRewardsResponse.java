/**
 * GetFieldsForRewardsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class GetFieldsForRewardsResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private com.mgipaypal.ac1211.client.RewardsFieldInfo[] rewardsFieldInfo;

    public GetFieldsForRewardsResponse() {
    }

    public GetFieldsForRewardsResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.mgipaypal.ac1211.client.RewardsFieldInfo[] rewardsFieldInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.rewardsFieldInfo = rewardsFieldInfo;
    }


    /**
     * Gets the rewardsFieldInfo value for this GetFieldsForRewardsResponse.
     * 
     * @return rewardsFieldInfo
     */
    public com.mgipaypal.ac1211.client.RewardsFieldInfo[] getRewardsFieldInfo() {
        return rewardsFieldInfo;
    }


    /**
     * Sets the rewardsFieldInfo value for this GetFieldsForRewardsResponse.
     * 
     * @param rewardsFieldInfo
     */
    public void setRewardsFieldInfo(com.mgipaypal.ac1211.client.RewardsFieldInfo[] rewardsFieldInfo) {
        this.rewardsFieldInfo = rewardsFieldInfo;
    }

    public com.mgipaypal.ac1211.client.RewardsFieldInfo getRewardsFieldInfo(int i) {
        return this.rewardsFieldInfo[i];
    }

    public void setRewardsFieldInfo(int i, com.mgipaypal.ac1211.client.RewardsFieldInfo _value) {
        this.rewardsFieldInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFieldsForRewardsResponse)) return false;
        GetFieldsForRewardsResponse other = (GetFieldsForRewardsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rewardsFieldInfo==null && other.getRewardsFieldInfo()==null) || 
             (this.rewardsFieldInfo!=null &&
              java.util.Arrays.equals(this.rewardsFieldInfo, other.getRewardsFieldInfo())));
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
        if (getRewardsFieldInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRewardsFieldInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRewardsFieldInfo(), i);
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
        new org.apache.axis.description.TypeDesc(GetFieldsForRewardsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFieldsForRewardsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rewardsFieldInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "rewardsFieldInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RewardsFieldInfo"));
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
