package com.example.Employee_Payroll;

 // Data Transfer Object (DTO) for Employee.
public class EmployeeDTO {
    private String name;
    private double salary;

     // Default constructor
     public EmployeeDTO() {}

    // Parameterised Constructor
    public EmployeeDTO(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
