/**
 * ErrorData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.common;


/**
 * This type contains the detailed error
 * 						information resulting from the service
 * 						operation.
 */
public class ErrorData  implements java.io.Serializable {
    private long errorId;

    private java.lang.String domain;

    private java.lang.String subdomain;

    private com.paypal.axis.svcs.types.common.ErrorSeverity severity;

    private com.paypal.axis.svcs.types.common.ErrorCategory category;

    private java.lang.String message;

    private org.apache.axis.types.Token exceptionId;

    private com.paypal.axis.svcs.types.common.ErrorParameter[] parameter;

    public ErrorData() {
    }

    public ErrorData(
           long errorId,
           java.lang.String domain,
           java.lang.String subdomain,
           com.paypal.axis.svcs.types.common.ErrorSeverity severity,
           com.paypal.axis.svcs.types.common.ErrorCategory category,
           java.lang.String message,
           org.apache.axis.types.Token exceptionId,
           com.paypal.axis.svcs.types.common.ErrorParameter[] parameter) {
           this.errorId = errorId;
           this.domain = domain;
           this.subdomain = subdomain;
           this.severity = severity;
           this.category = category;
           this.message = message;
           this.exceptionId = exceptionId;
           this.parameter = parameter;
    }


    /**
     * Gets the errorId value for this ErrorData.
     * 
     * @return errorId
     */
    public long getErrorId() {
        return errorId;
    }


    /**
     * Sets the errorId value for this ErrorData.
     * 
     * @param errorId
     */
    public void setErrorId(long errorId) {
        this.errorId = errorId;
    }


    /**
     * Gets the domain value for this ErrorData.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this ErrorData.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the subdomain value for this ErrorData.
     * 
     * @return subdomain
     */
    public java.lang.String getSubdomain() {
        return subdomain;
    }


    /**
     * Sets the subdomain value for this ErrorData.
     * 
     * @param subdomain
     */
    public void setSubdomain(java.lang.String subdomain) {
        this.subdomain = subdomain;
    }


    /**
     * Gets the severity value for this ErrorData.
     * 
     * @return severity
     */
    public com.paypal.axis.svcs.types.common.ErrorSeverity getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this ErrorData.
     * 
     * @param severity
     */
    public void setSeverity(com.paypal.axis.svcs.types.common.ErrorSeverity severity) {
        this.severity = severity;
    }


    /**
     * Gets the category value for this ErrorData.
     * 
     * @return category
     */
    public com.paypal.axis.svcs.types.common.ErrorCategory getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ErrorData.
     * 
     * @param category
     */
    public void setCategory(com.paypal.axis.svcs.types.common.ErrorCategory category) {
        this.category = category;
    }


    /**
     * Gets the message value for this ErrorData.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ErrorData.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the exceptionId value for this ErrorData.
     * 
     * @return exceptionId
     */
    public org.apache.axis.types.Token getExceptionId() {
        return exceptionId;
    }


    /**
     * Sets the exceptionId value for this ErrorData.
     * 
     * @param exceptionId
     */
    public void setExceptionId(org.apache.axis.types.Token exceptionId) {
        this.exceptionId = exceptionId;
    }


    /**
     * Gets the parameter value for this ErrorData.
     * 
     * @return parameter
     */
    public com.paypal.axis.svcs.types.common.ErrorParameter[] getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this ErrorData.
     * 
     * @param parameter
     */
    public void setParameter(com.paypal.axis.svcs.types.common.ErrorParameter[] parameter) {
        this.parameter = parameter;
    }

    public com.paypal.axis.svcs.types.common.ErrorParameter getParameter(int i) {
        return this.parameter[i];
    }

    public void setParameter(int i, com.paypal.axis.svcs.types.common.ErrorParameter _value) {
        this.parameter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorData)) return false;
        ErrorData other = (ErrorData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.errorId == other.getErrorId() &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.subdomain==null && other.getSubdomain()==null) || 
             (this.subdomain!=null &&
              this.subdomain.equals(other.getSubdomain()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.exceptionId==null && other.getExceptionId()==null) || 
             (this.exceptionId!=null &&
              this.exceptionId.equals(other.getExceptionId()))) &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              java.util.Arrays.equals(this.parameter, other.getParameter())));
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
        _hashCode += new Long(getErrorId()).hashCode();
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getSubdomain() != null) {
            _hashCode += getSubdomain().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getExceptionId() != null) {
            _hashCode += getExceptionId().hashCode();
        }
        if (getParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameter(), i);
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
        new org.apache.axis.description.TypeDesc(ErrorData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ErrorData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subdomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subdomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ErrorSeverity"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ErrorCategory"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ErrorParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
