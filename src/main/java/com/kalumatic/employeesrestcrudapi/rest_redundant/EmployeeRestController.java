//package com.kalumatic.employeesrestcrudapi.rest_redundant;
//
//import com.kalumatic.employeesrestcrudapi.entity.Employee;
//import com.kalumatic.employeesrestcrudapi.service_reduntant.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class EmployeeRestController {
//
//    private EmployeeService employeeService;
//
//    // constructor injection to inject employeeService
//    @Autowired
//    public EmployeeRestController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    // returns the list of all employees
//    // endpoint "/api/employees"
//    @GetMapping("/employees")
//    public List<Employee> findAll() {
//        return employeeService.findAll();
//    }
//
//    // returns employee with and id of {employeeId}
//    // endpoint "/api/employees/{employeeId}"
//    @GetMapping("/employees/{employeeId}")
//    public Employee findById(@PathVariable("employeeId") int employeeId) {
//        return employeeService.findById(employeeId);
//    }
//
//    // creates and saves a new employee
//    // endpoint "/api/employees"
//    @PostMapping("/employees")
//    public Employee add(@RequestBody Employee employee) {
//        employee.setId(0);
//        return employeeService.save(employee);
//    }
//
//    // updates an employee
//    // endpoint "/api/employees"
//    @PutMapping("/employees")
//    public Employee update(@RequestBody Employee employee) {
//        return employeeService.save(employee);
//    }
//
//    // delete the employee with the provided id
//    // endpoint "/api/employees/{employeeId}
//    @DeleteMapping("/employees/{employeeId}")
//    public void delete(@PathVariable int employeeId) {
//        employeeService.deleteById(employeeId);
//    }
//}
