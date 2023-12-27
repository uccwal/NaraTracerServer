package com.uccwal.naratracerserver.controller;

import com.uccwal.naratracerserver.entity.Employee;
import com.uccwal.naratracerserver.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employees1")
    public List<Employee> getEmployees() {
        return employeeService.findAllEmployees();
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName,
            @RequestParam(required = false) String email) {
        return employeeService.findEmployeesByCondition(firstName, lastName, email);
    }
}
