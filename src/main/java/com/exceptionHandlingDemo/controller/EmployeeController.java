package com.exceptionHandlingDemo.controller;


import com.exceptionHandlingDemo.exception.ResourceNotFoundException;
import com.exceptionHandlingDemo.model.Employee;
import com.exceptionHandlingDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/employee")
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

    @GetMapping
    public ResponseEntity getAllEmployees() throws ResourceNotFoundException {
        return  Optional.ofNullable(employeeService.getAllEmployees())
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException("No Employees Found !!!"));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long id){
        return Optional.ofNullable(employeeService.getEmployeeById(id))
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException("Employee Not Found!!!"));
    }


}
