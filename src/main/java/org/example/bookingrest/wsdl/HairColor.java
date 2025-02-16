
package org.example.bookingrest.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hairColor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="hairColor"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RED"/&gt;
 *     &lt;enumeration value="BLACK"/&gt;
 *     &lt;enumeration value="BLUE"/&gt;
 *     &lt;enumeration value="ORANGE"/&gt;
 *     &lt;enumeration value="WHITE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "hairColor")
@XmlEnum
public enum HairColor {

    RED,
    BLACK,
    BLUE,
    ORANGE,
    WHITE;

    public String value() {
        return name();
    }

    public static HairColor fromValue(String v) {
        return valueOf(v);
    }

}
