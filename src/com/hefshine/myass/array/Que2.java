package com.hefshine.myass.array;
import java.util.Scanner;
public class Que2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter Element ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter Position");
		int pos=sc.nextInt();
		System.out.println("Enter Element");
		int ele=sc.nextInt();
		int b[]=new int[a.length+1];
		int counter=0;
		for(int i=0;i<pos;i++)
		{
			b[counter]=a[i];
			counter++;
			if(pos==counter)
				break;
		}
		b[pos]=ele;
		counter++;
		for(int i=pos;i<a.length;i++)
		{
			
			b[counter]=a[i];
			counter++;
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
		
	}

}
