<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: alexeyshishkov
  Date: 20.04.18
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title><spring:message code="car.search.page.title"/></title>
	<link href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css" rel="stylesheet"/>
	<link href="<c:url value="/resources/css/style.css"/>" type="text/css" rel="stylesheet"/>
</head>
<body>
<form:form method="get">
	<fieldset>
		<legend><spring:message code="search.criteria"/></legend>

		<table>
			<tr>
				<td><b><form:label path="name"/></b></td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td colspan="2"><form:button><spring:message code="search"/></form:button></td>
			</tr>
		</table>
	</fieldset>
</form:form>

<script href="<c:url value="/resources/js/bootstrap.min.js"/> "/>
</body>
</html>
