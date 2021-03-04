<%-- 
    Document   : index
    Created on : 01 mar. 2021, 0:57:11
    Author     : Susana Hernández
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "controller.muestraOperacion"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>TRIANGULO EQUILATERO
            <form action="Triangulo2" method="post">
                Introduzca la base del triangulo:<br>
                <input type="text" name="base" value=""><br>
                Introduzca la altura del triangulo:<br>
                <input type="text" name="altura" value=""><br>
                <input type="submit" value="Calcular">
            </form>
        </div>
    </body>
</html>