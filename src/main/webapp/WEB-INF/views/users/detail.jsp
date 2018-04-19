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
	<table>
		<thead>
		<th>Name</th>
		<th>Age</th>
		<th>Country</th>
		</thead>
		<tbody>
		<tr>
			<td>${user.name}</td>
			<td>${user.age}</td>
			<td>${user.country}</td>
		</tr>
		</tbody>
	</table>
</c:if>
</body>
</html>