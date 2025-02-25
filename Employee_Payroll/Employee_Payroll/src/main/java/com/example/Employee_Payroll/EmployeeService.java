package com.example.Employee_Payroll;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.*;

@Service
// Converts EmployeeDTO to an Employee Model
// Handles the business logic delegated by Rest Controller

public class EmployeeService {
    public  Employee createRecord(EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        return employee;
    }
}