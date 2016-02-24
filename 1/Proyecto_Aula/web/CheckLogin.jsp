<%-- 
    Document   : CheckLogin
    Created on : oct 4, 2014, 9:17:56 p.m.
    Author     : AlvaroAlexander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controller.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Checking</title>
    </head>
    <body>
         <%
                String username=request.getParameter("tb_user");
                String password=request.getParameter("tb_password");
                
                
                
                LDAPtask.establecerConex("10.154.12.203");
                
                //ProcessLDAP.establecerConex("10.152.164.100");
                
                //String validation = ProcessLDAP.login(username, password).trim();
                
                //out.println(validation);
                
                int idValidation = Integer.parseInt(LDAPtask.login(username, password).trim());
       
                if(idValidation >= 0)
                {
                    VariableGlobal.idSession = idValidation;
                    session.setAttribute("username",username);
                    session.setAttribute("id", idValidation);
                    response.sendRedirect("Menu.jsp");
                }
                else
                {
                    response.sendRedirect("Error.jsp");
                }
        %>
    </body>
</html>
