package com.capgemini.studentexception.main;

import com.capgemini.studentexception.exception.FactorialException;

public class Factorial {
	
	
	private int factNo;

	public Factorial() {
		super();
		
	}

	public Factorial(int factNo){
		super();
		
		this.factNo = factNo;
	}
	public int getFactorial(int factno)
	{
		int factorial=1;
		if(factNo> 2)
			while(factNo!=1)
				factorial=factNo*factorial;
			factNo--;
	
	if(factorial>Integer.MAX_VALUE  || factorial>Integer.MIN_VALUE)
	
	 return factorial;
	 else
		 throw new FactorialException("not a factorial value exception");
}
	
}
