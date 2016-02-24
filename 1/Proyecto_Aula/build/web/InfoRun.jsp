<%-- 
    Document   : InfoRun
    Created on : oct 5, 2014, 1:55:38 p.m.
    Author     : AlvaroAlexander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Resources/css/style.css">
        <title>Information of the Run</title>
    </head>
    <body>
        <img src="Resources/img/Logo_UPB.png" alt="UPB Logo">
        <h6><font size="31">Information Run</font></h6>
        <%
            String name=request.getParameter("input_name");
            String description=request.getParameter("input_descrp");
            String arguments=request.getParameter("input_args");
            String nodes=request.getParameter("input_num_nodes");
            String codeMPI=request.getParameter("input_mcode");
            String[] temp = arguments.split(";");
        %>
        <table border="1">
            <tr>
                <td>
                    Name:
                </td>
                <td>
                    <%=name%>
                </td>
            </tr>
            <tr>
                <td>
                    Description:
                </td>
                <td>
                    <%=description%>
                </td>
            </tr>
            <tr>
                <td>
                    Arguments:
                </td>
                <td>
                    <%
                        out.println(temp[0] + "\t|\tLower limit = " + temp[1] + "\t|\tUpper limit = " + temp[2] + "\t|\tN = " + temp[3] + "");
                    %>
                </td>
            </tr>
            <tr>
                <td>
                    Nodes:
                </td>
                <td>
                    <%=nodes%>
                </td>
            </tr>
            <tr>
                <td>
                    MPI Code:
                </td>
                <td>
                    <%=codeMPI%>
                </td>
            </tr>
        </table>
                       
    </body>
</html>
