package com.hefshine.myass.iteration;

public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234,rem=0,sum=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}

}
