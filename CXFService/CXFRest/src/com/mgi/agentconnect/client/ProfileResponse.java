
package com.mgi.agentconnect.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="profileItem" type="{http://www.moneygram.com/AgentConnect1211}ProfileItem" maxOccurs="unbounded"/>
 *         &lt;element name="productProfileItem" type="{http://www.moneygram.com/AgentConnect1211}ProductProfileItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileResponse", propOrder = {
    "profileItem",
    "productProfileItem"
})
public class ProfileResponse
    extends Response
{

    @XmlElement(required = true)
    protected List<ProfileItem> profileItem;
    @XmlElement(required = true)
    protected List<ProductProfileItem> productProfileItem;

    /**
     * Gets the value of the profileItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileItem }
     * 
     * 
     */
    public List<ProfileItem> getProfileItem() {
        if (profileItem == null) {
            profileItem = new ArrayList<ProfileItem>();
        }
        return this.profileItem;
    }

    /**
     * Gets the value of the productProfileItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productProfileItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductProfileItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductProfileItem }
     * 
     * 
     */
    public List<ProductProfileItem> getProductProfileItem() {
        if (productProfileItem == null) {
            productProfileItem = new ArrayList<ProductProfileItem>();
        }
        return this.productProfileItem;
    }

}
