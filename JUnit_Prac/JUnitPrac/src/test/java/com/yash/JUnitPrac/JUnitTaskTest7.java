package com.yash.JUnitPrac;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTaskTest7 {
JUnitTask7 obj=new JUnitTask7();
	
	@Test
	public void isBinary() {
		assertEquals(String.valueOf(1010),obj.binaryEqui(10));
	}
	
	@Test
	public void isBinary1() {
		assertEquals(1010,obj.binaryEqui(10));
	}
}
