/**
 * AgentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class AgentInfo  implements java.io.Serializable {
    private java.lang.String agentName;

    private java.lang.String address;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.Boolean receiveCapability;

    private java.lang.Boolean sendCapability;

    private java.lang.String agentPhone;

    private com.mgipaypal.ac1211.client.StoreHourInfo[] storeHours;

    public AgentInfo() {
    }

    public AgentInfo(
           java.lang.String agentName,
           java.lang.String address,
           java.lang.String city,
           java.lang.String state,
           java.lang.Boolean receiveCapability,
           java.lang.Boolean sendCapability,
           java.lang.String agentPhone,
           com.mgipaypal.ac1211.client.StoreHourInfo[] storeHours) {
           this.agentName = agentName;
           this.address = address;
           this.city = city;
           this.state = state;
           this.receiveCapability = receiveCapability;
           this.sendCapability = sendCapability;
           this.agentPhone = agentPhone;
           this.storeHours = storeHours;
    }


    /**
     * Gets the agentName value for this AgentInfo.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this AgentInfo.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }


    /**
     * Gets the address value for this AgentInfo.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AgentInfo.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the city value for this AgentInfo.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this AgentInfo.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this AgentInfo.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this AgentInfo.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the receiveCapability value for this AgentInfo.
     * 
     * @return receiveCapability
     */
    public java.lang.Boolean getReceiveCapability() {
        return receiveCapability;
    }


    /**
     * Sets the receiveCapability value for this AgentInfo.
     * 
     * @param receiveCapability
     */
    public void setReceiveCapability(java.lang.Boolean receiveCapability) {
        this.receiveCapability = receiveCapability;
    }


    /**
     * Gets the sendCapability value for this AgentInfo.
     * 
     * @return sendCapability
     */
    public java.lang.Boolean getSendCapability() {
        return sendCapability;
    }


    /**
     * Sets the sendCapability value for this AgentInfo.
     * 
     * @param sendCapability
     */
    public void setSendCapability(java.lang.Boolean sendCapability) {
        this.sendCapability = sendCapability;
    }


    /**
     * Gets the agentPhone value for this AgentInfo.
     * 
     * @return agentPhone
     */
    public java.lang.String getAgentPhone() {
        return agentPhone;
    }


    /**
     * Sets the agentPhone value for this AgentInfo.
     * 
     * @param agentPhone
     */
    public void setAgentPhone(java.lang.String agentPhone) {
        this.agentPhone = agentPhone;
    }


    /**
     * Gets the storeHours value for this AgentInfo.
     * 
     * @return storeHours
     */
    public com.mgipaypal.ac1211.client.StoreHourInfo[] getStoreHours() {
        return storeHours;
    }


    /**
     * Sets the storeHours value for this AgentInfo.
     * 
     * @param storeHours
     */
    public void setStoreHours(com.mgipaypal.ac1211.client.StoreHourInfo[] storeHours) {
        this.storeHours = storeHours;
    }

    public com.mgipaypal.ac1211.client.StoreHourInfo getStoreHours(int i) {
        return this.storeHours[i];
    }

    public void setStoreHours(int i, com.mgipaypal.ac1211.client.StoreHourInfo _value) {
        this.storeHours[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgentInfo)) return false;
        AgentInfo other = (AgentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.receiveCapability==null && other.getReceiveCapability()==null) || 
             (this.receiveCapability!=null &&
              this.receiveCapability.equals(other.getReceiveCapability()))) &&
            ((this.sendCapability==null && other.getSendCapability()==null) || 
             (this.sendCapability!=null &&
              this.sendCapability.equals(other.getSendCapability()))) &&
            ((this.agentPhone==null && other.getAgentPhone()==null) || 
             (this.agentPhone!=null &&
              this.agentPhone.equals(other.getAgentPhone()))) &&
            ((this.storeHours==null && other.getStoreHours()==null) || 
             (this.storeHours!=null &&
              java.util.Arrays.equals(this.storeHours, other.getStoreHours())));
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
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getReceiveCapability() != null) {
            _hashCode += getReceiveCapability().hashCode();
        }
        if (getSendCapability() != null) {
            _hashCode += getSendCapability().hashCode();
        }
        if (getAgentPhone() != null) {
            _hashCode += getAgentPhone().hashCode();
        }
        if (getStoreHours() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreHours());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoreHours(), i);
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
        new org.apache.axis.description.TypeDesc(AgentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "AgentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "storeHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "StoreHourInfo"));
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
