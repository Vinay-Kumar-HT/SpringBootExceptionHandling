package com.exceptionHandlingDemo.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
public class Employee {
    /* Created By Vinay-Kumar-HT */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;
    private String name;
    private String department;

    public Employee(long empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    public Employee(){}

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
