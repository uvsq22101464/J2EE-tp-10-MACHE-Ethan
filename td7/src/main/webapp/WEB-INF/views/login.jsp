<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div align="center">
		<h2>Login</h2>
		<form:form action="${pageContext.request.contextPath}/login" method="post" modelAttribute="login">
			<table border="0" cellpadding="5">
				<tr>
					<td>Email:</td>
					<td><form:input path="mail" /></td>
				</tr>
				<tr>
					<td>Mot de passe:</td>
					<td><form:input path="password" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="login"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>