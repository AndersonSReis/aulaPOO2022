<%-- 
    Document   : forms
    Created on : 17 de out. de 2022, 21:08:05
    Author     : Anderson Reis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/css.jspf" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%
    String x = "Valor Inválido";
    int n1=0 , n2 =0;
    try{
        n1 = Integer.parseInt(request.getParameter("n1"));
        n2 = Integer.parseInt(request.getParameter("n2"));
    }catch(Exception ex){
    out.print(x);
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%/*Usando o jstl que é o acrônimo de JavaServer Pages Standard Template 
            Library, o qual podemos usar para recuperar dados de forma 
    transparente usando como componente básico da JEE */ %>
        <c:if test="${param.n1>param.n2}"><h2>Valor 1 maior que Valor 2...</h2></c:if>
        <c:if test="${param.n1<param.n2}"><h2>Valor 2 maior que Valor 1</h2></c:if>
    </body>
</html>
