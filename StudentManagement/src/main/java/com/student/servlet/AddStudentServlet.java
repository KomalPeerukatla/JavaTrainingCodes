package com.student.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StudentDAO;
import com.student.model.Student;

public class AddStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,  
                          HttpServletResponse response)
            throws ServletException, IOException {
  
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String course = request.getParameter("course");

        Student student = new Student(id, name, age, course);

        StudentDAO.addStudent(student);

        response.sendRedirect("viewStudents");
    }
}