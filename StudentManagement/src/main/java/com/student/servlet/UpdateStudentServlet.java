package com.student.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.student.dao.StudentDAO;
import com.student.model.Student;

public class UpdateStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        String name = request.getParameter("name");

        int age = Integer.parseInt(request.getParameter("age"));

        String course = request.getParameter("course");

        Student student =
                new Student(id,name,age,course);

        StudentDAO.updateStudent(student);

        response.sendRedirect("viewStudents");

    }

}