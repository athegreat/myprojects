<%-- 
    Document   : About
    Created on : 9/10/2014, 05:58:21 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Resources/css/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <img class="img3" src="Resources/img/Logo_UPB.png" alt="UPB Logo">
        <h6><font size="31">about</font></h6>
        <ul class="nav">               
                <li type="disc"><a href="RunCode.jsp">Home</a>
                    <ul>
                        <li><a href="index.jsp">Log out</a></li>
                        <li><a href="About.jsp">About us</a>                         
                        </li>
                    </ul>
                </li>                
                    <!--<li><a href="">Run Code MPI</a></li>-->
                <!--<li><a href="">Consulting Nodes</a></li>-->
                <li><a href="">MPI</a>
                    <ul>
                        <li><a href="RunCode.jsp">Run Code MPI</a></li>
                        <li><a href="#" onclick="consultingNodes()">Consulting Nodes</a></li>
                        <li><a href="InfomRun.jsp">Information Run</a></li>                        
                    </ul>
                </li>
                <li><a href="">Historical</a>
                 <ul>
                        <li><a href="Historial.jsp">Check Historial</a></li>                                                
                 </ul>
                </li>
            </ul>
        <br><br><br><br><table class="tabla3" border="6" width="1200" height="700" align="center">            
            <tr>
                <td colspan="2"><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br></td>                   
            </tr>                        
        </table>
        <img class="img2" src="Resources/img/distri.png" alt="UPB Logo">
    </body>
</html>
