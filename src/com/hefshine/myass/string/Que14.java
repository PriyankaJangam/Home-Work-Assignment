package com.hefshine.myass.string;

import java.util.Scanner;

public class Que14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count,index=0;
	
		System.out.println("Enter String ");
		Scanner sc=new Scanner(System.in);
		String s=new String();
		s=sc.nextLine();
		
		int count1[]=new int[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			 count=0;
			 char ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
				{
					count++;
				}
				
			}
			count1[i]=count;
		}
		int small=count1[0];
		for(int j=1;j<s.length();j++)
		{
			
			if(small>count1[j])
			{
				small=count1[j];
				index=j;
			}
			   
		}
		System.out.println("Occourance of "+s.charAt(index)+ " char is " +small);
		
	}

}
