package com.youness.trainingmanagementsystem.web;

import com.youness.trainingmanagementsystem.dtos.EmployeeDTO;
import com.youness.trainingmanagementsystem.entities.Employee;
import com.youness.trainingmanagementsystem.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")

public class EmployeeController {

    private EmployeeService employeeService;
    @PostMapping("/employees")

    public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.saveEmployee(employeeDTO);
    }
    @GetMapping("/employees")
    public List<EmployeeDTO> employees(){
        return employeeService.listEmployees();
    }

    @GetMapping("/employees/search")
    public List<EmployeeDTO> searchEmployees(@RequestParam(name="keyword", defaultValue = "") String keyword){
        return employeeService.searchEmployees(keyword);
    }
    @GetMapping("/employees/{id}")
    public EmployeeDTO getEmployee(@PathVariable(name = "id") Integer id ){
        return employeeService.getEmployee(id);
    }
    @PutMapping("/employees/{id}")
    public  Employee updateEmployee(@PathVariable(name = "id") Integer id, @RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
    }
}
