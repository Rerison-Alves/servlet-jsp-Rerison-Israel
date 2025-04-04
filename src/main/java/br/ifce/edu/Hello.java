package br.ifce.edu;

import br.ifce.edu.beans.Usuario;
import br.ifce.edu.utils.BeanUtilities;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "HelloServlet", value = "/Hello-servlet")
public class Hello extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        Usuario usuario = new Usuario();
        BeanUtilities.populateBean(usuario, request.getParameterMap());

        request.setAttribute("usuario", usuario);
        request.getRequestDispatcher("hello.jsp").forward(request, response);

    }

}