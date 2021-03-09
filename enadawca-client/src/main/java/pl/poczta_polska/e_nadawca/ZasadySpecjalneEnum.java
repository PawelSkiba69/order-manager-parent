
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for zasadySpecjalneEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="zasadySpecjalneEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ADMINISTRACYJNA"/&amp;gt;
 *     &amp;lt;enumeration value="PODATKOWA"/&amp;gt;
 *     &amp;lt;enumeration value="SADOWA_CYWILNA"/&amp;gt;
 *     &amp;lt;enumeration value="SADOWA_KARNA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
