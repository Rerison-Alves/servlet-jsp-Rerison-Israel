package br.ifce.edu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CarrinhoServlet", value = "/Carrinho")
public class Carrinho extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ArrayList<String> carrinho = (ArrayList<String>) session.getAttribute("carrinho");

        if (carrinho != null) {
            String indexStr = request.getParameter("remover");
            if (indexStr != null) {
                try {
                    int index = Integer.parseInt(indexStr);
                    carrinho.remove(index);
                } catch (Exception e) {

                }
            }
        }
        response.sendRedirect("carrinho.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ArrayList<String> carrinho = (ArrayList<String>) session.getAttribute("carrinho");

        if (carrinho == null) {
            carrinho = new ArrayList<>();
            session.setAttribute("carrinho", carrinho);
        }

        String produto = request.getParameter("produto");
        if (produto != null && !produto.trim().isEmpty()) {
            carrinho.add(produto);
        }

        response.sendRedirect("carrinho.jsp");
    }
}