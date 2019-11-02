package com.example.demo.serviceImpl;

import java.util.List;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
   
	private EmployeeDao employeeDao;
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		// TODO Auto-generated method stub
		return employeeDao.getOne(empId);
	}

	@Override
	public String deleteEmployeeById(Long empId) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Employee emp = employeeDao.getOne(empId);
		if(emp!= null)
		flag = true;
		if(flag){
		employeeDao.deleteById(empId);
		return "employee deleted successfully";
		}
		else
		return "employee not deleted";
		}
		
	@Override
	public Employee updateEmployee(Employee employee) {
		Employee emp = null;
		if(employee!= null){
		emp = employeeDao.getOne(employee.getEmpId());
		}
		if(emp!= null){
		return employeeDao.saveAndFlush(emp);
		}
		return null;
	}
    
}
