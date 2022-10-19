package com.yash.arraybasics;
//WAP to find third maximum number from list of numbers
import java.util.Scanner;

public class ArrayTask1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements in array");
		int size=sc.nextInt();
		System.out.println("Enter Array elements");
		int array[]=new int[size];
		
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		
		int temp;
		
		 for(int i = 0; i<size; i++ ){
		      for(int j = i+1; j<size; j++){
		         if(array[i]>array[j]){
		            temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		         }
		      }
		   }
		 
		 System.out.println("Third Maximum number is:: "+array[size-3]);
	}

}
