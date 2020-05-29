package com.hefshine.myass.array;

import java.util.Scanner;

class Array
{
	int sum=0;
	void Method(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
	}
	void display()
	{
		System.out.println(sum);
	}
}
public class Que27 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter Size of Array row");
		int size=sc.nextInt();
		System.out.println("Enter Element ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
				a[i]=sc.nextInt();
			
		}
		Array array=new Array();
		array.Method(a);
		array.display();
		
	}

}
