<%-- 
    Document   : index
    Created on : 17 de out. de 2022, 13:53:13
    Author     : Anderson Reis
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/css.jspf" %>



<!DOCTYPE html>
<html>
    
    <head>
        <%/*Usando um arquivo jspf que é uma seção do código 
            que o programador pretende executar dentro de uma página JSP.*/ %>
        <%@include file="WEB-INF/index.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body >
        <form action="forms.jsp">
        <input type="number" name="n1" step="1" value="1">
        <input type="number" name="n2" step="1" value="2">               
        <input type="submit" name="res" value="calcular">
        </form>
        
        <br><!-- comment -->
        
        
        <%/* usando fragmento código jsp que é processado no servidor, que neste 
        caso estou usando o TonCat*/%>
        <%= new Date() %>
    </body>
</html>
