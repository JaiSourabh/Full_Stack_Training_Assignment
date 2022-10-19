package com.yash.oopsbasics;

import java.util.Date;

public class Person {
	protected int pid;
	protected String pname;
	protected String paddress;
	protected Date dob;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public static void main(String[] args) {
		Department dobj=new Department();
		dobj.setDeptid(101);
		dobj.setDeptname("HR");
		dobj.setDeptid(102);
		dobj.setDeptname("Finance");
		System.out.println(dobj.getDeptid()+" : "+dobj.getDeptname());
	}
}

class Employee extends Person{
	long salary;
	Date date_of_joining;
	String base_location;
	Department deptobj;
	String contactno;
	String emailid;
	
	
}

class Department  {
	int deptid;
	String deptname;
	
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
}

class Customer extends Person{
	Date date_of_registration;
	String delivery_address;
	String contactno;
	String emailid;
	
	public Date getDate_of_registration() {
		return date_of_registration;
	}
	public void setDate_of_registration(Date date_of_registration) {
		this.date_of_registration = date_of_registration;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
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
	
		
}
