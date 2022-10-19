package com.yash.oopsbasics2;

public class Rectangle implements Shape{
	double length,breadth;
	
	public void input(){
		length=5;
		breadth=10;
	}
	
	@Override
	public void area() {
		this.input();
		double RecArea=2*(length+breadth);
		System.out.println("Area of Rectangle "+RecArea);
	}
}
