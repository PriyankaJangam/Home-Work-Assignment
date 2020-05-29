package com.hefshine.myass.string;

import java.util.Scanner;

public class Que17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=new String();
		s=sc.nextLine();
		System.out.println("Enter search index ");
		int search=sc.nextInt();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i==search)
			{
				System.out.println("index of Character "+ch);
			}
		}
			
	}

}
