package com.youness.trainingmanagementsystem.repositories;

import com.youness.trainingmanagementsystem.entities.Employee;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //Optional<Employee> findByEmail(String email);

    List<Employee> findEmployeeByEmailContaining(String keyword);
}
