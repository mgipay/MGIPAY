
package com.mgi.complaintproxyservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorHandlingCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorHandlingCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RetryNow"/>
 *     &lt;enumeration value="RetryLater"/>
 *     &lt;enumeration value="ReturnError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorHandlingCode")
@XmlEnum
public enum ErrorHandlingCode {

    @XmlEnumValue("RetryNow")
    RETRY_NOW("RetryNow"),
    @XmlEnumValue("RetryLater")
    RETRY_LATER("RetryLater"),
    @XmlEnumValue("ReturnError")
    RETURN_ERROR("ReturnError");
    private final String value;

    ErrorHandlingCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorHandlingCode fromValue(String v) {
        for (ErrorHandlingCode c: ErrorHandlingCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
