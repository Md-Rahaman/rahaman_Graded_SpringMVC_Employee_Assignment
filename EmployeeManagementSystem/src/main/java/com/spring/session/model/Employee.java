package com.spring.session.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Model Class
 */

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	@Column(name="employeeName",nullable = false)
	private String empName;
	
	@Column(name="employeeAddress",nullable = false)
	private String empAddress;
	
	@Column(name="employeePhone",nullable = false)
	private String empPhone;
	
	@Column(name="employeeSalary",nullable = false)
	private double empSalary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Emp Id=" + empId + ", Emp Name=" + empName + ", Emp Address=" + empAddress + ", Emp Phone="
				+ empPhone + ", Emp Salary=" + empSalary ;
	}
	
	

}
