/**
 * BillPaymentConsumerLookupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class BillPaymentConsumerLookupResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private com.mgipaypal.ac1211.client.SenderLookupInfo[] senderInfo;

    public BillPaymentConsumerLookupResponse() {
    }

    public BillPaymentConsumerLookupResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.mgipaypal.ac1211.client.SenderLookupInfo[] senderInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.senderInfo = senderInfo;
    }


    /**
     * Gets the senderInfo value for this BillPaymentConsumerLookupResponse.
     * 
     * @return senderInfo
     */
    public com.mgipaypal.ac1211.client.SenderLookupInfo[] getSenderInfo() {
        return senderInfo;
    }


    /**
     * Sets the senderInfo value for this BillPaymentConsumerLookupResponse.
     * 
     * @param senderInfo
     */
    public void setSenderInfo(com.mgipaypal.ac1211.client.SenderLookupInfo[] senderInfo) {
        this.senderInfo = senderInfo;
    }

    public com.mgipaypal.ac1211.client.SenderLookupInfo getSenderInfo(int i) {
        return this.senderInfo[i];
    }

    public void setSenderInfo(int i, com.mgipaypal.ac1211.client.SenderLookupInfo _value) {
        this.senderInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentConsumerLookupResponse)) return false;
        BillPaymentConsumerLookupResponse other = (BillPaymentConsumerLookupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.senderInfo==null && other.getSenderInfo()==null) || 
             (this.senderInfo!=null &&
              java.util.Arrays.equals(this.senderInfo, other.getSenderInfo())));
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
        if (getSenderInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSenderInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSenderInfo(), i);
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
        new org.apache.axis.description.TypeDesc(BillPaymentConsumerLookupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentConsumerLookupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SenderLookupInfo"));
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
