
package client.ws.rytsa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for novedadesValuacionesRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="novedadesValuacionesRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaCargaPrecio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaUltimaValuacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUsuarioCargaSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaValuacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plazo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tasaUtilizada" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tipoValuacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalValuado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valoresNominales" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "novedadesValuacionesRequestData", propOrder = {
    "fecha",
    "fechaCargaPrecio",
    "fechaUltimaValuacion",
    "idOperacion",
    "idUsuarioCargaSE",
    "monedaValuacion",
    "plazo",
    "precio",
    "tasaUtilizada",
    "tipoValuacion",
    "totalValuado",
    "valoresNominales"
})
public class NovedadesValuacionesRequestData {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCargaPrecio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUltimaValuacion;
    protected String idOperacion;
    protected String idUsuarioCargaSE;
    protected String monedaValuacion;
    protected int plazo;
    protected Double precio;
    protected Double tasaUtilizada;
    protected String tipoValuacion;
    protected Double totalValuado;
    protected Double valoresNominales;

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the fechaCargaPrecio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCargaPrecio() {
        return fechaCargaPrecio;
    }

    /**
     * Sets the value of the fechaCargaPrecio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCargaPrecio(XMLGregorianCalendar value) {
        this.fechaCargaPrecio = value;
    }

    /**
     * Gets the value of the fechaUltimaValuacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaValuacion() {
        return fechaUltimaValuacion;
    }

    /**
     * Sets the value of the fechaUltimaValuacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaValuacion(XMLGregorianCalendar value) {
        this.fechaUltimaValuacion = value;
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
     * Gets the value of the idUsuarioCargaSE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuarioCargaSE() {
        return idUsuarioCargaSE;
    }

    /**
     * Sets the value of the idUsuarioCargaSE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuarioCargaSE(String value) {
        this.idUsuarioCargaSE = value;
    }

    /**
     * Gets the value of the monedaValuacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaValuacion() {
        return monedaValuacion;
    }

    /**
     * Sets the value of the monedaValuacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaValuacion(String value) {
        this.monedaValuacion = value;
    }

    /**
     * Gets the value of the plazo property.
     * 
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * Sets the value of the plazo property.
     * 
     */
    public void setPlazo(int value) {
        this.plazo = value;
    }

    /**
     * Gets the value of the precio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrecio(Double value) {
        this.precio = value;
    }

    /**
     * Gets the value of the tasaUtilizada property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTasaUtilizada() {
        return tasaUtilizada;
    }

    /**
     * Sets the value of the tasaUtilizada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTasaUtilizada(Double value) {
        this.tasaUtilizada = value;
    }

    /**
     * Gets the value of the tipoValuacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoValuacion() {
        return tipoValuacion;
    }

    /**
     * Sets the value of the tipoValuacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoValuacion(String value) {
        this.tipoValuacion = value;
    }

    /**
     * Gets the value of the totalValuado property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalValuado() {
        return totalValuado;
    }

    /**
     * Sets the value of the totalValuado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalValuado(Double value) {
        this.totalValuado = value;
    }

    /**
     * Gets the value of the valoresNominales property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValoresNominales() {
        return valoresNominales;
    }

    /**
     * Sets the value of the valoresNominales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValoresNominales(Double value) {
        this.valoresNominales = value;
    }

}
