package com.example.Employee.Mgmt.service.serviceImpl;

import com.example.Employee.Mgmt.entity.Employee;
import com.example.Employee.Mgmt.repository.EmployeeRepository;
import com.example.Employee.Mgmt.response.SuccessResponse;
import com.example.Employee.Mgmt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Autowired

    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployee(int id) {
        return employeeRepository.findById(id);

    }

    @Override
    public SuccessResponse addEmployee(Employee employee) {
        SuccessResponse successResponse=new SuccessResponse();
        Employee employee1 = new Employee();
        employee1.setEmployeeId(employee.getEmployeeId());
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        employee1.setMobileNo(employee.getMobileNo());
        employee1.setCity(employee.getCity());
        employee1.setIsActive(employee.getIsActive());
        employee1.setIsDeleted(employee.getIsDeleted());

        return successResponse;
    }


    public SuccessResponse updateEmployee(Employee e, int id) {
        SuccessResponse successResponse=new SuccessResponse();
        Employee emp = new Employee();
        emp.setEmployeeId(e.getEmployeeId());
        emp.setFirstName(e.getFirstName());
        emp.setLastName(e.getLastName());
        emp.setMobileNo(e.getMobileNo());
        emp.setCity(e.getCity());
        emp.setIsActive(e.getIsActive());
        emp.setIsDeleted(e.getIsDeleted());


        return successResponse;
    }

    @Override
    public SuccessResponse deleteAllEmployees() {
        SuccessResponse successResponse=new SuccessResponse();
        employeeRepository.deleteAll();
        return successResponse;
    }

    @Override
    public SuccessResponse deleteEmployeeByID(int id) {
        SuccessResponse successResponse=new SuccessResponse();
        employeeRepository.deleteById(id);
        return successResponse;

    }


    @Override
    public List<Employee> list(String Search)
    {
        return employeeRepository.findByFirstNameLikeOrLastNameLikeOrCityLike("%"+Search+"%","%"+Search+"%","%"+Search+"%");

    }

    /*public <SuccessResponse> SuccessResponse employeeList() {
    }*/
}
