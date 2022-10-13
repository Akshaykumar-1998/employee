package com.example.EmployeeDetails.Controller;

import com.example.EmployeeDetails.Service.EmployeeService;
import com.example.EmployeeDetails.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
@Autowired
    private EmployeeService service;
@PostMapping("/addemployee")
public Employee addEmployee(@RequestBody Employee employee){
    return service.saveEmployee(employee);
}
@PostMapping("/addemployees")
public List<Employee>addEmployees(@RequestBody List<Employee>employees){
    return service.saveEmployees(employees);

}
@GetMapping("/employees")
public List<Employee>findAllEmployees(){
    return service.getEmployee();
}
public Employee findEmployeeById(int id){
    return service.getById(id);
}
@PutMapping("/update")
public Employee updateEmployee(@RequestBody Employee employee){
    return service.updateEmployee(employee);
}
@DeleteMapping("/delete/{id}")
public String deleteEmployee(@PathVariable int id){
    return service.deleteEmployee(id);
}
}
