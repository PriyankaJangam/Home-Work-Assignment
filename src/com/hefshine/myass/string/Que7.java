package com.hefshine.myass.string;

import java.util.Scanner;

public class Que7 {

	public static void main(String[] args) {
		String s1="Jaaavaaa";
		char ch[]=s1.toCharArray();
	
		for(int i=0;i<ch.length;i++)
		{
			char c1=s1.charAt(i);
			for(int j=i+1;j<ch.length;j++)
			{
				char c2=s1.charAt(j);
				if(c1==c2)
				{
					ch[j]=' ';
					
				}
			}
		}
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
			
		}
		char ch1[]=new char[ch.length-count];
		int counter=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				ch1[counter]=ch[i];
				counter++;
			}
		}

		String s2=String.valueOf(ch1);
		System.out.println(s1);
		System.out.println(s2);
		for(int i=0;i<s2.length();i++)
		{
			int no=0;
			char a=s2.charAt(i);
			
			for(int j=0;j<s1.length();j++)
			{
				
				char b=s1.charAt(j);
				if(a==b)
				{
					no=no+1;
					
				}
			}
			
			System.out.print(a +" "+no);
			System.out.println();
		}

	}

}
