package com.yash.arraybasics;

//You are having array of strings. Now you have to arrange strings in array on the basis of the 
//length of each string. Smallest string will be first and so on.

import java.util.*;

public class ArrayTask10 {
//Function to Sort the array of string
//according to lengths. This function
//implements Insertion Sort.
	static void sort(String[] s, int n) {
		for (int i = 1; i < n; i++) {
			String temp = s[i];

			// Insert s[j] at its correct position
			int j = i - 1;
			while (j >= 0 && temp.length() < s[j].length()) {
				s[j + 1] = s[j];
				j--;
			}
			s[j + 1] = temp;
		}
	}

//Driver function
	public static void main(String args[]) {
		String[] arr = { "Ujjain", "I", "from", "am"};
		int n = arr.length;
		// Function to perform sorting
		sort(arr, n);
		System.out.println("Sorted String : ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
