<%-- 
    Document   : storeMenu
    Created on : Feb 25, 2015, 5:27:03 PM
    Author     : vinod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop Inventory | Store Menu</title>
        <link type="text/css" rel="stylesheet" href="css/semantic.min.css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/semantic.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('.ui.blue.button').click(function() {
                    $('.left.sidebar').sidebar('toggle');
                });
            });

        </script>
    </head>
    <body>

        <c:if test="${empty Admin}">
            <c:redirect url="home.jsp"/>
        </c:if>

        <div class="ui left vertical inverted labeled icon sidebar menu">
            <a class="item" href="#">
                <i class="add to cart icon"></i>
                Add Item
            </a>
            <a class="item" href="#">
                <i class="edit icon"></i>
                Update Items
            </a>
            <a class="item">
                <i class="unhide icon"></i>
                View Items
            </a>
            <a class="item" href="#">
                <i class="cloud download icon"></i>
                Pending Items
            </a>
            <a class="item" href="#">
                <i class="search icon"></i>
                Search Item
            </a>
            <a class="item" href="#">
                <i class="external share icon"></i>
                Sold Items
            </a>
            <a class="item" href="#">
                <i class="sign out icon"></i>
                Logout
            </a>
        </div>
        <div class="ui blue button">
            <i class="tasks icon"></i>Menu
        </div>
    </body>
</html>
