
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PrintKindEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="PrintKindEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ADDRESS_LABEL"/&amp;gt;
 *     &amp;lt;enumeration value="CUSTOMS_DECLARATION"/&amp;gt;
 *     &amp;lt;enumeration value="ADDRESS_LABEL_FOR_RETURN_DOCUMENTS"/&amp;gt;
 *     &amp;lt;enumeration value="CHECKLIST"/&amp;gt;
 *     &amp;lt;enumeration value="COLLECT_ON_DELIVERY_FORM"/&amp;gt;
 *     &amp;lt;enumeration value="WAYBILL"/&amp;gt;
 *     &amp;lt;enumeration value="REPORT"/&amp;gt;
 *     &amp;lt;enumeration value="ADDRESS_LABEL_FOR_ERETURN"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "PrintKindEnum")
@XmlEnum
public enum PrintKindEnum {

    ADDRESS_LABEL,
    CUSTOMS_DECLARATION,
    ADDRESS_LABEL_FOR_RETURN_DOCUMENTS,
    CHECKLIST,
    COLLECT_ON_DELIVERY_FORM,
    WAYBILL,
    REPORT,
    ADDRESS_LABEL_FOR_ERETURN;

    public String value() {
        return name();
    }

    public static PrintKindEnum fromValue(String v) {
        return valueOf(v);
    }

}
