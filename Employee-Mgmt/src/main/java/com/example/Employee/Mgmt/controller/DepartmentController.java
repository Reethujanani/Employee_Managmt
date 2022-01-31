package com.example.Employee.Mgmt.controller;

import com.example.Employee.Mgmt.entity.Department;
import com.example.Employee.Mgmt.response.SuccessResponse;
import com.example.Employee.Mgmt.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/department")

public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    // displaying list of all department
    @GetMapping("/departments")
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartments();
    }

    // displaying department by id
    @GetMapping("/departments/{id}")
    public Department getDepartment(@PathVariable int id) {
        return departmentService.getDepartment(id);
    }

    // inserting department
    @PostMapping("/departments")
    public SuccessResponse addDepartment(@RequestBody Department department) {
       return departmentService.addDepartment(department);
    }

    //updating department by id
    @PutMapping("/departments/{id}")
    public SuccessResponse updateDepartment(@RequestBody Department d, @PathVariable int id) {
       return departmentService.updateDepartment(d, id);
    }

    // deleting all department
    @DeleteMapping("/departments")
    public SuccessResponse deleteAllDepartments() {

        return departmentService.deleteAllDepartment();
    }

    // deleting department by id
    @DeleteMapping("departments/{id}")
    public SuccessResponse deleteDepartmentByID(@RequestBody Department d, @PathVariable int id) {
       return departmentService.deleteDepartmentByID(id);
    }

}


