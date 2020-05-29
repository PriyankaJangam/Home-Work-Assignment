package com.hefshine.myass.array;

public class Que23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s1[]={'a','b','c','d'};
		char s2[]={'w','x','y','z'};
		char s3[]=new char[s1.length+s2.length];
		int pos=0;
		for(int i=0;i<s3.length;i++)
		{
			if(pos<s3.length)
			{
				s3[pos]=s1[i];
				pos++;
				s3[pos++]=s2[i];
			}
		}
		for(int i=0;i<s3.length;i++)
		{
			System.out.print(s3[i]+" ");
		}
	}

}
