
package com.mgi.agentconnect.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormFreeTranLookupResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormFreeTranLookupResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="formFreeTransactionInfo" type="{http://www.moneygram.com/AgentConnect1211}FormFreeTransactionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormFreeTranLookupResponse", propOrder = {
    "formFreeTransactionInfo"
})
public class FormFreeTranLookupResponse
    extends Response
{

    protected List<FormFreeTransactionInfo> formFreeTransactionInfo;

    /**
     * Gets the value of the formFreeTransactionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formFreeTransactionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormFreeTransactionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormFreeTransactionInfo }
     * 
     * 
     */
    public List<FormFreeTransactionInfo> getFormFreeTransactionInfo() {
        if (formFreeTransactionInfo == null) {
            formFreeTransactionInfo = new ArrayList<FormFreeTransactionInfo>();
        }
        return this.formFreeTransactionInfo;
    }

}
