
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaEZwrotPaczkaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaEZwrotPaczkaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSklepEZwrot" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="numerNadaniaZwrot" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaEZwrotPaczkaType", propOrder = {
    "idSklepEZwrot"
})
public class PrzesylkaEZwrotPaczkaType
    extends PrzesylkaRejestrowanaType
{

    protected Integer idSklepEZwrot;
    @XmlAttribute(name = "numerNadaniaZwrot")
    protected String numerNadaniaZwrot;

    /**
     * Gets the value of the idSklepEZwrot property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSklepEZwrot() {
        return idSklepEZwrot;
    }

    /**
     * Sets the value of the idSklepEZwrot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSklepEZwrot(Integer value) {
        this.idSklepEZwrot = value;
    }

    /**
     * Gets the value of the numerNadaniaZwrot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerNadaniaZwrot() {
        return numerNadaniaZwrot;
    }

    /**
     * Sets the value of the numerNadaniaZwrot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerNadaniaZwrot(String value) {
        this.numerNadaniaZwrot = value;
    }

}
