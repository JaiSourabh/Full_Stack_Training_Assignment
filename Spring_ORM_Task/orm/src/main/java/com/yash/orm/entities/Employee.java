package com.yash.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeeDetails")
public class Employee {
	@Id
	private int empid;
	@Column(name = "ename")
	private String empname;
	@Column(name="empEmail")
	private String email;
	public Employee() {
		super();
	}
	public Employee(int empid, String empname, String email) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.email = email;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", email=" + email + "]";
	}
	
	
}
