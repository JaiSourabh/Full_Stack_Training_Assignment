package com.yash.JUnitPrac;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {
	Factorial ft=new Factorial();
	
	@Test
	public void testFact1() {
		assertEquals(120,ft.fact(5));
	}
	
	@Test
	public void testFact2() {
		assertEquals(120,ft.fact(4));
	}
}
