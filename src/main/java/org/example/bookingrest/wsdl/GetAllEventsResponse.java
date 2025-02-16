package org.example.bookingrest.wsdl;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for getAllEventsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllEventsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://controller.bookingServicePayara.example.com/}eventReadList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllEventsResponse", propOrder = {
    "_return"
})
@XmlRootElement(name = "GetAllEventsResponse")
public class GetAllEventsResponse {

    @XmlElement(name = "return")
    protected EventReadList _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link EventReadList }
     *     
     */
    public EventReadList getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventReadList }
     *     
     */
    public void setReturn(EventReadList value) {
        this._return = value;
    }

}
