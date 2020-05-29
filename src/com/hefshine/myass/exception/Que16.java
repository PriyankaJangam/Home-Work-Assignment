package com.hefshine.myass.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import arithmeticanother.Main;

public class Que16 {
	int value;
	int num1;
	int num2;
	int num3;
	Scanner sc=new Scanner(System.in);
	
	
	
	void calculate()throws IOException
	{
		while(true)
		{
			
		System.out.println("Enter Option:");
		System.out.println("1.Try Catch Demo");
		System.out.println("2.Try Multi Catch");
		System.out.println("3.Try Finally");
		System.out.println("4.Try Catch Finally");
		System.out.println("5.Throw");
		System.out.println("6.Throws");
		System.out.println("Exit ");
		
		int value=sc.nextInt();
	
		switch(value)
		{
		case 1:
			System.out.println("Try Catch Demo ");
			System.out.println("Enter two Number ");
			num1=sc.nextInt();
			num2=sc.nextInt();
			try{
				num3=num1/num2;
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			
			break;
			
		case 2:
			System.out.println("Try Multi Catch ");
			System.out.println("Enter two Number ");
			num1=sc.nextInt();
			num2=sc.nextInt();
			try{
				num3=num1/num2;
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			catch(RuntimeException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			break;
			
		case 3:
			System.out.println("Try Finally ");
			System.out.println("Enter two Number ");
			num1=sc.nextInt();
			num2=sc.nextInt();
			try{
				num3=num1/num2;
			}
			finally{
				System.out.println(num3);
			}
			
			break;
		case 4:
			System.out.println("Try catch Finally ");
			System.out.println("Enter two Number ");
			num1=sc.nextInt();
			num2=sc.nextInt();
			try{
				num3=num1/num2;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally{
				System.out.println(num3);
			}
			
			break;
			
		case 5:
			System.out.println("Throw ");
			System.out.println("Enter two Number ");
			num1=sc.nextInt();
			num2=sc.nextInt();
			try{
			  if(num2==0)throw new ArithmeticException();
				num3=num1/num2;
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			finally{
				System.out.println(num3);
			}
			
			break;
		
		case 6:
			
			File file=new File("abc.txt");
			FileInputStream fis=new FileInputStream(file);
				fis.close();
			
			break;
			
		case 7:
				//return ;
			System.exit(0);
			
			default:
				System.out.println("Invalid Choice");	
		}
	}
		
  }
	public static void main(String[] args) throws IOException {
		Que16 q=new Que16();
		try{
			q.calculate();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}