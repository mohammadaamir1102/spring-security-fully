package com.security.repo;

import com.security.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByStudentName(String studentName);

}
