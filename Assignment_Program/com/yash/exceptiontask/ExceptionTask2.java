package com.yash.exceptiontask;

import java.util.Scanner;

public class ExceptionTask2 {

	public static void main(String[] args) throws NegativeArraySizeException {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array : ");
			int size=sc.nextInt();
			if(size<0) {
				throw new NegativeArraySizeException("Size would be negative");
			}
			 
			int arr[]=new int[size];
			System.out.println("Array of "+size+" is created succesfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
