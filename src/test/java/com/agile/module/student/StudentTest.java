package com.agile.module.student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testCreate(){
		
	}
	
	@Test
	public void testCorrect(){
		int expected = 100;
		int inputA = 10;
		int inputB = 90;
		int actual = inputA + inputB;
		
		// assertEquals(actual, expected); ... X
		assertEquals(expected, actual);
	}
	
}
