package com.ems.service;

import com.ems.dao.EmployeeDao;
import com.ems.entity.Employee;

import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao;

    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
