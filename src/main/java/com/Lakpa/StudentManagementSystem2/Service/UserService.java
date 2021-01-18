package com.Lakpa.StudentManagementSystem2.Service;

import com.Lakpa.StudentManagementSystem2.Model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistration userRegistration);
}
