package com.yash.oopsbasics3;

import java.util.Date;

public class Customer {
	public int custid;
	public long account_no;
	public String custname;
	public String cust_address;
	public Date cust_dob;
	public Date cust_account_opening_date;
	public Branch branch_obj;
	public Customer() {
		super();
	}
	
	public Customer(int custid, long account_no, String custname, String cust_address, Date cust_dob,
			Date cust_account_opening_date, Branch branch_obj) {
		super();
		this.custid = custid;
		this.account_no = account_no;
		this.custname = custname;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;
		this.branch_obj = branch_obj;
	}
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public Date getCust_dob() {
		return cust_dob;
	}
	public void setCust_dob(Date cust_dob) {
		this.cust_dob = cust_dob;
	}
	public Date getCust_account_opening_date() {
		return cust_account_opening_date;
	}
	public void setCust_account_opening_date(Date cust_account_opening_date) {
		this.cust_account_opening_date = cust_account_opening_date;
	}
	public Branch getBranch_obj() {
		return branch_obj;
	}
	public void setBranch_obj(Branch branch_obj) {
		this.branch_obj = branch_obj;
	}
	
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", account_no=" + account_no + ", custname=" + custname
				+ ", cust_address=" + cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date="
				+ cust_account_opening_date + ", branch_obj=" + branch_obj + "]";
	}
	
	
}
