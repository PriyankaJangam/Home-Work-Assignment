 package com.hefshine.myass.array;

import java.util.Scanner;

public class Que19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][3];
		int lar[]=new int[3];

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
      System.out.println("Maximum array Element in row");
 
		for(int i=0;i<a.length;i++)
		{	  int large=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{   
				if(large<a[i][j])
				{
					large=a[i][j];
				}
				lar[i]=large;
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{	
			  
				System.out.print(lar[i]+" ");
		}
			System.out.println();
		}
	}


