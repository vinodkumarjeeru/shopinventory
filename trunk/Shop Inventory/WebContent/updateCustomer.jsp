<%-- 
    Document   : updateCustomer
    Created on : Jan 8, 2015, 10:06:42 AM
    Author     : RAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop Inventory | Update</title>
        <link type="text/css" rel="stylesheet" href="css/semantic.min.css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/semantic.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $.getScript("js/myScript.js");
                $('.ui.red.button').click(function() {
                    showModal();
                });

                $('.ui.form').form({
                    customerName: {
                        identifier: 'firstname',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'please enter firstname'
                            }
                        ]
                    },
                    mobile: {
                        identifier: 'mobile',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'please enter mobile number'
                            },
                            {
                                type: 'length[10]',
                                prompt: 'please enter correct mobile number'
                            }
                        ]
                    },
                    door: {
                        identifier: 'door',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'please enter door number'
                            }
                        ]
                    },
                    village: {
                        identifier: 'village',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'please enter village name'
                            }
                        ]
                    },
                    state: {
                        identifier: 'state',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'please enter state name'
                            }
                        ]
                    },
                    pincode: {
                        identifier: 'pincode',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'please enter pincode'
                            }
                        ]
                    }
                },
                {
                    inline: true,
                    on: 'blur'
                });
            });

        </script>
    </head>
    <body>
        <%@include file="sideMenu.jsp" %>
        <c:if test="${empty Admin}">
            <c:redirect url="home.jsp"/>
        </c:if>

        <h1>Customer Update</h1>

        <div class="ui basic modal">
            <i class="close icon"></i>
            <div class="header">
                Search Customer
            </div>
            <div class="ui form segment">
                <form method="POST" id="custFindForm" action="${pageContext.request.contextPath}/update">
                    <div class="content">
                        <div class="description">
                            <div class="ui header">We've auto-chosen a profile image for you.</div>

                            <div class="field">
                                <label>Customer Name</label>
                                <div class="ui left icon input">
                                    <input type="text" id="custName" name="custName" placeholder="Customer Name"/>
                                    <i class="user icon"></i>
                                </div>
                            </div>
                            <div class="field">
                                <label>Phone Number</label>
                                <div class="ui left icon input">
                                    <input type="number" id="phone" name="phone" placeholder="Phone Number"/>
                                    <i class="phone icon"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="actions">
                        <input type="reset" class="ui green button" value="Clear"/>
                        <input type="submit" class="ui blue button" value="Find Customer" name="action"/>
                    </div>
                </form>
            </div>
        </div>


        <div class="ui form segment" id="customerUpdateForm">
            <form method="POST" action="${pageContext.request.contextPath}/update">
                <input type="hidden" value="${customer.customer_Id}" name="customerId"/>
                <div class="field">
                    <label>Customer name</label>
                    <div class="ui left icon input">
                        <input type="text" id="cName" name="customerName" value="${customer.customer_Name}" placeholder="Username"/>
                        <i class="user icon"></i>
                    </div>
                </div>
                <div class="field">
                    <label>Mobile Number</label>
                    <div class="ui left icon input">
                        <input type="number" id="mobile" name="mobile" value="${customer.customer_Phone}"/>
                        <i class="mobile icon"></i>
                    </div>
                </div>
                <div class="three fields">
                    <div class="field">
                        <label>Door No</label>
                        <div class="ui left icon input">
                            <input type="text" id="door" name="door" value="${customer.address.doorNo}" placeholder="Door No"/>
                            <i class="home icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <label>Village Name</label>
                        <div class="ui left icon input">
                            <input type="text" id="village" name="village" value="${customer.address.villeageName}" placeholder="Village Name"/>
                            <i class="star icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <label>District Name</label>
                        <div class="ui left icon input">
                            <input type="text" id="village" name="district" value="${customer.address.districtName}" placeholder="District Name"/>
                            <i class="star icon"></i>
                        </div>
                    </div>
                </div>
                <div class="field">
                    <label>State Name</label>
                    <div class="ui left icon input">
                        <input type="text" id="state" name="state" value="${customer.address.stateName}" placeholder="State Name"/>
                        <i class="location icon"></i>
                    </div>
                </div>
                <div class="field">
                    <label>Pin Code</label>
                    <div class="ui left icon input">
                        <input type="text" id="pincode" name="pincode" value="${customer.address.pinCode}" placeholder="Pin Code"/>
                        <i class="location icon"></i>
                    </div>
                </div>
                <input type="button" class="ui red button" value="Search Customer"/>
                <input type="submit" class="ui blue button" value="Update Customer" name="action"/>
            </form>
        </div>

        <c:if test="${not empty status}">
            <c:out value="${status}"/>
        </c:if>
    </body>
</html>
