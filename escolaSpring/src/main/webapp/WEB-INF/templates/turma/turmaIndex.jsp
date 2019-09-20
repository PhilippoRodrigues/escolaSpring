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
	<h2>
		<b>Turmas</b>
	</h2>
	<a href="/">Voltar ao Menu principal</a>

	<table border>
		<tr>
			<th>Id</th>
			<th>Turma</th>
		</tr>
		<c:forEach items="${turmas}" var="turma">
			<tr>
<%-- 				<td>${turma.aluno.nome}</td> --%>
				<td>${turma.getId()}</td>
				<td>${turma.getNome()}</td>
				<td><a
					href="${pageContext.request.contextPath}/turma/alterarTurma/${turma.getId()}">Alterar</a>
					&nbsp; <a href="#"
					onclick="remover('Deseja Remover?', '${pageContext.request.contextPath}/turma/removerTurma/${turma.getId()}')">Remover</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
