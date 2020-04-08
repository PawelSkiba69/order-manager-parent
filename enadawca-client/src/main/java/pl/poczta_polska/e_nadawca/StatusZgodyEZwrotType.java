
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for statusZgodyEZwrotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusZgodyEZwrotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eZwrotPrzesylki" type="{http://e-nadawca.poczta-polska.pl}eZwrotPrzesylkiType" maxOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="guidZgodaEZwrot" type="{http://e-nadawca.poczta-polska.pl}guidType" /&gt;
 *       &lt;attribute name="status" type="{http://e-nadawca.poczta-polska.pl}statusZgodyEZwrotNameType" /&gt;
 *       &lt;attribute name="platnoscZaPrzesylke" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="kosztKontrahenta" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="dataWygasnieciaZgody" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusZgodyEZwrotType", propOrder = {
    "eZwrotPrzesylki"
})
public class StatusZgodyEZwrotType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<EZwrotPrzesylkiType> eZwrotPrzesylki;
    @XmlAttribute(name = "guidZgodaEZwrot")
    protected String guidZgodaEZwrot;
    @XmlAttribute(name = "status")
    protected StatusZgodyEZwrotNameType status;
    @XmlAttribute(name = "platnoscZaPrzesylke")
    protected Boolean platnoscZaPrzesylke;
    @XmlAttribute(name = "kosztKontrahenta")
    protected Integer kosztKontrahenta;
    @XmlAttribute(name = "dataWygasnieciaZgody")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataWygasnieciaZgody;

    /**
     * Gets the value of the eZwrotPrzesylki property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eZwrotPrzesylki property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEZwrotPrzesylki().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EZwrotPrzesylkiType }
     * 
     * 
     */
    public List<EZwrotPrzesylkiType> getEZwrotPrzesylki() {
        if (eZwrotPrzesylki == null) {
            eZwrotPrzesylki = new ArrayList<EZwrotPrzesylkiType>();
        }
        return this.eZwrotPrzesylki;
    }

    /**
     * Gets the value of the guidZgodaEZwrot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidZgodaEZwrot() {
        return guidZgodaEZwrot;
    }

    /**
     * Sets the value of the guidZgodaEZwrot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidZgodaEZwrot(String value) {
        this.guidZgodaEZwrot = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusZgodyEZwrotNameType }
     *     
     */
    public StatusZgodyEZwrotNameType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusZgodyEZwrotNameType }
     *     
     */
    public void setStatus(StatusZgodyEZwrotNameType value) {
        this.status = value;
    }

    /**
     * Gets the value of the platnoscZaPrzesylke property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlatnoscZaPrzesylke() {
        return platnoscZaPrzesylke;
    }

    /**
     * Sets the value of the platnoscZaPrzesylke property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlatnoscZaPrzesylke(Boolean value) {
        this.platnoscZaPrzesylke = value;
    }

    /**
     * Gets the value of the kosztKontrahenta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKosztKontrahenta() {
        return kosztKontrahenta;
    }

    /**
     * Sets the value of the kosztKontrahenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKosztKontrahenta(Integer value) {
        this.kosztKontrahenta = value;
    }

    /**
     * Gets the value of the dataWygasnieciaZgody property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataWygasnieciaZgody() {
        return dataWygasnieciaZgody;
    }

    /**
     * Sets the value of the dataWygasnieciaZgody property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataWygasnieciaZgody(XMLGregorianCalendar value) {
        this.dataWygasnieciaZgody = value;
    }

}
