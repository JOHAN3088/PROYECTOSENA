<%-- 
    Document   : registroEmpleados
    Created on : 30/08/2024, 5:20:41 p. m.
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de empleados</title>
                
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <style>
         body{
            background-color: #1a237e;
            background-size: cover;
            color:#fff;
        }
        .registro{
            margin-top: 0px;
        }
        
        .registro label{
            font-size: 16px;
            color: #1a237e;
        }
        .registro input{
            font-size: 16px !important; 
            color: #1a237e;         
        }
        .registro button:hover{
            padding: 10px 40px;
        }
        .imagen{
         margin-top: 40px;   
        }
        
        
     </style>
     
    </head>
    <body>
       <!-- formulario de registro de turnos para usuarios -->
        <div class="container imagen">  
            <div class="row ">                
                <div class="col s12 5 offset-s5"><span class="flow-text">                       
                        <img src="img/images_redi.png" class="circle responsive-img">                                       
                </span>
                </div>
            </div>
        </div>               
            
     <div class="row registro">
        <div class="col s12 14 offsite-14">
            <div class="card">
                <div class="card-action indigo darken-4 col s12">
                    <h4>Registro</h4>                   
                </div>
                <br><br>
                <div class="card-content">
                    <div class="form-field">
                        <label for="username">username</label>
                        <input type="text" id="username">
                    </div><br>

                    <div class="form-field">
                        <label for="email">correo electronico</label>
                        <input type="text" id="email">
                    </div><br>

                    <div class="form-field">
                        <label for="fecha">fecha de nacimiento</label>
                        <input type="date" id="fecha">
                    </div><br>   
                    <div class="form-field">
                        <label for="password">contraseña</label>
                        <input type="password" id="password">
                   </div><br>                    
                    <div class="form-field center-align">
                       <button class="btn-large indigo darken-4">Enviar</button>
                      
                    </div><br>

                </div>
            </div>
          
        </div>
     </div>   
    
    <!-- Compiled and minified JavaScript -->
     <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
     <script>
         document.addEventListener('DOMContentLoaded', function() {
         
                      M.AutoInit();
  });
     </script>   

    </body>
</html>
