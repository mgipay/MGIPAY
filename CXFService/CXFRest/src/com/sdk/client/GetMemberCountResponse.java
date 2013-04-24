
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "memberCount"
})
@XmlRootElement(name = "getMemberCountResponse", namespace = "uri:audience.ws.sdk.edialog.com")
public class GetMemberCountResponse {

    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com")
    protected long memberCount;

    /**
     * Gets the value of the memberCount property.
     * 
     */
    public long getMemberCount() {
        return memberCount;
    }

    /**
     * Sets the value of the memberCount property.
     * 
     */
    public void setMemberCount(long value) {
        this.memberCount = value;
    }

}
