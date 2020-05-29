package com.hefshine.myass.array;

import java.util.Scanner;

public class Que26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter Size of Array row");
		int r=sc.nextInt();
		System.out.println("Enter Size of Column row");
		int c=sc.nextInt();
		System.out.println("Enter Array element ");
		int a[][]=new int[r][c];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
				sum=sum+a[i][j];
				}
				if(i+j==a.length-1 && i!=j)
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println(sum);
		
	}

}
