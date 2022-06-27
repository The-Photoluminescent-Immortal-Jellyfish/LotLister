<%--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">--%>

<%--<nav class="navbar navbar-expand-lg navbar-dark bg-dark">--%>
<%--    <div class="container-fluid">--%>
<%--        <!-- Brand and toggle get grouped for better mobile display -->--%>
<%--        <div class="navbar-header d-flex row w-25">--%>
<%--            <a class="navbar-brand btn btn-info col" role="button" href="${pageContext.request.contextPath}../ads">Lotlister</a><p class="col " style = "color: white">  <---- Click to add a lot</p>--%>
<%--        </div>--%>
<%--        <div class="navbar-header d-flex row w-25">--%>
<%--        <a class="navbar-brand btn btn-info col" role="button" href="${pageContext.request.contextPath}../ads">Lotlistings</a><p class="col " style = "color: white">  <---- Click to browse a lot</p>--%>
<%--        </div>--%>
<%--        <ul class="row nav navbar-nav navbar-right d-flex flex-row w-25 space-between">--%>
<%--            <li class = "col-4"><a href="${pageContext.request.contextPath}/login" class="btn btn-info" role="button">Login</a></li>--%>
<%--            <li class = "col-4"><a href="${pageContext.request.contextPath}/register" class="btn btn-info" role="button">Register</a></li>--%>
<%--            <li class = "col-4"><a href="${pageContext.request.contextPath}/logout" class="btn btn-info" role="button">Logout</a></li>--%>
<%--        </ul>--%>
<%--    </div>--%>
<%--</nav>--%>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Montserrat+Alternates:wght@100&display=swap" rel="stylesheet">

<style>
    .body{
        background-color: lightsteelblue;
        font-family: 'Montserrat Alternates', sans-serif;
    }
    #form{
        float: right;
    }
    #header{
        align-content: start;
        font-size: 30px;
        font-family: 'Montserrat Alternates', sans-serif;
        font-weight: bold;
    }
</style>

<body class="body">
<nav class="navbar navbar-expand-lg navbar-inverse">
    <div class="float-left" id="icon-bar">

        <%--        I want to add an icon of some sort--%>
        <a class="navbar-brand" href="#" id="header">TULSA COUNTY LOTLISTER</a>
        <%--        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">--%>
        <%--            <span class="navbar-toggler-icon"></span>--%>
        <%--        </button>--%>
    </div>
    <div>
        <ul class="nav navbar-nav">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span> Profile</a></li>
            <li><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-log-in"></span> Login / Sign Up <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="${pageContext.request.contextPath}/login">Login</a></li>
                    <li><a href="${pageContext.request.contextPath}/register">Sign Up</a></li>
                </ul>
    </div>
    <div>

        <form action="" class="navbar-form" id="form">
            <div class="form-group">
                <div class="input-group">
                    <input type="search" name="search" id="" placeholder="Search Anything Here..." class="form-control">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span></span>
                </div>
            </div>
        </form>
    </div>
    </div>
</nav>
</body>









<%--<div>--%>
<%--                <div>--%>
<%--                    <ul class="row nav navbar-nav navbar-right d-flex flex-row w-25 space-between">--%>
<%--                                    <li><a href="${pageContext.request.contextPath}/login" class="btn btn-primary" role="button">Login</a></li>--%>
<%--                                    <li><a href="${pageContext.request.contextPath}/register" class="btn btn-primary" role="button">Register</a></li>--%>
<%--                                    <li><a href="${pageContext.request.contextPath}/logout" class="btn btn-primary" role="button">Logout</a></li>--%>
<%--                    </ul>--%>
<%--                    <ul class="nav navbar-nav">--%>
<%--                        <li>--%>
<%--                            <form action="" class="navbar-form d-flex">--%>
<%--                                <div class="form-group">--%>
<%--                                    <div class="input-group">--%>
<%--                                        <input type="search" name="search" id="" placeholder="Search Anything Here..." class="form-control">--%>
<%--                                        <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span></span>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </form>--%>
<%--                        </li>--%>
<%--                    </ul>--%>
<%--                </div>--%>
<%--            </div>--%>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>