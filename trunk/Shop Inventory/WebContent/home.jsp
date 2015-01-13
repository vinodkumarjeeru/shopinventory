<%-- 
    Document   : home
    Created on : Jan 12, 2015, 9:52:54 PM
    Author     : vinod
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
                $('#loginModal').click(function() {
                    showModal();
                });

                $('a').hover(function() {
                    $(this).toggleClass('active');
                });
            });
        </script>
    </head>
    <body>
        <div class="ui pointing menu">
            <a class="item" id="loginModal">
                <i class="home icon"></i> Admin Login
            </a>
            <a class="item">
                <i class="mail icon"></i> Check Store Items
            </a>
            <a class="item">
                <i class="user icon"></i> Factory Login
            </a>
            <a class="item">
                <i class="user icon"></i> Factory Items
            </a>
            <div class="right menu">
                <div class="item">

                </div>
            </div>
        </div>

        <div class="ui basic modal">
            <i class="close icon"></i>
            <div class="header">
                Administrator Login
            </div>
            <div class="ui form segment">
                <form method="POST" id="loginForm" action="${pageContext.request.contextPath}/login">
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
                        <input type="submit" class="ui blue button" value="Admin Login" name="adminLogin"/>
                    </div>
                </form>
            </div>
        </div>

    <c:if test="${not empty status}">
        <p><c:out value="${status}"/></p>
</c:if>

</body>
</html>
