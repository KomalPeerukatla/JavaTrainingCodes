package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.demo.model.Student;
import com.demo.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/add")
    public String addStudentPage() {
        return "addStudent";
    }

    @RequestMapping(value="/save",method=RequestMethod.POST)
    public String save(@RequestParam int id,
                       @RequestParam String name) {

        Student s = new Student(id, name);

        service.save(s);

        return "redirect:/students";
    }

    @RequestMapping("/students")
    public String students(Model model) {

        model.addAttribute("list",
                service.getAllStudents());

        return "students";
    }

}
