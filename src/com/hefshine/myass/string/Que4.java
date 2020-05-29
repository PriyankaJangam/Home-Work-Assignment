package com.hefshine.myass.string;

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=" Java Program ";
		
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);
		char a[]=new char[s1.length()-count];
		int counter=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch!=' ')
			{
				a[counter]=ch;
				counter++;
			}
		}
		String s2=String.valueOf(a);
		System.out.println(s2);
		
	}

}
