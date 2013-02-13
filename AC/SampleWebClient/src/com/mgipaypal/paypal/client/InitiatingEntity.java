/**
 * InitiatingEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * Details about the party that initiated this
 * 						payment. The API user is making this payment on
 * 						behalf of the initiator. The initiator can
 * 						simply be an institution or a customer of the
 * 						institution.
 */
public class InitiatingEntity  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.mgipaypal.paypal.client.InstitutionCustomer institutionCustomer;

    private org.apache.axis.message.MessageElement [] _any;

    public InitiatingEntity() {
    }

    public InitiatingEntity(
           com.mgipaypal.paypal.client.InstitutionCustomer institutionCustomer,
           org.apache.axis.message.MessageElement [] _any) {
           this.institutionCustomer = institutionCustomer;
           this._any = _any;
    }


    /**
     * Gets the institutionCustomer value for this InitiatingEntity.
     * 
     * @return institutionCustomer
     */
    public com.mgipaypal.paypal.client.InstitutionCustomer getInstitutionCustomer() {
        return institutionCustomer;
    }


    /**
     * Sets the institutionCustomer value for this InitiatingEntity.
     * 
     * @param institutionCustomer
     */
    public void setInstitutionCustomer(com.mgipaypal.paypal.client.InstitutionCustomer institutionCustomer) {
        this.institutionCustomer = institutionCustomer;
    }


    /**
     * Gets the _any value for this InitiatingEntity.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this InitiatingEntity.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitiatingEntity)) return false;
        InitiatingEntity other = (InitiatingEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.institutionCustomer==null && other.getInstitutionCustomer()==null) || 
             (this.institutionCustomer!=null &&
              this.institutionCustomer.equals(other.getInstitutionCustomer()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInstitutionCustomer() != null) {
            _hashCode += getInstitutionCustomer().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(InitiatingEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "InitiatingEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institutionCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "institutionCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "InstitutionCustomer"));
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
