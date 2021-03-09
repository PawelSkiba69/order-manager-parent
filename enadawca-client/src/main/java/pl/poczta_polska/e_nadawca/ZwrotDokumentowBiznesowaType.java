
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for zwrotDokumentowBiznesowaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="zwrotDokumentowBiznesowaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="rodzaj" type="{http://e-nadawca.poczta-polska.pl}terminZwrotDokumentowBiznesowaType"/&amp;gt;
 *         &amp;lt;element name="idDokumentyZwrotneAdresy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zwrotDokumentowBiznesowaType", propOrder = {
    "rodzaj",
    "idDokumentyZwrotneAdresy"
})
public class ZwrotDokumentowBiznesowaType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TerminZwrotDokumentowBiznesowaType rodzaj;
    protected Integer idDokumentyZwrotneAdresy;

    /**
     * Gets the value of the rodzaj property.
     * 
     * @return
     *     possible object is
     *     {@link TerminZwrotDokumentowBiznesowaType }
     *     
     */
    public TerminZwrotDokumentowBiznesowaType getRodzaj() {
        return rodzaj;
    }

    /**
     * Sets the value of the rodzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminZwrotDokumentowBiznesowaType }
     *     
     */
    public void setRodzaj(TerminZwrotDokumentowBiznesowaType value) {
        this.rodzaj = value;
    }

    /**
     * Gets the value of the idDokumentyZwrotneAdresy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDokumentyZwrotneAdresy() {
        return idDokumentyZwrotneAdresy;
    }

    /**
     * Sets the value of the idDokumentyZwrotneAdresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDokumentyZwrotneAdresy(Integer value) {
        this.idDokumentyZwrotneAdresy = value;
    }

}
