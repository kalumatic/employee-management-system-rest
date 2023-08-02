package com.kalumatic.employeesrestcrudapi.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager em;

    @Autowired
    public EmployeeDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = em.createQuery("FROM Employee", Employee.class);

        List<Employee> employees = query.getResultList();

        return employees;
    }
}
