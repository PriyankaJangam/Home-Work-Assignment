package com.hefshine.myass.string;

import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String ");
		Scanner sc=new Scanner(System.in);
		String s=new String();
		s=sc.nextLine();
		char c[]=s.toCharArray();
		int a=0;
		System.out.println("Enter Word ");
		String w=new String();
		w=sc.nextLine();
		char c1=w.charAt(0);
		char ch=' ';
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==c1)
			{
				a=i;
				ch=c[a];
			}
		}
		System.out.println(ch+" "+a);
		
	}

}
