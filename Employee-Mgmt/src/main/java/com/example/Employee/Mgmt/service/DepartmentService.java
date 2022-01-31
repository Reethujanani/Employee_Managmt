package com.example.Employee.Mgmt.service;

import com.example.Employee.Mgmt.entity.Department;
import com.example.Employee.Mgmt.response.SuccessResponse;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    List<Department> getAllDepartments();

    Department getDepartment(int id);

    SuccessResponse addDepartment(Department department);

    SuccessResponse updateDepartment(Department d, int id);

    SuccessResponse deleteAllDepartment();

    SuccessResponse deleteDepartmentByID(int id);

    Optional<Department> findById();
}
