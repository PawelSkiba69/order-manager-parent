
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for wymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="wymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="BRAK"/&amp;gt;
 *     &amp;lt;enumeration value="WYMAGANY"/&amp;gt;
 *     &amp;lt;enumeration value="NIEWYMAGANY"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "wymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum")
@XmlEnum
public enum WymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum {

    BRAK,
    WYMAGANY,
    NIEWYMAGANY;

    public String value() {
        return name();
    }

    public static WymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum fromValue(String v) {
        return valueOf(v);
    }

}
