package com.kalumatic.employeesrestcrudapi.dao;

import com.kalumatic.employeesrestcrudapi.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

        return query.getResultList();
    }
}
