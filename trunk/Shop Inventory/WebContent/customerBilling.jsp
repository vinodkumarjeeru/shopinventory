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
        <title>Shop Inventory | Billing</title>
        <link type="text/css" rel="stylesheet" href="css/semantic.min.css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/semantic.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $.getScript("js/myScript.js");
                var i = 0;
                $('.ui.red.button').click(function() {
                    showItemsEntry();
                });
                $(document).on("change", ".billing", function() {
                    var sum = 0;
                    $(".billing").each(function() {
                        sum += +$(this).val();
                    });
                    $(".total").val(sum);
                });
            });
        </script>
    </head>
    <body>
        <%@include file="sideMenu.jsp" %>
        <c:if test="${empty Admin}">
            <c:redirect url="home.jsp"/>
        </c:if>
        <div class="ui form segment" id="customerRegForm">
            <form method="POST" action="${pageContext.request.contextPath}/billing">
                <div class="field">
                    <label>Customer Name</label>
                    <div class="ui left icon input">
                        <c:if test="empty status">
                            <c:out value="status"/>
                        </c:if>
                        <input type="text" id="cId" name="custName" placeholder="Customer Name" value="${status.customer_Name}"/>
                        <i class="user icon"></i>
                    </div>
                    <c:if test="not empty errorMsg">
                        <c:out value="errorMsg"/>
                    </c:if>
                </div>

                <div class="five fields" id="homeEntry">
                    <div class="field">
                        <label style="text-align: center;">Serial No</label>
                        <input type="number" placeholder="Serial No" name="serialNo">
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
                        <input type="number" placeholder="No.Of Items" name="noItems">
                    </div>
                    <div class="field">
                        <label style="text-align: center;">Price</label>
                        <input type="number" placeholder="Price" name="ItemsPrice" class="billing">
                    </div>
                </div>
                <div class="field">
                    <label>Total Price</label>
                    <input type="text" placeholder="Price" name="totalPrice" class="total">
                </div>

                <input type="button" class="ui red button" value="Add More"/> 
                <input type="button" class="ui orange button" value="Total Amount"/>
                <input type="submit" class="ui blue button" value="Credit Amount" name="billing"/>
            </form>

        </div>

    </body>
</html>
