package com.hefshine.myass.string;

import java.util.Scanner;

public class Que16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=new String();
		s=sc.nextLine();

		char temp[]=new char[s.length()+s.length()];
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			temp[count]=ch;
			count++;
			temp[count++]=ch;
			
		}
		String s1=String.valueOf(temp);
		System.out.println(s1);
//		for(int i=0,j=1;i<s.length();i++,j+=2)
//		{
//			char ch = s.charAt(i);
//			temp[j-1] = ch;
//			temp[j]=ch;
//
//		}
//		for(int i=0;i<temp.length;i++)
//		{
//			System.out.println(temp[i]);
//		}
	}

}


