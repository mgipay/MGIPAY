/**
 * GetRelatedProfilesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class GetRelatedProfilesResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private int modelUnitProfileID;

    private boolean modelPOS;

    private com.mgipaypal.ac1211.client.ProfileInfo[] profileInfo;

    public GetRelatedProfilesResponse() {
    }

    public GetRelatedProfilesResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           int modelUnitProfileID,
           boolean modelPOS,
           com.mgipaypal.ac1211.client.ProfileInfo[] profileInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.modelUnitProfileID = modelUnitProfileID;
        this.modelPOS = modelPOS;
        this.profileInfo = profileInfo;
    }


    /**
     * Gets the modelUnitProfileID value for this GetRelatedProfilesResponse.
     * 
     * @return modelUnitProfileID
     */
    public int getModelUnitProfileID() {
        return modelUnitProfileID;
    }


    /**
     * Sets the modelUnitProfileID value for this GetRelatedProfilesResponse.
     * 
     * @param modelUnitProfileID
     */
    public void setModelUnitProfileID(int modelUnitProfileID) {
        this.modelUnitProfileID = modelUnitProfileID;
    }


    /**
     * Gets the modelPOS value for this GetRelatedProfilesResponse.
     * 
     * @return modelPOS
     */
    public boolean isModelPOS() {
        return modelPOS;
    }


    /**
     * Sets the modelPOS value for this GetRelatedProfilesResponse.
     * 
     * @param modelPOS
     */
    public void setModelPOS(boolean modelPOS) {
        this.modelPOS = modelPOS;
    }


    /**
     * Gets the profileInfo value for this GetRelatedProfilesResponse.
     * 
     * @return profileInfo
     */
    public com.mgipaypal.ac1211.client.ProfileInfo[] getProfileInfo() {
        return profileInfo;
    }


    /**
     * Sets the profileInfo value for this GetRelatedProfilesResponse.
     * 
     * @param profileInfo
     */
    public void setProfileInfo(com.mgipaypal.ac1211.client.ProfileInfo[] profileInfo) {
        this.profileInfo = profileInfo;
    }

    public com.mgipaypal.ac1211.client.ProfileInfo getProfileInfo(int i) {
        return this.profileInfo[i];
    }

    public void setProfileInfo(int i, com.mgipaypal.ac1211.client.ProfileInfo _value) {
        this.profileInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRelatedProfilesResponse)) return false;
        GetRelatedProfilesResponse other = (GetRelatedProfilesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.modelUnitProfileID == other.getModelUnitProfileID() &&
            this.modelPOS == other.isModelPOS() &&
            ((this.profileInfo==null && other.getProfileInfo()==null) || 
             (this.profileInfo!=null &&
              java.util.Arrays.equals(this.profileInfo, other.getProfileInfo())));
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
        _hashCode += getModelUnitProfileID();
        _hashCode += (isModelPOS() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProfileInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfileInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfileInfo(), i);
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
        new org.apache.axis.description.TypeDesc(GetRelatedProfilesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetRelatedProfilesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelUnitProfileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "modelUnitProfileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelPOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "modelPOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "profileInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProfileInfo"));
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
