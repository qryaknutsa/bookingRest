
package org.example.bookingrest.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="eyeColor" type="{http://controller.bookingServicePayara.example.com/}eyeColor" minOccurs="0"/&gt;
 *         &lt;element name="hairColor" type="{http://controller.bookingServicePayara.example.com/}hairColor" minOccurs="0"/&gt;
 *         &lt;element name="nationality" type="{http://controller.bookingServicePayara.example.com/}country" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://controller.bookingServicePayara.example.com/}location" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
    "id",
    "height",
    "eyeColor",
    "hairColor",
    "nationality",
    "location"
})
public class Person {

    protected int id;
    protected int height;
    @XmlSchemaType(name = "string")
    protected EyeColor eyeColor;
    @XmlSchemaType(name = "string")
    protected HairColor hairColor;
    @XmlSchemaType(name = "string")
    protected Country nationality;
    protected Location location;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the eyeColor property.
     * 
     * @return
     *     possible object is
     *     {@link EyeColor }
     *     
     */
    public EyeColor getEyeColor() {
        return eyeColor;
    }

    /**
     * Sets the value of the eyeColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link EyeColor }
     *     
     */
    public void setEyeColor(EyeColor value) {
        this.eyeColor = value;
    }

    /**
     * Gets the value of the hairColor property.
     * 
     * @return
     *     possible object is
     *     {@link HairColor }
     *     
     */
    public HairColor getHairColor() {
        return hairColor;
    }

    /**
     * Sets the value of the hairColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link HairColor }
     *     
     */
    public void setHairColor(HairColor value) {
        this.hairColor = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setNationality(Country value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

}
