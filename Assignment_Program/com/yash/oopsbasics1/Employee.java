package com.yash.oopsbasics1;

import java.util.Date;

public class Employee extends Person{
	public double salary;
	public Date date_of_joining;
	public String base_location;
	public Department deptobj;
	public String contactno;
	public String emailid;
	
	public Employee() {
		super();
	}
	
	public Employee(double salary, Date date_of_joining, String base_location, Department deptobj, String contactno,
			String emailid) {
		super(101,"Sanjay Shukla","Indore",new Date());
		this.salary = salary;
		this.date_of_joining = date_of_joining;
		this.base_location = base_location;
		this.deptobj = deptobj;
		this.contactno = contactno;
		this.emailid = emailid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	public Department getDeptobj() {
		return deptobj;
	}

	public void setDeptobj(Department deptobj) {
		this.deptobj = deptobj;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", date_of_joining=" + date_of_joining + ", base_location="
				+ base_location + ", contactno=" + contactno + ", emailid=" + emailid + "]";
	}
	
}
