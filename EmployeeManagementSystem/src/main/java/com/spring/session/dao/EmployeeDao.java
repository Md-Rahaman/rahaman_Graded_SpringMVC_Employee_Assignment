package com.spring.session.dao;

import com.spring.session.model.Employee;
import java.util.List;


public interface EmployeeDao {
	
	public void addEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public List<Employee> listEmployee();
	public Employee getEmployeeById(int id);
	public void removeEmployee(int id);

	

}
