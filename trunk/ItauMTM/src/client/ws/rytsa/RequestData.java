
package client.ws.rytsa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corrida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTM" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="monedaValuacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestData", propOrder = {
    "codUsuario",
    "codigo",
    "corrida",
    "fecha",
    "idOperacion",
    "mtm",
    "monedaValuacion"
})
public class RequestData {

    protected String codUsuario;
    protected String codigo;
    protected String corrida;
    protected String fecha;
    protected String idOperacion;
    @XmlElement(name = "MTM")
    protected Double mtm;
    protected Integer monedaValuacion;

    /**
     * Gets the value of the codUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUsuario() {
        return codUsuario;
    }

    /**
     * Sets the value of the codUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUsuario(String value) {
        this.codUsuario = value;
    }

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the corrida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrida() {
        return corrida;
    }

    /**
     * Sets the value of the corrida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrida(String value) {
        this.corrida = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the idOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOperacion() {
        return idOperacion;
    }

    /**
     * Sets the value of the idOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOperacion(String value) {
        this.idOperacion = value;
    }

    /**
     * Gets the value of the mtm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMTM() {
        return mtm;
    }

    /**
     * Sets the value of the mtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMTM(Double value) {
        this.mtm = value;
    }

    /**
     * Gets the value of the monedaValuacion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonedaValuacion() {
        return monedaValuacion;
    }

    /**
     * Sets the value of the monedaValuacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonedaValuacion(Integer value) {
        this.monedaValuacion = value;
    }

}
