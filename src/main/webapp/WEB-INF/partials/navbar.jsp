<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Montserrat+Alternates:wght@100&display=swap" rel="stylesheet">

<style>
    .body{
        background-color: lightsteelblue;
        font-family: 'Montserrat Alternates', sans-serif;
    }
    #header{
        font-size: 55px;
        font-family: 'Montserrat Alternates', sans-serif;
        font-weight: bold;
    }
    .navbar{
        min-height: 180px;
        justify-content: space-between;
    }
    .icons{
        font-size: 35px;
    }
    .navbar-form{

    }
</style>

<body class="body">
<nav class="navbar navbar-expand-lg navbar-inverse">
    <div class="float-left" id="icon-bar">
            <a class="navbar-brand" href="#" id="header"><span class="glyphicon glyphicon-tags"></span>    TULSA COUNTY LOTLISTER</a>
    </div>
    <div class="icons">
        <ul class="nav navbar-nav">
            <li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-user"></span> Login</a></li>
            <li><a href="${pageContext.request.contextPath}/register"><span class="glyphicon glyphicon-send"></span> Sign Up</a></li>
        </ul>
    </div>
    <div>
        <form action="" class="navbar-form">
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

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>