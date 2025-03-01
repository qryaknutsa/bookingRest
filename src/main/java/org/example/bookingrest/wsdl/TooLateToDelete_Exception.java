
package org.example.bookingrest.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "TooLateToDelete", targetNamespace = "http://controller.bookingServicePayara.example.com/")
public class TooLateToDelete_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TooLateToDelete faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public TooLateToDelete_Exception(String message, TooLateToDelete faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public TooLateToDelete_Exception(String message, TooLateToDelete faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.example.bookingrest.wsdl.TooLateToDelete
     */
    public TooLateToDelete getFaultInfo() {
        return faultInfo;
    }

}
