
package org.example.bookingrest.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CustomNotFound", targetNamespace = "http://controller.bookingServicePayara.example.com/")
public class CustomNotFound_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CustomNotFound faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CustomNotFound_Exception(String message, CustomNotFound faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CustomNotFound_Exception(String message, CustomNotFound faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.example.bookingrest.wsdl.CustomNotFound
     */
    public CustomNotFound getFaultInfo() {
        return faultInfo;
    }

}
