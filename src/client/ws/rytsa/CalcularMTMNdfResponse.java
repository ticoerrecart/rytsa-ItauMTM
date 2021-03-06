
package client.ws.rytsa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calcularMTMNdfResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calcularMTMNdfResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://valuaciones.itau.rytsa/}informarNovedadesValuacionesXmlRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularMTMNdfResponse", propOrder = {
    "_return"
})
public class CalcularMTMNdfResponse {

    @XmlElement(name = "return")
    protected InformarNovedadesValuacionesXmlRequest _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link InformarNovedadesValuacionesXmlRequest }
     *     
     */
    public InformarNovedadesValuacionesXmlRequest getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformarNovedadesValuacionesXmlRequest }
     *     
     */
    public void setReturn(InformarNovedadesValuacionesXmlRequest value) {
        this._return = value;
    }

}
