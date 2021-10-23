package com.security.service;


import com.security.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee savEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeByID(Long studentId);

    List<Employee> getEmployeeByName(String studentName);

    Employee updateEmployee(Employee employee, Long studentId);

    void deleteEmployeeById(Long studentId);
}
