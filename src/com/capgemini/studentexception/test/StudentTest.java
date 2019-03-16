package com.capgemini.studentexception.test;


import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.studentexception.exception.StudentNameException;
import com.capgemini.studentexception.exception.studentException;
import com.capgemini.studentexception.main.Student;


public class StudentTest {
	Student student;
	
	
	@Before
	public void setUp() {
	
	}
	
	@Test
	public void toCheckDefaultValues()
	{
		Student student=new Student();
		assertNotNull(student);
	}
	@Test
	public void toCheckWetherAgeisWithinTheRange()
	{
		Student student=new Student(15,"sreevidhya",21,"btech");
	}
	
	@Test(expected=studentException.class)
	public void toCheckWetherAgeisWithinNotTheRange()
		{
			Student student=new Student(15,"sree",14,"btech");
		}
	@Test
	public void toCheckWetherNameIsValid()
	{
		Student student=new Student(15,"sree",20,"btech");
		
	}
	@Test(expected=StudentNameException.class)
	public void toCheckWetherNameIsNotValid()
	{
		Student student=new Student();
		student.validateName("sree@vidhya");
	}
	
	
}
