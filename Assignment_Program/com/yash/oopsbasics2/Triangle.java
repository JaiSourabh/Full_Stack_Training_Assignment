package com.yash.oopsbasics2;

public class Triangle implements Shape{
	double a,b,c;
	
	public void input() {
		this.a=5;
		this.b=5;
		this.c=5;
	}

	@Override
	public void area() {
		this.input();
		if((a+b)>c && (b+c)>a && (c+a)>b) {
		double s = (a+b+c)/2;
		double area1=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		System.out.println("Triangle area "+area1);
		}
		else {
		System.out.println("Triangle with above dimension are not possible");
		}
		}

}
