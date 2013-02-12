/**
 * DayOfWeek.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class DayOfWeek implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DayOfWeek(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "MON";
    public static final java.lang.String _value2 = "TUE";
    public static final java.lang.String _value3 = "WED";
    public static final java.lang.String _value4 = "THU";
    public static final java.lang.String _value5 = "FRI";
    public static final java.lang.String _value6 = "M-F";
    public static final java.lang.String _value7 = "S-S";
    public static final java.lang.String _value8 = "SAT";
    public static final java.lang.String _value9 = "SUN";
    public static final DayOfWeek value1 = new DayOfWeek(_value1);
    public static final DayOfWeek value2 = new DayOfWeek(_value2);
    public static final DayOfWeek value3 = new DayOfWeek(_value3);
    public static final DayOfWeek value4 = new DayOfWeek(_value4);
    public static final DayOfWeek value5 = new DayOfWeek(_value5);
    public static final DayOfWeek value6 = new DayOfWeek(_value6);
    public static final DayOfWeek value7 = new DayOfWeek(_value7);
    public static final DayOfWeek value8 = new DayOfWeek(_value8);
    public static final DayOfWeek value9 = new DayOfWeek(_value9);
    public java.lang.String getValue() { return _value_;}
    public static DayOfWeek fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DayOfWeek enumeration = (DayOfWeek)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DayOfWeek fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DayOfWeek.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dayOfWeek"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
