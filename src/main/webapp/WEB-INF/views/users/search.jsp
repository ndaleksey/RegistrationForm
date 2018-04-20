<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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

<form:form method="get" modelAttribute="userSearchCriteria" action="search">
	<fieldset>
		<legend><spring:message code="user.Search_criteria"/></legend>
		<table>
			<tr>
				<td><form:label path="name"><spring:message code="user.Name"></spring:message></form:label></td>
				<td><form:input path="name"/></td>
				<td>
					<button><spring:message code="Search"/></button>
				</td>
			</tr>
		</table>
	</fieldset>
</form:form>

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
