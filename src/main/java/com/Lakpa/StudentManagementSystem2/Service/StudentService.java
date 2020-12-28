package com.Lakpa.StudentManagementSystem2.Service;

import com.Lakpa.StudentManagementSystem2.Model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudentById(int id);

    void deleteStudentById(int id);

}
