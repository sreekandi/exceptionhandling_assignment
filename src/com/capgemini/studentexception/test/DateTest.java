package com.capgemini.studentexception.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.capgemini.studentexception.exception.InvalidDayException;
import com.capgemini.studentexception.exception.InvalidMonthException;
import com.capgemini.studentexception.main.Date;

public class DateTest {

	@Test
	 public void toCheckDateWithDefaultValues()
	 {
		Date date =new Date();
		assertNotNull(date);
	 }
	@Test
	public void testToCheckDayIsValid() throws InvalidDayException, InvalidMonthException {
		Date date =new Date(25,12,1997);
	}
	
	@Test(expected=InvalidDayException.class)
	public void testToCheckDayIsNotValid() throws InvalidDayException, InvalidMonthException {
		Date date =new Date(32,12,1997);
	}
	
	@Test
	public void testToCheckMonthIsValid() throws InvalidDayException, InvalidMonthException {
		Date date =new Date(25,12,1997);
	}
	
	@Test(expected=InvalidMonthException.class)
	public void testToCheckMonthIsNotValid() throws InvalidDayException, InvalidMonthException {
		Date date =new Date(25,14,1997);
	}
}
