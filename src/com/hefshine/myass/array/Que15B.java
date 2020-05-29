package com.hefshine.myass.array;

import java.util.Scanner;

public class Que15B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
