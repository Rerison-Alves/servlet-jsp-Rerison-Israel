package br.ifce.edu;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.ServletException;

@WebServlet(name = "MainServlet", value = "/Main-servlet")
public class Main extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        RequestDispatcher dispatcher = request.getRequestDispatcher("formlogin.html");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeUsuario = request.getParameter("usuario");
        String senhaUsuario = request.getParameter("senha");

        PrintWriter out = response.getWriter();
        if (nomeUsuario.equals("admin") && senhaUsuario.equals("123")) {
            request.getSession().setAttribute("usuario",nomeUsuario);
            response.sendRedirect("email.jsp");
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("formlogin.html");
            dispatcher.forward(request, response);
        }
    }

    public void destroy() {
    }
}