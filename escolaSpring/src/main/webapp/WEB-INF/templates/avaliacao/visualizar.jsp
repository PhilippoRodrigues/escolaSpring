<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AvaliacaoLista</title>
    </head>
    <body>
        <h1>Lista completa das notas das avaliações</h1>
        ${avaliacao.getNota1()}
        <br />
        ${avaliacao.getNota2()}
        <br />
        ${avaliacao.getNota3()}
        <br />
        ${avaliacao.getMedia()}
        <br />
        ${avaliacao.getAluno().getSituacao()}
    </body>
</html>
