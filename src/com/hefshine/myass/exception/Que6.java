package com.hefshine.myass.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Que6 {
	void m1()throws Exception
	{
		int a[]={10,20,30,40,50};
		System.out.println(a[111]);
		System.out.println("Array Index Out Of Bounds Exception Exception");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que6 q=new Que6();
		try{
			q.m1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Execution Continue");
	}
}

