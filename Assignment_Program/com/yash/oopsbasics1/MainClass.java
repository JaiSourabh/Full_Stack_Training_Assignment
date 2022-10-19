package com.yash.oopsbasics1;

import java.util.Date;

public class MainClass {
	public static void main(String[] args) {
		Department dept[]=new Department[2];
		Department dep1 = new Department(1, "IT");
		Department dep2 = new Department(2, "HR");
		dept[0] = dep1;
		dept[1] = dep2;
		@SuppressWarnings("deprecation")
		Person emp=new Employee(40000,new Date(2020,03,22),"Indore",dept[0],"8089076542","xyz@gmail.com");
		Person cus=new Customer(new Date(2020,07,22),"Ujjain","9098760987","abc@gmail.com");
	
		System.out.println("Employee object :"+emp);
		System.out.println("Customer object :"+cus);
	}
}
