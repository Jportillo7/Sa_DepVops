<%-- 
    Document   : paginaCliente
    Created on : Aug 13, 2019, 8:30:42 PM
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente</title>
    </head>
    <body>
        <h1>Solicitar Viaje</h1>
        <form action="Servlet_Solicitud" method="post">
            <p>Usuario:<input type="text" name="nombre"/></p>
            <p>Ubicacion: <input type="text" name="ubicacion"/></p>
            <p>Destino: <input type="text" name="destino"/></p>
            <input type="submit" name="btnBoton" value="Solicitar"/>
        </form>
    </body>
</html>
