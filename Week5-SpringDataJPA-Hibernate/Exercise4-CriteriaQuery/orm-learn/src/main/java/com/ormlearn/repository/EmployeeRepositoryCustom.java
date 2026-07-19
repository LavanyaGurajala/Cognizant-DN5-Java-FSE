package com.ormlearn.repository;

import com.ormlearn.entity.Employee;

import java.util.List;

public interface EmployeeRepositoryCustom {
    List<Employee> findByCriteria(String nameContains);
}
