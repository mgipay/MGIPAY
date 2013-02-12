/**
 * DirectedSendRegistrationFieldsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class DirectedSendRegistrationFieldsRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String receiveCountry;

    private java.lang.String deliveryOption;

    private java.lang.String receiveAgentID;

    private java.lang.String receiveCurrency;

    public DirectedSendRegistrationFieldsRequest() {
    }

    public DirectedSendRegistrationFieldsRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String receiveCountry,
           java.lang.String deliveryOption,
           java.lang.String receiveAgentID,
           java.lang.String receiveCurrency) {
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
        this.receiveCountry = receiveCountry;
        this.deliveryOption = deliveryOption;
        this.receiveAgentID = receiveAgentID;
        this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the receiveCountry value for this DirectedSendRegistrationFieldsRequest.
     * 
     * @return receiveCountry
     */
    public java.lang.String getReceiveCountry() {
        return receiveCountry;
    }


    /**
     * Sets the receiveCountry value for this DirectedSendRegistrationFieldsRequest.
     * 
     * @param receiveCountry
     */
    public void setReceiveCountry(java.lang.String receiveCountry) {
        this.receiveCountry = receiveCountry;
    }


    /**
     * Gets the deliveryOption value for this DirectedSendRegistrationFieldsRequest.
     * 
     * @return deliveryOption
     */
    public java.lang.String getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this DirectedSendRegistrationFieldsRequest.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(java.lang.String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the receiveAgentID value for this DirectedSendRegistrationFieldsRequest.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this DirectedSendRegistrationFieldsRequest.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the receiveCurrency value for this DirectedSendRegistrationFieldsRequest.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this DirectedSendRegistrationFieldsRequest.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DirectedSendRegistrationFieldsRequest)) return false;
        DirectedSendRegistrationFieldsRequest other = (DirectedSendRegistrationFieldsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.receiveCountry==null && other.getReceiveCountry()==null) || 
             (this.receiveCountry!=null &&
              this.receiveCountry.equals(other.getReceiveCountry()))) &&
            ((this.deliveryOption==null && other.getDeliveryOption()==null) || 
             (this.deliveryOption!=null &&
              this.deliveryOption.equals(other.getDeliveryOption()))) &&
            ((this.receiveAgentID==null && other.getReceiveAgentID()==null) || 
             (this.receiveAgentID!=null &&
              this.receiveAgentID.equals(other.getReceiveAgentID()))) &&
            ((this.receiveCurrency==null && other.getReceiveCurrency()==null) || 
             (this.receiveCurrency!=null &&
              this.receiveCurrency.equals(other.getReceiveCurrency())));
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
        if (getReceiveCountry() != null) {
            _hashCode += getReceiveCountry().hashCode();
        }
        if (getDeliveryOption() != null) {
            _hashCode += getDeliveryOption().hashCode();
        }
        if (getReceiveAgentID() != null) {
            _hashCode += getReceiveAgentID().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DirectedSendRegistrationFieldsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectedSendRegistrationFieldsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "deliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAgentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAgentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
