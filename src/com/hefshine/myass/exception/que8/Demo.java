package com.hefshine.myass.exception.que8;

import java.util.Scanner;

public class Demo {
	int division(int dividend ,int divisor)
	{
		int sum=0;
		try
		{
			if(divisor==0)throw new ArithmeticException();
			sum=dividend/divisor;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divisor Can not be zero");
			e.printStackTrace();
			
		}
		finally
		{
			System.out.println("The result is ");
			return sum;
		}
		
	}
	
}
