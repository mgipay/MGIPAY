
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmendTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendTransactionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="transactionSucceeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendTransactionResponse", propOrder = {
    "transactionSucceeded"
})
public class AmendTransactionResponse
    extends Response
{

    protected boolean transactionSucceeded;

    /**
     * Gets the value of the transactionSucceeded property.
     * 
     */
    public boolean isTransactionSucceeded() {
        return transactionSucceeded;
    }

    /**
     * Sets the value of the transactionSucceeded property.
     * 
     */
    public void setTransactionSucceeded(boolean value) {
        this.transactionSucceeded = value;
    }

}
