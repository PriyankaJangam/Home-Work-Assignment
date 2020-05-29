package com.hefshine.myass.array;

import java.util.Scanner;

public class Que24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m[][]=new int[3][3];
		System.out.println("Enter Array element ");
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				m[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<m.length;i++)
		{
			int rowMin=m[i][0];
			int colIndex=0;
			boolean flag=true;
			
			//find smallest element in row
			for(int j=1;j<m.length;j++)
			{
				if(rowMin>m[i][j])
				{
					rowMin=m[i][j];
					colIndex=j;
				}
			}
			
			//Chech rowMin is also largest element in col
			for(int j=0;j<m.length;j++)
			{
				if(m[j][colIndex]>rowMin)
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.println("Sadle Point is "+rowMin);
			}
			
		}
	}

}
