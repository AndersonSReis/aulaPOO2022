<%-- 
    Document   : index
    Created on : 17 de out. de 2022, 13:53:13
    Author     : Anderson Reis
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <style>
        body{
           background-image: radial-gradient(circle at 69.86% 57.23%, #ffff00 0, #f3ff00 12.5%, #c7ff00 25%, #98ff00 37.5%, #61f810 50%, #00e833 62.5%, #00db48 75%, #00cf59 87.5%, #00c569 100%); 
        }
    </style>
    <head>
        <%/*Usando um arquivo jspf que é uma seção do código 
            que o programador pretende executar dentro de uma página JSP.*/ %>
        <%@include file="WEB-INF/index.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body >
        
        
        <%/* usando fragmento código jsp que é processado no servidor, que neste 
        caso estou usando o TonCat*/%>
        <%= new Date() %>
    </body>
</html>
