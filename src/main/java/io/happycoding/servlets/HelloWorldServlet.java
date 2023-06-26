package io.happycoding.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
/*
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
*/
public class HelloWorldServlet extends HttpServlet {
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws IOException {
response.setContentType("text/html;");
response.getWriter().println("<h1>Hello world from within Maven throught /manager/text using curl x2! </h1>");
}
}
