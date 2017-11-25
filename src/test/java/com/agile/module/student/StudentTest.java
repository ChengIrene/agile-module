package com.agile.module.student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testCreate() {
		Student student = new Student("Jane Doe");
		String studentName = student.getName();
		assertEquals("Jane Doe", studentName);

		Student student2 = new Student("Mary");
		String studentName2 = student2.getName();
		assertEquals("Mary", studentName2);

		assertEquals("Jane Doe", student.getName());
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
