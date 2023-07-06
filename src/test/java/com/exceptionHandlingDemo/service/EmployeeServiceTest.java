package com.exceptionHandlingDemo.service;

import com.exceptionHandlingDemo.model.Employee;
import com.exceptionHandlingDemo.repository.EmployeeRepository;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeServiceTest {

    @Autowired
    EmployeeService employeeService;

    @Test
    void saveEmployee() {
        Employee employee = new Employee(
                1,"Vinay","vinay@gmail.com","CS"
        );

        var savedEmployee = employeeService.saveEmployee(employee);

        System.out.println(savedEmployee);

    }

    @Test
    void getAllEmployees() {
    }

    @Test
    void getEmployeeById() {
    }

    @Test
    void updateEmployee() {
    }

    @Test
    void removeEmployee() {
    }
}