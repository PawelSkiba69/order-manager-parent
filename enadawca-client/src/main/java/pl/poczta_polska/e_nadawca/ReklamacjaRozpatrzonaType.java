
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for reklamacjaRozpatrzonaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="reklamacjaRozpatrzonaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="guid" type="{http://e-nadawca.poczta-polska.pl}guidType" /&amp;gt;
 *       &amp;lt;attribute name="numerNadania" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" /&amp;gt;
 *       &amp;lt;attribute name="rozstrzygniecie" type="{http://e-nadawca.poczta-polska.pl}rozstrzygniecieType" /&amp;gt;
 *       &amp;lt;attribute name="przyznaneOdszkodowanie" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="uzasadnienie" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="dataRozpatrzenia" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *       &amp;lt;attribute name="nazwaJednostkiRozpatrujacej" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="osobaRozpatrujaca" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="idReklamacja" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reklamacjaRozpatrzonaType")
public class ReklamacjaRozpatrzonaType {

    @XmlAttribute(name = "guid")
    protected String guid;
    @XmlAttribute(name = "numerNadania")
    protected String numerNadania;
    @XmlAttribute(name = "rozstrzygniecie")
    protected RozstrzygniecieType rozstrzygniecie;
    @XmlAttribute(name = "przyznaneOdszkodowanie")
    protected Integer przyznaneOdszkodowanie;
    @XmlAttribute(name = "uzasadnienie")
    protected String uzasadnienie;
    @XmlAttribute(name = "dataRozpatrzenia")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRozpatrzenia;
    @XmlAttribute(name = "nazwaJednostkiRozpatrujacej")
    protected String nazwaJednostkiRozpatrujacej;
    @XmlAttribute(name = "osobaRozpatrujaca")
    protected String osobaRozpatrujaca;
    @XmlAttribute(name = "idReklamacja")
    protected String idReklamacja;

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
     * Gets the value of the numerNadania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerNadania() {
        return numerNadania;
    }

    /**
     * Sets the value of the numerNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerNadania(String value) {
        this.numerNadania = value;
    }

    /**
     * Gets the value of the rozstrzygniecie property.
     * 
     * @return
     *     possible object is
     *     {@link RozstrzygniecieType }
     *     
     */
    public RozstrzygniecieType getRozstrzygniecie() {
        return rozstrzygniecie;
    }

    /**
     * Sets the value of the rozstrzygniecie property.
     * 
     * @param value
     *     allowed object is
     *     {@link RozstrzygniecieType }
     *     
     */
    public void setRozstrzygniecie(RozstrzygniecieType value) {
        this.rozstrzygniecie = value;
    }

    /**
     * Gets the value of the przyznaneOdszkodowanie property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrzyznaneOdszkodowanie() {
        return przyznaneOdszkodowanie;
    }

    /**
     * Sets the value of the przyznaneOdszkodowanie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrzyznaneOdszkodowanie(Integer value) {
        this.przyznaneOdszkodowanie = value;
    }

    /**
     * Gets the value of the uzasadnienie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUzasadnienie() {
        return uzasadnienie;
    }

    /**
     * Sets the value of the uzasadnienie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUzasadnienie(String value) {
        this.uzasadnienie = value;
    }

    /**
     * Gets the value of the dataRozpatrzenia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRozpatrzenia() {
        return dataRozpatrzenia;
    }

    /**
     * Sets the value of the dataRozpatrzenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRozpatrzenia(XMLGregorianCalendar value) {
        this.dataRozpatrzenia = value;
    }

    /**
     * Gets the value of the nazwaJednostkiRozpatrujacej property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaJednostkiRozpatrujacej() {
        return nazwaJednostkiRozpatrujacej;
    }

    /**
     * Sets the value of the nazwaJednostkiRozpatrujacej property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaJednostkiRozpatrujacej(String value) {
        this.nazwaJednostkiRozpatrujacej = value;
    }

    /**
     * Gets the value of the osobaRozpatrujaca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsobaRozpatrujaca() {
        return osobaRozpatrujaca;
    }

    /**
     * Sets the value of the osobaRozpatrujaca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsobaRozpatrujaca(String value) {
        this.osobaRozpatrujaca = value;
    }

    /**
     * Gets the value of the idReklamacja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReklamacja() {
        return idReklamacja;
    }

    /**
     * Sets the value of the idReklamacja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReklamacja(String value) {
        this.idReklamacja = value;
    }

}
