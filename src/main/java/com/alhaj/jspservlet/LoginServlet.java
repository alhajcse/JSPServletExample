package com.alhaj.jspservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/login",name = "login")
public class LoginServlet extends HttpServlet {

    private String message;

    public void init() {
        message = "Hello World!";
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();

        String n=request.getParameter("email");
        String p=request.getParameter("password");

        if(n.equals("alhaj@gmail.com") && p.equals("123456")){

            System.out.println("Email "+n);
            System.out.println("Pass "+p);

            response.sendRedirect("welcome.jsp");


        }else {

            System.out.print("Wrong ");
            request.setAttribute("password",p);
            ServletContext context=getServletContext();
            RequestDispatcher dispatcher=context.getRequestDispatcher("/error.jsp");
            dispatcher.forward(request,response);

        }



        // out.close();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}