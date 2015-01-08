<%-- 
    Document   : createCustomer
    Created on : Jan 5, 2015, 8:13:50 PM
    Author     : Lenovo
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
        <c:if test="${empty Admin}">
            <c:redirect url="index.jsp"/>
        </c:if>

        <%@include file="sideMenu.jsp" %>
        <div class="ui form segment" id="customerRegForm">
            <form method="POST" action="${pageContext.request.contextPath}/create">
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
                <input type="submit" class="ui blue button" value="Submit"/>
            </form>
        </div>
    </body>
</html>
