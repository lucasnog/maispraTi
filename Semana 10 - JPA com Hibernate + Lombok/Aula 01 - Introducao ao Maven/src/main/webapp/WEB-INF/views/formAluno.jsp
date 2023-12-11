<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Aluno" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Aluno</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<%
        Aluno aluno = (Aluno) request.getAttribute("aluno");
        String nome = aluno != null ? aluno.getNome() : "";
        String idade = aluno != null ? aluno.getIdade().toString() : "";
        String id = aluno != null ? aluno.getId().toString() : "";
    %>
    <div class="container">
        <h1><%= aluno != null ? "Editar Aluno" : "Cadastrar Aluno" %></h1>
        <form action="/ProjetoMaven/aluno" method="post">
        	<input type="hidden" name="id" value="<%= id %>">
            <div class="mb-3">
                <label for="nome" class="form-label">Nome:</label>
                <input type="text" class="form-control" id="nome" name="nome" value="<%= nome %>" required>
            </div>
            <div class="mb-3">
                <label for="idade" class="form-label">Idade:</label>
                <input type="number" class="form-control" id="idade" name="idade" value="<%= idade %>" required>
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>