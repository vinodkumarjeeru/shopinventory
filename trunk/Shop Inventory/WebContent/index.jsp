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
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {

            });

        </script>
    </head>
    <body>



        <nav role="navigation" class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <a href="#loginModal" class="navbar-brand" data-toggle="modal">Login</a>
                </div>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#" id="timeElement">Login</a></li>
                </ul>
            </div>
        </nav>


        <div id="loginModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Enter Information</h4>
                    </div>
                    <form method="post" action="${pageContext.request.contextPath}/login">
                        <div class="modal-body">
                            <div class="form-group">
                                <label>Email</label>
                                <input type="text" class="form-control" id="username" name="username" placeholder="Username"/>
                            </div>
                            <div class="form-group">
                                <label >Password</label>
                                <input type="password" class="form-control" id="password" name="password" placeholder="Password"/>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="submit" value="Login" class="btn btn-success"/>
                            <input type="reset" value="Clear" class="btn btn-info"/>
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </form>
                        
                </div>
            </div>
        </div>
        <c:if test="${not empty status}">
            <p><c:out value="${status}"/></p>
        </c:if>
        <nav role="navigation" class="navbar navbar-default navbar-fixed-bottom">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <a href="#" class="navbar-brand">Brand</a>
                </div>
                <!-- Collection of nav links and other content for toggling -->
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Login</a></li>
                </ul>
            </div>
        </nav>




    </body>
</html>
