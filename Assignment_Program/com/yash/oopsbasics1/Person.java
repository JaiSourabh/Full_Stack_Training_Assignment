package com.yash.oopsbasics1;

import java.util.Date;

public class Person {
	protected int pid;
	protected String pname;
	protected String paddress;
	protected Date dob;
			
	public Person() {
		super();
	}

	public Person(int pid, String pname, String paddress, Date dob) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.dob = dob;
		System.out.println("Person Object : "+pid+" , "+pname+" , "+paddress+" , "+dob);
	}

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

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", dob=" + dob + "]";
	}
	
	
}
