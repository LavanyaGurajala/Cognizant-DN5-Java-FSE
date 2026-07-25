package com.ems.dao;

import com.ems.entity.Employee;

import java.util.List;

public class EmployeeDao {

    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
