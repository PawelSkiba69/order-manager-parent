
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for zwrotDokumentowType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="zwrotDokumentowType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element name="rodzajPocztex" type="{http://e-nadawca.poczta-polska.pl}terminRodzajType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rodzajList" type="{http://e-nadawca.poczta-polska.pl}rodzajListType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="odleglosc" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zwrotDokumentowType", propOrder = {
    "rodzajPocztex",
    "rodzajList"
})
public class ZwrotDokumentowType {

    @XmlSchemaType(name = "string")
    protected TerminRodzajType rodzajPocztex;
    protected RodzajListType rodzajList;
    @XmlAttribute(name = "odleglosc")
    protected Integer odleglosc;

    /**
     * Gets the value of the rodzajPocztex property.
     * 
     * @return
     *     possible object is
     *     {@link TerminRodzajType }
     *     
     */
    public TerminRodzajType getRodzajPocztex() {
        return rodzajPocztex;
    }

    /**
     * Sets the value of the rodzajPocztex property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminRodzajType }
     *     
     */
    public void setRodzajPocztex(TerminRodzajType value) {
        this.rodzajPocztex = value;
    }

    /**
     * Gets the value of the rodzajList property.
     * 
     * @return
     *     possible object is
     *     {@link RodzajListType }
     *     
     */
    public RodzajListType getRodzajList() {
        return rodzajList;
    }

    /**
     * Sets the value of the rodzajList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RodzajListType }
     *     
     */
    public void setRodzajList(RodzajListType value) {
        this.rodzajList = value;
    }

    /**
     * Gets the value of the odleglosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOdleglosc() {
        return odleglosc;
    }

    /**
     * Sets the value of the odleglosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOdleglosc(Integer value) {
        this.odleglosc = value;
    }

}
