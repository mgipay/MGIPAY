
package com.ac1211.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-03-25T18:12:35.815+05:30
 * Generated source version: 2.7.3
 */

@WebFault(name = "error", targetNamespace = "http://www.moneygram.com/AgentConnect1211")
public class Error_Exception extends Exception {
    
    private com.ac1211.client.Error error;

    public Error_Exception() {
        super();
    }
    
    public Error_Exception(String message) {
        super(message);
    }
    
    public Error_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Error_Exception(String message, com.ac1211.client.Error error) {
        super(message);
        this.error = error;
    }

    public Error_Exception(String message, com.ac1211.client.Error error, Throwable cause) {
        super(message, cause);
        this.error = error;
    }

    public com.ac1211.client.Error getFaultInfo() {
        return this.error;
    }
}
