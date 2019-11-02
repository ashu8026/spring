package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;


@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
	private EmployeeService employeeService;
    
    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee){
    	
    	return employeeService.createEmployee(employee);
    }
    @GetMapping("/employee/{id}")
   public Employee getEmployeeById(@RequestParam (required=true)Long empId){
	   
	  // if(empId!= null)
	   return employeeService.getEmployeeById(empId);
	   
   }
    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
    	return employeeService.getEmployees();
    }
    @DeleteMapping("/employee")
    public String deleteEmployeeById(@RequestParam (required=true)Long empId){
    	return employeeService.deleteEmployeeById(empId);
    }
   
    
}
