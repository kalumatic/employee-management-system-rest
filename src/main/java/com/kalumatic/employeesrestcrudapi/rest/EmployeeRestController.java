package com.kalumatic.employeesrestcrudapi.rest;

import com.kalumatic.employeesrestcrudapi.dao.EmployeeDAO;
import com.kalumatic.employeesrestcrudapi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    // constructor injection to inject employeeDAO
    @Autowired
    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    // returns the list of all employees
    // endpoint "/api/employees"
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
