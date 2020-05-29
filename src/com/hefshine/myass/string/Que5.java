package com.hefshine.myass.string;

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String ");
		Scanner sc=new Scanner(System.in);
		String s=new String();
		s=sc.nextLine();
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
				
			}
			
		}
		
		System.out.println(count);
	}

}
