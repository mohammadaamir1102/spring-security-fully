package com.security.repo;

import com.security.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByStudentName(String studentName);
    Employee findByStudentGmail(String studentGmail);

}
