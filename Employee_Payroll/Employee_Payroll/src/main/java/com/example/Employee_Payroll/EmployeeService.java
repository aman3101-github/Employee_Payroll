package com.example.Employee_Payroll;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {

    // Synchronized list for thread safety
    private final List<Employee> employeeList = new ArrayList<>();

    // Counter to assign unique IDs
    private int employeeIdCounter = 1;

    // Method to return all the existing employees
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    // Method to get the employee by ID
    public Employee getEmployeeById(int id) {
        return employeeList.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No employee found with ID: " + id));
    }

    // Method to create a new employee
    public Employee createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();

        // Assign unique ID
        employee.setId(employeeIdCounter++);
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());

        employeeList.add(employee);
        return employee;
    }

    // Method to update an existing employee
    public Employee updateEmployee(int id, EmployeeDTO employeeDTO) {
        return employeeList.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .map(employee -> {
                    employee.setName(employeeDTO.getName());
                    employee.setSalary(employeeDTO.getSalary());
                    return employee;
                })
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
    }

    // Method to delete an existing employee
    public boolean deleteEmployee(int id) {
        Employee employeeToDelete = employeeList.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));

        return employeeList.remove(employeeToDelete);
    }
}
