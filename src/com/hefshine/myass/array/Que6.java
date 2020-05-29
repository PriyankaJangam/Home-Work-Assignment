package com.hefshine.myass.array;

import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int temp;
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
			for(int j=0;j<a.length;j++)
			{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
