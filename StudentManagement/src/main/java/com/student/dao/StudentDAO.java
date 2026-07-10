package com.student.dao;

import java.util.ArrayList;
import com.student.model.Student;

public class StudentDAO {

    private static ArrayList<Student> students = new ArrayList<>();

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
    public static Student getStudentById(int id) {

        for(Student s : students) {

            if(s.getId() == id) {
                return s;
            }

        }

        return null;
    }

    public static void updateStudent(Student student) {

        for(Student s : students) {

            if(s.getId() == student.getId()) {

                s.setName(student.getName());
                s.setAge(student.getAge());
                s.setCourse(student.getCourse());

                break;
            }
        }

    }
    public static void deleteStudent(int id) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getId() == id) {

                students.remove(i);

                break;
            }
        }

    }

}