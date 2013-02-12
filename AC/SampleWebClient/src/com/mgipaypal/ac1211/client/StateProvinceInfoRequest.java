/**
 * StateProvinceInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class StateProvinceInfoRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private com.mgipaypal.ac1211.client.StateProvinceFilterType stateProvinceFilter;

    public StateProvinceInfoRequest() {
    }

    public StateProvinceInfoRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           com.mgipaypal.ac1211.client.StateProvinceFilterType stateProvinceFilter) {
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
        this.stateProvinceFilter = stateProvinceFilter;
    }


    /**
     * Gets the stateProvinceFilter value for this StateProvinceInfoRequest.
     * 
     * @return stateProvinceFilter
     */
    public com.mgipaypal.ac1211.client.StateProvinceFilterType getStateProvinceFilter() {
        return stateProvinceFilter;
    }


    /**
     * Sets the stateProvinceFilter value for this StateProvinceInfoRequest.
     * 
     * @param stateProvinceFilter
     */
    public void setStateProvinceFilter(com.mgipaypal.ac1211.client.StateProvinceFilterType stateProvinceFilter) {
        this.stateProvinceFilter = stateProvinceFilter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StateProvinceInfoRequest)) return false;
        StateProvinceInfoRequest other = (StateProvinceInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.stateProvinceFilter==null && other.getStateProvinceFilter()==null) || 
             (this.stateProvinceFilter!=null &&
              this.stateProvinceFilter.equals(other.getStateProvinceFilter())));
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
        if (getStateProvinceFilter() != null) {
            _hashCode += getStateProvinceFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StateProvinceInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "StateProvinceInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateProvinceFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateProvinceFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateProvinceFilterType"));
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
