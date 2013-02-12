/**
 * DataTypeCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class DataTypeCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DataTypeCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "boolean";
    public static final java.lang.String _value2 = "string";
    public static final java.lang.String _value3 = "int";
    public static final java.lang.String _value4 = "decimal";
    public static final java.lang.String _value5 = "date";
    public static final java.lang.String _value6 = "datetime";
    public static final java.lang.String _value7 = "time";
    public static final java.lang.String _value8 = "text";
    public static final java.lang.String _value9 = "cntrycode";
    public static final java.lang.String _value10 = "enum";
    public static final java.lang.String _value11 = "stringbool";
    public static final DataTypeCode value1 = new DataTypeCode(_value1);
    public static final DataTypeCode value2 = new DataTypeCode(_value2);
    public static final DataTypeCode value3 = new DataTypeCode(_value3);
    public static final DataTypeCode value4 = new DataTypeCode(_value4);
    public static final DataTypeCode value5 = new DataTypeCode(_value5);
    public static final DataTypeCode value6 = new DataTypeCode(_value6);
    public static final DataTypeCode value7 = new DataTypeCode(_value7);
    public static final DataTypeCode value8 = new DataTypeCode(_value8);
    public static final DataTypeCode value9 = new DataTypeCode(_value9);
    public static final DataTypeCode value10 = new DataTypeCode(_value10);
    public static final DataTypeCode value11 = new DataTypeCode(_value11);
    public java.lang.String getValue() { return _value_;}
    public static DataTypeCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DataTypeCode enumeration = (DataTypeCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DataTypeCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DataTypeCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dataTypeCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
