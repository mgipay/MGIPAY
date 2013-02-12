/**
 * TransactionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class TransactionStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AVAIL = "AVAIL";
    public static final java.lang.String _CANCL = "CANCL";
    public static final java.lang.String _RECVD = "RECVD";
    public static final java.lang.String _REFND = "REFND";
    public static final java.lang.String _AFR = "AFR";
    public static final java.lang.String _UNCOMMITED = "UNCOMMITED";
    public static final TransactionStatus AVAIL = new TransactionStatus(_AVAIL);
    public static final TransactionStatus CANCL = new TransactionStatus(_CANCL);
    public static final TransactionStatus RECVD = new TransactionStatus(_RECVD);
    public static final TransactionStatus REFND = new TransactionStatus(_REFND);
    public static final TransactionStatus AFR = new TransactionStatus(_AFR);
    public static final TransactionStatus UNCOMMITED = new TransactionStatus(_UNCOMMITED);
    public java.lang.String getValue() { return _value_;}
    public static TransactionStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionStatus enumeration = (TransactionStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransactionStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "transactionStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
