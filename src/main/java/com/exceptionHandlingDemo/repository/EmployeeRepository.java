package com.exceptionHandlingDemo.repository;
import com.exceptionHandlingDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /* Created By Vinay-Kumar-HT */
    public Employee findByEmail(String email);
}
