package com.yash.arraybasics;
//WAP to find the LCM and HCF of array numbers
public class ArrrayTask7 {
	public static void main(String args[]) {
		
		int[] myArray = { 25, 50, 125, 625 };
		int min, max, x, lcm = 0;
		//LCM
		for (int i = 0; i < myArray.length; i++) {
			for (int j = i + 1; j < myArray.length - 1; j++) {
				if (myArray[i] > myArray[j]) {
					min = myArray[j];
					max = myArray[i];
				} else {
					min = myArray[i];
					max = myArray[j];
				}
				for (int k = 0; k < myArray.length; k++) {
					x = k * max;
					if (x % min == 0) {
						lcm = x;
					}
				}
			}
		}
		System.out.println("LCM of the given array of numbers : " + lcm);
		System.out.println("HCF of the given array of numbers :" + findGCD(myArray, myArray.length));
	}

	//HCF
	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static int findGCD(int arr[], int n) {
		int result = arr[0];
		for (int element : arr) {
			result = gcd(result, element);

			if (result == 1) {
				return 1;
			}
		}

		return result;
	}
}