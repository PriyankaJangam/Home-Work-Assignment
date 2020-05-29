package com.hefshine.myass.array;

import java.util.Scanner;

public class Que17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Array Element");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Array Element");
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+(a[i][j]-b[i][j]));
			}
			System.out.println();
		}
	}

}
