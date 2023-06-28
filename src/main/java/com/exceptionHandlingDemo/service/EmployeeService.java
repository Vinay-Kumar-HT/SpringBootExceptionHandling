package com.exceptionHandlingDemo.service;

import com.exceptionHandlingDemo.exception.ResourceNotFoundException;
import com.exceptionHandlingDemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    public Employee saveEmployee(Employee employee);

    public List<Employee> getAllEmployees() throws ResourceNotFoundException;

    public Employee getEmployeeById(Long id);

    public Employee updateEmployee(Long id, Employee employee);

    public Employee removeEmployee(Long id);
}
