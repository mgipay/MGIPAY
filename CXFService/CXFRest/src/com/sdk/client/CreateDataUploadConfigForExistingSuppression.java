
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="audienceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="appendToAudience" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="emailNotification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "audienceId",
    "appendToAudience",
    "emailNotification"
})
@XmlRootElement(name = "createDataUploadConfigForExistingSuppression", namespace = "uri:dataupload.ws.sdk.edialog.com")
public class CreateDataUploadConfigForExistingSuppression {

    @XmlElement(namespace = "uri:dataupload.ws.sdk.edialog.com")
    protected int audienceId;
    @XmlElement(namespace = "uri:dataupload.ws.sdk.edialog.com")
    protected boolean appendToAudience;
    @XmlElement(namespace = "uri:dataupload.ws.sdk.edialog.com")
    protected List<String> emailNotification;

    /**
     * Gets the value of the audienceId property.
     * 
     */
    public int getAudienceId() {
        return audienceId;
    }

    /**
     * Sets the value of the audienceId property.
     * 
     */
    public void setAudienceId(int value) {
        this.audienceId = value;
    }

    /**
     * Gets the value of the appendToAudience property.
     * 
     */
    public boolean isAppendToAudience() {
        return appendToAudience;
    }

    /**
     * Sets the value of the appendToAudience property.
     * 
     */
    public void setAppendToAudience(boolean value) {
        this.appendToAudience = value;
    }

    /**
     * Gets the value of the emailNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailNotification() {
        if (emailNotification == null) {
            emailNotification = new ArrayList<String>();
        }
        return this.emailNotification;
    }

}
