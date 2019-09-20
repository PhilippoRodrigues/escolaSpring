<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Disciplinas</title>
</head>
<body>

	<h1>Cadastro de disciplinas</h1>
	<form:form action="/disciplina/inserirAction/" method="post" modelAttribute="disciplina">
		<fieldset>
			<legend>Dados da disciplina:</legend>
			<label>Id:</label>
			<form:input path="id" />
			<label>Nome:</label>
			<form:input path="nome" />
		</fieldset>


		<fieldset>
			<legend>Dados da disciplina:</legend>
			<label>Id do Professor:</label>
			<form:input path="professor.id" />
			<label>Nome do Professor:</label>
			<form:input path="professor.nome" />
		</fieldset>

		<br />
		<form:button>Salvar</form:button>
	</form:form>

</body>
</html>