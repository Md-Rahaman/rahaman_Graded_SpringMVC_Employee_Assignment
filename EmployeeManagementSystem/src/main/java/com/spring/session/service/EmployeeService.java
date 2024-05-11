package com.spring.session.service;

import java.util.List;

import com.spring.session.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public List<Employee> listEmployee();
	public Employee getEmployeeById(int id);
	public void removeEmployee(int id);

}
