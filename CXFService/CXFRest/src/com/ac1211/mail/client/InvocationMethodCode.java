
package com.ac1211.mail.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvocationMethodCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvocationMethodCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FOR-FUTURE-USE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvocationMethodCode")
@XmlEnum
public enum InvocationMethodCode {

    @XmlEnumValue("FOR-FUTURE-USE")
    FOR_FUTURE_USE("FOR-FUTURE-USE");
    private final String value;

    InvocationMethodCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvocationMethodCode fromValue(String v) {
        for (InvocationMethodCode c: InvocationMethodCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
