package com.example.Employee_Payroll;
import org.springframework.web.bind.annotation.*;

@RestController // Declares the class as the controller
@RequestMapping("/api/test") // Root URL 

public class EmployeeController {

    // GET request - Fetch Data
    @GetMapping
    public String getData() {
        return "GET Request: Data fetched successfully!";
    }

    // POST request - Create Data
    @PostMapping
    public String postData() {
        return "POST Request: Data created successfully!";
    }

    // PUT request - Update Data
    @PutMapping
    public String putData() {
        return "PUT Request: Data updated successfully!";
    }

    // DELETE request - Delete Data
    @DeleteMapping
    public String deleteData() {
        return "DELETE Request: Data deleted successfully!";
    }
}
