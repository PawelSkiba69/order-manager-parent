
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for przesylkaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="przesylkaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="oplacaOdbiorca" type="{http://e-nadawca.poczta-polska.pl}oplacaOdbiorcaType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="guid" use="required" type="{http://e-nadawca.poczta-polska.pl}guidType" /&amp;gt;
 *       &amp;lt;attribute name="pakietGuid" type="{http://e-nadawca.poczta-polska.pl}guidType" /&amp;gt;
 *       &amp;lt;attribute name="opakowanieGuid" type="{http://e-nadawca.poczta-polska.pl}guidType" /&amp;gt;
 *       &amp;lt;attribute name="opis" type="{http://e-nadawca.poczta-polska.pl}opisType" /&amp;gt;
 *       &amp;lt;attribute name="planowanaDataNadania" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaType", propOrder = {
    "oplacaOdbiorca"
})
@XmlSeeAlso({
    SubPrzesylkaBiznesowaType.class,
    SubPrzesylkaBiznesowaPlusType.class,
    SubPrzesylkaPaletowaType.class,
    SubUslugaPaczkowaType.class,
    SubUslugaKurierskaType.class,
    PrzesylkaNieRejestrowanaType.class,
    PrzesylkaRejestrowanaType.class
})
public abstract class PrzesylkaType {

    protected OplacaOdbiorcaType oplacaOdbiorca;
    @XmlAttribute(name = "guid", required = true)
    protected String guid;
    @XmlAttribute(name = "pakietGuid")
    protected String pakietGuid;
    @XmlAttribute(name = "opakowanieGuid")
    protected String opakowanieGuid;
    @XmlAttribute(name = "opis")
    protected String opis;
    @XmlAttribute(name = "planowanaDataNadania")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar planowanaDataNadania;

    /**
     * Gets the value of the oplacaOdbiorca property.
     * 
     * @return
     *     possible object is
     *     {@link OplacaOdbiorcaType }
     *     
     */
    public OplacaOdbiorcaType getOplacaOdbiorca() {
        return oplacaOdbiorca;
    }

    /**
     * Sets the value of the oplacaOdbiorca property.
     * 
     * @param value
     *     allowed object is
     *     {@link OplacaOdbiorcaType }
     *     
     */
    public void setOplacaOdbiorca(OplacaOdbiorcaType value) {
        this.oplacaOdbiorca = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the pakietGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPakietGuid() {
        return pakietGuid;
    }

    /**
     * Sets the value of the pakietGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPakietGuid(String value) {
        this.pakietGuid = value;
    }

    /**
     * Gets the value of the opakowanieGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpakowanieGuid() {
        return opakowanieGuid;
    }

    /**
     * Sets the value of the opakowanieGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpakowanieGuid(String value) {
        this.opakowanieGuid = value;
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
     * Gets the value of the planowanaDataNadania property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanowanaDataNadania() {
        return planowanaDataNadania;
    }

    /**
     * Sets the value of the planowanaDataNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanowanaDataNadania(XMLGregorianCalendar value) {
        this.planowanaDataNadania = value;
    }

}
