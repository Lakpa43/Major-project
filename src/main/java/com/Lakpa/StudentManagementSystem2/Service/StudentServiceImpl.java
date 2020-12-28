package com.Lakpa.StudentManagementSystem2.Service;

import com.Lakpa.StudentManagementSystem2.Model.Student;
import com.Lakpa.StudentManagementSystem2.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        Optional<Student> optional = studentRepository.findById(id);
        Student student = null;
        if(optional.isPresent()) {
            student = optional.get();
        }else {
            throw new RuntimeException("Student not found");
        }
        return student;
    }

    @Override
    public void deleteStudentById(int id) {
        this.studentRepository.deleteById(id);
    }
}
