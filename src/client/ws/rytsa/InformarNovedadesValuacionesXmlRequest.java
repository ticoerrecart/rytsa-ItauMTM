
package client.ws.rytsa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for informarNovedadesValuacionesXmlRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="informarNovedadesValuacionesXmlRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestDataList" type="{http://valuaciones.itau.rytsa/}requestData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informarNovedadesValuacionesXmlRequest", propOrder = {
    "codFormula",
    "fechaProceso",
    "requestDataList"
})
public class InformarNovedadesValuacionesXmlRequest {

    protected String codFormula;
    protected String fechaProceso;
    @XmlElement(nillable = true)
    protected List<RequestData> requestDataList;

    /**
     * Gets the value of the codFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFormula() {
        return codFormula;
    }

    /**
     * Sets the value of the codFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFormula(String value) {
        this.codFormula = value;
    }

    /**
     * Gets the value of the fechaProceso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaProceso() {
        return fechaProceso;
    }

    /**
     * Sets the value of the fechaProceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaProceso(String value) {
        this.fechaProceso = value;
    }

    /**
     * Gets the value of the requestDataList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestDataList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestDataList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestData }
     * 
     * 
     */
    public List<RequestData> getRequestDataList() {
        if (requestDataList == null) {
            requestDataList = new ArrayList<RequestData>();
        }
        return this.requestDataList;
    }

}
