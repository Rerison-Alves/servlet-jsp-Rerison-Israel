package br.ifce.edu;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PagMailServlet", value = "/PagMail")
public class PagMail extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = (String) request.getSession().getAttribute("usuario");

        if (user == null) {
            RequestDispatcher dispatcher =  request.getRequestDispatcher("Main-servlet");
            dispatcher.forward(request, response);
        }
    }

}