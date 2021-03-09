
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="adres" type="{http://e-nadawca.poczta-polska.pl}adresType"/&amp;gt;
 *         &amp;lt;element name="przesylka" type="{http://e-nadawca.poczta-polska.pl}EZDOPrzesylkaType" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="error" type="{http://e-nadawca.poczta-polska.pl}errorType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="numerKD" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="numerEZDO" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adres",
    "przesylka",
    "error"
})
@XmlRootElement(name = "getEZDOResponse")
public class GetEZDOResponse {

    @XmlElement(required = true)
    protected AdresType adres;
    @XmlElement(required = true)
    protected List<EZDOPrzesylkaType> przesylka;
    protected List<ErrorType> error;
    @XmlAttribute(name = "numerKD")
    protected String numerKD;
    @XmlAttribute(name = "numerEZDO")
    protected String numerEZDO;

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setAdres(AdresType value) {
        this.adres = value;
    }

    /**
     * Gets the value of the przesylka property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the przesylka property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPrzesylka().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link EZDOPrzesylkaType }
     * 
     * 
     */
    public List<EZDOPrzesylkaType> getPrzesylka() {
        if (przesylka == null) {
            przesylka = new ArrayList<EZDOPrzesylkaType>();
        }
        return this.przesylka;
    }

    /**
     * Gets the value of the error property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the error property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getError().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     * 
     * 
     */
    public List<ErrorType> getError() {
        if (error == null) {
            error = new ArrayList<ErrorType>();
        }
        return this.error;
    }

    /**
     * Gets the value of the numerKD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerKD() {
        return numerKD;
    }

    /**
     * Sets the value of the numerKD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerKD(String value) {
        this.numerKD = value;
    }

    /**
     * Gets the value of the numerEZDO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerEZDO() {
        return numerEZDO;
    }

    /**
     * Sets the value of the numerEZDO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerEZDO(String value) {
        this.numerEZDO = value;
    }

}
