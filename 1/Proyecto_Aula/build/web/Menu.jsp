<%-- 
    Document   : Menu
    Created on : oct 2, 2014, 9:35:32 a.m.
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
        <link href="Resources/js/bootstrap.min.css" rel="stylesheet">
        <!--
                 FIN
                   CSS 
        -->      
    </head>
    <body>
    <div class="page-header">
        <div class="jumbotron"><h2>MENU PROJECT</h2>
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
                                    <li><a href="BasicHistorial.jsp">Check Historial</a></li>    
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
        </div>  
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
