
package ee.ttu.idu0075._2015.ws.bookshop;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="categoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Kids"/&gt;
 *     &lt;enumeration value="Comics"/&gt;
 *     &lt;enumeration value="Cooking"/&gt;
 *     &lt;enumeration value="Education"/&gt;
 *     &lt;enumeration value="HealthFitness"/&gt;
 *     &lt;enumeration value="Sports"/&gt;
 *     &lt;enumeration value="Travel"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "categoryType")
@XmlEnum
public enum CategoryType {

    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Kids")
    KIDS("Kids"),
    @XmlEnumValue("Comics")
    COMICS("Comics"),
    @XmlEnumValue("Cooking")
    COOKING("Cooking"),
    @XmlEnumValue("Education")
    EDUCATION("Education"),
    @XmlEnumValue("HealthFitness")
    HEALTH_FITNESS("HealthFitness"),
    @XmlEnumValue("Sports")
    SPORTS("Sports"),
    @XmlEnumValue("Travel")
    TRAVEL("Travel"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryType fromValue(String v) {
        for (CategoryType c: CategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
