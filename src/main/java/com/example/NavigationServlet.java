package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
@WebServlet("/navigation")
public class NavigationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();

        try (BufferedReader br = new BufferedReader(new FileReader(new File("/Users/alina/Desktop/Java/Servlet/Zadacha_29_2_2/logging.log")))) {
            String text = br.readLine();
            while (text != null) {
                writer.println("<p>" + br.readLine() + "</p>");
                text = br.readLine();
            }
        } catch (IOException e) {
            writer.println("Something went wrong");
        }
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
