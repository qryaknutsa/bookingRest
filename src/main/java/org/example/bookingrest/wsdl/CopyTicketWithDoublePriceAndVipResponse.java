
package org.example.bookingrest.wsdl;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for copyTicketWithDoublePriceAndVipResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="copyTicketWithDoublePriceAndVipResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://controller.bookingServicePayara.example.com/}ticket" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyTicketWithDoublePriceAndVipResponse", propOrder = {
    "_return"
})
@XmlRootElement
public class CopyTicketWithDoublePriceAndVipResponse {

    @XmlElement(name = "return")
    protected Ticket _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Ticket }
     *     
     */
    public Ticket getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticket }
     *     
     */
    public void setReturn(Ticket value) {
        this._return = value;
    }

}
