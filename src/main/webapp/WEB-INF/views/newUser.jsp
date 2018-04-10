<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: alexeyshishkov
  Date: 09.04.18
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>New User Form</title>
</head>
<body>


<form:form method="post" modelAttribute="user" action="newUser">
	<table>
		<tr>
			<td><b>Name:</b></td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td><b>Age:</b></td>
			<td><form:input path="age"/></td>
		</tr>
		<tr>
			<td><b>Country:</b></td>
			<td><form:input path="country"/></td>
		</tr>
	</table>

	<form:button name="AddUser" value="Add">Add</form:button>
</form:form>
</body>
</html>
