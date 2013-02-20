
package com.ac1211.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for feeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="feeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VARIABLE"/>
 *     &lt;enumeration value="EXACT"/>
 *     &lt;enumeration value="MINIMUM"/>
 *     &lt;enumeration value="NOT_FOUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "feeType")
@XmlEnum
public enum FeeType {

    VARIABLE,
    EXACT,
    MINIMUM,
    NOT_FOUND;

    public String value() {
        return name();
    }

    public static FeeType fromValue(String v) {
        return valueOf(v);
    }

}
