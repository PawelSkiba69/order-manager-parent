
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for czynnoscUpustowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="czynnoscUpustowaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="POSORTOWANA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "czynnoscUpustowaType")
@XmlEnum
public enum CzynnoscUpustowaType {

    POSORTOWANA;

    public String value() {
        return name();
    }

    public static CzynnoscUpustowaType fromValue(String v) {
        return valueOf(v);
    }

}
