<%-- 
    Document   : sideMenu
    Created on : Jan 5, 2015, 8:37:28 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>App | Side Menu</title>
        <link type="text/css" rel="stylesheet" href="css/semantic.min.css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/semantic.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('.ui.blue.button').click(function(){
                     $('.left.sidebar').sidebar('toggle');
                });
               
                        
            });

        </script>
    </head>
    <body>
        <div class="ui left vertical inverted labeled icon sidebar menu">
            <a class="item">
                <i class="home icon"></i>
                Home
            </a>
            <a class="item">
                <i class="block layout icon"></i>
                Topics
            </a>
            <a class="item">
                <i class="smile icon"></i>
                Friends
            </a>
            <a class="item">
                <i class="calendar icon"></i>
                History
            </a>
            <a class="item">
                <i class="mail icon"></i>
                Messages
            </a>
            <a class="item">
                <i class="chat icon"></i>
                Discussions
            </a>
            <a class="item">
                <i class="trophy icon"></i>
                Achievements
            </a>
            <a class="item">
                <i class="shop icon"></i>
                Store
            </a>
            <a class="item">
                <i class="settings icon"></i>
                Settings
            </a>
        </div>
        
        
    </body>
</html>
