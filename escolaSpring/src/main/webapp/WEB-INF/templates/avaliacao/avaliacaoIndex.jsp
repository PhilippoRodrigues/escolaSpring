<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Notas das avaliações</title>

<script>
	function remover(mensagem, url) {
		if (confirm(mensagem)) {
			window.location = url;
		}
	}
</script>
</head>
<body>

	<a href="/avaliacao/avaliacaoInserir">Inserir nota</a>

	<table border>
		<tr>
			<th>Avaliação 1</th>
			<th>Avaliação 2</th>
			<th>Aluno</th>
		</tr>
		<c:forEach items="${avaliacoes}" var="avaliacao">
			<tr>
				<td>${avaliacao.getAluno().getNome()}</td>
				<td>${avaliacao.getAluno().calcularMedia()}</td>
<%-- 				<td>${avaliacao.getNota()}</td> --%>
<%-- 				<td>${(aluno.avaliacoes.getNotas() != null) --%>
<%-- 				    ? aluno.getAvaliacoes().getNota() --%>
<%-- 				    : "-"  --%>
<%-- 				    } --%>
<!-- 				</td> -->
				<!--                     <td> -->
				<%--                         <a href="/veiculo/porProprietario/${pessoa.getId()}">Veículos</a> --%>
				<!--                     </td> -->
				<!--                     <td> -->
				<%--                         <a href="${pageContext.request.contextPath}/veiculo/porProprietario/${pessoa.getId()}">Veículos</a> --%>
				<!--                     </td> -->
				<td><a
					href="${pageContext.request.contextPath}/avaliacao/alterarAvaliacao/${avaliacao.getId()}">Alterar</a>
					&nbsp; <a href="#"
					onclick="remover('Deseja Remover?', '${pageContext.request.contextPath}/avaliacao/removerAvaliacao/${avaliacao.getId()}')">Remover</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
