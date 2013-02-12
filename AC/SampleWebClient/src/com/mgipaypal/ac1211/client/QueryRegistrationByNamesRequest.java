/**
 * QueryRegistrationByNamesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class QueryRegistrationByNamesRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String receiveCountry;

    private java.lang.String deliveryOption;

    private java.lang.String receiveAgentID;

    private java.lang.String receiveCurrency;

    private java.lang.String receiverFirstName;

    private java.lang.String receiverLastName;

    private java.lang.String receiverPhoneNumber;

    private java.lang.String registrationCreatorFirstName;

    private java.lang.String registrationCreatorLastName;

    private java.lang.String registrationCreatorPhoneNumber;

    private java.lang.Integer maxRowsToReturn;

    public QueryRegistrationByNamesRequest() {
    }

    public QueryRegistrationByNamesRequest(
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
           java.lang.String receiveCurrency,
           java.lang.String receiverFirstName,
           java.lang.String receiverLastName,
           java.lang.String receiverPhoneNumber,
           java.lang.String registrationCreatorFirstName,
           java.lang.String registrationCreatorLastName,
           java.lang.String registrationCreatorPhoneNumber,
           java.lang.Integer maxRowsToReturn) {
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
        this.receiverFirstName = receiverFirstName;
        this.receiverLastName = receiverLastName;
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.registrationCreatorFirstName = registrationCreatorFirstName;
        this.registrationCreatorLastName = registrationCreatorLastName;
        this.registrationCreatorPhoneNumber = registrationCreatorPhoneNumber;
        this.maxRowsToReturn = maxRowsToReturn;
    }


    /**
     * Gets the receiveCountry value for this QueryRegistrationByNamesRequest.
     * 
     * @return receiveCountry
     */
    public java.lang.String getReceiveCountry() {
        return receiveCountry;
    }


    /**
     * Sets the receiveCountry value for this QueryRegistrationByNamesRequest.
     * 
     * @param receiveCountry
     */
    public void setReceiveCountry(java.lang.String receiveCountry) {
        this.receiveCountry = receiveCountry;
    }


    /**
     * Gets the deliveryOption value for this QueryRegistrationByNamesRequest.
     * 
     * @return deliveryOption
     */
    public java.lang.String getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this QueryRegistrationByNamesRequest.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(java.lang.String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the receiveAgentID value for this QueryRegistrationByNamesRequest.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this QueryRegistrationByNamesRequest.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the receiveCurrency value for this QueryRegistrationByNamesRequest.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this QueryRegistrationByNamesRequest.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the receiverFirstName value for this QueryRegistrationByNamesRequest.
     * 
     * @return receiverFirstName
     */
    public java.lang.String getReceiverFirstName() {
        return receiverFirstName;
    }


    /**
     * Sets the receiverFirstName value for this QueryRegistrationByNamesRequest.
     * 
     * @param receiverFirstName
     */
    public void setReceiverFirstName(java.lang.String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }


    /**
     * Gets the receiverLastName value for this QueryRegistrationByNamesRequest.
     * 
     * @return receiverLastName
     */
    public java.lang.String getReceiverLastName() {
        return receiverLastName;
    }


    /**
     * Sets the receiverLastName value for this QueryRegistrationByNamesRequest.
     * 
     * @param receiverLastName
     */
    public void setReceiverLastName(java.lang.String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }


    /**
     * Gets the receiverPhoneNumber value for this QueryRegistrationByNamesRequest.
     * 
     * @return receiverPhoneNumber
     */
    public java.lang.String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }


    /**
     * Sets the receiverPhoneNumber value for this QueryRegistrationByNamesRequest.
     * 
     * @param receiverPhoneNumber
     */
    public void setReceiverPhoneNumber(java.lang.String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }


    /**
     * Gets the registrationCreatorFirstName value for this QueryRegistrationByNamesRequest.
     * 
     * @return registrationCreatorFirstName
     */
    public java.lang.String getRegistrationCreatorFirstName() {
        return registrationCreatorFirstName;
    }


    /**
     * Sets the registrationCreatorFirstName value for this QueryRegistrationByNamesRequest.
     * 
     * @param registrationCreatorFirstName
     */
    public void setRegistrationCreatorFirstName(java.lang.String registrationCreatorFirstName) {
        this.registrationCreatorFirstName = registrationCreatorFirstName;
    }


    /**
     * Gets the registrationCreatorLastName value for this QueryRegistrationByNamesRequest.
     * 
     * @return registrationCreatorLastName
     */
    public java.lang.String getRegistrationCreatorLastName() {
        return registrationCreatorLastName;
    }


    /**
     * Sets the registrationCreatorLastName value for this QueryRegistrationByNamesRequest.
     * 
     * @param registrationCreatorLastName
     */
    public void setRegistrationCreatorLastName(java.lang.String registrationCreatorLastName) {
        this.registrationCreatorLastName = registrationCreatorLastName;
    }


    /**
     * Gets the registrationCreatorPhoneNumber value for this QueryRegistrationByNamesRequest.
     * 
     * @return registrationCreatorPhoneNumber
     */
    public java.lang.String getRegistrationCreatorPhoneNumber() {
        return registrationCreatorPhoneNumber;
    }


    /**
     * Sets the registrationCreatorPhoneNumber value for this QueryRegistrationByNamesRequest.
     * 
     * @param registrationCreatorPhoneNumber
     */
    public void setRegistrationCreatorPhoneNumber(java.lang.String registrationCreatorPhoneNumber) {
        this.registrationCreatorPhoneNumber = registrationCreatorPhoneNumber;
    }


    /**
     * Gets the maxRowsToReturn value for this QueryRegistrationByNamesRequest.
     * 
     * @return maxRowsToReturn
     */
    public java.lang.Integer getMaxRowsToReturn() {
        return maxRowsToReturn;
    }


    /**
     * Sets the maxRowsToReturn value for this QueryRegistrationByNamesRequest.
     * 
     * @param maxRowsToReturn
     */
    public void setMaxRowsToReturn(java.lang.Integer maxRowsToReturn) {
        this.maxRowsToReturn = maxRowsToReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryRegistrationByNamesRequest)) return false;
        QueryRegistrationByNamesRequest other = (QueryRegistrationByNamesRequest) obj;
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
              this.receiveCurrency.equals(other.getReceiveCurrency()))) &&
            ((this.receiverFirstName==null && other.getReceiverFirstName()==null) || 
             (this.receiverFirstName!=null &&
              this.receiverFirstName.equals(other.getReceiverFirstName()))) &&
            ((this.receiverLastName==null && other.getReceiverLastName()==null) || 
             (this.receiverLastName!=null &&
              this.receiverLastName.equals(other.getReceiverLastName()))) &&
            ((this.receiverPhoneNumber==null && other.getReceiverPhoneNumber()==null) || 
             (this.receiverPhoneNumber!=null &&
              this.receiverPhoneNumber.equals(other.getReceiverPhoneNumber()))) &&
            ((this.registrationCreatorFirstName==null && other.getRegistrationCreatorFirstName()==null) || 
             (this.registrationCreatorFirstName!=null &&
              this.registrationCreatorFirstName.equals(other.getRegistrationCreatorFirstName()))) &&
            ((this.registrationCreatorLastName==null && other.getRegistrationCreatorLastName()==null) || 
             (this.registrationCreatorLastName!=null &&
              this.registrationCreatorLastName.equals(other.getRegistrationCreatorLastName()))) &&
            ((this.registrationCreatorPhoneNumber==null && other.getRegistrationCreatorPhoneNumber()==null) || 
             (this.registrationCreatorPhoneNumber!=null &&
              this.registrationCreatorPhoneNumber.equals(other.getRegistrationCreatorPhoneNumber()))) &&
            ((this.maxRowsToReturn==null && other.getMaxRowsToReturn()==null) || 
             (this.maxRowsToReturn!=null &&
              this.maxRowsToReturn.equals(other.getMaxRowsToReturn())));
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
        if (getReceiverFirstName() != null) {
            _hashCode += getReceiverFirstName().hashCode();
        }
        if (getReceiverLastName() != null) {
            _hashCode += getReceiverLastName().hashCode();
        }
        if (getReceiverPhoneNumber() != null) {
            _hashCode += getReceiverPhoneNumber().hashCode();
        }
        if (getRegistrationCreatorFirstName() != null) {
            _hashCode += getRegistrationCreatorFirstName().hashCode();
        }
        if (getRegistrationCreatorLastName() != null) {
            _hashCode += getRegistrationCreatorLastName().hashCode();
        }
        if (getRegistrationCreatorPhoneNumber() != null) {
            _hashCode += getRegistrationCreatorPhoneNumber().hashCode();
        }
        if (getMaxRowsToReturn() != null) {
            _hashCode += getMaxRowsToReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryRegistrationByNamesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "QueryRegistrationByNamesRequest"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverLastName"));
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
        elemField.setFieldName("registrationCreatorFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "registrationCreatorFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationCreatorLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "registrationCreatorLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationCreatorPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "registrationCreatorPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRowsToReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "maxRowsToReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
