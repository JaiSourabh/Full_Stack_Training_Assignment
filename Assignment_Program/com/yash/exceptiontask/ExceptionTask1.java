package com.yash.exceptiontask;

import java.util.Scanner;

public class ExceptionTask1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arrFirstName[]=new String[10];
		System.out.println("Enter 10 First Name");
		for(int i=0;i<10;i++) {
			arrFirstName[i]=sc.nextLine();
		}
		try {
			System.out.println("Enter the position number");
			
			int position=sc.nextInt();
			System.out.println("Name at "+position+" is : "+arrFirstName[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position : "+e);
		}
		
	}

}
