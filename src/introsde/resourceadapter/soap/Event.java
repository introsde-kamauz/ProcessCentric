
package introsde.resourceadapter.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per event complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="max_temperature" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="min_temperature" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precipitations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="venue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event", propOrder = {
    "city",
    "description",
    "distance",
    "duration",
    "latitude",
    "longitude",
    "maxTemperature",
    "minTemperature",
    "name",
    "precipitations",
    "startdate",
    "type",
    "venue"
})
public class Event {

    protected String city;
    protected String description;
    protected String distance;
    protected String duration;
    protected double latitude;
    protected double longitude;
    @XmlElement(name = "max_temperature")
    protected Double maxTemperature;
    @XmlElement(name = "min_temperature")
    protected Double minTemperature;
    protected String name;
    protected String precipitations;
    protected String startdate;
    protected String type;
    protected String venue;

    /**
     * Recupera il valore della proprietÓ city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Imposta il valore della proprietÓ city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Recupera il valore della proprietÓ description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietÓ description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietÓ distance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Imposta il valore della proprietÓ distance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * Recupera il valore della proprietÓ duration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Imposta il valore della proprietÓ duration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Recupera il valore della proprietÓ latitude.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Imposta il valore della proprietÓ latitude.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Recupera il valore della proprietÓ longitude.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Imposta il valore della proprietÓ longitude.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Recupera il valore della proprietÓ maxTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * Imposta il valore della proprietÓ maxTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxTemperature(Double value) {
        this.maxTemperature = value;
    }

    /**
     * Recupera il valore della proprietÓ minTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinTemperature() {
        return minTemperature;
    }

    /**
     * Imposta il valore della proprietÓ minTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinTemperature(Double value) {
        this.minTemperature = value;
    }

    /**
     * Recupera il valore della proprietÓ name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietÓ name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietÓ precipitations.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecipitations() {
        return precipitations;
    }

    /**
     * Imposta il valore della proprietÓ precipitations.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecipitations(String value) {
        this.precipitations = value;
    }

    /**
     * Recupera il valore della proprietÓ startdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartdate() {
        return startdate;
    }

    /**
     * Imposta il valore della proprietÓ startdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartdate(String value) {
        this.startdate = value;
    }

    /**
     * Recupera il valore della proprietÓ type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietÓ type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietÓ venue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenue() {
        return venue;
    }

    /**
     * Imposta il valore della proprietÓ venue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenue(String value) {
        this.venue = value;
    }

}
