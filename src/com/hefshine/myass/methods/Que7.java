package com.hefshine.myass.methods;
import java.util.Scanner;
 class Calculator {
	 int CalculateSum(int number1,int number2)
	 {
		 int sum=number1+number2;
		 return sum;
	 }
	int CalculateDifference(int number1,int number2)
	{
		int sum=number1+number2;
		 return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int add=obj.CalculateSum(num1,num2);
		System.out.println("Sum Of Two Numbers"+add);
		int sub=obj.CalculateDifference(num1, num2);
		System.out.println("Difference Of Two Numbers"+sub);
	}

}
