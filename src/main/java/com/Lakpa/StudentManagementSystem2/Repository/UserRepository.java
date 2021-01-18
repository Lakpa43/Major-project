package com.Lakpa.StudentManagementSystem2.Repository;

import com.Lakpa.StudentManagementSystem2.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
