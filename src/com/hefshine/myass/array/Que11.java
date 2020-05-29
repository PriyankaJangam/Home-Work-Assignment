package com.hefshine.myass.array;

import java.util.Scanner;

public class Que11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of first Array ");
		int size1=sc.nextInt();
		System.out.println("Enter Element of first array ");
		int a[]=new int[size1];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter Size of second Array ");
		int size2=sc.nextInt();
		System.out.println("Enter Element of second array ");
		int b[]=new int[size2];
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		boolean flag=false;
		if(a.length!=b.length){
			flag=false;
		}
		else{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
				{
					flag=true;
					continue;
				}
				else
				{
					flag=false;
					break;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("Both are Equal");
		}
		else{
			System.out.println("Both are not Equal");
		}
	}

}
