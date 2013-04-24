
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
 *         &lt;element name="cellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="groupNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arrayofCIDs" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
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
    "cellId",
    "groupNumber",
    "arrayofCIDs"
})
@XmlRootElement(name = "updateProofGroupSampleCIDs", namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
public class UpdateProofGroupSampleCIDs {

    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
    protected int cellId;
    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com")
    protected int groupNumber;
    @XmlElement(namespace = "uri:mailingcontrol.ws.sdk.edialog.com", type = Integer.class)
    protected List<Integer> arrayofCIDs;

    /**
     * Gets the value of the cellId property.
     * 
     */
    public int getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     */
    public void setCellId(int value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the groupNumber property.
     * 
     */
    public int getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     */
    public void setGroupNumber(int value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the arrayofCIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayofCIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayofCIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getArrayofCIDs() {
        if (arrayofCIDs == null) {
            arrayofCIDs = new ArrayList<Integer>();
        }
        return this.arrayofCIDs;
    }

}
