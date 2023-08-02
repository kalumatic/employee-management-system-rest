package com.kalumatic.employeesrestcrudapi.dao;

import com.kalumatic.employeesrestcrudapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
