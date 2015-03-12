<%-- 
    Document   : menu1
    Created on : Mar 12, 2015, 10:14:37 AM
    Author     : Vinnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>App | HOME</title>
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <style type="text/css">

            body {
                padding-top: 70px; /* Required padding for .navbar-fixed-top. Remove if using .navbar-static-top. Change if height of navigation changes. */
            }

            .hero-spacer {
                margin-top: 30px;
            }

            .hero-feature {
                margin-bottom: 30px;
            }

            footer {
                margin: 50px 0;
            }
        </style>
        <script type="text/javascript">
            $(document).ready(function() {
                var date = new Date();
                var twoDigitMonth = date.getMonth() + "";
                if (twoDigitMonth.length == 1)
                    twoDigitMonth = "0" + twoDigitMonth;
                var twoDigitDate = date.getDate() + "";
                if (twoDigitDate.length == 1)
                    twoDigitDate = "0" + twoDigitDate;
                $('.dateSpan').html(twoDigitDate + "-" + twoDigitMonth + "-" + date.getFullYear());
            });
        </script>
    </head>

    <body>
        <c:if test="${empty Admin}">
            <c:redirect url="home.jsp"/>
        </c:if>
        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Date: <span class="dateSpan"></span></a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="#">About</a>
                        </li>
                        <li>
                            <a href="#">Services</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/logout">Logout</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>

        <!-- Page Content -->
        <div class="container">

            <!-- Jumbotron Header -->
            <header class="jumbotron hero-spacer">
                <h3>A Warm Welcome!</h3>
            </header>

            <hr>

            <!-- Title -->
            <div class="row">
                <div class="col-lg-12">
                    <h3>Latest Features</h3>
                </div>
            </div>
            <!-- /.row -->

            <!-- Page Features -->
            <div class="row text-center">

                <div class="col-md-3 col-sm-6 hero-feature">
                    <div class="thumbnail">
                        <img src="img/customer.jpg" alt="Customer">
                        <div class="caption">
                            <a class="btn btn-success" href="${pageContext.request.contextPath}/customerMenu.jsp">Customer Module</a>
                        </div>
                    </div>
                </div>

                <div class="col-md-3 col-sm-6 hero-feature">
                    <div class="thumbnail">
                        <img src="img/store.jpg" alt="Store">
                        <div class="caption">
                            <a class="btn btn-success" href="${pageContext.request.contextPath}/storeMenu.jsp">Store Module</a>
                        </div>
                    </div>
                </div>

                <div class="col-md-3 col-sm-6 hero-feature">
                    <div class="thumbnail">
                        <img src="img/factory.jpg" alt="Factory">
                        <div class="caption">
                            <a class="btn btn-success">Factory Module</a>
                        </div>
                    </div>
                </div>

                <div class="col-md-3 col-sm-6 hero-feature">
                    <div class="thumbnail">
                        <img src="http://placehold.it/800x500" alt="">
                        <div class="caption">
                            <a class="btn btn-success">Others Module</a>
                        </div>
                    </div>
                </div>

            </div>
            <!-- /.row -->

            <hr>

            <!-- Footer -->
            <footer>
                <div class="row">

                    <p>Copyright &copy; Ravi</p>

                </div>
            </footer>

        </div>
        <!-- /.container -->

</html>
