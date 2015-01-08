<%-- 
    Document   : index
    Created on : 9 Dec, 2014, 10:38:41 AM
    Author     : 3500512
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
        <script type="text/javascript" src="js/semantic.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('.ui.form').form({
                    username: {
                        identifier: 'username',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'Please enter a username'
                            }
                        ]
                    },
                    password: {
                        identifier: 'password',
                        rules: [
                            {
                                type: 'empty',
                                prompt: 'Please enter a password'
                            },
                            {
                                type: 'length[6]',
                                prompt: 'Your password must be at least 6 characters'
                            }
                        ]
                    }
                });
            });

        </script>
    </head>
    <body>
        <div class="ui form segment">
            <form method="POST" action="${pageContext.request.contextPath}/mine">
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
                <input type="submit" class="ui blue button" value="Login" name="login"/>
            </form>
        </div>
            <c:if test="${not empty status}">
                <c:out value="${status}"/>
            </c:if>
    </body>
</html>
