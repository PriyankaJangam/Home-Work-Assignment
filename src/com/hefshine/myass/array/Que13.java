package com.hefshine.myass.array;

public class Que13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={26,0,67,45,0,78,54,34,10,0,34};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
