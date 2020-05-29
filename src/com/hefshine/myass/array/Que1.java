package com.hefshine.myass.array;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0,avg;
		System.out.println("Enter Size of Array ");
		int size=sc.nextInt();
		System.out.println("Enter Element ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("Average of "+avg);
	}

}
