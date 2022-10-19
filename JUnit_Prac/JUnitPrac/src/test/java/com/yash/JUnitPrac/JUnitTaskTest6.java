package com.yash.JUnitPrac;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTaskTest6 {
	JUnitTask6 obj=new JUnitTask6();
	
	@Test
	public void isSumCorrect() {
		assertEquals(2107, obj.sumAndAdd());
	}
	
	@Test
	public void isAddSumCorrect() {
		assertEquals(207, obj.sumAndAdd());
	}
}
