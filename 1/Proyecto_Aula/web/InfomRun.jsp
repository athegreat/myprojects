<%-- 
    Document   : InfomRun
    Created on : 9/10/2014, 04:01:11 PM
    Author     : DELL
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="soapdb.historyDB"%>
<%@page import="soapdb.*"%>
<%@page import="Controller.VariableGlobal"%>
<%@page import="soapcluster.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Resources/css/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <br><img class="img1" src="Resources/img/Logo_UPB.png" alt="UPB Logo">
        <h6><font size="31">Information Run</font></h6>
                    <ul class="nav">                
                <li type="disc"><a href="RunCode.jsp">Home</a>
                    <ul>
                        <li><a href="index.jsp">Log out</a></li>                                                 
                        </li>
                    </ul>
                </li>                
                    <!--<li><a href="">Run Code MPI</a></li>-->
                <!--<li><a href="">Consulting Nodes</a></li>-->
                <li><a href="">MPI</a>
                    <ul>
                        <li><a href="RunCode.jsp">Run Code MPI</a></li>
                        <li><a href="">Consulting Nodes</a></li>
                        <li><a href="InfomRun.jsp">Information Run</a></li>                        
                    </ul>
                </li>
                <li><a href="">Historical</a>
                 <ul>
                        <li><a href="Historial.jsp">Check Historial</a></li>                                                
                 </ul>
                </li>
            </ul>
        <br><br><br><br><table class="tabla3" border="6" width="800" height="100" align="center">
            <%
                solicitar_corrida runCodeMPI = new solicitar_corrida();
                String name = request.getParameter("input_name"),
                        number_nodes = request.getParameter("input_num_nodes"),
                        args = request.getParameter("input_args"),
                        codeMPI = request.getParameter("input_mcode"),
                        description = request.getParameter("input_mdescription");
                
                String r = runCodeMPI.sol_corrida("1" + "", name, description, codeMPI, args, number_nodes);
            %>
            <tr>
                <th>Date</th>
                <th>Id User</th>		
                <th>Number of nodes solicited</th>
                <th>Time Execution</th>
            </tr>
            <%
                
                //historial.
                
                historyDB hisB = new historyDB();
                
                
                ArrayList<ArrayList> listA = hisB.getHistorial("1","1", "", "");
                
                Detail deta = new Detail();
                
                Object ob = listA.get(0).get(0);
                
                ArrayList l = deta.conect_db(String.valueOf(ob));
                
                //to bring the last run
                out.println("<tr>");
                
                out.println("<td>"+ l.get(2) +"</td>");
                out.println("<td>"+ l.get(1) +"</td>");
                out.println("<td>"+ l.get(7) +"</td>");
                out.println("<td>"+ l.get(11) +"</td>");
                
                out.println("</tr>");
                
                
                out.println("<tr>"
                        + "<th>Download file</th>"
                        + "<th>Status</th>"
                        + "<th colspan=\"2\">Name MPI</th>"
                        + "</tr>");
                
                out.println("<td>"+ l.get(8) +"</td>");
                out.println("<td>"+ l.get(5) +"</td>");
                
                out.println("</tr>");
                
                out.println("<tr>"
                        + "<td>Nombre_Codigo <br><button type=\"button\">Download File</button></td>"
                        + "<td>Running</td>		"
                        + "<td colspan=\"2\">Codigo MPI</td>"
                        + "</tr>"
                        + "<tr>"
                        + "<th colspan=\"2\">Errors</th>"
                        + "<th colspan=\"2\">Description</th>"
                        + "</tr>");
                
                out.println("</tr>");
                
                out.println("<td colspan=\"2\">"+ l.get(10) +"<br><br><br><br><br><br><br><br><br></td>");
                out.println("<td colspan=\"2\">"+ l.get(4) +"<br><br><br><br><br><br><br><br><br></td>");
                
                out.println("</tr>");
                
                
            %>
        </table>
    </body>
</html>
