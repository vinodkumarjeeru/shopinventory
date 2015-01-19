<%-- 
    Document   : sideMenu
    Created on : Jan 5, 2015, 8:37:28 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop Inventory | Side Menu</title>
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
            <a class="item" href="${pageContext.request.contextPath}/createCustomer.jsp">
                <i class="users icon"></i>
                Add Customer
            </a>
            <a class="item" href="${pageContext.request.contextPath}/customerBilling.jsp">
                <i class="book icon"></i>
                Billing
            </a>
            <a class="item">
                <i class="block rupee icon"></i>
                Check Balance
            </a>
            <a class="item" href="${pageContext.request.contextPath}/list?list=customersList">
                <i class="users icon"></i>
                View Customers
            </a>
            <a class="item" href="${pageContext.request.contextPath}/updateCustomer.jsp">
                <i class="edit icon"></i>
                Update Customer
            </a>
            <a class="item">
                <i class="money icon"></i>
                Update Balance
            </a>
            <a class="item">
                <i class="trello icon"></i>
                Credit Amount
            </a>
            <a class="item">
                <i class="sort content descending icon"></i>
                Debit Amount
            </a>
            <a class="item" href="${pageContext.request.contextPath}/logout">
                <i class="sign out icon"></i>
                Logout
            </a>
        </div>
        <div class="ui blue button">
            <i class="tasks icon"></i>Menu
        </div>

    </body>
</html>
