
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for zwrotPrzesylkiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zwrotPrzesylkiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="przyczyna" type="{http://e-nadawca.poczta-polska.pl}przyczynaZwrotuEnum" /&gt;
 *       &lt;attribute name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="przyczynaZwrotuDodatkowa" type="{http://e-nadawca.poczta-polska.pl}przyczynaZwrotuDodatkowaType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zwrotPrzesylkiType")
public class ZwrotPrzesylkiType {

    @XmlAttribute(name = "przyczyna")
    protected PrzyczynaZwrotuEnum przyczyna;
    @XmlAttribute(name = "data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlAttribute(name = "przyczynaZwrotuDodatkowa")
    protected String przyczynaZwrotuDodatkowa;

    /**
     * Gets the value of the przyczyna property.
     * 
     * @return
     *     possible object is
     *     {@link PrzyczynaZwrotuEnum }
     *     
     */
    public PrzyczynaZwrotuEnum getPrzyczyna() {
        return przyczyna;
    }

    /**
     * Sets the value of the przyczyna property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrzyczynaZwrotuEnum }
     *     
     */
    public void setPrzyczyna(PrzyczynaZwrotuEnum value) {
        this.przyczyna = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the przyczynaZwrotuDodatkowa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrzyczynaZwrotuDodatkowa() {
        return przyczynaZwrotuDodatkowa;
    }

    /**
     * Sets the value of the przyczynaZwrotuDodatkowa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrzyczynaZwrotuDodatkowa(String value) {
        this.przyczynaZwrotuDodatkowa = value;
    }

}
