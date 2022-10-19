package com.yash.oopsbasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Electronics {
	public int id;
	public String semiconductorType;
	public String  dateOfManufacturing;	
	
	public void getDetails(int id,String semiconductorType,String dateOfManufacturing) {
		 Date date = new Date();  
		    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		     dateOfManufacturing= formatter.format(date);  
		System.out.println("Electronics Details : "+id+semiconductorType+dateOfManufacturing);
	}
	
	public static void main(String[] args) {
		Electronics mobile=new Mobile();
		mobile.getDetails(101,"yes","21/02/2022");
	}
}

class Mobile extends Electronics{
	public void getDetails(int id,String semiconductorType,Date dateOfManufacturing) {
		System.out.println("Mobile Details : "+id+semiconductorType+dateOfManufacturing);
	}
}

class LCD extends Electronics{
	
}

class Laptop extends Electronics{
	
}

