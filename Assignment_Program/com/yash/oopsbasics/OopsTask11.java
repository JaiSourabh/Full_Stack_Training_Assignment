package com.yash.oopsbasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OopsTask11 {
	public int empid;
	public String empname;
	public double empsalary;
	public String empaddress;
	public Date emp_dob;
	public Date emp_doj;
	
	
	public OopsTask11(int empid, String empname, double empsalary, String empaddress, Date emp_dob, Date emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
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

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public Date getEmp_dob() {
		return emp_dob;
	}

	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}

	public Date getEmp_doj() {
		return emp_doj;
	}

	public void setEmp_doj(Date emp_doj) {
		this.emp_doj = emp_doj;
	}

	@Override
	public String toString() {
		return "OopsTask11 [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}

	public static void main(String[] args) throws ParseException {
		 String dob = "26-09-1989";
		 String doj="25-10-2001";
	       SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
	       Date emp_dob = formatter.parse(dob);      
	       Date emp_doj = formatter.parse(doj); 
		OopsTask11 emp1=new OopsTask11(101,"Aman",5900,"Ujjain",emp_dob, emp_doj);
		System.out.println(emp1);

	}

}
