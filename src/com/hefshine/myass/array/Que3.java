package com.hefshine.myass.array;
import java.util.Scanner;
public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,size;
		System.out.println("Enter size of First Array ");
		int size1=sc.nextInt();
		int a[]=new int[size1];
		System.out.println("Enter size of Second Array ");
		int size2=sc.nextInt();
		int b[]=new int[size2];
		int c[]=new int[size1+size2];
		System.out.println("Enter First Array Element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			c[i]=a[i];
		}
		size=i;
		System.out.println("Enter Second Array Element ");
		for(i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
			c[size]=b[i];
			size++;
		}
		
		for(i=0;i<size;i++)
		{
			System.out.println(c[i]);
		}
		
	}

}
