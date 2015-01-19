<%-- 
    Document   : viewCustomers
    Created on : Jan 19, 2015, 9:31:42 PM
    Author     : vinod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop Inventory | List</title>
        <link type="text/css" rel="stylesheet" href="css/semantic.min.css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/semantic.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('#addCustomer').click(function() {
                    $(location).attr('href', 'createCustomer.jsp');
                });
            });
        </script>
    </head>
    <body>
        <%@include file="sideMenu.jsp" %>
        <c:if test="${empty Admin}">
            <c:redirect url="home.jsp"/>
        </c:if>
        <h1>List Of Customers</h1>

        <table class="ui compact celled definition table">
            <thead class="full-width">
                <tr>
                    <th><i class="user icon"></i>Customer Name</th>
                    <th><i class="mobile icon"></i>Customer Phone</th>
                    <th><i class="calendar icon"></i>Join Date</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${studentList}" var="students">
                    <tr>
                        <td><c:out value="${students.customer_Name}"/></td>
                        <td><c:out value="${students.customer_Phone}"/></td>
                        <td><c:out value="${students.customer_Join_Date}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
            <tfoot class="full-width">
                <tr>
                    <th colspan="4">
            <div class="ui left floated green small primary labeled icon button" id="addCustomer">
                <i class="user icon"></i> Add Customer
            </div>
        </th>
    </tr>
</tfoot>
</table>
</body>
</html>
