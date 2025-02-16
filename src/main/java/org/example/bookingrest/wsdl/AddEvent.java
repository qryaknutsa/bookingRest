
package org.example.bookingrest.wsdl;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for addEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventWrite" type="{http://controller.bookingServicePayara.example.com/}eventWrite" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addEvent", propOrder = {
    "eventWrite"
})
@XmlRootElement
public class AddEvent {

    @XmlElement
    protected EventWrite eventWrite;

    /**
     * Gets the value of the eventWrite property.
     * 
     * @return
     *     possible object is
     *     {@link EventWrite }
     *     
     */
    public EventWrite getEventWrite() {
        return eventWrite;
    }

    /**
     * Sets the value of the eventWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventWrite }
     *     
     */
    public void setEventWrite(EventWrite value) {
        this.eventWrite = value;
    }

}
