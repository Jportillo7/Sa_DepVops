
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
    "nombrePiloto"
})
public class RecepcionSolicitud {

    @XmlElement(name = "Nombre_Piloto")
    protected String nombrePiloto;

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

}
