<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Home" />
    </jsp:include>
</head>
<body>

<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <div class="row">
        <div>
            <form class="" action="${pageContext.request.contextPath}/ads" method="Post">
                <a class="home-list w-text" href="/category?value=0">View all available listings! </a>
            </form>
        </div>
    </div>
</div>


</div>
</body>
</html>