/**
 * FundingSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * Funding source information.
 */
public class FundingSource  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String lastFourOfAccountNumber;

    private java.lang.String type;

    private java.lang.String displayName;

    private java.lang.String fundingSourceId;

    private java.lang.Boolean allowed;

    private org.apache.axis.message.MessageElement [] _any;

    public FundingSource() {
    }

    public FundingSource(
           java.lang.String lastFourOfAccountNumber,
           java.lang.String type,
           java.lang.String displayName,
           java.lang.String fundingSourceId,
           java.lang.Boolean allowed,
           org.apache.axis.message.MessageElement [] _any) {
           this.lastFourOfAccountNumber = lastFourOfAccountNumber;
           this.type = type;
           this.displayName = displayName;
           this.fundingSourceId = fundingSourceId;
           this.allowed = allowed;
           this._any = _any;
    }


    /**
     * Gets the lastFourOfAccountNumber value for this FundingSource.
     * 
     * @return lastFourOfAccountNumber
     */
    public java.lang.String getLastFourOfAccountNumber() {
        return lastFourOfAccountNumber;
    }


    /**
     * Sets the lastFourOfAccountNumber value for this FundingSource.
     * 
     * @param lastFourOfAccountNumber
     */
    public void setLastFourOfAccountNumber(java.lang.String lastFourOfAccountNumber) {
        this.lastFourOfAccountNumber = lastFourOfAccountNumber;
    }


    /**
     * Gets the type value for this FundingSource.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this FundingSource.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the displayName value for this FundingSource.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this FundingSource.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the fundingSourceId value for this FundingSource.
     * 
     * @return fundingSourceId
     */
    public java.lang.String getFundingSourceId() {
        return fundingSourceId;
    }


    /**
     * Sets the fundingSourceId value for this FundingSource.
     * 
     * @param fundingSourceId
     */
    public void setFundingSourceId(java.lang.String fundingSourceId) {
        this.fundingSourceId = fundingSourceId;
    }


    /**
     * Gets the allowed value for this FundingSource.
     * 
     * @return allowed
     */
    public java.lang.Boolean getAllowed() {
        return allowed;
    }


    /**
     * Sets the allowed value for this FundingSource.
     * 
     * @param allowed
     */
    public void setAllowed(java.lang.Boolean allowed) {
        this.allowed = allowed;
    }


    /**
     * Gets the _any value for this FundingSource.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this FundingSource.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundingSource)) return false;
        FundingSource other = (FundingSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lastFourOfAccountNumber==null && other.getLastFourOfAccountNumber()==null) || 
             (this.lastFourOfAccountNumber!=null &&
              this.lastFourOfAccountNumber.equals(other.getLastFourOfAccountNumber()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.fundingSourceId==null && other.getFundingSourceId()==null) || 
             (this.fundingSourceId!=null &&
              this.fundingSourceId.equals(other.getFundingSourceId()))) &&
            ((this.allowed==null && other.getAllowed()==null) || 
             (this.allowed!=null &&
              this.allowed.equals(other.getAllowed()))) &&
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
        if (getLastFourOfAccountNumber() != null) {
            _hashCode += getLastFourOfAccountNumber().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getFundingSourceId() != null) {
            _hashCode += getFundingSourceId().hashCode();
        }
        if (getAllowed() != null) {
            _hashCode += getAllowed().hashCode();
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
        new org.apache.axis.description.TypeDesc(FundingSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastFourOfAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastFourOfAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingSourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fundingSourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
