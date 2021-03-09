
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for reklamowanaPrzesylkaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="reklamowanaPrzesylkaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="przesylka" type="{http://e-nadawca.poczta-polska.pl}przesylkaType"/&amp;gt;
 *         &amp;lt;element name="powodReklamacji" type="{http://e-nadawca.poczta-polska.pl}powodReklamacjiType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="dataNadania" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *       &amp;lt;attribute name="urzadNadania" type="{http://e-nadawca.poczta-polska.pl}urzadNadaniaType" /&amp;gt;
 *       &amp;lt;attribute name="powodReklamacjiOpis" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="odszkodowanie" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="oplata" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="oczekiwaneOdszkodowanie" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reklamowanaPrzesylkaType", propOrder = {
    "przesylka",
    "powodReklamacji"
})
public class ReklamowanaPrzesylkaType {

    @XmlElement(required = true)
    protected PrzesylkaType przesylka;
    @XmlElement(required = true)
    protected PowodReklamacjiType powodReklamacji;
    @XmlAttribute(name = "dataNadania", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNadania;
    @XmlAttribute(name = "urzadNadania")
    protected Integer urzadNadania;
    @XmlAttribute(name = "powodReklamacjiOpis")
    protected String powodReklamacjiOpis;
    @XmlAttribute(name = "odszkodowanie")
    protected Integer odszkodowanie;
    @XmlAttribute(name = "oplata")
    protected Integer oplata;
    @XmlAttribute(name = "oczekiwaneOdszkodowanie")
    protected Integer oczekiwaneOdszkodowanie;

    /**
     * Gets the value of the przesylka property.
     * 
     * @return
     *     possible object is
     *     {@link PrzesylkaType }
     *     
     */
    public PrzesylkaType getPrzesylka() {
        return przesylka;
    }

    /**
     * Sets the value of the przesylka property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrzesylkaType }
     *     
     */
    public void setPrzesylka(PrzesylkaType value) {
        this.przesylka = value;
    }

    /**
     * Gets the value of the powodReklamacji property.
     * 
     * @return
     *     possible object is
     *     {@link PowodReklamacjiType }
     *     
     */
    public PowodReklamacjiType getPowodReklamacji() {
        return powodReklamacji;
    }

    /**
     * Sets the value of the powodReklamacji property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowodReklamacjiType }
     *     
     */
    public void setPowodReklamacji(PowodReklamacjiType value) {
        this.powodReklamacji = value;
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
     * Gets the value of the powodReklamacjiOpis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowodReklamacjiOpis() {
        return powodReklamacjiOpis;
    }

    /**
     * Sets the value of the powodReklamacjiOpis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowodReklamacjiOpis(String value) {
        this.powodReklamacjiOpis = value;
    }

    /**
     * Gets the value of the odszkodowanie property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOdszkodowanie() {
        return odszkodowanie;
    }

    /**
     * Sets the value of the odszkodowanie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOdszkodowanie(Integer value) {
        this.odszkodowanie = value;
    }

    /**
     * Gets the value of the oplata property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOplata() {
        return oplata;
    }

    /**
     * Sets the value of the oplata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOplata(Integer value) {
        this.oplata = value;
    }

    /**
     * Gets the value of the oczekiwaneOdszkodowanie property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOczekiwaneOdszkodowanie() {
        return oczekiwaneOdszkodowanie;
    }

    /**
     * Sets the value of the oczekiwaneOdszkodowanie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOczekiwaneOdszkodowanie(Integer value) {
        this.oczekiwaneOdszkodowanie = value;
    }

}
