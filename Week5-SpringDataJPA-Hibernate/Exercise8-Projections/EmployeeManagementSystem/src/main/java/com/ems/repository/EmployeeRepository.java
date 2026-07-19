package com.ems.repository;

import com.ems.dto.EmployeeDTO;
import com.ems.entity.Employee;
import com.ems.projection.EmployeeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<EmployeeProjection> findByDepartment(String department);

    @Query("select new com.ems.dto.EmployeeDTO(e.name, e.department) from Employee e")
    List<EmployeeDTO> fetchEmployeeDtos();
}
