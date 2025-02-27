package com.example.Employee_Payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // GET method to get all employees
    @GetMapping("/allemployees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployeeList();
    }

    // GET method to get employee by ID
    @GetMapping("/employee/{id}")
    public Employee getEmployeeByID(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    // POST method to create a new employee
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.createEmployee(employeeDTO);
    }

    // PUT method to update an existing employee
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody EmployeeDTO employeeDTO) {
        return employeeService.updateEmployee(id, employeeDTO);
    }

    // DELETE method to remove an existing employee
    @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }
}
