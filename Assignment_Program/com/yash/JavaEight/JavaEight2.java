package com.yash.JavaEight;

public class JavaEight2 {
	public static void main(String[] args) {
		String str1 = "Taj is situated in Agra AST";
		
		JavaEightInterface2 jt=(str)-> {
			if(str1.contains("AST")) {
				System.out.println("String contain AST");
			}
			else {
				System.out.println("Not Contain AST");
			}
		};
		jt.isContainAST(str1);
	}
}
