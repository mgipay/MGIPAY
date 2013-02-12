/**
 * CityListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class CityListResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String[] city;

    public CityListResponse() {
    }

    public CityListResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String[] city) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.city = city;
    }


    /**
     * Gets the city value for this CityListResponse.
     * 
     * @return city
     */
    public java.lang.String[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this CityListResponse.
     * 
     * @param city
     */
    public void setCity(java.lang.String[] city) {
        this.city = city;
    }

    public java.lang.String getCity(int i) {
        return this.city[i];
    }

    public void setCity(int i, java.lang.String _value) {
        this.city[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CityListResponse)) return false;
        CityListResponse other = (CityListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity())));
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
        if (getCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCity(), i);
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
        new org.apache.axis.description.TypeDesc(CityListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CityListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentCityType"));
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
