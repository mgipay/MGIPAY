/**
 * ReceiverInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ReceiverInfo  implements java.io.Serializable {
    private java.lang.String accountNickname;

    private java.lang.String receiverPhoneNumber;

    private java.lang.String receiverFirstName;

    private java.lang.String receiverLastName;

    private java.lang.String mgCustomerReceiveNumber;

    private java.lang.String accountNumberLastFour;

    public ReceiverInfo() {
    }

    public ReceiverInfo(
           java.lang.String accountNickname,
           java.lang.String receiverPhoneNumber,
           java.lang.String receiverFirstName,
           java.lang.String receiverLastName,
           java.lang.String mgCustomerReceiveNumber,
           java.lang.String accountNumberLastFour) {
           this.accountNickname = accountNickname;
           this.receiverPhoneNumber = receiverPhoneNumber;
           this.receiverFirstName = receiverFirstName;
           this.receiverLastName = receiverLastName;
           this.mgCustomerReceiveNumber = mgCustomerReceiveNumber;
           this.accountNumberLastFour = accountNumberLastFour;
    }


    /**
     * Gets the accountNickname value for this ReceiverInfo.
     * 
     * @return accountNickname
     */
    public java.lang.String getAccountNickname() {
        return accountNickname;
    }


    /**
     * Sets the accountNickname value for this ReceiverInfo.
     * 
     * @param accountNickname
     */
    public void setAccountNickname(java.lang.String accountNickname) {
        this.accountNickname = accountNickname;
    }


    /**
     * Gets the receiverPhoneNumber value for this ReceiverInfo.
     * 
     * @return receiverPhoneNumber
     */
    public java.lang.String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }


    /**
     * Sets the receiverPhoneNumber value for this ReceiverInfo.
     * 
     * @param receiverPhoneNumber
     */
    public void setReceiverPhoneNumber(java.lang.String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }


    /**
     * Gets the receiverFirstName value for this ReceiverInfo.
     * 
     * @return receiverFirstName
     */
    public java.lang.String getReceiverFirstName() {
        return receiverFirstName;
    }


    /**
     * Sets the receiverFirstName value for this ReceiverInfo.
     * 
     * @param receiverFirstName
     */
    public void setReceiverFirstName(java.lang.String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }


    /**
     * Gets the receiverLastName value for this ReceiverInfo.
     * 
     * @return receiverLastName
     */
    public java.lang.String getReceiverLastName() {
        return receiverLastName;
    }


    /**
     * Sets the receiverLastName value for this ReceiverInfo.
     * 
     * @param receiverLastName
     */
    public void setReceiverLastName(java.lang.String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }


    /**
     * Gets the mgCustomerReceiveNumber value for this ReceiverInfo.
     * 
     * @return mgCustomerReceiveNumber
     */
    public java.lang.String getMgCustomerReceiveNumber() {
        return mgCustomerReceiveNumber;
    }


    /**
     * Sets the mgCustomerReceiveNumber value for this ReceiverInfo.
     * 
     * @param mgCustomerReceiveNumber
     */
    public void setMgCustomerReceiveNumber(java.lang.String mgCustomerReceiveNumber) {
        this.mgCustomerReceiveNumber = mgCustomerReceiveNumber;
    }


    /**
     * Gets the accountNumberLastFour value for this ReceiverInfo.
     * 
     * @return accountNumberLastFour
     */
    public java.lang.String getAccountNumberLastFour() {
        return accountNumberLastFour;
    }


    /**
     * Sets the accountNumberLastFour value for this ReceiverInfo.
     * 
     * @param accountNumberLastFour
     */
    public void setAccountNumberLastFour(java.lang.String accountNumberLastFour) {
        this.accountNumberLastFour = accountNumberLastFour;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiverInfo)) return false;
        ReceiverInfo other = (ReceiverInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNickname==null && other.getAccountNickname()==null) || 
             (this.accountNickname!=null &&
              this.accountNickname.equals(other.getAccountNickname()))) &&
            ((this.receiverPhoneNumber==null && other.getReceiverPhoneNumber()==null) || 
             (this.receiverPhoneNumber!=null &&
              this.receiverPhoneNumber.equals(other.getReceiverPhoneNumber()))) &&
            ((this.receiverFirstName==null && other.getReceiverFirstName()==null) || 
             (this.receiverFirstName!=null &&
              this.receiverFirstName.equals(other.getReceiverFirstName()))) &&
            ((this.receiverLastName==null && other.getReceiverLastName()==null) || 
             (this.receiverLastName!=null &&
              this.receiverLastName.equals(other.getReceiverLastName()))) &&
            ((this.mgCustomerReceiveNumber==null && other.getMgCustomerReceiveNumber()==null) || 
             (this.mgCustomerReceiveNumber!=null &&
              this.mgCustomerReceiveNumber.equals(other.getMgCustomerReceiveNumber()))) &&
            ((this.accountNumberLastFour==null && other.getAccountNumberLastFour()==null) || 
             (this.accountNumberLastFour!=null &&
              this.accountNumberLastFour.equals(other.getAccountNumberLastFour())));
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
        if (getAccountNickname() != null) {
            _hashCode += getAccountNickname().hashCode();
        }
        if (getReceiverPhoneNumber() != null) {
            _hashCode += getReceiverPhoneNumber().hashCode();
        }
        if (getReceiverFirstName() != null) {
            _hashCode += getReceiverFirstName().hashCode();
        }
        if (getReceiverLastName() != null) {
            _hashCode += getReceiverLastName().hashCode();
        }
        if (getMgCustomerReceiveNumber() != null) {
            _hashCode += getMgCustomerReceiveNumber().hashCode();
        }
        if (getAccountNumberLastFour() != null) {
            _hashCode += getAccountNumberLastFour().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceiverInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiverInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNickname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "accountNickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgCustomerReceiveNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgCustomerReceiveNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumberLastFour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "accountNumberLastFour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
