
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &amp;lt;element name="urzadNadania" type="{http://e-nadawca.poczta-polska.pl}urzadNadaniaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IWDContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "urzadNadania",
    "iwdContent"
})
@XmlRootElement(name = "uploadIWDContent")
public class UploadIWDContent {

    protected Integer urzadNadania;
    @XmlElement(name = "IWDContent", required = true)
    protected byte[] iwdContent;

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
     * Gets the value of the iwdContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIWDContent() {
        return iwdContent;
    }

    /**
     * Sets the value of the iwdContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIWDContent(byte[] value) {
        this.iwdContent = value;
    }

}
