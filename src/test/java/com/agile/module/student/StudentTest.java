package com.agile.module.student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {


    /*
     * We suppose there should be a student object
     * which cat accept the name as the input of the constructor,
     * then we can get the name of the student after create the student object.
     * */
	@Test
	public void testCreate() {
	    final String nameOfJane = "Jane Doe";
	    final String nameOfMary = "Mary Brown";

	    Student jane = new Student(nameOfJane);
	    assertEquals(nameOfJane, jane.getName());

	    Student mary = new Student(nameOfMary);
	    assertEquals(nameOfMary, mary.getName());
	}

	@Test
    public void testSetStudentName() {
	    final String originalName = "Jane Doe";
	    final String newName = "Jane Doe Doe";

	    Student jane = new Student(originalName);
	    assertEquals(originalName, jane.getName());

	    jane.setName(newName);
	    assertEquals(newName, jane.getName());
    }

	@Test
	public void testCorrect(){
	    int expected = 100;
	    int inputA = 10;
	    int inputB = 90;
	    int actual = inputA + inputB;

	    // assertEquals(actual, expected); ... X
        // assertEquals(expected, actual);
	}
	
}
