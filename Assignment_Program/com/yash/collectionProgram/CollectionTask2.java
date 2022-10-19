//Program to store all Collection elements in Array and perform the Binary Search
package com.yash.collectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CollectionTask2 {
	//Method for binary search
	 public static void binarySearch(Integer arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		Integer[] arr=list.toArray(new Integer[0]);
		int last=arr.length-1;
		System.out.println("Enter element for binary search");
		int key=sc.nextInt();
		binarySearch(arr, 0, last, key);
	}
	
}
