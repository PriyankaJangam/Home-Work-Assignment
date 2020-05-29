package com.hefshine.myass.string;

import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Jaaavaaa";
		char ch[]=s1.toCharArray();
		System.out.println(ch);
		
		for(int i=0;i<ch.length;i++)
		{
			char c1=s1.charAt(i);
			for(int j=i+1;j<ch.length;j++)
			{
				char c2=s1.charAt(j);
				if(c1==c2)
				{
					ch[j]=' ';
					ch[i]=' ';
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
		System.out.println(s2);
	}

}
