<%-- 
    Document   : customerBilling
    Created on : Jan 8, 2015, 1:01:33 PM
    Author     : RAM
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="css/semantic.min.css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/semantic.min.js"></script>
    </head>
    <body>
        <%@include file="sideMenu.jsp" %>
        <div class="ui form segment" id="customerRegForm">
            <form method="POST" action="${pageContext.request.contextPath}/create">
                <div class="field">
                    <label>Customer Id</label>
                    <div class="ui left icon input">
                        <c:if test="empty status">
                            <c:out value="status"/>
                        </c:if>
                            <input type="text" id="cId" name="custId" placeholder="Customer Id" value="${status.customer_Name}"/>
                        <i class="user icon"></i>
                    </div>
                </div>
                        <input type="submit" class="ui blue button" value="Credit Amount" name="billing"/>
            </form>

        </div>

    </body>
</html>
