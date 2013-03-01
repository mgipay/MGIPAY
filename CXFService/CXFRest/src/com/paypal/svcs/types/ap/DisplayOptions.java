/**
 * DisplayOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.svcs.types.ap;


/**
 * Customizable options that a client application
 * 						can specify for display purposes.
 */
public class DisplayOptions  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String emailHeaderImageUrl;

    private java.lang.String emailMarketingImageUrl;

    private java.lang.String headerImageUrl;

    private java.lang.String businessName;

    private org.apache.axis.message.MessageElement [] _any;

    public DisplayOptions() {
    }

    public DisplayOptions(
           java.lang.String emailHeaderImageUrl,
           java.lang.String emailMarketingImageUrl,
           java.lang.String headerImageUrl,
           java.lang.String businessName,
           org.apache.axis.message.MessageElement [] _any) {
           this.emailHeaderImageUrl = emailHeaderImageUrl;
           this.emailMarketingImageUrl = emailMarketingImageUrl;
           this.headerImageUrl = headerImageUrl;
           this.businessName = businessName;
           this._any = _any;
    }


    /**
     * Gets the emailHeaderImageUrl value for this DisplayOptions.
     * 
     * @return emailHeaderImageUrl
     */
    public java.lang.String getEmailHeaderImageUrl() {
        return emailHeaderImageUrl;
    }


    /**
     * Sets the emailHeaderImageUrl value for this DisplayOptions.
     * 
     * @param emailHeaderImageUrl
     */
    public void setEmailHeaderImageUrl(java.lang.String emailHeaderImageUrl) {
        this.emailHeaderImageUrl = emailHeaderImageUrl;
    }


    /**
     * Gets the emailMarketingImageUrl value for this DisplayOptions.
     * 
     * @return emailMarketingImageUrl
     */
    public java.lang.String getEmailMarketingImageUrl() {
        return emailMarketingImageUrl;
    }


    /**
     * Sets the emailMarketingImageUrl value for this DisplayOptions.
     * 
     * @param emailMarketingImageUrl
     */
    public void setEmailMarketingImageUrl(java.lang.String emailMarketingImageUrl) {
        this.emailMarketingImageUrl = emailMarketingImageUrl;
    }


    /**
     * Gets the headerImageUrl value for this DisplayOptions.
     * 
     * @return headerImageUrl
     */
    public java.lang.String getHeaderImageUrl() {
        return headerImageUrl;
    }


    /**
     * Sets the headerImageUrl value for this DisplayOptions.
     * 
     * @param headerImageUrl
     */
    public void setHeaderImageUrl(java.lang.String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }


    /**
     * Gets the businessName value for this DisplayOptions.
     * 
     * @return businessName
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this DisplayOptions.
     * 
     * @param businessName
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the _any value for this DisplayOptions.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this DisplayOptions.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisplayOptions)) return false;
        DisplayOptions other = (DisplayOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailHeaderImageUrl==null && other.getEmailHeaderImageUrl()==null) || 
             (this.emailHeaderImageUrl!=null &&
              this.emailHeaderImageUrl.equals(other.getEmailHeaderImageUrl()))) &&
            ((this.emailMarketingImageUrl==null && other.getEmailMarketingImageUrl()==null) || 
             (this.emailMarketingImageUrl!=null &&
              this.emailMarketingImageUrl.equals(other.getEmailMarketingImageUrl()))) &&
            ((this.headerImageUrl==null && other.getHeaderImageUrl()==null) || 
             (this.headerImageUrl!=null &&
              this.headerImageUrl.equals(other.getHeaderImageUrl()))) &&
            ((this.businessName==null && other.getBusinessName()==null) || 
             (this.businessName!=null &&
              this.businessName.equals(other.getBusinessName()))) &&
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
        if (getEmailHeaderImageUrl() != null) {
            _hashCode += getEmailHeaderImageUrl().hashCode();
        }
        if (getEmailMarketingImageUrl() != null) {
            _hashCode += getEmailMarketingImageUrl().hashCode();
        }
        if (getHeaderImageUrl() != null) {
            _hashCode += getHeaderImageUrl().hashCode();
        }
        if (getBusinessName() != null) {
            _hashCode += getBusinessName().hashCode();
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
        new org.apache.axis.description.TypeDesc(DisplayOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "DisplayOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailHeaderImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailHeaderImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailMarketingImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailMarketingImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headerImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessName"));
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
