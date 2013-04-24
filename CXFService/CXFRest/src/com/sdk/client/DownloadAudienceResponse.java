
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
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
 *         &lt;element name="property" type="{uri:audiencetransfer.ws.sdk.edialog.com}OptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audienceFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "property",
    "audienceFile"
})
@XmlRootElement(name = "downloadAudienceResponse", namespace = "uri:audiencetransfer.ws.sdk.edialog.com")
public class DownloadAudienceResponse {

    @XmlElement(namespace = "uri:audiencetransfer.ws.sdk.edialog.com")
    protected int audienceId;
    @XmlElement(namespace = "uri:audiencetransfer.ws.sdk.edialog.com")
    protected List<OptionType> property;
    @XmlElement(namespace = "uri:audiencetransfer.ws.sdk.edialog.com", required = true)
    @XmlMimeType("*/*")
    protected DataHandler audienceFile;

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
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionType }
     * 
     * 
     */
    public List<OptionType> getProperty() {
        if (property == null) {
            property = new ArrayList<OptionType>();
        }
        return this.property;
    }

    /**
     * Gets the value of the audienceFile property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getAudienceFile() {
        return audienceFile;
    }

    /**
     * Sets the value of the audienceFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setAudienceFile(DataHandler value) {
        this.audienceFile = value;
    }

}
