<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Alterar informações das avaliações</h1>
<form:form action="/avaliacao/alterarAction" method="post"
	modelAttribute="avaliacao">
	<form:hidden path="id" />
	<fieldset>
		<legend>Informações das avaliações:</legend>
		<label>Avaliação 1:</label>
		<form:input path="nota" />
		<label>Avaliação 2:</label>
		<form:input path="nota" />
	</fieldset>
	<form:button>Alterar</form:button>
</form:form>
