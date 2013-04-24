
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
 *         &lt;element name="resultAudienceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "resultAudienceId"
})
@XmlRootElement(name = "createAudienceResponse", namespace = "uri:audience.ws.sdk.edialog.com")
public class CreateAudienceResponse {

    @XmlElement(namespace = "uri:audience.ws.sdk.edialog.com")
    protected int resultAudienceId;

    /**
     * Gets the value of the resultAudienceId property.
     * 
     */
    public int getResultAudienceId() {
        return resultAudienceId;
    }

    /**
     * Sets the value of the resultAudienceId property.
     * 
     */
    public void setResultAudienceId(int value) {
        this.resultAudienceId = value;
    }

}
