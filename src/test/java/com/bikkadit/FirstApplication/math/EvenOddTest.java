package com.bikkadit.FirstApplication.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenOddTest {
   
	@Test
	public void evenoddTest() {
		
		EvenOdd evenOdd=new EvenOdd();
		assertEquals(  true,evenOdd.evenOddNumber(2) );
		//alternative for  assertEquals if value is boolean 
		//is assertFalse or assertTrue
		assertFalse(evenOdd.evenOddNumber(3));
	}

}
