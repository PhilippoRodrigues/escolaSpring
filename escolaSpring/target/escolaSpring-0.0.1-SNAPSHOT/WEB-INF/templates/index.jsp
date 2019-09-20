<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<h2>${mensagem}</h2>
	<form method="post"
		action="${pageContext.request.contextPath}/usuario/login">
		<label>Usuário</label><input name="username" /> 
		<label>Senha</label>
		<input type="password" name="password" /> 
		<input type="submit" value="Logar" />
	</form>
</body>
</html>
