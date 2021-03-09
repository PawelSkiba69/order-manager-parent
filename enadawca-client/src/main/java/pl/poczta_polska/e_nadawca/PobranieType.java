
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for pobranieType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="pobranieType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="sposobPobrania" type="{http://e-nadawca.poczta-polska.pl}sposobPobraniaType" /&amp;gt;
 *       &amp;lt;attribute name="kwotaPobrania" type="{http://e-nadawca.poczta-polska.pl}kwotaPobraniaType" /&amp;gt;
 *       &amp;lt;attribute name="nrb"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *             &amp;lt;minLength value="0"/&amp;gt;
 *             &amp;lt;maxLength value="26"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="tytulem"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *             &amp;lt;minLength value="0"/&amp;gt;
 *             &amp;lt;maxLength value="54"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="sprawdzenieZawartosciPrzesylkiPrzezOdbiorce" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pobranieType")
public class PobranieType {

    @XmlAttribute(name = "sposobPobrania")
    protected SposobPobraniaType sposobPobrania;
    @XmlAttribute(name = "kwotaPobrania")
    protected Integer kwotaPobrania;
    @XmlAttribute(name = "nrb")
    protected String nrb;
    @XmlAttribute(name = "tytulem")
    protected String tytulem;
    @XmlAttribute(name = "sprawdzenieZawartosciPrzesylkiPrzezOdbiorce")
    protected Boolean sprawdzenieZawartosciPrzesylkiPrzezOdbiorce;

    /**
     * Gets the value of the sposobPobrania property.
     * 
     * @return
     *     possible object is
     *     {@link SposobPobraniaType }
     *     
     */
    public SposobPobraniaType getSposobPobrania() {
        return sposobPobrania;
    }

    /**
     * Sets the value of the sposobPobrania property.
     * 
     * @param value
     *     allowed object is
     *     {@link SposobPobraniaType }
     *     
     */
    public void setSposobPobrania(SposobPobraniaType value) {
        this.sposobPobrania = value;
    }

    /**
     * Gets the value of the kwotaPobrania property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKwotaPobrania() {
        return kwotaPobrania;
    }

    /**
     * Sets the value of the kwotaPobrania property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKwotaPobrania(Integer value) {
        this.kwotaPobrania = value;
    }

    /**
     * Gets the value of the nrb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrb() {
        return nrb;
    }

    /**
     * Sets the value of the nrb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrb(String value) {
        this.nrb = value;
    }

    /**
     * Gets the value of the tytulem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTytulem() {
        return tytulem;
    }

    /**
     * Sets the value of the tytulem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTytulem(String value) {
        this.tytulem = value;
    }

    /**
     * Gets the value of the sprawdzenieZawartosciPrzesylkiPrzezOdbiorce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSprawdzenieZawartosciPrzesylkiPrzezOdbiorce() {
        return sprawdzenieZawartosciPrzesylkiPrzezOdbiorce;
    }

    /**
     * Sets the value of the sprawdzenieZawartosciPrzesylkiPrzezOdbiorce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSprawdzenieZawartosciPrzesylkiPrzezOdbiorce(Boolean value) {
        this.sprawdzenieZawartosciPrzesylkiPrzezOdbiorce = value;
    }

}
