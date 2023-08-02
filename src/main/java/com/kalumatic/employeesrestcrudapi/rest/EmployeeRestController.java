package com.kalumatic.employeesrestcrudapi.rest;

import com.kalumatic.employeesrestcrudapi.entity.Employee;
import com.kalumatic.employeesrestcrudapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    // constructor injection to inject employeeService
    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // returns the list of all employees
    // endpoint "/api/employees"
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    // returns employee with and id of {employeeId}
    // endpoint "/api/employees/{employeeId}"
    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable("employeeId") int employeeId) {
        return employeeService.findById(employeeId);
    }
}
