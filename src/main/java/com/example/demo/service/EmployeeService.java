package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {	
public Employee createEmployee(Employee employee);
public List<Employee> getEmployees();
public Employee getEmployeeById(Long empId);
public String deleteEmployeeById(Long empId);
public Employee updateEmployee(Employee employee);

}
