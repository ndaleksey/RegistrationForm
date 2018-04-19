<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: alexeyshishkov
  Date: 18.04.18
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
	<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body>

<form action="<c:url value="/users/search"/>" method="get">
	<fieldset>
		<legend>Search user</legend>
		<table>
			<tr>
				<td><label for="name">Name</label></td>
				<td><input id="name" name="name"/></td>
				<td>
					<button>Search</button>
				</td>
			</tr>
		</table>
	</fieldset>
</form>

<c:if test="${not empty userList}">
	<table>
		<thead>
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Country</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td><a href="<c:url value="/users/detail/${user.id}"/>"/>${user.name}</td>
				<td>${user.age}"</td>
				<td>${user.country}"</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>
</body>
</html>
