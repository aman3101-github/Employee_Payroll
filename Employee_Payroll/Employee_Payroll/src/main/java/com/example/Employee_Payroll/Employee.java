package com.example.Employee_Payroll;

 // Model class representing an Employee entity.
public class Employee {
    private String name;
    private double salary;

    // Default Constructor
     public Employee(){}

    // Parameterised Constructor
    public Employee(String name, double salary) {
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
