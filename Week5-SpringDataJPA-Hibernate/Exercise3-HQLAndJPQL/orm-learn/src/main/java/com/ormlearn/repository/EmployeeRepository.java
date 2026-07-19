package com.ormlearn.repository;

import com.ormlearn.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query("select e from Employee e where e.permanent = true")
    List<Employee> findPermanentEmployees();

    @Query("select e from Employee e where e.salary > :salary")
    List<Employee> findEmployeesBySalaryGreaterThan(@Param("salary") double salary);

    @Query("select e from Employee e where e.department = :department")
    List<Employee> findEmployeesByDepartment(@Param("department") String department);
}
