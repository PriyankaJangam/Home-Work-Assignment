package com.hefshine.myass.iteration;

public class Que13 {
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int count=4;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=count;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+"  ");
				
			}
			
			System.out.println();
			count--;
		
		}
		
	}

}
