package com.spring.session.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.spring.session.model.Employee;

@Repository
public class EmployeeDAOImpl  implements EmployeeDao{

	private SessionFactory sessionFactory;
	Session session;
	
	
	public void setSessionFactory(SessionFactory sesfact)
	{
		this.sessionFactory=sesfact;
	}

	@Override
	public void addEmployee(Employee emp) {
		session=this.sessionFactory.getCurrentSession();
		session.persist(emp);
		System.out.println("Employee details Recorded Succesfully"+"/n"+emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		session=this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(emp);
		System.out.println("Employee details Recorded Succesfully"+"/n"+emp);
	}

	@Override
	public List<Employee> listEmployee() {
		session=this.sessionFactory.getCurrentSession();
		List<Employee> employees=session.createQuery("from Employee").list();
		for(Employee emp:employees)
		{
			System.out.println("Employee List : "+emp);
		}
		return employees;
	}

	@Override
	public Employee getEmployeeById(int id) {
		session=this.sessionFactory.getCurrentSession();
		Employee emp=(Employee)session.get(Employee.class, id);
		System.out.println("Employee : "+emp);
		return emp;
	}

	@Override
	public void removeEmployee(int id) {
		session=this.sessionFactory.getCurrentSession();
		Employee emp=(Employee)session.get(Employee.class, id);
		if(emp !=null)
		{
			session.delete(emp);
		}
		System.out.println("Employee : "+emp);
	}



}
