
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>App | Home</title>
        <!-- Bootstrap Core CSS -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>

        <!-- Custom CSS -->
        <link type="text/css" rel="stylesheet" href="css/grayscale.css"/>

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="http://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet" type="text/css">
        <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    </head>
    <body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">
        <!-- Navigation -->
        <nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                        <i class="fa fa-bars"></i>
                    </button>
                    <a class="navbar-brand page-scroll" href="#page-top">
                        <i class="fa fa-play-circle"></i> Welcome To My Page
                    </a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
                    <ul class="nav navbar-nav">
                        <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                        <li class="hidden">
                            <a href="#page-top"></a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#about">About</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#download">Contact</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#contact">Login</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>

        <!-- Intro Header -->
        <header class="intro">
            <div class="intro-body">
                <div class="container">
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">
                            <h1 class="brand-heading">Inventory</h1>
                            <p class="intro-text">It Includes info about all customers.<br>It Manages all customer transactions.</p>
                            <a href="#about" class="btn btn-circle page-scroll">
                                <i class="fa fa-angle-double-down animated"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </header>

        <!-- About Section -->
        <section id="about" class="container content-section text-center">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <h2>About Project</h2>
                    <p>Grayscale is a free Bootstrap 3 theme created by Start Bootstrap. It can be yours right now, simply download the template on <a href="http://startbootstrap.com/template-overviews/grayscale/">the preview page</a>. The theme is open source, and you can use it for any purpose, personal or commercial.</p>
                    <p>This theme features stock photos by <a href="http://gratisography.com/">Gratisography</a> along with a custom Google Maps skin courtesy of <a href="http://snazzymaps.com/">Snazzy Maps</a>.</p>
                    <p>Grayscale includes full HTML, CSS, and custom JavaScript files along with LESS files for easy customization.</p>
                </div>
            </div>
        </section>

        <!-- Download Section -->
        <section id="download" class="content-section text-center">
            <div class="download-section">
                <div class="container">
                    <div class="col-lg-8 col-lg-offset-2">
                        <h2>Download Grayscale</h2>
                        <p>You can download Grayscale for free on the preview page at Start Bootstrap.</p>
                        <a href="http://startbootstrap.com/template-overviews/grayscale/" class="btn btn-default btn-lg">Visit Download Page</a>
                    </div>
                </div>
            </div>
        </section>

        <!-- Contact Section -->
        <section id="contact" class="container content-section text-center">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <h2>Please Enter The Following Details To Login</h2>
                    <form method="post" action="${pageContext.request.contextPath}/login">
                        <div class="form-group" style="text-align: left;">
                            <label>Username</label>
                            <input type="text" class="form-control" id="username" 
                                   name="username" placeholder="Username"/>
                        </div>
                        <div class="form-group" style="text-align: left;">
                            <label >Password</label>
                            <input type="password" class="form-control" id="password" 
                                   name="password" placeholder="Password"/>
                        </div>
                        <input type="submit" value="Login" class="btn btn-default btn-lg"/>
                        <input type="reset" value="Clear" class="btn btn-default btn-lg"/>
                    </form>
                </div>
            </div>
            <c:if test="${not empty status}">
                <p><c:out value="${status}"/></p>
            </c:if>

        </section>

        <!-- Map Section -->
        <div id="map"></div>

        <!-- Footer -->
        <footer>
            <div class="container text-center">
                <p>Copyright &copy; Ravi </p>
            </div>
        </footer>

        <!-- jQuery -->
        <script type="text/javascript" src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script type="text/javascript" src="js/bootstrap.min.js"></script>

        <!-- Plugin JavaScript -->
        <script type="text/javascript" src="js/jquery.easing.min.js"></script>

        <!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
        <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRngKslUGJTlibkQ3FkfTxj3Xss1UlZDA&sensor=false"></script>

        <!-- Custom Theme JavaScript -->
        <script type="text/javascript" src="js/grayscale.js"></script>

    </body>

</html>
