package com.uccwal.naratracerserver.service;


import com.uccwal.naratracerserver.entity.Employee;
import com.uccwal.naratracerserver.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAllEmployees( ) {
        return employeeRepository.findAll();
    }

    public List<Employee> findEmployeesByCondition(String firstName, String lastName, String email) {
        return employeeRepository.findEmployeesByCondition(firstName, lastName, email);
    }


}
