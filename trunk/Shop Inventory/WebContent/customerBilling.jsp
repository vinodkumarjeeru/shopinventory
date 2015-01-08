<%-- 
    Document   : customerBilling
    Created on : Jan 8, 2015, 1:01:33 PM
    Author     : RAM
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="css/semantic.min.css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/semantic.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $.getScript("js/myScript.js");
                var i = 0;
                $('#totalDiv').hide();
                $('.ui.red.button').click(function() {
                    showItemsEntry();
                });
                $('.ui.orange.button').click(function() {
                    $('#totalDiv').show();
                });
            });
        </script>
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
                <div class="five fields" id="homeEntry">
                    <div class="field">
                        <label style="text-align: center;">Serial No</label>
                        <input type="text" placeholder="Serial No" name="serialNo">
                    </div>
                    <div class="field">
                        <label style="text-align: center;">Item Id</label>
                        <input type="text" placeholder="Item Id" name="itemId">
                    </div>
                    <div class="field">
                        <label style="text-align: center;">Item Name</label>
                        <input type="text" placeholder="Item Name" name="itemName">
                    </div>
                    <div class="field">
                        <label style="text-align: center;">No.Of Items</label>
                        <input type="text" placeholder="No.Of Items" name="noItems">
                    </div>
                    <div class="field">
                        <label style="text-align: center;">Price</label>
                        <input type="text" placeholder="Price" name="price">
                    </div>
                </div>
                <div class="field" id="totalDiv">
                    <label>Total Price</label>
                    <input type="text" placeholder="Price" name="totalPrice">
                </div>
                <input type="button" class="ui red button" value="Add More"/> 
                <input type="button" class="ui orange button" value="Total Amount"/>
                <input type="submit" class="ui blue button" value="Credit Amount" name="billing"/>
            </form>

        </div>

    </body>
</html>