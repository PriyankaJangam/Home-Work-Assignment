package com.hefshine.myass.exception;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=10;
		int no2=0;
		
		try{
			
			int no3=no1/no2;
			System.out.println(no3);
			
		}
		catch(ArithmeticException e)
		{
			
		}
		
		finally
		{
			System.out.println("Exception Handle");
		}
	}

}
