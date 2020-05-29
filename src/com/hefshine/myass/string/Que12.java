package com.hefshine.myass.string;

import java.util.Scanner;

public class Que12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String ");
		Scanner sc=new Scanner(System.in);
		String s=new String();
		s=sc.nextLine();
		char temp[]=new char[s.length()];
		
			for(int j=0;j<s.length();j++)
			{
				char ch=s.charAt(j);
				if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' ||ch=='U' )
				{
					ch=(char)(ch+1);
					temp[j]=ch;
				}
			}
		System.out.println(temp);
	}

}