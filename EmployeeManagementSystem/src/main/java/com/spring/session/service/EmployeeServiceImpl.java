package com.spring.session.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.session.dao.EmployeeDao;
import com.spring.session.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDAO;
	
	
	@Autowired
	@Qualifier("employeeDAOImpl")
	public void setEmployeeDAO(EmployeeDao employeeDAO)
	{
		this.employeeDAO=employeeDAO;
	}
	
	@Override
	@Transactional
	public void addEmployee(Employee emp) {
		this.employeeDAO.addEmployee(emp);
	}

	@Override
	@Transactional
	public void updateEmployee(Employee emp) {
		this.employeeDAO.updateEmployee(emp);
	}

	@Override
	@Transactional
	public List<Employee> listEmployee() {
		return this.employeeDAO.listEmployee();
	}

	@Override
	@Transactional
	public Employee getEmployeeById(int id) {
		return this.employeeDAO.getEmployeeById(id);
	}

	@Override
	@Transactional
	public void removeEmployee(int id) {
		this.employeeDAO.removeEmployee(id);
		
	}
	
	

}
