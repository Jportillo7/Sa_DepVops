/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteServicios;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jose
 */
@WebService(serviceName = "servicios")
public class servicios {
    
    boolean solicitud = false;
    boolean recepcion = false;
    String destino = "";
    String piloto = "";
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Solicitud_Servicio")
    public String Solicitud_Servicio(@WebParam(name = "Nombre_Cliente") String Nombre_Cliente, @WebParam(name = "Ubicacion") String Ubicacion, @WebParam(name = "Destino") String Destino) {
        solicitud = true;
        destino = Destino;
        if(recepcion){
            recepcion = false;
            return "El piloto "+ piloto + " lo llevara a su destino";
        }
        return "Esperando piloto...";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Recepcion_Solicitud")
    public String Recepcion_Solicitud(@WebParam(name = "Nombre_Piloto") String Nombre_Piloto) {
        piloto = Nombre_Piloto;
        if(solicitud){
            solicitud = false;
            recepcion = true;
            return "Tienes un nuevo viaje a "+destino;
        }
        return "No hay viajes por hacer";
    }

}
