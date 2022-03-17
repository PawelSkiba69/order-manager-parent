
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for buforType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buforType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="profil" type="{http://e-nadawca.poczta-polska.pl}profilType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="idBufor" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="dataNadania" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="urzadNadania" type="{http://e-nadawca.poczta-polska.pl}urzadNadaniaType" /&gt;
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="opis" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="aktualizujPlanowanaDateNadaniaPrzesylek" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buforType", propOrder = {
    "profil"
})
public class BuforType {

    protected ProfilType profil;
    @XmlAttribute(name = "idBufor")
    protected Integer idBufor;
    @XmlAttribute(name = "dataNadania")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNadania;
    @XmlAttribute(name = "urzadNadania")
    protected Integer urzadNadania;
    @XmlAttribute(name = "active")
    protected Boolean active;
    @XmlAttribute(name = "opis")
    protected String opis;
    @XmlAttribute(name = "aktualizujPlanowanaDateNadaniaPrzesylek")
    protected Boolean aktualizujPlanowanaDateNadaniaPrzesylek;

    /**
     * Gets the value of the profil property.
     * 
     * @return
     *     possible object is
     *     {@link ProfilType }
     *     
     */
    public ProfilType getProfil() {
        return profil;
    }

    /**
     * Sets the value of the profil property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfilType }
     *     
     */
    public void setProfil(ProfilType value) {
        this.profil = value;
    }

    /**
     * Gets the value of the idBufor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdBufor() {
        return idBufor;
    }

    /**
     * Sets the value of the idBufor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdBufor(Integer value) {
        this.idBufor = value;
    }

    /**
     * Gets the value of the dataNadania property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNadania() {
        return dataNadania;
    }

    /**
     * Sets the value of the dataNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNadania(XMLGregorianCalendar value) {
        this.dataNadania = value;
    }

    /**
     * Gets the value of the urzadNadania property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUrzadNadania() {
        return urzadNadania;
    }

    /**
     * Sets the value of the urzadNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUrzadNadania(Integer value) {
        this.urzadNadania = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
    }

    /**
     * Gets the value of the aktualizujPlanowanaDateNadaniaPrzesylek property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAktualizujPlanowanaDateNadaniaPrzesylek() {
        return aktualizujPlanowanaDateNadaniaPrzesylek;
    }

    /**
     * Sets the value of the aktualizujPlanowanaDateNadaniaPrzesylek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAktualizujPlanowanaDateNadaniaPrzesylek(Boolean value) {
        this.aktualizujPlanowanaDateNadaniaPrzesylek = value;
    }

}
