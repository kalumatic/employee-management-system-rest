package com.kalumatic.employeesrestcrudapi.dao_ambiguous;

import com.kalumatic.employeesrestcrudapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}