package com.ormlearn.service;

import com.ormlearn.entity.Employee;
import com.ormlearn.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> search(String keyword) {
        return repository.findByCriteria(keyword);
    }
}
