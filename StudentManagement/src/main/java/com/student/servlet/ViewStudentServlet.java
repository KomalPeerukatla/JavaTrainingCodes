package com.student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.student.dao.StudentDAO;
import com.student.model.Student;

public class ViewStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();    

        out.println("<!DOCTYPE html>");
        out.println("<html>"); 

        // ================= HEAD =================

        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Student Details</title>");
        out.println("<link rel='stylesheet' href='css/style.css'>");
        out.println("</head>");

        // ================= BODY =================

        out.println("<body>");

        // ================= NAVBAR =================

        out.println("<nav class='navbar'>");

        out.println("<div class='logo'>");
        out.println("Komal institute of Technology");
        out.println("</div>");

        out.println("<div class='nav-links'>");
        out.println("<a href='index.html'>Home</a>");
        out.println("<a href='addStudent.html'>Add Student</a>");
        out.println("<a href='viewStudents'>View Students</a>");
        out.println("</div>");

        out.println("</nav>");

        // ================= CONTAINER =================

        out.println("<div class='container'>");

        out.println("<h1>Student Details</h1>");

        out.println("<table>");

        out.println("<tr>");
        out.println("<th>ID</th>");
        out.println("<th>Name</th>");
        out.println("<th>Age</th>");
        out.println("<th>Course</th>");
        out.println("<th>Actions</th>");
        out.println("</tr>");

        // ================= DISPLAY STUDENTS =================

        for (Student s : StudentDAO.getStudents()) {

            out.println("<tr>");  

            out.println("<td>" + s.getId() + "</td>");
            out.println("<td>" + s.getName() + "</td>");
            out.println("<td>" + s.getAge() + "</td>");
            out.println("<td>" + s.getCourse() + "</td>");

            out.println("<td>");

            // UPDATE BUTTON
            out.println("<a class='update-btn' href='editStudent?id="
                    + s.getId()
                    + "'>Update</a>");  

            out.println("&nbsp;&nbsp;");

            // DELETE BUTTON
            out.println("<a class='delete-btn' href='deleteStudent?id="
                    + s.getId()
                    + "' onclick=\"return confirm('Are you sure you want to delete this student?')\">Delete</a>");

            out.println("</td>");

            out.println("</tr>");
        }

        out.println("</table>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}