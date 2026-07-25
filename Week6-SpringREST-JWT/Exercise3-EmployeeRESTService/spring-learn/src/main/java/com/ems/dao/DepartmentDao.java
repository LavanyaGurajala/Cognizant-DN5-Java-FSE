package com.ems.dao;

import com.ems.entity.Department;

import java.util.List;

public class DepartmentDao {

    private List<Department> departments;

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
