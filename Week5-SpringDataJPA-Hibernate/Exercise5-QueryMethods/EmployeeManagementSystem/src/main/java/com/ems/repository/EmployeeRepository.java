package com.ems.repository;

import com.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByName(String name);
    List<Employee> findBySalaryGreaterThan(Double salary);
    List<Employee> findByDepartment(String department);
    List<Employee> findByNameContaining(String fragment);
    List<Employee> findByPermanent(Boolean permanent);
}
