<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <title>Carrinho de Compras</title>
</head>
<body>
<h2>Adicionar Produto ao Carrinho</h2>
<form action="Carrinho" method="post">
    <input type="text" name="produto" placeholder="Nome do Produto" required>
    <button type="submit">Adicionar</button>
</form>

<h2>Produtos no Carrinho</h2>
<ul>
    <%
        ArrayList<String> carrinho = (ArrayList<String>) session.getAttribute("carrinho");
        if (carrinho != null && !carrinho.isEmpty()) {
            for (int i = 0; i < carrinho.size(); i++) {
    %>
        <li>
            <%= carrinho.get(i) %>
            <a href="Carrinho?remover=<%= i %>"> ― </a>
        </li>
    <%
        }
    } else {
    %>
    <li>O carrinho está vazio.</li>
    <%
        }
    %>
</ul>
</body>
</html>
