package com.hefshine.myass.exception;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,20,30,40,50};
		try{
			System.out.println(a[6]);
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic Exception");
			e.printStackTrace();
		}
		System.out.println("Exception Handle");
		
	}

}
