<%-- 
    Document   : RunCode
    Created on : oct 2, 2014, 9:38:24 a.m.
    Author     : Alexander Mora
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">      
                <!--
           INICIO 
            CSS 
        -->
        <link rel="stylesheet" href="Resources/css/style.css">
        <link rel="stylesheet" href="Resources/css/bootstrap.css">
        <link rel="stylesheet" href="Resources/css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="Resources/css/bootstrap.min.css">
        <link href="navbar.css" rel="stylesheet">
        <!--
                 FIN
                   CSS 
        -->
    </head>
    <div class="page-header">
        <div class="jumbotron"><h2>RUN CODE MPI</h2>
        </div>
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
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">                
                <li class="dropdown"><a href="RunCode.jsp">Home</a>
                    <ul  class="dropdown-menu" role="menu">
                        <li><a href="index.jsp">Log out</a></li>
                        <li><a href="About.jsp">About us</a>                         
                        </li>
                    </ul>
                </li>             

                <li class="dropdown"><a href="">MPI</a>
                    <ul  class="dropdown-menu" role="menu">
                        <li><a href="RunCode.jsp">Run Code MPI</a></li>
                        <li><a href="">Consulting Nodes</a></li>
                        <li><a href="InfomRun.jsp">Information Run</a></li>                        
                    </ul>
                </li>
                <li class="dropdown"><a href="">Historical</a>
                    <ul  class="dropdown-menu" role="menu" >
                        <li><a href="Historial.jsp">Check Historial</a></li>                                                
                    </ul>
                </li>
            </ul>
        </div></div>
    -->
    
    <div class="container">

    </div>
    <form method="post" action="InfomRun.jsp">


        <br><br><br><br>
        <table class="tabla3" border="6" width="800" height="100" align="center">
            <tr>
                <th>Name</th>
                <th>Number of nodes to use</th>                 
            </tr>
            <tr>
                <td><input type="text" size="49" name="input_name" value=""></td>
                <td><input type="text" size="49" name="input_num_nodes" value=""></td>                
            </tr>
            <tr>
                <th colspan="2">Arguments (Split by ;)</th>  
            </tr>
            <tr>
                <td colspan="2"><input type="text" size="105" name="input_args" value=""></td>
            </tr>
            <tr>
                <th colspan="1">Code MPI</th>
                <th>Description</th>            
            </tr>
            <tr> 
                <td><textarea rows="25" cols="50" name="input_mcode"></textarea></td>
                <td><textarea rows="25" cols="50" name="input_mdescription"></textarea></td>            
            </tr>                        
        </table>
        <br/><input type="submit" value="Send">  
            <div class="container">

        <div class="row">
            <div class="col-md-6"></div>
            <div class="col-md-6" id='right'><img class="logo" width="250" src="Resources/img/Logo_UPB.png" alt="UPB Logo"></div>


        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="Resources/js/bootstrap.min.js"></script>

        </html>
