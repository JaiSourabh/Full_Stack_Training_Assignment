package com.yash.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.yash.orm.entities.Employee;

public class EmployeeDao {
	private HibernateTemplate hibernatetemp;

	public HibernateTemplate getHibernatetemp() {
		return hibernatetemp;
	}

	public void setHibernatetemp(HibernateTemplate hibernatetemp) {
		this.hibernatetemp = hibernatetemp;
	}

	@Transactional
	public int insert(Employee e) {
		Integer	i1=(Integer) this.hibernatetemp.save(e);
		return i1;
	} 
	
	public Employee getEmployeeById(int empId) {
		Employee emp=this.hibernatetemp.get(Employee.class,empId);
		return emp;
	}
	
	public List<Employee> getAllEmployee(){
	  List<Employee> lEmp=	this.hibernatetemp.loadAll(Employee.class);
	  return lEmp;
	}
	
	@Transactional
	public void deleteEmployee(int empId) {
		Employee emp=this.hibernatetemp.get(Employee.class, empId);
		this.hibernatetemp.delete(emp);
	}
	
	@Transactional
	public void updateEmployee(Employee employee) {
		this.hibernatetemp.update(employee);
	}
}
