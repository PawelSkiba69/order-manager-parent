
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ePrzesylkaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ePrzesylkaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="urzadWydaniaEPrzesylki" type="{http://e-nadawca.poczta-polska.pl}urzadWydaniaEPrzesylkiType"/&amp;gt;
 *         &amp;lt;element name="pobranie" type="{http://e-nadawca.poczta-polska.pl}pobranieType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&amp;gt;
 *       &amp;lt;attribute name="eSposobPowiadomieniaAdresata" type="{http://e-nadawca.poczta-polska.pl}eSposobPowiadomieniaType" /&amp;gt;
 *       &amp;lt;attribute name="eSposobPowiadomieniaNadawcy" type="{http://e-nadawca.poczta-polska.pl}eSposobPowiadomieniaType" /&amp;gt;
 *       &amp;lt;attribute name="eKontaktAdresata" type="{http://e-nadawca.poczta-polska.pl}eKontaktType" /&amp;gt;
 *       &amp;lt;attribute name="eKontaktNadawcy" type="{http://e-nadawca.poczta-polska.pl}eKontaktType" /&amp;gt;
 *       &amp;lt;attribute name="ostroznie" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ePrzesylkaType", propOrder = {
    "urzadWydaniaEPrzesylki",
    "pobranie"
})
public class EPrzesylkaType
    extends PrzesylkaRejestrowanaType
{

    @XmlElement(required = true)
    protected UrzadWydaniaEPrzesylkiType urzadWydaniaEPrzesylki;
    protected PobranieType pobranie;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "eSposobPowiadomieniaAdresata")
    protected ESposobPowiadomieniaType eSposobPowiadomieniaAdresata;
    @XmlAttribute(name = "eSposobPowiadomieniaNadawcy")
    protected ESposobPowiadomieniaType eSposobPowiadomieniaNadawcy;
    @XmlAttribute(name = "eKontaktAdresata")
    protected String eKontaktAdresata;
    @XmlAttribute(name = "eKontaktNadawcy")
    protected String eKontaktNadawcy;
    @XmlAttribute(name = "ostroznie")
    protected Boolean ostroznie;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;

    /**
     * Gets the value of the urzadWydaniaEPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link UrzadWydaniaEPrzesylkiType }
     *     
     */
    public UrzadWydaniaEPrzesylkiType getUrzadWydaniaEPrzesylki() {
        return urzadWydaniaEPrzesylki;
    }

    /**
     * Sets the value of the urzadWydaniaEPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrzadWydaniaEPrzesylkiType }
     *     
     */
    public void setUrzadWydaniaEPrzesylki(UrzadWydaniaEPrzesylkiType value) {
        this.urzadWydaniaEPrzesylki = value;
    }

    /**
     * Gets the value of the pobranie property.
     * 
     * @return
     *     possible object is
     *     {@link PobranieType }
     *     
     */
    public PobranieType getPobranie() {
        return pobranie;
    }

    /**
     * Sets the value of the pobranie property.
     * 
     * @param value
     *     allowed object is
     *     {@link PobranieType }
     *     
     */
    public void setPobranie(PobranieType value) {
        this.pobranie = value;
    }

    /**
     * Gets the value of the masa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasa() {
        return masa;
    }

    /**
     * Sets the value of the masa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasa(Integer value) {
        this.masa = value;
    }

    /**
     * Gets the value of the eSposobPowiadomieniaAdresata property.
     * 
     * @return
     *     possible object is
     *     {@link ESposobPowiadomieniaType }
     *     
     */
    public ESposobPowiadomieniaType getESposobPowiadomieniaAdresata() {
        return eSposobPowiadomieniaAdresata;
    }

    /**
     * Sets the value of the eSposobPowiadomieniaAdresata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESposobPowiadomieniaType }
     *     
     */
    public void setESposobPowiadomieniaAdresata(ESposobPowiadomieniaType value) {
        this.eSposobPowiadomieniaAdresata = value;
    }

    /**
     * Gets the value of the eSposobPowiadomieniaNadawcy property.
     * 
     * @return
     *     possible object is
     *     {@link ESposobPowiadomieniaType }
     *     
     */
    public ESposobPowiadomieniaType getESposobPowiadomieniaNadawcy() {
        return eSposobPowiadomieniaNadawcy;
    }

    /**
     * Sets the value of the eSposobPowiadomieniaNadawcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESposobPowiadomieniaType }
     *     
     */
    public void setESposobPowiadomieniaNadawcy(ESposobPowiadomieniaType value) {
        this.eSposobPowiadomieniaNadawcy = value;
    }

    /**
     * Gets the value of the eKontaktAdresata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEKontaktAdresata() {
        return eKontaktAdresata;
    }

    /**
     * Sets the value of the eKontaktAdresata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEKontaktAdresata(String value) {
        this.eKontaktAdresata = value;
    }

    /**
     * Gets the value of the eKontaktNadawcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEKontaktNadawcy() {
        return eKontaktNadawcy;
    }

    /**
     * Sets the value of the eKontaktNadawcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEKontaktNadawcy(String value) {
        this.eKontaktNadawcy = value;
    }

    /**
     * Gets the value of the ostroznie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOstroznie() {
        return ostroznie;
    }

    /**
     * Sets the value of the ostroznie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOstroznie(Boolean value) {
        this.ostroznie = value;
    }

    /**
     * Gets the value of the wartosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWartosc() {
        return wartosc;
    }

    /**
     * Sets the value of the wartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWartosc(Integer value) {
        this.wartosc = value;
    }

}
