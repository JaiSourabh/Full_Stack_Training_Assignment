package com.yash.oopsbasics3;

import java.util.Date;

public class BankMain {

	public static void main(String[] args) {
		Branch branch1=new Branch(101,"Nayapura","Ujjain");
		Branch branch2=new Branch(102,"Freeganj","Ujjain");
		
		@SuppressWarnings("deprecation")
		Customer cus1=new Customer(101,12345L,"Aman","Indore",new Date(2001,03,22),new Date(2022,04,22),branch1);
		Customer cus2=new Customer(102,12346L,"Naman","Dewas",new Date(2000,05,21),new Date(2022,02,20),branch2);
		
		Customer_Account_Statement cas1=new Customer_Account_Statement(1001,cus1.custid,10000,2000,new Date(2022,02,21));
		Customer_Account_Statement cas2=new Customer_Account_Statement(1002,cus2.custid,50000,4000,new Date(2022,05,21));
		
		System.out.println("First Customer Details"+cus1+" : "+cas1);
		System.out.println("Second Customer Details"+cus2+" : "+cas2);
	}

}
