
package paqueteservicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the paqueteservicios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RecepcionSolicitudResponse_QNAME = new QName("http://paqueteServicios/", "Recepcion_SolicitudResponse");
    private final static QName _RecepcionSolicitud_QNAME = new QName("http://paqueteServicios/", "Recepcion_Solicitud");
    private final static QName _SolicitudServicio_QNAME = new QName("http://paqueteServicios/", "Solicitud_Servicio");
    private final static QName _SolicitudServicioResponse_QNAME = new QName("http://paqueteServicios/", "Solicitud_ServicioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: paqueteservicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecepcionSolicitud }
     * 
     */
    public RecepcionSolicitud createRecepcionSolicitud() {
        return new RecepcionSolicitud();
    }

    /**
     * Create an instance of {@link SolicitudServicio }
     * 
     */
    public SolicitudServicio createSolicitudServicio() {
        return new SolicitudServicio();
    }

    /**
     * Create an instance of {@link SolicitudServicioResponse }
     * 
     */
    public SolicitudServicioResponse createSolicitudServicioResponse() {
        return new SolicitudServicioResponse();
    }

    /**
     * Create an instance of {@link RecepcionSolicitudResponse }
     * 
     */
    public RecepcionSolicitudResponse createRecepcionSolicitudResponse() {
        return new RecepcionSolicitudResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionSolicitudResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paqueteServicios/", name = "Recepcion_SolicitudResponse")
    public JAXBElement<RecepcionSolicitudResponse> createRecepcionSolicitudResponse(RecepcionSolicitudResponse value) {
        return new JAXBElement<RecepcionSolicitudResponse>(_RecepcionSolicitudResponse_QNAME, RecepcionSolicitudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paqueteServicios/", name = "Recepcion_Solicitud")
    public JAXBElement<RecepcionSolicitud> createRecepcionSolicitud(RecepcionSolicitud value) {
        return new JAXBElement<RecepcionSolicitud>(_RecepcionSolicitud_QNAME, RecepcionSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitudServicio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paqueteServicios/", name = "Solicitud_Servicio")
    public JAXBElement<SolicitudServicio> createSolicitudServicio(SolicitudServicio value) {
        return new JAXBElement<SolicitudServicio>(_SolicitudServicio_QNAME, SolicitudServicio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitudServicioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paqueteServicios/", name = "Solicitud_ServicioResponse")
    public JAXBElement<SolicitudServicioResponse> createSolicitudServicioResponse(SolicitudServicioResponse value) {
        return new JAXBElement<SolicitudServicioResponse>(_SolicitudServicioResponse_QNAME, SolicitudServicioResponse.class, null, value);
    }

}
