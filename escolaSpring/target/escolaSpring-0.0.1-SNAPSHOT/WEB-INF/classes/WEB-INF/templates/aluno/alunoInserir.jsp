<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alunos</title>
</head>
<body>

	<h1>Cadastrar Aluno</h1>

	<form:form action="/aluno/inserirAction/" method="post"
		modelAttribute="aluno">
		<fieldset>
			<legend>Dados do aluno:</legend>
			<label>Id:</label>
			<form:input path="id" />
			<label>Nome:</label>
			<form:input path="nome" />
			<label>Série:</label>
			<form:input path="serie" />
			<label>Faltas:</label>
			<form:input path="faltas" />
		</fieldset>
		
		<fieldset>
			<legend>Dados do aluno:</legend>
			<label>Turma:</label>
			<form:input path="turma.nome" />
		</fieldset>
		

		<br />
		<form:button>Salvar</form:button>
	</form:form>
</body>
</html>