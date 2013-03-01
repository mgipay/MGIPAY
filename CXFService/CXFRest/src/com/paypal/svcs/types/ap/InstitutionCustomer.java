/**
 * InstitutionCustomer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.svcs.types.ap;


/**
 * The customer of the initiating institution
 */
public class InstitutionCustomer  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    /* The unique identifier as assigned to the
     * 								institution. */
    private java.lang.String institutionId;

    /* The first (given) name of the end
     * 								consumer as known by the institution. */
    private java.lang.String firstName;

    /* The last (family) name of the end
     * 								consumer as known by the institution. */
    private java.lang.String lastName;

    /* The full name of the end consumer as
     * 								known by the institution. */
    private java.lang.String displayName;

    /* The unique identifier as assigned to the
     * 								end consumer by the institution. */
    private java.lang.String institutionCustomerId;

    /* The two-character ISO country code of
     * 								the home country of the end consumer */
    private java.lang.String countryCode;

    private java.lang.String email;

    private org.apache.axis.message.MessageElement [] _any;

    public InstitutionCustomer() {
    }

    public InstitutionCustomer(
           java.lang.String institutionId,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String displayName,
           java.lang.String institutionCustomerId,
           java.lang.String countryCode,
           java.lang.String email,
           org.apache.axis.message.MessageElement [] _any) {
           this.institutionId = institutionId;
           this.firstName = firstName;
           this.lastName = lastName;
           this.displayName = displayName;
           this.institutionCustomerId = institutionCustomerId;
           this.countryCode = countryCode;
           this.email = email;
           this._any = _any;
    }


    /**
     * Gets the institutionId value for this InstitutionCustomer.
     * 
     * @return institutionId   * The unique identifier as assigned to the
     * 								institution.
     */
    public java.lang.String getInstitutionId() {
        return institutionId;
    }


    /**
     * Sets the institutionId value for this InstitutionCustomer.
     * 
     * @param institutionId   * The unique identifier as assigned to the
     * 								institution.
     */
    public void setInstitutionId(java.lang.String institutionId) {
        this.institutionId = institutionId;
    }


    /**
     * Gets the firstName value for this InstitutionCustomer.
     * 
     * @return firstName   * The first (given) name of the end
     * 								consumer as known by the institution.
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this InstitutionCustomer.
     * 
     * @param firstName   * The first (given) name of the end
     * 								consumer as known by the institution.
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this InstitutionCustomer.
     * 
     * @return lastName   * The last (family) name of the end
     * 								consumer as known by the institution.
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this InstitutionCustomer.
     * 
     * @param lastName   * The last (family) name of the end
     * 								consumer as known by the institution.
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the displayName value for this InstitutionCustomer.
     * 
     * @return displayName   * The full name of the end consumer as
     * 								known by the institution.
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this InstitutionCustomer.
     * 
     * @param displayName   * The full name of the end consumer as
     * 								known by the institution.
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the institutionCustomerId value for this InstitutionCustomer.
     * 
     * @return institutionCustomerId   * The unique identifier as assigned to the
     * 								end consumer by the institution.
     */
    public java.lang.String getInstitutionCustomerId() {
        return institutionCustomerId;
    }


    /**
     * Sets the institutionCustomerId value for this InstitutionCustomer.
     * 
     * @param institutionCustomerId   * The unique identifier as assigned to the
     * 								end consumer by the institution.
     */
    public void setInstitutionCustomerId(java.lang.String institutionCustomerId) {
        this.institutionCustomerId = institutionCustomerId;
    }


    /**
     * Gets the countryCode value for this InstitutionCustomer.
     * 
     * @return countryCode   * The two-character ISO country code of
     * 								the home country of the end consumer
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this InstitutionCustomer.
     * 
     * @param countryCode   * The two-character ISO country code of
     * 								the home country of the end consumer
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the email value for this InstitutionCustomer.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this InstitutionCustomer.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the _any value for this InstitutionCustomer.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this InstitutionCustomer.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstitutionCustomer)) return false;
        InstitutionCustomer other = (InstitutionCustomer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.institutionId==null && other.getInstitutionId()==null) || 
             (this.institutionId!=null &&
              this.institutionId.equals(other.getInstitutionId()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.institutionCustomerId==null && other.getInstitutionCustomerId()==null) || 
             (this.institutionCustomerId!=null &&
              this.institutionCustomerId.equals(other.getInstitutionCustomerId()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
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
        if (getInstitutionId() != null) {
            _hashCode += getInstitutionId().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getInstitutionCustomerId() != null) {
            _hashCode += getInstitutionCustomerId().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
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
        new org.apache.axis.description.TypeDesc(InstitutionCustomer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "InstitutionCustomer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institutionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "institutionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institutionCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "institutionCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
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
