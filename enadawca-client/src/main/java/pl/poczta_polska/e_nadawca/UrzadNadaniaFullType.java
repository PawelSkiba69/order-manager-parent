
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for urzadNadaniaFullType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="urzadNadaniaFullType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="urzadNadania" type="{http://e-nadawca.poczta-polska.pl}urzadNadaniaType" /&amp;gt;
 *       &amp;lt;attribute name="opis" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="nazwaWydruk" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "urzadNadaniaFullType")
public class UrzadNadaniaFullType {

    @XmlAttribute(name = "urzadNadania")
    protected Integer urzadNadania;
    @XmlAttribute(name = "opis")
    protected String opis;
    @XmlAttribute(name = "nazwaWydruk")
    protected String nazwaWydruk;

    /**
     * Gets the value of the urzadNadania property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUrzadNadania() {
        return urzadNadania;
    }

    /**
     * Sets the value of the urzadNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUrzadNadania(Integer value) {
        this.urzadNadania = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
    }

    /**
     * Gets the value of the nazwaWydruk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaWydruk() {
        return nazwaWydruk;
    }

    /**
     * Sets the value of the nazwaWydruk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaWydruk(String value) {
        this.nazwaWydruk = value;
    }

}
