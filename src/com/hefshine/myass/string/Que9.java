package com.hefshine.myass.string;

import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=new String();
		s=sc.nextLine();
		char temp[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				ch=(char)(ch+32);
				temp[i]=ch;
			}
			
			
		}
		System.out.println(temp);
	}

}
