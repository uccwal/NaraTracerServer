package com.uccwal.naratracerserver.repository;


import com.uccwal.naratracerserver.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e WHERE e.firstName = :firstName AND e.lastName = :lastName AND e.email = :email")
    List<Employee> findEmployeesByCondition(@Param("firstName") String firstName, @Param("lastName") String lastName, @Param("email") String email);
}
