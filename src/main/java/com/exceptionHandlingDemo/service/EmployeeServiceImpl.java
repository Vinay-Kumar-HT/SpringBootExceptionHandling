package com.exceptionHandlingDemo.service;

import com.exceptionHandlingDemo.exception.ResourceNotFoundException;
import com.exceptionHandlingDemo.model.Employee;
import com.exceptionHandlingDemo.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    /* Created By Vinay-Kumar-HT */

    Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        var response = employeeRepository.save(employee);
        logger.info("Employee Saved Successfully " + response);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() throws ResourceNotFoundException {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.getReferenceById(id);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        return null;
    }

    @Override
    public Employee removeEmployee(Long id) {
        return null;
    }


}
