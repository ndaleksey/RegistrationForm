<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: alexeyshishkov
  Date: 09.04.18
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Users</title>
</head>
<body>
<h1>Registered Users</h1>

<table border="1">
	<thead>
	<tr>
		<td width="180">Id</td>
		<td>Name</td>
		<td>Age</td>
		<td>Country</td>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${users}" var="user">
		<tr>
			<td><c:out value="${user.id}"/></td>
			<td><c:out value="${user.name}"/></td>
			<td><c:out value="${user.age}"/></td>
			<td><c:out value="${user.country}"/></td>
		</tr>
	</c:forEach>
	</tbody>
	<a href="/users/newUser">
		<div>
			<p>Add new</p>
		</div>
	</a>
</table>
</body>
</html>
