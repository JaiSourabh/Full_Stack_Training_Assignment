package com.yash.JavaEight;

import java.util.Arrays;
import java.util.Scanner;

public class javaEight5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,6,7,9,10};
		int ip=arr[0];
		System.out.println(arr[0]);
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1]-arr[i]!=1) {
				ip=arr[i+1];
			//System.out.println();
			
			System.out.println(arr[i]+" : "+ip);
			}
			
			
		}

	}
}
