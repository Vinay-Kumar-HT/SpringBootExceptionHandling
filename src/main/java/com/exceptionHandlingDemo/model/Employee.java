package com.exceptionHandlingDemo.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table
public class Employee {
/* Created By Vinay-Kumar-HT */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String department;

    public Employee(long empId, String name, String email, String department) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public Employee() {
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
