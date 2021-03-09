
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for doreczenieUslugaKurierskaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="doreczenieUslugaKurierskaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="oczekiwanyTerminDoreczenia" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *       &amp;lt;attribute name="oczekiwanaGodzinaDoreczenia" type="{http://e-nadawca.poczta-polska.pl}oczekiwanaGodzinaDoreczeniaUslugiType" /&amp;gt;
 *       &amp;lt;attribute name="wSobote" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="w90Minut" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="wNiedzieleLubSwieto" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="doRakWlasnych" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="wGodzinachOd20Do7" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="po17" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doreczenieUslugaKurierskaType")
public class DoreczenieUslugaKurierskaType {

    @XmlAttribute(name = "oczekiwanyTerminDoreczenia")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar oczekiwanyTerminDoreczenia;
    @XmlAttribute(name = "oczekiwanaGodzinaDoreczenia")
    protected OczekiwanaGodzinaDoreczeniaUslugiType oczekiwanaGodzinaDoreczenia;
    @XmlAttribute(name = "wSobote")
    protected Boolean wSobote;
    @XmlAttribute(name = "w90Minut")
    protected Boolean w90Minut;
    @XmlAttribute(name = "wNiedzieleLubSwieto")
    protected Boolean wNiedzieleLubSwieto;
    @XmlAttribute(name = "doRakWlasnych")
    protected Boolean doRakWlasnych;
    @XmlAttribute(name = "wGodzinachOd20Do7")
    protected Boolean wGodzinachOd20Do7;
    @XmlAttribute(name = "po17")
    protected Boolean po17;

    /**
     * Gets the value of the oczekiwanyTerminDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOczekiwanyTerminDoreczenia() {
        return oczekiwanyTerminDoreczenia;
    }

    /**
     * Sets the value of the oczekiwanyTerminDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOczekiwanyTerminDoreczenia(XMLGregorianCalendar value) {
        this.oczekiwanyTerminDoreczenia = value;
    }

    /**
     * Gets the value of the oczekiwanaGodzinaDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link OczekiwanaGodzinaDoreczeniaUslugiType }
     *     
     */
    public OczekiwanaGodzinaDoreczeniaUslugiType getOczekiwanaGodzinaDoreczenia() {
        return oczekiwanaGodzinaDoreczenia;
    }

    /**
     * Sets the value of the oczekiwanaGodzinaDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link OczekiwanaGodzinaDoreczeniaUslugiType }
     *     
     */
    public void setOczekiwanaGodzinaDoreczenia(OczekiwanaGodzinaDoreczeniaUslugiType value) {
        this.oczekiwanaGodzinaDoreczenia = value;
    }

    /**
     * Gets the value of the wSobote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWSobote() {
        return wSobote;
    }

    /**
     * Sets the value of the wSobote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWSobote(Boolean value) {
        this.wSobote = value;
    }

    /**
     * Gets the value of the w90Minut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isW90Minut() {
        return w90Minut;
    }

    /**
     * Sets the value of the w90Minut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setW90Minut(Boolean value) {
        this.w90Minut = value;
    }

    /**
     * Gets the value of the wNiedzieleLubSwieto property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWNiedzieleLubSwieto() {
        return wNiedzieleLubSwieto;
    }

    /**
     * Sets the value of the wNiedzieleLubSwieto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWNiedzieleLubSwieto(Boolean value) {
        this.wNiedzieleLubSwieto = value;
    }

    /**
     * Gets the value of the doRakWlasnych property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoRakWlasnych() {
        return doRakWlasnych;
    }

    /**
     * Sets the value of the doRakWlasnych property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoRakWlasnych(Boolean value) {
        this.doRakWlasnych = value;
    }

    /**
     * Gets the value of the wGodzinachOd20Do7 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWGodzinachOd20Do7() {
        return wGodzinachOd20Do7;
    }

    /**
     * Sets the value of the wGodzinachOd20Do7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWGodzinachOd20Do7(Boolean value) {
        this.wGodzinachOd20Do7 = value;
    }

    /**
     * Gets the value of the po17 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPo17() {
        return po17;
    }

    /**
     * Sets the value of the po17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPo17(Boolean value) {
        this.po17 = value;
    }

}
