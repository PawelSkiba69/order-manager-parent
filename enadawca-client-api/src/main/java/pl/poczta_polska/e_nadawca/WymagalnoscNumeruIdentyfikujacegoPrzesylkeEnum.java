
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="wymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BRAK"/&gt;
 *     &lt;enumeration value="WYMAGANY"/&gt;
 *     &lt;enumeration value="NIEWYMAGANY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
