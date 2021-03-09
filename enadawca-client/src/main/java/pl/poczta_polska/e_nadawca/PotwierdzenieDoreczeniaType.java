
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for potwierdzenieDoreczeniaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="potwierdzenieDoreczeniaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="sposob" type="{http://e-nadawca.poczta-polska.pl}sposobDoreczeniaPotwierdzeniaType" /&amp;gt;
 *       &amp;lt;attribute name="kontakt" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "potwierdzenieDoreczeniaType")
public class PotwierdzenieDoreczeniaType {

    @XmlAttribute(name = "sposob")
    protected SposobDoreczeniaPotwierdzeniaType sposob;
    @XmlAttribute(name = "kontakt")
    protected String kontakt;

    /**
     * Gets the value of the sposob property.
     * 
     * @return
     *     possible object is
     *     {@link SposobDoreczeniaPotwierdzeniaType }
     *     
     */
    public SposobDoreczeniaPotwierdzeniaType getSposob() {
        return sposob;
    }

    /**
     * Sets the value of the sposob property.
     * 
     * @param value
     *     allowed object is
     *     {@link SposobDoreczeniaPotwierdzeniaType }
     *     
     */
    public void setSposob(SposobDoreczeniaPotwierdzeniaType value) {
        this.sposob = value;
    }

    /**
     * Gets the value of the kontakt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontakt() {
        return kontakt;
    }

    /**
     * Sets the value of the kontakt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontakt(String value) {
        this.kontakt = value;
    }

}
