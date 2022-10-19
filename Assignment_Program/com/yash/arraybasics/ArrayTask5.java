package com.yash.arraybasics;
//An Array Contain different numbers you have to find how many are even, odd, perfect and 
//prime
import java.util.Scanner;

public class ArrayTask5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements in array");
		int size = sc.nextInt();
		System.out.println("Enter Array elements");
		int array[] = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		// Perfect no.
		for (int i = 0; i < size; i++) {
			long number = array[i];
			long s = isPerfect(array[i]);

			if (s == number)
				System.out.println(number + " is a perfect number");
		}

		// Even No.
		System.out.println("Even elements are : ");
		for (int i = 0; i < size; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.println("\n" + "Odd elements are : ");
		for (int i = 0; i < size; i++) {
			if ((array[i] % 2) != 0) {
				System.out.print(array[i] + " ");
			}
		}

		// Prime No
		System.out.println("\n" + "prime numbers in the array ");
		for (int i = 0; i < array.length; i++) {
			boolean isPrime = true;

			// check to see if the numbers are prime
			for (int j = 2; j < array[i]; j++) {
				if (array[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
			// print the number
			if (isPrime)
				System.out.print(array[i] + " ");
		}

	}

	static long isPerfect(long num) {
		// variable stores the sum
		long sum = 0;
		// executes until the condition becomes false
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				// calculates the sum of factors
				sum = sum + i;
			} // end of if
		} // end of for
			// returns the sum of factors
		return sum;
	}

}
