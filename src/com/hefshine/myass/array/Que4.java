package com.hefshine.myass.array;

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5};
		int mid=a.length/2;
	
	
			for(int j=0;j<mid;j++)
			{
			int temp=a[j];
			a[j]=a[a.length-j-1];
			a[a.length-j-1]=temp;
			}
			
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		
	}

}
