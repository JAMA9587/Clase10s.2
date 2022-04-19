

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link href="css.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        <center>   
            <h1 class="titulo">Promedio de Notas </h2>
        <form action="DatosFinales" method="get">
            
            <table class="cuadro" >
                <tr>
                    <td><label> Nombre: </label></td>
                    <td><input typie="text" name="nombre"></td>
                </tr>
                <tr>
                    <td><label> Apellido: </label></td>
                    <td><input typie="text" name="apellido"></td>
                </tr>
                <tr>
                    <td><label> Primera Nota: </label></td>
                    <td><input typie="text" name="nota1"></td>
                </tr>
                <tr>
                    <td><label> Segunda Nota: </label></td>
                    <td><input typie="text" name="nota2"></td>
                </tr>
                <tr>
                    <td><label> Tercera Nota:  </label></td>
                    <td><input typie="text" name="nota3"></td>
                </tr>
                <tr>
                    <td class="botonCell"><input type="submit" name="promedio" value="calcular" class="botonCalcular"></td>
                    <td class="botonCell"><input type="reset" value="limpiar" class="botonLimpiar"></td>
                </tr>
                
            </table>
            
            
        </form>
        
        
        
        </center>
    </body>
</html>


