package com.hefshine.myass.string;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Que15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=new String();
		s=sc.nextLine();
		String str="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				 ch=(char)(ch+32);
				 str=str+ch;
				 continue;
			}
			if(ch>=97 && ch<=122)
			{
				 ch=(char)(ch-32);
				 str=str+ch;
			}
			
		}
		System.out.println(str);
	}

}
