<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ProfessoresLista</title>
    </head>
    <body>
        <h1>Lista completa de professores</h1>
        ${professor.getNome()}
        <br />
        ${professor.getDisciplina().getNome()}
    </body>
</html>
