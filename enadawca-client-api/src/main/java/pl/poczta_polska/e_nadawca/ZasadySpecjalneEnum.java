
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zasadySpecjalneEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="zasadySpecjalneEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADMINISTRACYJNA"/&gt;
 *     &lt;enumeration value="PODATKOWA"/&gt;
 *     &lt;enumeration value="SADOWA_CYWILNA"/&gt;
 *     &lt;enumeration value="SADOWA_KARNA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "zasadySpecjalneEnum")
@XmlEnum
public enum ZasadySpecjalneEnum {

    ADMINISTRACYJNA,
    PODATKOWA,
    SADOWA_CYWILNA,
    SADOWA_KARNA;

    public String value() {
        return name();
    }

    public static ZasadySpecjalneEnum fromValue(String v) {
        return valueOf(v);
    }

}
