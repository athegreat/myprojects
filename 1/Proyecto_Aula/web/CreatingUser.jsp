<%-- 
    Document   : CreatingUser
    Created on : oct 3, 2014, 5:56:22 p.m.
    Author     : AlvaroAlexander
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
        <div class="jumbotron"><h2>CREATING USER.</h2>
        </div>       
        <form method="post" action="RegisterUser.jsp"> 
            <div class="row">
            <div class="col-md-6"><label class="right_aling">Enter your Name:</label></div>
                <div class="col-md-6"> <input type="text"  class="form-control" name="tb_newname" value="name"> </div>
            </div>
            <div class="row">
            <div class="col-md-6"><label class="right_aling">Enter your Username:</label></div>
                <div class="col-md-6"> <input type="text"  class="form-control" name="tb_newuser" value="name@example.com"> </div>
            </div>
            <div class="row">
            <div class="col-md-6"><label class="right_aling">Enter your Password:</label></div>
                <div class="col-md-6"> <input type="password"  class="form-control" name="tb_newpass" value="******"> </div>
            </div>
                <div class="row">
                    <div class="col-md-6"> <label class="right_aling">Confirm your Password:</label></div>
                    <div class="col-md-6"> <input type="password"  class="form-control" name="tb_newconfirmpass" value="******"></div>
                </div>
                <div class="row">
                    <div class="col-md-6"></div>
                    <div class="col-md-6" id='right'><input class="btn btn-primary btn-lg" id="submit_login" type="submit" value="Submit"></div>
                </div>
                <div class="row">
                    <div class="col-md-6"></div>                    
                </div>
            <!--            
            <h5><table border="6" width="540" height="200" align="center"></h5>
            <tr>
                <td><font color="black" size="5"> Enter your Name: </font></td>
                <td><input type="text" name="tb_newname"></td>
            </tr>
            <tr>
                <td><font color="black" size="5">Enter your Username (email): </font></td>
                    <td><input type="text" name="tb_newuser" value="name@example.com"></td>
            </tr>
            <tr>
                <td><font color="black" size="5">Enter your Password: </font></td>
                <td><input type="password" name="tb_newpass" value="******"> </td>
            </tr>
            <tr>
                <td><font color="black" size="5">Confirm your Password: </font></td>
                <td><input type="password" name="tb_newconfirmpass"></td>
            </tr>
            </table>
                -->
            <br/><input type="submit" value="Create it">
            <!--<br><input type="Button" name="btn_createuser" value = "Create it">-->
        </form>
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
