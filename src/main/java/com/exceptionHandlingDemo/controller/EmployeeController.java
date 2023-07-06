package com.exceptionHandlingDemo.controller;


import com.exceptionHandlingDemo.model.Employee;
import com.exceptionHandlingDemo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {
    /* Created By Vinay-Kumar-HT */

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity saveEmployees(@RequestBody @Validated Employee employee) {
        var savedEmployee = employeeService.saveEmployee(employee);
        return new ResponseEntity(savedEmployee, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateEmployees(@RequestParam Long id, @RequestBody Employee employee) {
        var updatedEmployee = employeeService.updateEmployee(id, employee);
        return new ResponseEntity(updatedEmployee, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getAllEmployees() {
        var employeeList = employeeService.getAllEmployees();
        return new ResponseEntity(employeeList, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long id) {
        var employee = employeeService.getEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity removeEmployee(@RequestParam Long id){
        employeeService.removeEmployee(id);
        return new ResponseEntity(String.format("Employee Deleted with id %s : ",id), HttpStatus.OK);
    }


}
