package com.hefshine.myass.exception.que15;

import java.util.Scanner;

public class UserRegistration {
	void registerProfile(String userName,int age,String country)
	{
	
		try{
			
			if(country.equals("India"))
			{
				System.out.println("Name of User "+userName);
				System.out.println("Country of User "+country);
			}
			else
			{
				throw new InvalidCountryException("Invalid Country Exception");
			}
		  }
		catch(InvalidCountryException e)
		  {
			 e.printStackTrace();
		  }
				
		try
		{
			if(age>=18)
			{
				System.out.println("User valid for registration,bcoz age is "+age);
			}
			else
			{
				throw new InvalidAgeException("Invalid age Exception");
			}
		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		UserRegistration us=new UserRegistration();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name ");
		String name=sc.next();
		System.out.println("Enter Age ");
		int age=sc.nextInt();
		System.out.println("Enter Country ");
		String country=sc.next();
		us.registerProfile(name, age, country);
		System.out.println("User Define Exception Handling Example");
	}
}
