/**
 * ProductFieldInfoVisibility.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ProductFieldInfoVisibility implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProductFieldInfoVisibility(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REQ = "REQ";
    public static final java.lang.String _OPT = "OPT";
    public static final java.lang.String _SUP_OPT = "SUP_OPT";
    public static final java.lang.String _NOT_ALL = "NOT_ALL";
    public static final ProductFieldInfoVisibility REQ = new ProductFieldInfoVisibility(_REQ);
    public static final ProductFieldInfoVisibility OPT = new ProductFieldInfoVisibility(_OPT);
    public static final ProductFieldInfoVisibility SUP_OPT = new ProductFieldInfoVisibility(_SUP_OPT);
    public static final ProductFieldInfoVisibility NOT_ALL = new ProductFieldInfoVisibility(_NOT_ALL);
    public java.lang.String getValue() { return _value_;}
    public static ProductFieldInfoVisibility fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProductFieldInfoVisibility enumeration = (ProductFieldInfoVisibility)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProductFieldInfoVisibility fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductFieldInfoVisibility.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProductFieldInfoVisibility"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
