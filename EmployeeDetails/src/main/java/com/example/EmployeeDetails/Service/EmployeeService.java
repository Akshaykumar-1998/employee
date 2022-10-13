package com.example.EmployeeDetails.Service;

import com.example.EmployeeDetails.entity.Employee;
import com.example.EmployeeDetails.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee saveEmployee(Employee employee){
      return   employeeRepository.save(employee);
    }
    public List< Employee> saveEmployees(List<Employee>employees){
       return employeeRepository.saveAll(employees);

    }
    public List<Employee>getEmployee(){
        return employeeRepository.findAll();
    }
    public Employee getById(int id){
        return employeeRepository.findById(id).orElse(null);
    }
    public String deleteEmployee(int id){
        employeeRepository.deleteById(id);
        return "Employee Remove" ;
    }
    public Employee updateEmployee(Employee employee){
        Employee existingEmployee=employeeRepository.findById(employee.getId()).orElse(null);
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setCity(employee.getCity());
        existingEmployee.setDOB(employee.getDOB());
    return employeeRepository.save(existingEmployee);
    }
}
