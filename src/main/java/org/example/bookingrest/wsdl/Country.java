
package org.example.bookingrest.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for country.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="country"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NORTH_KOREA"/&gt;
 *     &lt;enumeration value="JAPAN"/&gt;
 *     &lt;enumeration value="CHINA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "country")
@XmlEnum
public enum Country {

    NORTH_KOREA,
    JAPAN,
    CHINA;

    public String value() {
        return name();
    }

    public static Country fromValue(String v) {
        return valueOf(v);
    }

}
