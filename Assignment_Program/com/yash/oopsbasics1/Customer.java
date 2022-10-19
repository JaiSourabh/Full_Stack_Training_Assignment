package com.yash.oopsbasics1;

import java.util.Date;

public class Customer extends Person{
	public Date date_of_registration;
	public String delivery_address;
	public String contactno;
	public String emailid;
	
	public Customer() {
		super();
	}

	public Customer(Date date_of_registration, String delivery_address, String contactno, String emailid) {
		super();
		this.date_of_registration = date_of_registration;
		this.delivery_address = delivery_address;
		this.contactno = contactno;
		this.emailid = emailid;
	}

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

	@Override
	public String toString() {
		return "Customer [date_of_registration=" + date_of_registration + ", delivery_address=" + delivery_address
				+ ", contactno=" + contactno + ", emailid=" + emailid + "]";
	}
	
	
}
