
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
 *         &lt;element name="memberInfo" type="{uri:customerStatus.ws.sdk.edialog.com}LookupAudiencePropertiesType"/>
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
    "memberInfo"
})
@XmlRootElement(name = "lookupRecipientAudienceProfileResponse", namespace = "uri:customerStatus.ws.sdk.edialog.com")
public class LookupRecipientAudienceProfileResponse {

    @XmlElement(namespace = "uri:customerStatus.ws.sdk.edialog.com", required = true)
    protected LookupAudiencePropertiesType memberInfo;

    /**
     * Gets the value of the memberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LookupAudiencePropertiesType }
     *     
     */
    public LookupAudiencePropertiesType getMemberInfo() {
        return memberInfo;
    }

    /**
     * Sets the value of the memberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupAudiencePropertiesType }
     *     
     */
    public void setMemberInfo(LookupAudiencePropertiesType value) {
        this.memberInfo = value;
    }

}
