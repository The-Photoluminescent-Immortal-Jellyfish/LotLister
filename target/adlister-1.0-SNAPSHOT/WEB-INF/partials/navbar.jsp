<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header d-flex row w-25">
            <a class="navbar-brand btn btn-info col" role="button" href="${pageContext.request.contextPath}../ads">Lotlister</a><p class="col " style = "color: white">  <---- Click to add a lot</p>
        </div>
        <div class="navbar-header d-flex row w-25">
        <a class="navbar-brand btn btn-info col" role="button" href="${pageContext.request.contextPath}../ads">Lotlistings</a><p class="col " style = "color: white">  <---- Click to browse a lot</p>
        </div>
        <ul class="row nav navbar-nav navbar-right d-flex flex-row w-25 space-between">
            <li class = "col-4"><a href="${pageContext.request.contextPath}/login" class="btn btn-info" role="button">Login</a></li>
            <li class = "col-4"><a href="${pageContext.request.contextPath}/register" class="btn btn-info" role="button">Register</a></li>
            <li class = "col-4"><a href="${pageContext.request.contextPath}/logout" class="btn btn-info" role="button">Logout</a></li>
        </ul>
    </div>
</nav>
