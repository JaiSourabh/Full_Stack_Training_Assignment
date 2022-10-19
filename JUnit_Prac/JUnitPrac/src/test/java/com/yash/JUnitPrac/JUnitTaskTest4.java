package com.yash.JUnitPrac;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTaskTest4 {
	JUnitTask4 obj=new JUnitTask4();
	
	@Test
	public void isTest1() {
		assertEquals(8,obj.sumOfDigits(251));
	}
	
	@Test
	public void isTest2() {
		assertEquals(141,obj.sumOfDigits(77));
	}
}
