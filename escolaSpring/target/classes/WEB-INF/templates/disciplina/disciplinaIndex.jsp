<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<script>
	function remover(mensagem, url) {
		if (confirm(mensagem)) {
			window.location = url;
		}
	}
</script>
</head>
<body>
	<h2><b>Lista de alunos</b></h2>
	<a href="/">Voltar ao Menu principal</a>
	<a href="/disciplina/disciplinaInserir">Inserir disciplina</a>

	<table border>
		<tr>
			<th>Nome</th>
			<th>Professor</th>
		</tr>
		<c:forEach items="${disciplinas}" var="disciplina">
			<tr>
				<td>${disciplina.getNome()}</td>
				<td>${disciplina.getProfessor().getNome()}</td>
				<%--                         ${(aluno.getTurma() != null) --%>
				<%--                           ? aluno.getTurma().getNome() --%>
				<%--                           : "-" --%>
				<%--                         } --%>
				<!--                     </td> -->
				<!--                     <td> -->
				<%--                         <a href="/veiculo/porProprietario/${pessoa.getId()}">Veículos</a> --%>
				<!--                     </td> -->
				<td><a
					href="${pageContext.request.contextPath}/disciplina/alterarDisciplina/${disciplina.getId()}">Alterar</a>
					&nbsp; <a href="#"
					onclick="remover('Deseja Remover?', '${pageContext.request.contextPath}/disciplina/removerDisciplina/${disciplina.getId()}')">Remover</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
