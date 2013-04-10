
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="int"/>
 *     &lt;enumeration value="decimal"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="datetime"/>
 *     &lt;enumeration value="time"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="cntrycode"/>
 *     &lt;enumeration value="enum"/>
 *     &lt;enumeration value="stringbool"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataTypeCode")
@XmlEnum
public enum DataTypeCode {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("int")
    INT("int"),
    @XmlEnumValue("decimal")
    DECIMAL("decimal"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("cntrycode")
    CNTRYCODE("cntrycode"),
    @XmlEnumValue("enum")
    ENUM("enum"),
    @XmlEnumValue("stringbool")
    STRINGBOOL("stringbool");
    private final String value;

    DataTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeCode fromValue(String v) {
        for (DataTypeCode c: DataTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
