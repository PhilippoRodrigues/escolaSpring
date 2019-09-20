<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Inserir notas dos alunos</h1>
<form:form action="/avaliacao/inserirAction" method="post"
	modelAttribute="avaliacao">
	<fieldset>
		<legend>Notas:</legend>
		<label>Avaliação 1:</label>
		<form:input path="nota" />
		<label>Avaliação 2:</label>
		<form:input path="nota" />
	</fieldset>
	<fieldset>
		<legend>Informações adicionais</legend>
		<label>Aluno:</label>
		<form:input path="aluno.nome" />
	</fieldset>

	<form:button>Cadastrar</form:button>
</form:form>
