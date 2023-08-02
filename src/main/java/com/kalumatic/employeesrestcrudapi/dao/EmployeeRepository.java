package com.kalumatic.employeesrestcrudapi.dao;

import com.kalumatic.employeesrestcrudapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
