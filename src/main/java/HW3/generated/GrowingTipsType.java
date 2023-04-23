//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.23 at 09:51:08 PM EEST 
//


package HW3.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for growing_tipsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="growing_tipsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="temperature" type="{}temperatureType"/>
 *         &lt;element name="lighting">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Light-loving"/>
 *               &lt;enumeration value="Not light-loving"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="watering" type="{}wateringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "growing_tipsType", propOrder = {
    "temperature",
    "lighting",
    "watering"
})
public class GrowingTipsType {

    @XmlElement(required = true)
    protected TemperatureType temperature;
    @XmlElement(required = true)
    protected String lighting;
    @XmlElement(required = true)
    protected WateringType watering;

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setTemperature(TemperatureType value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the lighting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLighting() {
        return lighting;
    }

    /**
     * Sets the value of the lighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLighting(String value) {
        this.lighting = value;
    }

    /**
     * Gets the value of the watering property.
     * 
     * @return
     *     possible object is
     *     {@link WateringType }
     *     
     */
    public WateringType getWatering() {
        return watering;
    }

    /**
     * Sets the value of the watering property.
     * 
     * @param value
     *     allowed object is
     *     {@link WateringType }
     *     
     */
    public void setWatering(WateringType value) {
        this.watering = value;
    }

}
