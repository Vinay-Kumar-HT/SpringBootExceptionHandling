package com.exceptionHandlingDemo.service;

import com.exceptionHandlingDemo.exception.EmailAlreadyExistsException;
import com.exceptionHandlingDemo.exception.ResourceNotFoundException;
import com.exceptionHandlingDemo.model.Employee;
import com.exceptionHandlingDemo.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public Employee saveEmployee(Employee employee) throws EmailAlreadyExistsException{
        Optional.ofNullable(employeeRepository.findByEmail(employee.getEmail())).ifPresent(
                (savedEmployee) -> {
                    throw new EmailAlreadyExistsException(
                            String.format(" Employee with email %s already exist", savedEmployee.getEmail()));
                }
        );

        var savedEmployee = employeeRepository.save(employee);
        logger.info("Employee Saved Successfully " + savedEmployee);
        return savedEmployee;
    }

    @Override
    public List<Employee> getAllEmployees() throws ResourceNotFoundException {
        var employees = Optional.of(employeeRepository.findAll()).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException("No Employees Found !!!");
                }
        );

        return employees;

    }

    @Override
    public Employee getEmployeeById(Long id) throws ResourceNotFoundException {

        return employeeRepository.findById(id).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException("Employee", "Id", String.valueOf(id));
                }
        );

    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        var updateEmployee = employeeRepository.findById(id).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException("Employee", "Id", String.valueOf(id));
                }
        );

        updateEmployee.setName(employee.getName());
        updateEmployee.setEmail(employee.getEmail());
        updateEmployee.setDepartment(employee.getDepartment());

        var responseEmployee = Optional.ofNullable(employeeRepository.save(updateEmployee));
        if(responseEmployee.isPresent()) {
            logger.info("Employee updated successfully !!!");
        }
        return responseEmployee.get();
    }

    @Override
    public void removeEmployee(Long id) {
        var employee = employeeRepository.findById(id).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException("Employee", "Id", String.valueOf(id));
                }
        );
        logger.info("Employee removed successfully !!!");

        employeeRepository.deleteById(id);
    }


}
