
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedirectInfoRedirectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RedirectInfoRedirectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CURRENCY_REDIRECT"/>
 *     &lt;enumeration value="COUNTRY_REDIRECT"/>
 *     &lt;enumeration value="COUNTRY_CURRENCY_REDIRECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RedirectInfoRedirectType")
@XmlEnum
public enum RedirectInfoRedirectType {

    CURRENCY_REDIRECT,
    COUNTRY_REDIRECT,
    COUNTRY_CURRENCY_REDIRECT;

    public String value() {
        return name();
    }

    public static RedirectInfoRedirectType fromValue(String v) {
        return valueOf(v);
    }

}
