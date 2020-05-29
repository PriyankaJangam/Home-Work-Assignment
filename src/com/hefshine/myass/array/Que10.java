package com.hefshine.myass.array;

import java.util.Scanner;

public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int temp;
		int small1;
		System.out.println("Enter Size of Array ");
		int size=sc.nextInt();
		System.out.println("Enter Element ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		small1=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(small1<a[i] )
			{
				small1=a[i];
				break;
			}
			 
		}
		System.out.println(small1+" Second Smaller");
			
	}
	
}
