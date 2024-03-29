
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zwrotDokumentowKurierskaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zwrotDokumentowKurierskaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="rodzajPocztex" type="{http://e-nadawca.poczta-polska.pl}terminZwrotDokumentowKurierskaType" minOccurs="0"/&gt;
 *         &lt;element name="rodzajPaczka" type="{http://e-nadawca.poczta-polska.pl}terminZwrotDokumentowPaczkowaType" minOccurs="0"/&gt;
 *         &lt;element name="rodzajList" type="{http://e-nadawca.poczta-polska.pl}rodzajListType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zwrotDokumentowKurierskaType", propOrder = {
    "rodzajPocztex",
    "rodzajPaczka",
    "rodzajList"
})
public class ZwrotDokumentowKurierskaType {

    @XmlSchemaType(name = "string")
    protected TerminZwrotDokumentowKurierskaType rodzajPocztex;
    @XmlSchemaType(name = "string")
    protected TerminZwrotDokumentowPaczkowaType rodzajPaczka;
    protected RodzajListType rodzajList;

    /**
     * Gets the value of the rodzajPocztex property.
     * 
     * @return
     *     possible object is
     *     {@link TerminZwrotDokumentowKurierskaType }
     *     
     */
    public TerminZwrotDokumentowKurierskaType getRodzajPocztex() {
        return rodzajPocztex;
    }

    /**
     * Sets the value of the rodzajPocztex property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminZwrotDokumentowKurierskaType }
     *     
     */
    public void setRodzajPocztex(TerminZwrotDokumentowKurierskaType value) {
        this.rodzajPocztex = value;
    }

    /**
     * Gets the value of the rodzajPaczka property.
     * 
     * @return
     *     possible object is
     *     {@link TerminZwrotDokumentowPaczkowaType }
     *     
     */
    public TerminZwrotDokumentowPaczkowaType getRodzajPaczka() {
        return rodzajPaczka;
    }

    /**
     * Sets the value of the rodzajPaczka property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminZwrotDokumentowPaczkowaType }
     *     
     */
    public void setRodzajPaczka(TerminZwrotDokumentowPaczkowaType value) {
        this.rodzajPaczka = value;
    }

    /**
     * Gets the value of the rodzajList property.
     * 
     * @return
     *     possible object is
     *     {@link RodzajListType }
     *     
     */
    public RodzajListType getRodzajList() {
        return rodzajList;
    }

    /**
     * Sets the value of the rodzajList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RodzajListType }
     *     
     */
    public void setRodzajList(RodzajListType value) {
        this.rodzajList = value;
    }

}
