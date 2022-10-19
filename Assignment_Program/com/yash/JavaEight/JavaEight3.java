package com.yash.JavaEight;

import java.util.Scanner;

public class JavaEight3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int n1 = sc.nextInt();
		System.out.println("Enter a second number");
		int n2 = sc.nextInt();

		System.out.println("Enter choice");
		System.out.println("Press 1 for Even no.");
		System.out.println("Press 2 for Odd no.");
		System.out.println("Press 3 for Armstrong no.");
		System.out.println("Press 4 for Palindrome no.");
		int ip = sc.nextInt();

		if (ip == 1) {

			EvenNoInterface i1 = (a) -> {
				if (a % 2 == 0)
					System.out.println(a + " is Even no.");
				else
					System.out.println(a + " is not even no.");
			};

			i1.isEvenNo(n1);
			i1.isEvenNo(n2);
		}

		else if (ip == 2) {
			OddNoInterface i1 = (a) -> {
				if (a % 2 != 0)
					System.out.println(a + " is Odd no.");
				else
					System.out.println(a +" is not odd no.");
			};

			i1.isOddNumber(n1);
			i1.isOddNumber(n2);
		}

		else if (ip == 3) {
			ArmStrongNo i = (a) -> {
				int originalNumber, remainder, result = 0;

				originalNumber = a;

				while (originalNumber != 0) {
					remainder = originalNumber % 10;
					result += Math.pow(remainder, 3);
					originalNumber /= 10;
				}

				if (result == a)
					System.out.println(a + " is an Armstrong number.");
				else
					System.out.println(a + " is not an Armstrong number.");
			};

			i.isArmstrong(n1);
			i.isArmstrong(n2);
		}

		else if (ip == 4) {
			String i1 = Integer.toString(n1);
			String i2 = Integer.toString(n2);
			PalindromeInterface p = (str) -> {

				String rev = "";
				for (int i = str.length() - 1; i >= 0; i--)
					rev += str.charAt(i);

				if (str.equals(rev))
					System.out.println(str+ " given string is palindrom");
				else
					System.out.println(str+" given string is not palindrom");

			};
			p.isPalindrom(i1);
			p.isPalindrom(i2);

		} 
		else {
			System.out.println("Invalid Input");
		}

	}

}
