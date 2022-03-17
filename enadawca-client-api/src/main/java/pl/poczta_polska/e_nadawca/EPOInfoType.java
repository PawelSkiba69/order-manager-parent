
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EPOInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EPOInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="awizoPrzesylki" type="{http://e-nadawca.poczta-polska.pl}awizoPrzesylkiType" minOccurs="0"/&gt;
 *         &lt;element name="doreczeniePrzesylki" type="{http://e-nadawca.poczta-polska.pl}doreczeniePrzesylkiType" minOccurs="0"/&gt;
 *         &lt;element name="zwrotPrzesylki" type="{http://e-nadawca.poczta-polska.pl}zwrotPrzesylkiType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
