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
        <script type="text/javascript">
            $(document).ready(function() {
                $(".ui.red.message").hide();
                $('.ui.form').form({
                    itemId: {
                        identifier: 'itemId',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'Please Enter Item Id'
                            }
                        ]
                    },
                    itemName: {
                        identifier: 'itemName',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'Please Enter Item Name'
                            }
                        ]
                    },
                    noItems: {
                        identifier: 'noItems',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'Please Enter Number Of Items'
                            }
                        ]
                    },
                    itemPrice: {
                        identifier: 'itemPrice',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'Please Enter Item Pricee'
                            }
                        ]
                    },
                    factory: {
                        identifier: 'factory',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'Please Enter factory name'
                            }
                        ]
                    }
                },
                {
                    inline: true,
                    on: 'blur'
                });
                
                $("#itemId").on('input',function() {
                    var options = {};
                    options.url = "${pageContext.request.contextPath}/getinfo?info=itemId";
                    options.type = "GET";
                    options.data = {"criteria": $("#itemId").val()};
                    options.success = function(data) {
                        if (data.length != 0) {
                            $("#itemDiv").addClass("ui red error");
                            $(".ui.red.message").show().html(data);
                        }
                    },
                        options.error = function(error) {
                        console.log("Error Occured...." + error);
                    };
                    $.ajax(options);
                });
            });


        </script>
    </head>
    <body>
        <%@include file="storeMenu.jsp" %>
        <c:if test="${empty Admin}">
            <c:redirect url="home.jsp"/>
        </c:if>
        <div class="ui form segment" id="customerRegForm">
            <form method="POST" action="${pageContext.request.contextPath}/additem">
                <div class="field" id="itemDiv">
                    <label>Item Id</label>
                    <div class="ui left icon input">
                        <input type="text" id="itemId" name="itemId" placeholder="Item Id"/>
                        <i class="user icon"></i>
                    </div>
                </div>
                <div class="ui red message"></div>
                <div class="field">
                    <label>Item Name</label>
                    <div class="ui left icon input">
                        <input type="text" id="itemName" name="itemName"/>
                        <i class="mobile icon"></i>
                    </div>
                </div>
                <div class="field">
                    <label>No.Of Items</label>
                    <div class="ui left icon input">
                        <input type="number" id="noItems" name="noItems" placeholder="No.Of Items"/>
                        <i class="home icon"></i>
                    </div>
                </div>
                <div class="field">
                    <label>Items Price</label>
                    <div class="ui left icon input">
                        <input type="number" id="itemPrice" name="itemPrice" placeholder="Items Price"/>
                        <i class="location icon"></i>
                    </div>
                </div>
                <div class="field">
                    <label>Factory Name</label>
                    <div class="ui left icon input">
                        <input type="text" id="factory" name="factory" placeholder="Factory Name"/>
                        <i class="location icon"></i>
                    </div>
                </div>
                <input type="submit" class="ui blue button" value="Submit"/>
                <input type="reset" class="ui red button" value="Clear"/>
            </form>
            <c:if test="${not empty status}">
                <c:out value="${status}"/>
            </c:if>
        </div>

    </body>
</html>
