package com.hefshine.myass.exception;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float no1=1.1f;
		float no2=0.0f;
		
		try{
		
			float no3=no1/no2;
			System.out.println(no3);
			
		}
		
		finally
		{
			System.out.println("Exception Handle");
		}
	}

}
