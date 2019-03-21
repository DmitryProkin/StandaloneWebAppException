
package _0._0._0._0._8080.motorbikeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delete complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personRequest" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delete", propOrder = {
    "personRequest"
})
public class Delete {

    protected long personRequest;

    /**
     * Gets the value of the personRequest property.
     * 
     */
    public long getPersonRequest() {
        return personRequest;
    }

    /**
     * Sets the value of the personRequest property.
     * 
     */
    public void setPersonRequest(long value) {
        this.personRequest = value;
    }

}
