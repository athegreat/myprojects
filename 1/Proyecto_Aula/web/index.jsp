<%-- 
    Document   : index
    Created on : oct 2, 2014, 8:50:58 a.m.
    Author     : Alexander Mora
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Resources/css/style.css">
        <link rel="stylesheet" href="Resources/css/bootstrap.css">
        <title>Login</title>
    </head>
    <body>
        <div class="page-header">
            <div class="jumbotron"><h2>SERVICIO DE ACCESO REMOTO PARA LA EJECUCIÓN DE ALGORITMOS DE ALTO RENDIMIENTO EN UN CLÚSTER DE COMPUTADORES MEDIANTE CLIENTES JSP,PHP Y JAVA RMI.</h2>
            </div>
        </div>
        <div class="container">
            <form method="post" action="CheckLogin.jsp">
                <div class="row">
                    <div class="col-md-6"><label class="right_aling">User</label></div>
                    <div class="col-md-6"> <input type="text"  class="form-control" name="tb_user" value="name@example.com"> </div>
                </div>
                <div class="row">
                    <div class="col-md-6"> <label class="right_aling">Password</label></div>
                    <div class="col-md-6"> <input type="password"  class="form-control" name="tb_password" value="******"></div>
                </div>
                <div class="row">
                    <div class="col-md-6"></div>
                    <div class="col-md-6" id='right'><input class="btn btn-primary btn-lg" id="submit_login" type="submit" value="Submit"></div>
                </div>
                <div class="row">
                    <div class="col-md-6"></div>
                    <div class="col-md-6" id='right'><h3><span class="label label-warning"><a href="CreatingUser.jsp">If you don't have a account, click here!</a></span></h3></div>
                </div>
                <div class="row">
                    <div class="col-md-6"></div>
                    <div class="col-md-6" id='right'><img class="logo" width="250" src="Resources/img/Logo_UPB.png" alt="UPB Logo"></div>
                </div>
            </form>
        </div>
    </body>
</html>
