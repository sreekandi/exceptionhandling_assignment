package com.capgemini.studentexception.test;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.capgemini.studentexception.exception.FactorialException;
import com.capgemini.studentexception.main.Factorial;

public class FactorialTest {

	@Test
	public void toCheckDefaultValues()
	{
		Factorial factorial=new Factorial();
		assertNotNull(factorial);
	}
	@Test
	public void toChekFactorial()
	{
		Factorial factorial=new Factorial(5);
		
	}
	@Test(Expected =FactorialException.class)
	public void toCheckNotFactorial()
	{
		Factorial factorial=new Factorial(1);
	}
	
	

}
