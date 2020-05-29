package com.hefshine.myass.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Que7 {
	void m1()
	{
		File file=new File("abc.txt");
		try{
			FileInputStream fis=new FileInputStream(file);
			if(fis==null)
			{
				throw new FileNotFoundException();
			}
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally{
			System.out.println("Handle");
		}
	}
	void m2()
	{
		m1();
	}
	void m3()
	{
		m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que7 q=new Que7();
		q.m3();
		System.out.println("Return in main");
	}

}
