
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="miejsceOdbioru" type="{http://e-nadawca.poczta-polska.pl}adresType"/&gt;
 *         &lt;element name="nadawca" type="{http://e-nadawca.poczta-polska.pl}adresType" minOccurs="0"/&gt;
 *         &lt;element name="oczekiwanaDataOdbioru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oczekiwanaGodzinaOdbioru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="szacowanaIloscPrzeslek" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="szacowanaLacznaMasaPrzesylek" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "miejsceOdbioru",
    "nadawca",
    "oczekiwanaDataOdbioru",
    "oczekiwanaGodzinaOdbioru",
    "szacowanaIloscPrzeslek",
    "szacowanaLacznaMasaPrzesylek"
})
@XmlRootElement(name = "zamowKuriera")
public class ZamowKuriera {

    @XmlElement(required = true)
    protected AdresType miejsceOdbioru;
    protected AdresType nadawca;
    @XmlElement(required = true)
    protected String oczekiwanaDataOdbioru;
    @XmlElement(required = true)
    protected String oczekiwanaGodzinaOdbioru;
    @XmlElement(required = true)
    protected String szacowanaIloscPrzeslek;
    @XmlElement(required = true)
    protected String szacowanaLacznaMasaPrzesylek;

    /**
     * Gets the value of the miejsceOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getMiejsceOdbioru() {
        return miejsceOdbioru;
    }

    /**
     * Sets the value of the miejsceOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setMiejsceOdbioru(AdresType value) {
        this.miejsceOdbioru = value;
    }

    /**
     * Gets the value of the nadawca property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getNadawca() {
        return nadawca;
    }

    /**
     * Sets the value of the nadawca property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setNadawca(AdresType value) {
        this.nadawca = value;
    }

    /**
     * Gets the value of the oczekiwanaDataOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOczekiwanaDataOdbioru() {
        return oczekiwanaDataOdbioru;
    }

    /**
     * Sets the value of the oczekiwanaDataOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOczekiwanaDataOdbioru(String value) {
        this.oczekiwanaDataOdbioru = value;
    }

    /**
     * Gets the value of the oczekiwanaGodzinaOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOczekiwanaGodzinaOdbioru() {
        return oczekiwanaGodzinaOdbioru;
    }

    /**
     * Sets the value of the oczekiwanaGodzinaOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOczekiwanaGodzinaOdbioru(String value) {
        this.oczekiwanaGodzinaOdbioru = value;
    }

    /**
     * Gets the value of the szacowanaIloscPrzeslek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzacowanaIloscPrzeslek() {
        return szacowanaIloscPrzeslek;
    }

    /**
     * Sets the value of the szacowanaIloscPrzeslek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzacowanaIloscPrzeslek(String value) {
        this.szacowanaIloscPrzeslek = value;
    }

    /**
     * Gets the value of the szacowanaLacznaMasaPrzesylek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzacowanaLacznaMasaPrzesylek() {
        return szacowanaLacznaMasaPrzesylek;
    }

    /**
     * Sets the value of the szacowanaLacznaMasaPrzesylek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzacowanaLacznaMasaPrzesylek(String value) {
        this.szacowanaLacznaMasaPrzesylek = value;
    }

}
