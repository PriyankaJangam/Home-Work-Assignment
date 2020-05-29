package com.hefshine.myass.iteration;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3,count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println("num is prime");
			}
			else
			{
				System.out.println("num is not prime");
			}
		

		
	}

}
