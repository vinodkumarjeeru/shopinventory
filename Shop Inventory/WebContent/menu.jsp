<%-- 
    Document   : index
    Created on : 9 Dec, 2014, 10:38:41 AM
    Author     : 3500512
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('li').hover(function() {
                    $(this).toggleClass('active');
                });
            });

        </script>
    </head>
    <body>

        <c:if test="${empty Admin}">
            <c:redirect url="home.jsp"/>
        </c:if>

        <nav role="navigation" class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <ul class="nav nav-pills">
                        <li><a href="${pageContext.request.contextPath}/createCustomer.jsp">Customer Module</a></li>
                        <li><a href="${pageContext.request.contextPath}/addItems.jsp">Stock Module</a></li>
                        <li><a href="#">Factory Module</a></li>
                        <li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>
                    </ul>
                </div>
            </div>
        </nav>




        <nav role="navigation" class="navbar navbar-default navbar-fixed-bottom">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <a href="#" class="navbar-brand">Go Home</a>
                </div>
            </div>
        </nav>




    </body>
</html>
