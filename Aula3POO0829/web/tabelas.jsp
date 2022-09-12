<%-- 
    Document   : tabelas
    Created on : 9 de set. de 2022, 10:36:24
    Author     : Anderson Reis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabelas</title>
    </head>
    <body>
        <h1>Exemplos de tabelas</h1>
        <table border : 1px >
            <colgroup>
                <col span="1" style="background-position: center; background-color: red">                
            </colgroup>
            <tr>
                <th>Dom</th>
                <th>Seg</th>
                <th>Ter</th>
                <th>Qua</th>
                <th>Qui</th>
                <th>Sex</th>
                <th>Sab</th>               
            </tr>
          
            <%   
            int cont = 0;
            for(int i = 1; i<=5; i++){
            cont= cont+1;                    
            %> 
            
               <tr> 
                   
            <%
                for(int j = 1; j<=7; j++){
                
                if (cont <= 31){
            %>
                
                <td><%=cont%></td>
                
            <% 
                    }
                cont= cont+1;    
                }
            %></tr><%
            }
            %>
        </table>
    </body>
</html>
