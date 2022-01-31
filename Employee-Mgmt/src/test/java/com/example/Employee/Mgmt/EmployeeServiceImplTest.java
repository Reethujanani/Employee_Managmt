package com.example.Employee.Mgmt;

import com.example.Employee.Mgmt.dto.DepartmentDTO;
import com.example.Employee.Mgmt.entity.Department;
import com.example.Employee.Mgmt.entity.Employee;
import com.example.Employee.Mgmt.repository.DepartmentRepository;
import com.example.Employee.Mgmt.repository.EmployeeRepository;
import com.example.Employee.Mgmt.response.SuccessResponse;
import com.example.Employee.Mgmt.service.serviceImpl.DepartmentServiceImpl;
import com.example.Employee.Mgmt.service.serviceImpl.EmployeeServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeServiceImplTest {

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @InjectMocks
    private DepartmentServiceImpl departmentService;

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private DepartmentRepository departmentRepository;

    @Before
    void init() {

        employeeService.setEmployeeRepository(employeeRepository);
        departmentService.setDepartmentRepository(departmentRepository);
    }


    private Employee employee() {
        Employee employee = new Employee();
        employee.setEmployeeId(Constants.EMPLOYEE_ID);
        employee.setFirstName(Constants.FIRST_NAME);
        employee.setLastName(Constants.LAST_NAME);
        employee.setMobileNo(Constants.MOBILE_NO);
        employee.setCity(Constants.CITY);
        employee.setIsActive(Constants.IS_ACTIVE);
        employee.setIsDeleted(Constants.DELETED_FLAG);
        return employee;
    }

    private Department department() {
        Department department1 = new Department();
        department1.setDepartmentId(Constants.DEPARTMENT_ID);
        department1.setDepartmentName(Constants.DEPARTMENT_NAME);
        return department1;
    }

    @Test
    void saveEmployee() {
        try {
            SuccessResponse successResponse = employeeService.addEmployee(employee());
            assertNotNull(successResponse);
        } catch (Exception e) {
        }
    }

    @Test
    void updateemployee() {
        try {
            SuccessResponse successResponse = employeeService.updateEmployee(employee(), Constants.EMPLOYEE_ID);
            assertNotNull(successResponse);
        } catch (Exception e) {
        }
    }

    @Test
    void EmployeeList() {
        try {
            List<Employee> employeeList = employeeService.list(Constants.SEARCH);
            assertNotNull(employeeList);
        } catch (Exception e) {
        }
    }


    @Test
    void employeeById() {
        try {
            Optional<Employee> optionalEmployee = employeeService.getEmployee(Constants.EMPLOYEE_ID);
            assertNotNull(optionalEmployee);
        } catch (Exception e) {
        }
    }

    @Test
    void deleteAllEmployees() {
        try {
            SuccessResponse successResponse = employeeService.deleteAllEmployees();
            assertNotNull(successResponse);
        } catch (Exception e) {
        }

    }

    @Test
    void deleteEmployeeByID(){
        try{
            SuccessResponse successResponse = employeeService.deleteEmployeeByID(Constants.EMPLOYEE_ID);
            assertNotNull(successResponse);
        } catch (Exception e) {
        }
    }

    @Test
    void getAllDepartments(){
        try{
            List<Department> list = departmentService.getAllDepartments();
            assertNotNull(list);
        } catch (Exception e) {
        }

        }


    @Test
    void getDepartment() {

        try {
            Department department = departmentService.getDepartment(Constants.DEPARTMENT_ID);
            assertNotNull(department);
        } catch (Exception e) {
        }
    }

        @Test
        void addDepartment(){
            try{
                SuccessResponse successResponse = departmentService.addDepartment(department());
                assertNotNull(successResponse);
            } catch (Exception e) {
        }

        }

        @Test
        void updateDepartment(){
                try{
                    SuccessResponse successResponse = departmentService.updateDepartment(department(),Constants.DEPARTMENT_ID);
                    assertNotNull(successResponse);
                } catch (Exception e) {
                }
            }

            @Test
            void deleteAllDepartment(){
                try{
                    SuccessResponse successResponse = departmentService.deleteAllDepartment();
                    assertNotNull(successResponse);
                } catch (Exception e) {
                }
            }

            @Test
            void deleteDepartmentByID(){
                try{
                    SuccessResponse successResponse = departmentService.deleteDepartmentByID(Constants.DEPARTMENT_ID);
                    assertNotNull(successResponse);
                } catch (Exception e) {
                }


            }

            @Test
            void findById() {
                try {
                    Optional<Department> optionalDepartment = departmentService.findById();
                    assertNotNull(optionalDepartment);
                } catch (Exception e) {
                }


            }}


