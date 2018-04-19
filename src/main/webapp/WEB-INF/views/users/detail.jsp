<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>${user.name} info</title>
</head>

<body>

<h1>
	<c:choose>
		<c:when test="${user eq null}">Unknown</c:when>
		<c:when test="${user ne null}">${user.name}</c:when>
	</c:choose>
	info
</h1>
<c:if test="${user ne null}">
	<img src="/resources/img/users/${user.name}.jpg" align="left" width="640" height="480" alt="${user.name}"/>
	<table>
		<tbody>
		<tr>
			<td><b>Name</b></td>
			<td>${user.name}</td>
		</tr>
		<tr>
			<td><b>Age</b></td>
			<td>${user.age}</td>
		</tr>
		<tr>
			<td><b>Country</b></td>
			<td>${user.country}</td>
		</tr>
		</tbody>
	</table>
</c:if>
</body>
</html>