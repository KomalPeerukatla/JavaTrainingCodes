package com.student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.student.dao.StudentDAO;
import com.student.model.Student;

public class EditStudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Student s = StudentDAO.getStudentById(id);  

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");

        out.println("<head>");
        out.println("<title>Update Student</title>");
        out.println("<link rel='stylesheet' href='css/style.css'>");
        out.println("</head>");

        out.println("<body>");

        out.println("<div class='container'>");

        out.println("<h2>Update Student</h2>");

        out.println("<form action='updateStudent' method='post'>");

        out.println("<table>");

        out.println("<tr>");
        out.println("<td>ID</td>");
        out.println("<td>");
        out.println("<input type='number' name='id' value='"+s.getId()+"' readonly>");
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Name</td>");
        out.println("<td>");
        out.println("<input type='text' name='name' value='"+s.getName()+"'>");
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Age</td>");
        out.println("<td>");
        out.println("<input type='number' name='age' value='"+s.getAge()+"'>");
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Course</td>");
        out.println("<td>");
        out.println("<input type='text' name='course' value='"+s.getCourse()+"'>");
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td colspan='2'>");
        out.println("<input type='submit' value='Update Student'>");
        out.println("</td>");
        out.println("</tr>");

        out.println("</table>");

        out.println("</form>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");

    }

}