<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AlunosLista</title>
    </head>
    <body>
        <h1>Lista completa de alunos</h1>
        ${aluno.getNome()}
        <br />
        ${aluno.getSerie()}
        <br />
        ${aluno.getTurma().getNome()}
    </body>
</html>
