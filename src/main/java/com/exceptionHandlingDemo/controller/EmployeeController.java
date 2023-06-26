package com.exceptionHandlingDemo.controller;


import com.exceptionHandlingDemo.model.Employee;
import com.exceptionHandlingDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    /* Created By Vinay-Kumar-HT */

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee saveEmployees(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employee1")
    public List<Employee> getAllEmployees() {

        var employeeList = Arrays.asList(
                new Employee(1,"Testing","CS"),
                new Employee(2,"Test 2", "IS")
        );
       return employeeList;
    }

    @GetMapping("/employee")
    public String getAllEmploy() {

        var employeeList = Arrays.asList(
                new Employee(1,"Testing","CS"),
                new Employee(2,"Test 2", "IS")
        );
        return "Hey Vinay";
    }

}
