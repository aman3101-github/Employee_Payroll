package com.example.Employee_Payroll;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    // Store employees in memory
    private final List<Employee> employeeList = new ArrayList<>();

    // Create Employee Record
    public Employee createRecord(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        employeeList.add(employee);
        return employee;
    }

    // Get All Employees
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}
