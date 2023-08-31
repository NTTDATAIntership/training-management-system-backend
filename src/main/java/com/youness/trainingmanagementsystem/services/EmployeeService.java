package com.youness.trainingmanagementsystem.services;

import com.youness.trainingmanagementsystem.dtos.EmployeeDTO;
import com.youness.trainingmanagementsystem.entities.Employee;

import java.util.List;



public interface EmployeeService {

    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);





    Employee updateEmployee(Employee employee);
    void deleteEmployee(Integer id);

    EmployeeDTO getEmployee(Integer id);
    List<EmployeeDTO> listEmployees();


    List<EmployeeDTO> searchEmployees(String keyword);
}
