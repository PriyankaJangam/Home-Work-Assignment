package com.hefshine.myass.iteration;

public class Que23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=4,i=0,j=0,k=0,no=1;
		for(i=0;i<5;i++)
		{
			
			for(j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			no=1;
			for( k=0;k<=i;k++)
			{

				System.out.print(no+" ");
				no=no*(i-k)/(k+1);
			}
			
			System.out.println();
					
		
		}
	}

}
