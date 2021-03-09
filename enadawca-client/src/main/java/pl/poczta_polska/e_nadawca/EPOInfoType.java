
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EPOInfoType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EPOInfoType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="awizoPrzesylki" type="{http://e-nadawca.poczta-polska.pl}awizoPrzesylkiType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="doreczeniePrzesylki" type="{http://e-nadawca.poczta-polska.pl}doreczeniePrzesylkiType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="zwrotPrzesylki" type="{http://e-nadawca.poczta-polska.pl}zwrotPrzesylkiType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPOInfoType", propOrder = {
    "awizoPrzesylki",
    "doreczeniePrzesylki",
    "zwrotPrzesylki"
})
public class EPOInfoType {

    protected AwizoPrzesylkiType awizoPrzesylki;
    protected DoreczeniePrzesylkiType doreczeniePrzesylki;
    protected ZwrotPrzesylkiType zwrotPrzesylki;

    /**
     * Gets the value of the awizoPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link AwizoPrzesylkiType }
     *     
     */
    public AwizoPrzesylkiType getAwizoPrzesylki() {
        return awizoPrzesylki;
    }

    /**
     * Sets the value of the awizoPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwizoPrzesylkiType }
     *     
     */
    public void setAwizoPrzesylki(AwizoPrzesylkiType value) {
        this.awizoPrzesylki = value;
    }

    /**
     * Gets the value of the doreczeniePrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link DoreczeniePrzesylkiType }
     *     
     */
    public DoreczeniePrzesylkiType getDoreczeniePrzesylki() {
        return doreczeniePrzesylki;
    }

    /**
     * Sets the value of the doreczeniePrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoreczeniePrzesylkiType }
     *     
     */
    public void setDoreczeniePrzesylki(DoreczeniePrzesylkiType value) {
        this.doreczeniePrzesylki = value;
    }

    /**
     * Gets the value of the zwrotPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link ZwrotPrzesylkiType }
     *     
     */
    public ZwrotPrzesylkiType getZwrotPrzesylki() {
        return zwrotPrzesylki;
    }

    /**
     * Sets the value of the zwrotPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZwrotPrzesylkiType }
     *     
     */
    public void setZwrotPrzesylki(ZwrotPrzesylkiType value) {
        this.zwrotPrzesylki = value;
    }

}
