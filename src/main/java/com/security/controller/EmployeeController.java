package com.security.controller;

import com.security.entity.Employee;
import com.security.service.EmployeeService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    // build create employee REST API
    @PostMapping("/employee")
    public ResponseEntity<Employee> savEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.savEmployee(employee), HttpStatus.CREATED);
    }

    // get All Employee
    @GetMapping("/get-employee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();

    }

    //get Record based id
    @GetMapping("/get-id/{id}")
    public ResponseEntity<Employee> getEmployeeByID(@PathVariable("id") Long studentId) {
        return new ResponseEntity<Employee>(employeeService.getEmployeeByID(studentId), HttpStatus.OK);
    }

    //get record based name
    @GetMapping("/get-name/{name}")
    public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable("name") String studentName) {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployeeByName(studentName), HttpStatus.NOT_FOUND);

    }

    //update employee
    @PutMapping("update-employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long studentId, @RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, studentId), HttpStatus.OK);

    }

    //delete API by id
    @DeleteMapping("delete-employee/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable("id") long studentId) {
        return new ResponseEntity<String>(" Employee deleted Successfully", HttpStatus.OK);

    }


}
