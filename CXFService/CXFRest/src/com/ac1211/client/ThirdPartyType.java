
package com.ac1211.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thirdPartyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="thirdPartyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ORG"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="PERSON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "thirdPartyType")
@XmlEnum
public enum ThirdPartyType {

    ORG,
    NONE,
    PERSON;

    public String value() {
        return name();
    }

    public static ThirdPartyType fromValue(String v) {
        return valueOf(v);
    }

}
