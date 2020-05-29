package com.hefshine.myass.string;

import java.util.Scanner;

public class Que18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		String s=new String("   Java program   ");
		//s=sc.nextLine();
		
		int fs=0,ts=0;
		for(int i=0;s.charAt(i)==' ';i++)
		{
			++fs;
		}
		for(int i=s.length()-1;s.charAt(i)==' ';i--)
		{
			++ts;
		}
		
		char t[]=new char[s.length()-ts-fs];
		int count=0;
		for(int i=fs;i<s.length()-ts;i++)
		{
			t[count]=s.charAt(i);
			count++;
		}
		String s1=String.valueOf(t);
		System.out.println(s1);
	}

}
