
package com.ac1211.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiveCountryRequirementsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiveCountryRequirementsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.moneygram.com/AgentConnect1211}stringMax20" minOccurs="0"/>
 *         &lt;element name="receiveCountryRequirementsInfo" type="{http://www.moneygram.com/AgentConnect1211}ReceiveCountryRequirementsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiveCountryRequirementsResponse", propOrder = {
    "version",
    "receiveCountryRequirementsInfo"
})
public class ReceiveCountryRequirementsResponse
    extends Response
{

    protected String version;
    protected List<ReceiveCountryRequirementsInfo> receiveCountryRequirementsInfo;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the receiveCountryRequirementsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiveCountryRequirementsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiveCountryRequirementsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiveCountryRequirementsInfo }
     * 
     * 
     */
    public List<ReceiveCountryRequirementsInfo> getReceiveCountryRequirementsInfo() {
        if (receiveCountryRequirementsInfo == null) {
            receiveCountryRequirementsInfo = new ArrayList<ReceiveCountryRequirementsInfo>();
        }
        return this.receiveCountryRequirementsInfo;
    }

}
