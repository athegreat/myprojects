<%-- 
    Document   : Historial
    Created on : oct 5, 2014, 1:14:02 p.m.
    Author     : AlvaroAlexander
--%>

<%@page import="Controller.VariableGlobal"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>JSP Page</title>
                <!--
           INICIO 
            CSS 
        -->
        <link rel="stylesheet" href="Resources/css/style.css">
        <link rel="stylesheet" href="Resources/css/bootstrap.css">
        <link rel="stylesheet" href="Resources/css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="Resources/css/bootstrap.min.css">
        <link href="navbar.css" rel="stylesheet">
        <link href="Resources/js/bootstrap.min.css" rel="stylesheet">
        <!--
                 FIN
                   CSS 
        -->
    </head>
        <div class="page-header">
        <div class="jumbotron"><h2>HISTORIAL</h2>
        </div>
    <body>
      
        <!--
           INICIO 
            BARRA DE NAVEGACIÓN 
            -->
            <div class="navbar navbar-default" role="navigation">
                <div class="container-fluid">
                    <div class="navbar-header">
                    </div>
                    <div class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                            <li class="dropdown">
                                <a href="RunCode.jsp" class="dropdown-toggle" data-toggle="dropdown">Home<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="index.jsp">Log out</a></li>                                     
                                </ul>
                            </li>    
                            <li class="dropdown">
                                <a href="RunCode.jsp" class="dropdown-toggle" data-toggle="dropdown">MPI<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="RunCode.jsp">Run Code MPI</a></li>
                                    <li><a href="">Consulting Nodes</a></li>
                                    <li><a href="InfomRun.jsp">Information Run</a></li> 
                                </ul>
                            </li>   
                            <li class="dropdown">
                                <a href="RunCode.jsp" class="dropdown-toggle" data-toggle="dropdown">Historical<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="HistorialPA.jsp">Check Historial</a></li>    
                                </ul>
                            </li>  
                        </ul>

                    </div><!--/.nav-collapse -->
                </div><!--/.container-fluid -->
            </div>
            </div>
            <!--
           FIN
           BARRA DE NAVEGACIÓN 
            -->
        <!--
        <ul class="nav">               
                <li type="disc"><a href="RunCode.jsp">Home</a>
                    <ul>
                        <li><a href="index.jsp">Log out</a></li>
                        <li><a href="About.jsp">About us</a>                         
                        </li>
                    </ul>
                </li>                
                    <!--<li><a href="">Run Code MPI</a></li>
                <!--<li><a href="">Consulting Nodes</a></li>
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
        -->               
        <br><br><br><br><h4 style="color: black">List: <select name="corridas">    
        </select></h4>        
        <table class="tabla2" border="6" width="400" height="100" align="center">
            <tr>
                <td><a href="InfomRun.jsp"><font color="black" size="5">ID Run </font></a></td>
                <td><input type="text" name="tb_idrun" value=""></td>
            </tr>

            <tr>
                <td><font color="black" size="5">Number of nodes used: </font></td>
                <td><input type="text" name="tb_nodes" value=""></td>
            </tr>
            <tr>
                <td><font color="black" size="5">Date: </font></td>
                <td><input type="date" name="tb_date" value=""></td>
            </tr>
            <tr>
                <td><font color="black" size="5">Status: </font></td>
                <td><input type="status" name="tb_status" value=""></td>
            </tr>
        </table>
        
            <div class="container">

        <div class="row">
            <div class="col-md-6"></div>
            <div class="col-md-6" id='right'><img class="logo" width="250" src="Resources/img/Logo_UPB.png" alt="UPB Logo"></div>


        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="Resources/js/bootstrap.min.js"></script>

    </body>
</html>
