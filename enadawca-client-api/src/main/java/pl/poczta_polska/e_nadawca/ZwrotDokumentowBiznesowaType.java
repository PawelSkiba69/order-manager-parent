
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zwrotDokumentowBiznesowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zwrotDokumentowBiznesowaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rodzaj" type="{http://e-nadawca.poczta-polska.pl}terminZwrotDokumentowBiznesowaType"/&gt;
 *         &lt;element name="idDokumentyZwrotneAdresy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
