<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Hello World!</h1>
	${aluno.getId()}
	<br /> 
	${aluno.getNome()}
	<br />

	<!-- o idFeal é usar o if para relacionamentos não obrigatorios, como o caso de pessoa-habilitacao -->

	<!-- ${aluno.getNota().getTotal()} -->

</body>
</html>