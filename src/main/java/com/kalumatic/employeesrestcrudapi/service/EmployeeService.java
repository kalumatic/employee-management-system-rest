package com.kalumatic.employeesrestcrudapi.service;

import com.kalumatic.employeesrestcrudapi.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
