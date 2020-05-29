package com.hefshine.myass.string;

import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=new String();
		s=sc.nextLine();
		int count=0;
		System.out.println("Enter character ");
		char ch=sc.next().charAt(0);;
		
	
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
				{
					count++;
				}
				
			}
			System.out.println("Occourance of char "+ch+" is " +count);
		}
		
   }
