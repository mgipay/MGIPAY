/**
 * FormFreeTranLookupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class FormFreeTranLookupResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private com.mgipaypal.ac1211.client.FormFreeTransactionInfo[] formFreeTransactionInfo;

    public FormFreeTranLookupResponse() {
    }

    public FormFreeTranLookupResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.mgipaypal.ac1211.client.FormFreeTransactionInfo[] formFreeTransactionInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.formFreeTransactionInfo = formFreeTransactionInfo;
    }


    /**
     * Gets the formFreeTransactionInfo value for this FormFreeTranLookupResponse.
     * 
     * @return formFreeTransactionInfo
     */
    public com.mgipaypal.ac1211.client.FormFreeTransactionInfo[] getFormFreeTransactionInfo() {
        return formFreeTransactionInfo;
    }


    /**
     * Sets the formFreeTransactionInfo value for this FormFreeTranLookupResponse.
     * 
     * @param formFreeTransactionInfo
     */
    public void setFormFreeTransactionInfo(com.mgipaypal.ac1211.client.FormFreeTransactionInfo[] formFreeTransactionInfo) {
        this.formFreeTransactionInfo = formFreeTransactionInfo;
    }

    public com.mgipaypal.ac1211.client.FormFreeTransactionInfo getFormFreeTransactionInfo(int i) {
        return this.formFreeTransactionInfo[i];
    }

    public void setFormFreeTransactionInfo(int i, com.mgipaypal.ac1211.client.FormFreeTransactionInfo _value) {
        this.formFreeTransactionInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormFreeTranLookupResponse)) return false;
        FormFreeTranLookupResponse other = (FormFreeTranLookupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.formFreeTransactionInfo==null && other.getFormFreeTransactionInfo()==null) || 
             (this.formFreeTransactionInfo!=null &&
              java.util.Arrays.equals(this.formFreeTransactionInfo, other.getFormFreeTransactionInfo())));
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
        if (getFormFreeTransactionInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFormFreeTransactionInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFormFreeTransactionInfo(), i);
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
        new org.apache.axis.description.TypeDesc(FormFreeTranLookupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeTranLookupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formFreeTransactionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "formFreeTransactionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeTransactionInfo"));
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
