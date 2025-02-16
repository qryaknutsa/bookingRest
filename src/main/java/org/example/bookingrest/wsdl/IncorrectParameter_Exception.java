
package org.example.bookingrest.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "IncorrectParameter", targetNamespace = "http://controller.bookingServicePayara.example.com/")
public class IncorrectParameter_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private IncorrectParameter faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IncorrectParameter_Exception(String message, IncorrectParameter faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IncorrectParameter_Exception(String message, IncorrectParameter faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.example.bookingrest.wsdl.IncorrectParameter
     */
    public IncorrectParameter getFaultInfo() {
        return faultInfo;
    }

}
