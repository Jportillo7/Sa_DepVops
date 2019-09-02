<%-- 
    Document   : paginaPiloto
    Created on : Aug 13, 2019, 8:38:01 PM
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recepcion</title>
    </head>
    <body>
        <h1>Verificar Viaje</h1>
        <form action="Servlet_Recepcion" method="post">
            <p>Nombre Piloto: <input type="text" name="nombre"></p>
            <input type="submit" name="btnBoton" value="Verificar"/>
        </form>
    </body>
</html>
