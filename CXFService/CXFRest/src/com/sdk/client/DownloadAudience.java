
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
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="option" type="{uri:audiencetransfer.ws.sdk.edialog.com}OptionType" maxOccurs="unbounded" minOccurs="0"/>
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
    "column",
    "option"
})
@XmlRootElement(name = "downloadAudience", namespace = "uri:audiencetransfer.ws.sdk.edialog.com")
public class DownloadAudience {

    @XmlElement(namespace = "uri:audiencetransfer.ws.sdk.edialog.com")
    protected int audienceId;
    @XmlElement(namespace = "uri:audiencetransfer.ws.sdk.edialog.com")
    protected List<String> column;
    @XmlElement(namespace = "uri:audiencetransfer.ws.sdk.edialog.com")
    protected List<OptionType> option;

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
     * Gets the value of the column property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColumn() {
        if (column == null) {
            column = new ArrayList<String>();
        }
        return this.column;
    }

    /**
     * Gets the value of the option property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionType }
     * 
     * 
     */
    public List<OptionType> getOption() {
        if (option == null) {
            option = new ArrayList<OptionType>();
        }
        return this.option;
    }

}
