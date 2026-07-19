package com.ormlearn.service;

import com.ormlearn.entity.Employee;
import com.ormlearn.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getPermanentEmployees() {
        return employeeRepository.findPermanentEmployees();
    }
}
