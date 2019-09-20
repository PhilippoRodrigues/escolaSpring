<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Alterar informações do professor</h1>
<form:form action="/professor/alterarAction" method="post"
	modelAttribute="professor">
	<form:hidden path="id" />
	<fieldset>
		<legend>Informações do professor:</legend>
		<label>Nome:</label>
		<form:input path="nome" />
	</fieldset>
	<fieldset>
		<legend>Informações adicionais</legend>
		<label>Disciplina:</label>
		<form:input path="disciplina.nome" />
	</fieldset>

	<form:button>Alterar</form:button>
</form:form>
