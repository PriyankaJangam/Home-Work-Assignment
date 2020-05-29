package com.hefshine.myass.array;

import java.util.Scanner;

public class Que22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		System.out.println("Enter the size of subArray:");
		int k=sc.nextInt();	
		Float min=100000.0f;
		int c=0;
		int main[]=new int[n];
		Float avg[]=new Float[100];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			main[i]=sc.nextInt();
		}
		System.out.println("Given array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(main[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			Float sum=0.0f;
			for(int j=i;j<(i+k) && j<n;j++)
			{
				sum =sum+main[j];
			}
			avg[c]=sum/k;
			c++;
		}
     		for(int i=0;i<c-2;i++)
		{
			if(avg[i]<min)
				min=avg[i];
		}
		System.out.println("Index=>"+k+"Average=>"+min);

	}

}
