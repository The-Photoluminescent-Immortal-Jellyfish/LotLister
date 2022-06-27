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

<style>
    .body{
        background-color: lightsteelblue;
    }

</style>
<body class="body">
<div class="navbar navbar-inverse d-flex row">
    <div class="container-fluid">
        <div class="row">
            <div>

                <div class="navbar-header">
                    <button class="navbar-toggle" data-target="#mobile_menu" data-toggle="collapse"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                    <a href="#" class="navbar-brand">LOTLISTER</a>
                </div>

                <div>
                    <ul class="row nav navbar-nav navbar-right d-flex flex-row w-25 space-between">
                                    <li><a href="${pageContext.request.contextPath}/login" class="btn btn-primary" role="button">Login</a></li>
                                    <li><a href="${pageContext.request.contextPath}/register" class="btn btn-primary" role="button">Register</a></li>
                                    <li><a href="${pageContext.request.contextPath}/logout" class="btn btn-primary" role="button">Logout</a></li>
                    </ul>
                    <ul class="nav navbar-nav">
                        <li>
                            <form action="" class="navbar-form">
                                <div class="form-group">
                                    <div class="input-group">
                                        <%--@declare id="search"--%><label for="search"></label><input type="search" name="search" id="search" placeholder="Search Anything Here..." class="form-control">
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span></span>
                                    </div>
                                </div>
                            </form>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

