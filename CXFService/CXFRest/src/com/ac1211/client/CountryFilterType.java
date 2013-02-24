
package com.ac1211.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countryFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="countryFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RECEIVE_ACTIVE"/>
 *     &lt;enumeration value="MG_DIRECTED_SEND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "countryFilterType")
@XmlEnum
public enum CountryFilterType {

    RECEIVE_ACTIVE,
    MG_DIRECTED_SEND;

    public String value() {
        return name();
    }

    public static CountryFilterType fromValue(String v) {
        return valueOf(v);
    }

}
