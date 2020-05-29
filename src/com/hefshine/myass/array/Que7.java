package com.hefshine.myass.array;
import java.util.Scanner;
public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter size of array ");
		int size=sc.nextInt();
		System.out.println("Enter element of array ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println("Negative Element in array"+a[i]);
				count=count+1;
			}
		}
		System.out.println("Number of Negative Element in array"+count);
	}

}
