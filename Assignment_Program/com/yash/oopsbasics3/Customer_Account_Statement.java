package com.yash.oopsbasics3;

import java.util.Date;

public class Customer_Account_Statement {
	public int CAID;
	public int custId;
	public double amount;
	public double deposit_withdrawl;
	public Date deposit_date;
	public Customer_Account_Statement() {
		super();
	}
	public Customer_Account_Statement(int cAID, int custId, double amount, double deposit_withdrawl,
			Date deposit_date) {
		super();
		CAID = cAID;
		this.custId = custId;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
	}
	public int getCAID() {
		return CAID;
	}
	public void setCAID(int cAID) {
		CAID = cAID;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getDeposit_withdrawl() {
		return deposit_withdrawl;
	}
	public void setDeposit_withdrawl(double deposit_withdrawl) {
		this.deposit_withdrawl = deposit_withdrawl;
	}
	public Date getDeposit_date() {
		return deposit_date;
	}
	public void setDeposit_date(Date deposit_date) {
		this.deposit_date = deposit_date;
	}
	@Override
	public String toString() {
		return "Customer_Account_Statement [CAID=" + CAID + ", custId=" + custId + ", amount=" + amount
				+ ", deposit_withdrawl=" + deposit_withdrawl + ", deposit_date=" + deposit_date + "]";
	}
	
}
