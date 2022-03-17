
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adres" type="{http://e-nadawca.poczta-polska.pl}adresType"/&gt;
 *         &lt;element name="przesylka" type="{http://e-nadawca.poczta-polska.pl}EZDOPrzesylkaType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="error" type="{http://e-nadawca.poczta-polska.pl}errorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="numerKD" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numerEZDO" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the przesylka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrzesylka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
