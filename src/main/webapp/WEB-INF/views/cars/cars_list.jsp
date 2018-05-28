<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: alexeyshishkov
  Date: 28.05.18
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Car List</title>
	<link href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css" rel="stylesheet"/>
	<link href="<c:url value="/resources/css/style.css"/>" type="text/css" rel="stylesheet"/>
</head>
<body>

<%--<form:form method="post">
	<div class="form-group">
		<label for="searchInput"><spring:message code="car.search.page.title"/></label>
		<input type="text" class="form-control" id="searchInput" placeholder="<spring:message
		code="car.search.page.title"/>">
	</div>
	<form:button type="submit" class="btn btn-primary">Submit</form:button>
</form:form>--%>

<table class="table table-hover">
	<thead class="thead-dark">
	<tr>
		<th scope="col">VIN</th>
		<th scope="col">Color</th>
		<th scope="col">Year</th>
		<th scope="col">Name</th>
		<th scope="col">Engine</th>
		<th scope="col">Weight</th>
		<th scope="col">Price</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${cars}" var="car">
		<tr>
			<td>${car.vin}</td>
			<td>${car.color}</td>
			<td>${car.year}</td>
			<td>${car.name}</td>
			<td>${car.engine}</td>
			<td>${car.weight}</td>
			<td>${car.price}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

<script href="<c:url value="/resources/js/bootstrap.min.js"/> "/>
</body>
</html>