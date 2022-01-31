package com.example.Employee.Mgmt.service;

import com.example.Employee.Mgmt.entity.Employee;
import com.example.Employee.Mgmt.response.SuccessResponse;


import java.util.List;
import java.util.Optional;

public interface EmployeeService {


    List<Employee> getAllEmployees();

    Optional<Employee> getEmployee(int id);

    SuccessResponse addEmployee(Employee employee);

    SuccessResponse updateEmployee(Employee e, int id);

    SuccessResponse deleteAllEmployees();

    SuccessResponse deleteEmployeeByID(int id);


    List<Employee> list(String first_name);
}
