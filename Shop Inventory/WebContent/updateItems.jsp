<%-- 
    Document   : updateItems
    Created on : Mar 21, 2015, 10:57:51 AM
    Author     : Vinnu
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
                $.getScript("js/myScript.js");
                $('.ui.red.button').click(function() {
                    $(".ui.red.message").hide();
                    showModal();
                });


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
                $("#itemId").on('input', function() {
                    getKeyDetails();
                });

            });


        </script>
    </head>
    <body>
        <%@include file="storeMenu.jsp" %>
        <c:if test="${empty Admin}">
            <c:redirect url="home.jsp"/>
        </c:if>
        <div class="ui basic modal">
            <i class="close icon"></i>
            <div class="header">
                Search Items
            </div>
            <div class="ui form segment">
                <form method="POST" id="custFindForm" action="${pageContext.request.contextPath}/updateitem">
                    <div class="content">
                        <div class="description">
                            <div class="ui header">We've auto-chosen a profile image for you.</div>

                            <div class="field">
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
                                    <input type="text" id="itemName" name="itemName" placeholder="Item Name"/>
                                    <i class="phone icon"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="actions">
                        <input type="submit" class="ui blue button" value="Get Details" name="action"/>
                        <input type="reset" class="ui green button" value="Clear"/>
                    </div>
                </form>
            </div>
        </div>

        <div class="ui form segment" id="itemUpdateForm">
            <form method="POST" action="${pageContext.request.contextPath}/updateitem">
                <div class="field" id="itemDiv">
                    <label>Item Id</label>
                    <div class="ui left icon input">
                        <input type="text" id="itemId1" name="itemId" value="${store.item_Id}" placeholder="Item Id"/>
                        <i class="user icon"></i>
                    </div>
                </div>
                <div class="field">
                    <label>Item Name</label>
                    <div class="ui left icon input">
                        <input type="text" id="itemName" name="itemName" value="${store.item_Name}"/>
                        <i class="mobile icon"></i>
                    </div>
                </div>
                <div class="field">
                    <label>No.Of Items</label>
                    <div class="ui left icon input">
                        <input type="number" id="noItems" name="noItems" value="${store.total_Items}" placeholder="No.Of Items"/>
                               <i class="home icon"></i>
                    </div>
                </div>
                <div class="field">
                    <label>Items Price</label>
                    <div class="ui left icon input">
                        <input type="number" id="itemPrice" name="itemPrice" value="${store.price}" placeholder="Items Price"/>
                        <i class="location icon"></i>
                    </div>
                </div>
                <div class="field">
                    <label>Factory Name</label>
                    <div class="ui left icon input">
                        <input type="text" id="factory" name="factory" value="${store.factoryName}" placeholder="Factory Name"/>
                        <i class="location icon"></i>
                    </div>
                </div>
                <input type="button" class="ui red button" value="Find Item"/>
                <input type="submit" class="ui blue button" value="Update Item" name="action"/>
            </form>
            <c:if test="${not empty status}">
                <c:out value="${status}"/>
            </c:if>
        </div>
    </body>
</html>
