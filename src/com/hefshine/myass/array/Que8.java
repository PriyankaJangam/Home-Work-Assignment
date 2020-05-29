package com.hefshine.myass.array;

import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array ");
		int size=sc.nextInt();
		int i;
		System.out.println("Enter element of array ");
		int a[]=new int[size];
		int even[]=new int[size];
		int odd[]=new int[size];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[i]=a[i];
				System.out.println("Even Array "+even[i]);
			}
			if(a[i]%2!=0)
			{
				odd[i]=a[i];
				System.out.println("Odd Array "+odd[i]);
			}
		}
		
	}

}
