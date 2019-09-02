
package paqueteservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Recepcion_Solicitud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Recepcion_Solicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nombre_Piloto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ubicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tiempo_Llegada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recepcion_Solicitud", propOrder = {
    "nombrePiloto",
    "ubicacion",
    "tiempoLlegada"
})
public class RecepcionSolicitud {

    @XmlElement(name = "Nombre_Piloto")
    protected String nombrePiloto;
    @XmlElement(name = "Ubicacion")
    protected String ubicacion;
    @XmlElement(name = "Tiempo_Llegada")
    protected String tiempoLlegada;

    /**
     * Gets the value of the nombrePiloto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePiloto() {
        return nombrePiloto;
    }

    /**
     * Sets the value of the nombrePiloto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePiloto(String value) {
        this.nombrePiloto = value;
    }

    /**
     * Gets the value of the ubicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Sets the value of the ubicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacion(String value) {
        this.ubicacion = value;
    }

    /**
     * Gets the value of the tiempoLlegada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiempoLlegada() {
        return tiempoLlegada;
    }

    /**
     * Sets the value of the tiempoLlegada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiempoLlegada(String value) {
        this.tiempoLlegada = value;
    }

}
