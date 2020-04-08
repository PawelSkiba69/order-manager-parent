
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaEZwrotPocztexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaEZwrotPocztexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&gt;
 *       &lt;attribute name="numerNadaniaZwrot" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaEZwrotPocztexType")
public class PrzesylkaEZwrotPocztexType
    extends PrzesylkaRejestrowanaType
{

    @XmlAttribute(name = "numerNadaniaZwrot")
    protected String numerNadaniaZwrot;

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
