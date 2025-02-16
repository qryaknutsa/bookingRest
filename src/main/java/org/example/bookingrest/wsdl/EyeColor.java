
package org.example.bookingrest.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eyeColor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eyeColor"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GREEN"/&gt;
 *     &lt;enumeration value="RED"/&gt;
 *     &lt;enumeration value="BLUE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "eyeColor")
@XmlEnum
public enum EyeColor {

    GREEN,
    RED,
    BLUE;

    public String value() {
        return name();
    }

    public static EyeColor fromValue(String v) {
        return valueOf(v);
    }

}
