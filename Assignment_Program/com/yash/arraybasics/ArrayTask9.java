package com.yash.arraybasics;
//User will enter the element in M*M order matrix that is square matrix now you have to print 
//first row, last row, first column, and last column elements. Code should be applicable for matrix 
//of any order.

public class ArrayTask9 {
	public static void main(String[] args) {
		int rows, cols;

		// Initialize matrix a
		int a[][] = { { 1, 2 }, { 4, 5 } };

		// Calculates elements of each rows of given matrix
		rows = a.length;
		cols = a[0].length;

		// Calculates sum of each row of given matrix
		for (int i = 0; i < rows; i++) {
			System.out.println("Elements of " + (i + 1) + " rows are : ");
			for (int j = 0; j < cols; j++) {
				System.out.println(a[i][j]);
			}
		}

		// Calculates elements of each column of given matrix
		for (int i = 0; i < cols; i++) {
			System.out.println("Elements of " + (i + 1) + " column are : ");
			for (int j = 0; j < rows; j++) {
				System.out.println(a[j][i] + " ");
			}
		}
	}
}