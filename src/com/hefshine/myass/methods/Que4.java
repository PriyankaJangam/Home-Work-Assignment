package com.hefshine.myass.methods;
import java.util.Scanner;
public class Que4 {

	void Small(int num1,int num2,int num3)
	{
		if(num1<num2 && num1<num3)
		{
			System.out.println("Number 1 is Small");
		}
		else
		{
			if(num2<num3)
			{
				System.out.println("Number 2 is Small");
			}
			else
			{
				System.out.println("Number 3 is Small");
			}
		}
	}	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que4 obj=new Que4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		obj.Small(num1,num2,num3);
	}

}
