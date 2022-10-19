package com.yash.oopsbasics2;

public class Square implements Shape {
	double side;
	
	public void input(){
		side=5.5;
	}
	
	@Override
	public void area() {
		this.input();
		double SqArea=side*side;
		System.out.println("Area of Square "+SqArea);
	}

}
