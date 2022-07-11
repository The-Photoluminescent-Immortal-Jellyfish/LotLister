<%--@elvariable id="lot" type="org.w3c.dom.html.HTMLDocument"--%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="backend.models.MySqlLotsDao" %>
<%@ page import="backend.models.Lot" %>
<%@ page import="backend.models.DaoFactory" %>
<%@ page import="java.sql.SQLException" %><%--
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
    <h1>Here Are all the lots!</h1>
    <%try {
request.setAttribute("lots", DaoFactory.getLotsDao().all());} catch (SQLException e) {
    e.printStackTrace();
}%>
    <c:forEach var="lots" items="${lots.lot}">
    <div class="item">
        <h3>${lot.title}</h3>
<%--        <p>${lot.description}</p>--%>
<%--        <c:if test="${lot.isOnSale}">--%>
<%--            <p>This item is on sale!</p>--%>
<%--        </c:if>--%>
        </item>
        </c:forEach>

</div>
</body>
</html>