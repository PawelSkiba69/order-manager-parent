
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for doreczenieUslugaPocztowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doreczenieUslugaPocztowaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="oczekiwanyTerminDoreczenia" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="oczekiwanaGodzinaDoreczenia" type="{http://e-nadawca.poczta-polska.pl}oczekiwanaGodzinaDoreczeniaUslugiType" /&gt;
 *       &lt;attribute name="wSobote" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="doRakWlasnych" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doreczenieUslugaPocztowaType")
public class DoreczenieUslugaPocztowaType {

    @XmlAttribute(name = "oczekiwanyTerminDoreczenia")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar oczekiwanyTerminDoreczenia;
    @XmlAttribute(name = "oczekiwanaGodzinaDoreczenia")
    protected OczekiwanaGodzinaDoreczeniaUslugiType oczekiwanaGodzinaDoreczenia;
    @XmlAttribute(name = "wSobote")
    protected Boolean wSobote;
    @XmlAttribute(name = "doRakWlasnych")
    protected Boolean doRakWlasnych;

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

}
