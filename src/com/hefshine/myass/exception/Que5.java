package com.hefshine.myass.exception;

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={10,20,30,40,50};
		try{
			System.out.println(a[111]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Exception");
			e.printStackTrace();
			
		}
		
		finally
		{
			System.out.println("Exception Handle");
		}
	}

}
