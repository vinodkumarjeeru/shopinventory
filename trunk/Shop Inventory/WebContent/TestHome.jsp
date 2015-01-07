<%-- 
    Document   : createCustomer
    Created on : 23 Dec, 2014, 10:29:11 AM
    Author     : 3500512
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>App | Create Customer</title>
        <link type="text/css" rel="stylesheet" href="css/semantic.min.css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/semantic.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $.getScript("js/myScript.js");
                $('#customerRegForm').hide();
                $('#checkCustomerBalance').hide();
                $('#storeItemsList').hide();
                $('#updateAddress').hide();
                $('.dropdown').dropdown();
                $('.ui.vertical.menu').hide();
                $('.ui.blue.button').click(function() {
                    $('.ui.vertical.menu').toggle('slide');
                });

                $('.item').hover(function() {
                    $(this).toggleClass('active');
                });

                $('#addCustomer').bind('click', function() {
                    showRegForm();
                });
                $('#checkBalance').bind('click', function() {
                    checkBalanceForm();
                });
                $('#siList').bind('click', function() {
                    getStoreItemList();
                });
                $('#vcDetails').bind('click', function() {
                    viewCustomerDetails();
                });
                $('#updateAdd').bind('click', function() {
                    updateAddress();
                });
                
                $('.ui.red.button').click(function() {
                    showLoginModal();
                });


                $('.ui.form').form({
                    firstname: {
                        identifier: 'firstname',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'please enter firstname'
                            }
                        ]
                    },
                    lastname: {
                        identifier: 'lastname',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'please enter lastname'
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
        <div class="ui pointing menu">
            <a class="item" id="addCustomer"><i class="users icon"></i> Add Customer</a>
            <a class="item" id="checkBalance"><i class="dollar icon"></i> Check Balance</a>
            <a class="item" id="siList"><i class="archive icon"></i>Store Item List</a>
            <a class="item" id="vcDetails"><i class="unhide icon"></i>View Customer Details</a>
            <div class="right menu">
                <div class="ui dropdown item">
                    <i class="dropdown icon"></i>
                    Other Options
                    <div class="menu">
                        <a class="item" id="updateAdd">Update Address</a>
                        <a class="item">Update Balance</a>
                        <a class="item">Update Customer</a>
                        <a class="item">Credit Amount</a>
                        <a class="item">Debit Amount</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="ui form segment" id="customerRegForm">
            <form method="POST" action="${pageContext.request.contextPath}/create">
                <div class="two fields">
                    <div class="field">
                        <label>First name</label>
                        <div class="ui left icon input">
                            <input type="text" id="fName" name="firstname" placeholder="Username"/>
                            <i class="user icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <label>Last name</label>
                        <div class="ui left icon input">
                            <input type="text" id="lName" name="lastname" placeholder="Lastname"/>
                            <i class="user icon"></i>
                        </div>
                    </div>
                </div>
                <div class="field">
                    <label>Mobile Number</label>
                    <div class="ui left icon input">
                        <input type="number" id="mobile" name="mobile"/>
                        <i class="mobile icon"></i>
                    </div>
                </div>
                <div class="three fields">
                    <div class="field">
                        <label>Door No</label>
                        <div class="ui left icon input">
                            <input type="text" id="door" name="door" placeholder="Door No"/>
                            <i class="home icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <label>Village Name</label>
                        <div class="ui left icon input">
                            <input type="text" id="village" name="village" placeholder="Village Name"/>
                            <i class="star icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <label>District Name</label>
                        <div class="ui left icon input">
                            <input type="text" id="village" name="district" placeholder="District Name"/>
                            <i class="star icon"></i>
                        </div>
                    </div>
                </div>
                <div class="two fields">
                    <div class="field">
                        <label>State Name</label>
                        <div class="ui left icon input">
                            <input type="text" id="state" name="state" placeholder="State Name"/>
                            <i class="location icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <label>Pin Code</label>
                        <div class="ui left icon input">
                            <input type="text" id="pincode" name="pincode" placeholder="Pin Code"/>
                            <i class="location icon"></i>
                        </div>
                    </div>
                </div>
                <input type="submit" class="ui blue button" value="Submit"/>
            </form>

        </div>
        <div class="ui segment" id="checkCustomerBalance">
            <div class="ui two column middle aligned relaxed fitted stackable grid">
                <div class="column">
                    <div class="ui form segment">
                        <div class="field">
                            <label>Customer Name</label>
                            <div class="ui left icon input">
                                <input type="text" name="customerName" placeholder="Enter Customer Name"/>
                                <i class="user icon"></i>
                            </div>
                        </div>
                        <div class="field">
                            <label>Phone</label>
                            <div class="ui left icon input">
                                <input type="number" name="mobile" id="customerMobile"/>
                                <i class="mobile icon"></i>
                            </div>
                        </div>
                        <div class="ui blue button">Check Balance</div>
                    </div>
                </div>
                <div class="ui vertical divider">
                    (Or)
                </div>
                <div class="column">
                    <div class="ui form segment">
                        <div class="field">
                            <label>Customer Id</label>
                            <div class="ui left icon input">
                                <input type="text" name="customerId" placeholder="Enter Customer Id"/>
                                <i class="user icon"></i>
                            </div>
                        </div>
                        <div class="field">
                            <label>Date </label>
                            <div class="ui left icon input">
                                <input type="date" name="mobile" id="date"/>
                                <i class="calendar icon"></i>
                            </div>
                        </div>
                        <div class="ui blue button">Check Balance</div>
                    </div>
                </div>
            </div>
        </div>
        <div class="ui segment" id="storeItemsList">
            <table class="ui striped celled table">
                <thead>
                    <tr>
                        <th>Item Id</th>
                        <th>Item Name</th>
                        <th>Sold Items</th>
                        <th>Remaining Items</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>Rice</td>
                        <td>12</td>
                        <td>15</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>Rice</td>
                        <td>12</td>
                        <td>15</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>Rice</td>
                        <td>12</td>
                        <td>15</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="ui one column middle aligned relaxed fitted stackable grid" id="updateAddress">
            <div class="column">
                <div class="ui form segment">
                    <div class="field">
                        <label>Customer Id</label>
                        <div class="ui left icon input">
                            <input type="text" name="customerId" placeholder="Enter Customer Id"/>
                            <i class="barcode icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <label>Customer Name</label>
                        <div class="ui left icon input">
                            <input type="text" name="customerName" placeholder="Enter Customer Name"/>
                            <i class="user icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <label>Phone</label>
                        <div class="ui left icon input">
                            <input type="number" name="mobile" id="customerMobile"/>
                            <i class="mobile icon"></i>
                        </div>
                    </div>
                    <div class="ui blue button">Check User</div>
                </div>
            </div>
        </div>
    <c:if test="${not empty status}">
        <div class="ui icon message">
            <i class="notched circle loading icon"></i>
            <div class="content">
                <p><c:out value="${status}"/></p>
            </div>
        </div>
    </c:if>
                
                
        <div class="ui red button">Show Modal</div>
        <div class="ui basic modal">
            <i class="close icon"></i>
            <div class="header">
                Administrator Login
            </div>
            <div class="ui form segment">
                <form method="POST" id="loginForm" action="${pageContext.request.contextPath}/mine">
                    <div class="content">
                        <div class="description">
                            <div class="ui header">We've auto-chosen a profile image for you.</div>

                            <div class="field">
                                <label>Username</label>
                                <div class="ui left icon input">
                                    <input type="text" id="user" name="username" placeholder="Username"/>
                                    <i class="user icon"></i>
                                </div>
                            </div>
                            <div class="field">
                                <label>Password</label>
                                <div class="ui left icon input">
                                    <input type="password" id="password" name="password" placeholder="Password"/>
                                    <i class="lock icon"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="actions">
                        <input type="reset" class="ui green button" value="Clear"/>
                        <input type="submit" class="ui blue button" value="Login" name="login"/>
                    </div>
                </form>
            </div>
        </div>

</body>
</html>
