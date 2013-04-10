
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="searchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IND"/>
 *     &lt;enumeration value="CODE"/>
 *     &lt;enumeration value="NAME"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="BIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "searchType")
@XmlEnum
public enum SearchType {

    IND,
    CODE,
    NAME,
    ID,
    BIN;

    public String value() {
        return name();
    }

    public static SearchType fromValue(String v) {
        return valueOf(v);
    }

}
