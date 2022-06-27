<%--
  Created by IntelliJ IDEA.
  User: stout
  Date: 6/24/22
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
        <jsp:include page="/WEB-INF/partials/head.jsp">
            <jsp:param name="title" value="Viewing All The Ads" />
        </jsp:include>
    <title>Title</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<div class = "container">
    <h1>Type a Lot.</h1>
    <div class = "row">
<form action="${pageContext.request.contextPath}/crudad" method="post">
    <div class = "row">

    <div class = "col">
    <%--    this.title = title;--%>
    <div class="form-group">
        <label for="title">title</label>
        <input id="title" name="title" class="form-control" type="text">
    </div>
    <%--    this.description = description;--%>
    <div class="form-group">
        <label for="description">description</label>
        <input id="description" name="description" class="form-control" type="text">
    </div>
    <%--    this.street_number = street_number;--%>
    <div class="form-group">
        <label for="street_number">street_number</label>
        <input id="street_number" name="street_number" class="form-control" type="text">
    </div>
    <%--    this.street_name = street_name;--%>
    <div class="form-group">
        <label for="street_name">street_name</label>
        <input id="street_name" name="street_name" class="form-control" type="text">
    </div>
    <%--    this.username = username;--%>
    <div class="form-group">
        <label for="username">username</label>
        <input id="username" name="username" class="form-control" type="text">
    </div>
<%--    this.email = email;--%>
    <div class="form-group">
        <label for="email">email</label>
        <input id="email" name="email" class="form-control" type="text">
    </div>
</div>
<div class = "col">
<%--    this.appraisal = appraisal;--%>
    <div class="form-group">
        <label for="appraisal">appraisal</label>
        <input id="appraisal" name="appraisal" class="form-control" type="text">
    </div>
<%--    this.sale_price = sale_price;--%>
    <div class="form-group">
        <label for="sale_price">sale_price</label>
        <input id="sale_price" name="sale_price" class="form-control" type="text">
    </div>
<%--    this.listing_name = listing_name;--%>

<%--    this.city = city;--%>
    <div class="form-group">
        <label for="city">city</label>
        <input id="city" name="city" class="form-control" type="text">
    </div>
<%--    this.state = state;--%>
    <div class="form-group">
        <label for="state">state</label>
        <input id="state" name="state" class="form-control" type="text">
    </div>
<%--    this.gov_org = gov_org;--%>
    <div class="form-group">
        <label for="gov_org">gov_org</label>
        <input id="gov_org" name="gov_org" class="form-control" type="text">

    </div>
    <div class="input-group col">
        <div class="input-group-prepend">
            <div class="input-group-text">
                <input type="radio" aria-label="Real Estate" name="real_estate">
                <input type="radio" aria-label="Auto" name="auto">
                <input type="radio" aria-label="Artwork" name="artwork">
            </div>
        </div>
        <input type="text" class="form-control" aria-label="Text input with radio button">
    </div>
    <div class = "form-group">
        <input type="submit" class="btn btn-primary btn-block">
    </div>
</div>
    </div>
</form>
</div>
</div>
</body>
</html>