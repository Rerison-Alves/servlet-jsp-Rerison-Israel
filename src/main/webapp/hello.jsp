<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="br.ifce.edu.beans.Usuario" %>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
    <%
        Usuario usuario = (Usuario) request.getAttribute("usuario");
    %>
    <p> Olá : <%= usuario.getNome() %> : <%= usuario.getCpf() %></p>
</body>
</html>
}