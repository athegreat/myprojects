<%-- 
    Document   : Error
    Created on : oct 4, 2014, 10:00:08 p.m.
    Author     : AlvaroAlexander
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Some Error has occured,Please try again later...</h1>
        
        <%
            //JOptionPane.showConfirmDialog(null,"Some Error has occured,Please try again later...");
            response.sendRedirect("index.jsp");
        %>
    </body>
</html>
