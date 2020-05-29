package com.hefshine.myass.string;

public class Que23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="2713";

		char b[]=new char[s.length()];
		//int c[]=new int[s.length()];

		for(int i=0;i<s.length();i++)
		{
			b[i]=s.charAt(i);

		}
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					char temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}

		String s1=String.valueOf(b);
		System.out.println(s1);
		/*
//		for(int i=0;i<c.length;i++)
//		{
//			System.out.print(c[i]);
//		}
		char c1[]=new char[c.length];
		for(int i=0;i<c.length;i++)
		{
			//Integer t = c[i];
			c1[i] =new Integer(c[i]).toString().charAt(0);
			//	c1[i]= 
		}
		String s1 = String.valueOf(c1);
		System.out.println(s1);
		//		String str=c.toString();
		//		System.out.println(str);*/
	}

}
