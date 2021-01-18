package com.Lakpa.StudentManagementSystem2.Repository;

import com.Lakpa.StudentManagementSystem2.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
