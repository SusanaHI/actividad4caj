<%-- 
    Document   : muestraResultado
    Created on : 2 mar. 2021, 14:36:24
    Author     : Susana Hernández
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "model.Triangulo2"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <h1>Area y Perimetro de un Triangulo</h1>
        <%   
            //double e1 = (double) request.getAttribute("areaResuelta");
            //double e2 = (double) request.getAttribute("perimetroResuelto");
        %>
        <h3>AREA</h3><br>
        <%=request.getAttribute("areaResuelta")%>
        <h3>PERIMETRO</h3>
        <%=request.getAttribute("perimetroResuelto")%>
    </body>
</html>
