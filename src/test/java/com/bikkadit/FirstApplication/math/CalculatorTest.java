package com.bikkadit.FirstApplication.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calculator=new Calculator();
	
	@Test
	public void addTest() {
	  assertEquals(30.00, calculator.add(20.00, 10.00));	
	}
	
	@Test
	public void subTest() {
		assertEquals(20,calculator.subtract(30.00, 10.00) );
	}
	
	@Test
	public void mulTest() {
		assertEquals(20, calculator.multiply(10, 2) );
	}
	
	@Test
	public void divTest() {
		assertEquals(2,calculator.divide(20, 10));
	}

}
