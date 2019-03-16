package com.capgemini.studentexception.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.studentexception.exception.StudentNameException;
import com.capgemini.studentexception.exception.studentException;

public class Student {

	private int studentRollNo;
	private String studentName;
	private int studentAge;
	private String studentCourse;

	public Student() {

	}

	public Student(int studentRollNo, String studentName, int studentAge, String studentCourse) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentCourse = studentCourse;

		if (studentAge >= 15 && studentAge <= 21) 
			
			this.studentAge = studentAge;

		else
			throw new studentException("Age NotWithin Range Exception");

		if (!validateName(studentName))
			
		throw new StudentNameException("Name is not   valid exception");
		else
			this.studentName = studentName;
				
		
		
	}

	public boolean validateName(String studentName) {
		Pattern p = Pattern.compile("[a-zA-Z]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(studentName);
		boolean b = m.find();
		return b;
	}

}
