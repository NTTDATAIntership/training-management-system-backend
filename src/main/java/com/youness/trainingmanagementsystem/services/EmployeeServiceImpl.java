package com.youness.trainingmanagementsystem.services;

import com.youness.trainingmanagementsystem.dtos.EmployeeDTO;
import com.youness.trainingmanagementsystem.entities.Employee;
import com.youness.trainingmanagementsystem.mappers.EmployeeMapperImpl;
import com.youness.trainingmanagementsystem.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    private EmployeeMapperImpl dtoMapper;

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee=dtoMapper.fromEmployeeDTO(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        return dtoMapper.fromEmployee(savedEmployee);
    }



    @Override
    public List<EmployeeDTO> searchEmployees(String keyword){
        List<Employee> employees = employeeRepository.findEmployeeByEmailContaining(keyword);
        List<EmployeeDTO> employeeDTOS= employees.stream().map(employee->dtoMapper.fromEmployee(employee)).collect(Collectors.toList());
        return employeeDTOS;
    }



    @Override
    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee=employeeRepository.findById(employee.getId()).orElseThrow();
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setJob(employee.getJob());
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setPassword(employee.getPassword());
        existingEmployee.setPhone(employee.getPhone());
        existingEmployee.setUsername(employee.getUsername());
        return employeeRepository.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(Integer id) {

        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeDTO getEmployee(Integer id){
        Employee employee= employeeRepository.findById(id)
                .orElseThrow(()->new RuntimeException("employee not found"));
        EmployeeDTO employeeDTO= dtoMapper.fromEmployee(employee);
        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> listEmployees() {

        List<Employee> employees= employeeRepository.findAll();
        List<EmployeeDTO> employeeDTOS= employees.stream().map(empl->dtoMapper.fromEmployee(empl)).collect(Collectors.toList());
        return employeeDTOS;
    }


}
