<%@ page import="java.util.ArrayList" %>
<%@ page import="backend.models.MySqlLotsDao" %>
<%@ page import="backend.models.Lot" %><%--
  Created by IntelliJ IDEA.
  User: stout
  Date: 6/28/22
  Time: 8:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the ads!</h1>

    <jsp:useBean id="lots" scope="request" type="java.util.List"/>
    <c:forEach var="lot" items="${lots}">
        <div class="col-md-6">
            <h2>${lot.title}</h2>
            <p>${lot.description}</p>
        </div>
    </c:forEach>
</div>

</body>
</html>