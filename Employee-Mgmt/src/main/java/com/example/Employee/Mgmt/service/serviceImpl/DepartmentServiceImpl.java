package com.example.Employee.Mgmt.service.serviceImpl;

import com.example.Employee.Mgmt.entity.Department;
import com.example.Employee.Mgmt.repository.DepartmentRepository;
import com.example.Employee.Mgmt.response.SuccessResponse;
import com.example.Employee.Mgmt.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    public void setDepartmentRepository(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Autowired

        private DepartmentRepository departmentRepository;
    @Override
    public List<Department> getAllDepartments() {
      return departmentRepository.findAll();

    }

    @Override
    public Department getDepartment(int id) {
        Integer departmentId;
        Optional<Department> department = departmentRepository.findById(id);
        return department.get();
    }

    @Override
    public SuccessResponse addDepartment(Department department) {
        SuccessResponse successResponse=new SuccessResponse();
    Department department1 = new Department();
    department1.setDepartmentId(department.getDepartmentId());
    department1.setDepartmentName(department.getDepartmentName());


        return successResponse;
    }

    @Override
    public SuccessResponse updateDepartment(Department d, int id) {
        SuccessResponse successResponse=new SuccessResponse();
        Department department2 = new Department();
        department2.setDepartmentId(d.getDepartmentId());
        department2.setDepartmentName(d.getDepartmentName());

        return successResponse;
    }

    @Override
    public SuccessResponse deleteAllDepartment() {
        SuccessResponse successResponse=new SuccessResponse();
        departmentRepository.deleteAll();
        return successResponse;
    }

    @Override
    public SuccessResponse deleteDepartmentByID(int id) {
        SuccessResponse successResponse=new SuccessResponse();
        departmentRepository.deleteById(id);
        return successResponse;
    }

    @Override
    public Optional<Department> findById() {
        return Optional.empty();
    }


}



