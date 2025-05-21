package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/actor")
public class ActorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String lang = req.getParameter("lang");
        String salary = req.getParameter("salary");
        String blockbusters = req.getParameter("blockbusters");
        String flops = req.getParameter("flops");
        String upcomingMovie = req.getParameter("upcomingMovie");
        String producer = req.getParameter("producer");
        String director = req.getParameter("director");
        String budget = req.getParameter("budget");

        out.println("<h2>Actor Data Received Successfully!</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Language: " + lang + "</p>");
        out.println("<p>Salary: " + salary + "</p>");
        out.println("<p>Blockbusters: " + blockbusters + "</p>");
        out.println("<p>Flops: " + flops + "</p>");
        out.println("<p>Upcoming Movie: " + upcomingMovie + "</p>");
        out.println("<p>Producer: " + producer + "</p>");
        out.println("<p>Director: " + director + "</p>");
        out.println("<p>Budget: " + budget + "</p>");
    }
}
