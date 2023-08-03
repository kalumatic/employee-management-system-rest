package com.kalumatic.employeesrestcrudapi.service_reduntant;

import com.kalumatic.employeesrestcrudapi.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
