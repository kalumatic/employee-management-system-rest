package com.kalumatic.employeesrestcrudapi.service_reduntant;

import com.kalumatic.employeesrestcrudapi.dao.EmployeeRepository;
import com.kalumatic.employeesrestcrudapi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee save(Employee employee) {
        // save or update the employee
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        // finds the employee by id, and then deletes them
        employeeRepository.deleteById(id);
    }
}
