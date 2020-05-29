package com.hefshine.myass.array;

import java.util.Scanner;

public class Que15A {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Size of Array ");
	int size=sc.nextInt();
	System.out.println("Enter Element ");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int b[]=new int[size];
	
	int counter1=0;
	int counter2=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			b[counter1++]=a[i];
		}

	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==1)
		{
			b[counter1++]=a[i];
		}

	}
	for(int i=0;i<counter1;i++)
	{
		System.out.println(b[i]+" ");
	}
	
	
}
}
