
package org.example.bookingrest.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EventServiceImplService", targetNamespace = "http://controller.bookingServicePayara.example.com/", wsdlLocation = "file:/C:/Users/toric/IdeaProjects/bookingRest/src/main/resources/wsdl/bookingservice.wsdl")
public class EventServiceImplService
    extends Service
{

    private final static URL EVENTSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException EVENTSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName EVENTSERVICEIMPLSERVICE_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "EventServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/toric/IdeaProjects/bookingRest/src/main/resources/wsdl/bookingservice.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EVENTSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        EVENTSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public EventServiceImplService() {
        super(__getWsdlLocation(), EVENTSERVICEIMPLSERVICE_QNAME);
    }

    public EventServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EVENTSERVICEIMPLSERVICE_QNAME, features);
    }

    public EventServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, EVENTSERVICEIMPLSERVICE_QNAME);
    }

    public EventServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EVENTSERVICEIMPLSERVICE_QNAME, features);
    }

    public EventServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EventServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EventService
     */
    @WebEndpoint(name = "EventServiceImplPort")
    public EventService getEventServiceImplPort() {
        return super.getPort(new QName("http://controller.bookingServicePayara.example.com/", "EventServiceImplPort"), EventService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EventService
     */
    @WebEndpoint(name = "EventServiceImplPort")
    public EventService getEventServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://controller.bookingServicePayara.example.com/", "EventServiceImplPort"), EventService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EVENTSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw EVENTSERVICEIMPLSERVICE_EXCEPTION;
        }
        return EVENTSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
