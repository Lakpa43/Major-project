package com.Lakpa.StudentManagementSystem2.Service;

import com.Lakpa.StudentManagementSystem2.Model.Teacher;
import com.Lakpa.StudentManagementSystem2.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        this.teacherRepository.save(teacher);
    }

    @Override
    public Teacher getTeacherById(int id) {
        Optional<Teacher> optional = teacherRepository.findById(id);
        Teacher teacher = null;
        if(optional.isPresent()) {
            teacher = optional.get();
        }else {
            throw new RuntimeException("Teacher not found");
        }
        return teacher;    }

    @Override
    public void deleteTeacherById(int id) {
        this.teacherRepository.deleteById(id);
    }
}
