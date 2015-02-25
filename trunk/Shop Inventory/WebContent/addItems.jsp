<%-- 
    Document   : storeItems
    Created on : Feb 23, 2015, 6:18:00 PM
    Author     : vinod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop Inventory | Store</title>
        <link type="text/css" rel="stylesheet" href="css/semantic.min.css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/semantic.min.js"></script>
    </head>
    <body>
        <%@include file="storeMenu.jsp" %>
        <c:if test="${empty Admin}">
            <c:redirect url="home.jsp"/>
        </c:if>

    </body>
</html>
