package com.Lakpa.StudentManagementSystem2.Service;

import com.Lakpa.StudentManagementSystem2.Model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();

    void saveTeacher(Teacher teacher);

    Teacher getTeacherById(int id);

    void deleteTeacherById(int id);

}
