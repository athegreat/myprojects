<%-- 
    Document   : RegisterUser
    Created on : oct 14, 2014, 8:28:08 a.m.
    Author     : AlvaroAlexander
--%>

<%@page import="Controller.ProcessLDAP"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creating User</title>
        <%
            String tbname = "tb_newname", tbuser = "tb_newuser", 
                    tbpass = "tb_newpass", tbnewpass = "tb_newconfirmpass";
            
        %>
    </head>
    <body>
        <%
            ProcessLDAP.establecerConex("10.154.12.203");
            
            String name = request.getParameter(tbname);
            
            String username=request.getParameter(tbuser);
            
            String password=request.getParameter(tbpass);
            
            String confirmpassword=request.getParameter(tbnewpass);
            
            //ProcessLDAP.register(name, username, password);
            //response.sendRedirect("index.jsp");
            
            char[] p1 = password.toCharArray();
            char[] p2 = confirmpassword.toCharArray();
            
            //if (p1)
            
            boolean t = password.trim().equals(confirmpassword.trim());
            
            if (password.trim().equals(confirmpassword.trim()))
            {
                String s = ProcessLDAP.register(name, username, password);
                
                if (s.equals("1"))
                {
                    response.sendRedirect("index.jsp");
                }
                else
                {
                    request.setAttribute(tbname, " ");
                    request.setAttribute(tbuser, " ");
                    request.setAttribute(tbpass, " ");
                    request.setAttribute(tbnewpass, " ");
                    response.sendRedirect("CreatingUser.jsp");
                }
            }
            else
            {
                response.sendRedirect("CreatingUser.jsp");
            }
            
            
            
            
        %>
    </body>
</html>
