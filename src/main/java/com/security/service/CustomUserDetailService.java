package com.security.service;

import com.security.entity.Employee;
import com.security.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String studentGmail) throws UsernameNotFoundException {
        Employee byStudentGmail = employeeRepository.findByStudentGmail(studentGmail);
        if (byStudentGmail == null)
            throw new UsernameNotFoundException("user not found with Gmail " + studentGmail);

        return new User(byStudentGmail.getStudentGmail(), byStudentGmail.getStudentPassword(), new ArrayList<>());

    }
}
