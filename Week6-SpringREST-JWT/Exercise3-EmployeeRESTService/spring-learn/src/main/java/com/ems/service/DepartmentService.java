package com.ems.service;

import com.ems.dao.DepartmentDao;
import com.ems.entity.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDao departmentDao;

    public List<Department> getDepartments() {
        return departmentDao.getDepartments();
    }

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }
}
