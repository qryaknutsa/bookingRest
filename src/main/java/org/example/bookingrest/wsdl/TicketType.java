
package org.example.bookingrest.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ticketType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ticketType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHEAP"/&gt;
 *     &lt;enumeration value="BUDGETARY"/&gt;
 *     &lt;enumeration value="USUAL"/&gt;
 *     &lt;enumeration value="VIP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ticketType")
@XmlEnum
public enum TicketType {

    CHEAP,
    BUDGETARY,
    USUAL,
    VIP;

    public String value() {
        return name();
    }

    public static TicketType fromValue(String v) {
        return valueOf(v);
    }

}
