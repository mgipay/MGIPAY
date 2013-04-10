
package com.mgi.complaintproxyservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ClientIntegrationError"/>
 *     &lt;enumeration value="UserError"/>
 *     &lt;enumeration value="ServiceSystemError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCategoryCode")
@XmlEnum
public enum ErrorCategoryCode {

    @XmlEnumValue("ClientIntegrationError")
    CLIENT_INTEGRATION_ERROR("ClientIntegrationError"),
    @XmlEnumValue("UserError")
    USER_ERROR("UserError"),
    @XmlEnumValue("ServiceSystemError")
    SERVICE_SYSTEM_ERROR("ServiceSystemError");
    private final String value;

    ErrorCategoryCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCategoryCode fromValue(String v) {
        for (ErrorCategoryCode c: ErrorCategoryCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
