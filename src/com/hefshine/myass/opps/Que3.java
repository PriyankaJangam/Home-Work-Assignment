package com.hefshine.myass.opps;
import java.util.Scanner;
public class Que3 {
	int value;
	int num1;
	int num2;
	int num3;
	Scanner sc=new Scanner(System.in);
	
	
	
	void calculate()
	{
		while(true)
		{
			
		System.out.println("Enter Option:");
		System.out.println("1.add");
		System.out.println("2.subtract");
		System.out.println("3.multiply");
		System.out.println("4.quit");
	
		int value=sc.nextInt();
	
		switch(value)
		{
		case 1:
			System.out.println("Enter Two Number to Add");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=num1+num2;
			System.out.println("Addition of Number"+num3);
			break;
			
		case 2:
			System.out.println("Enter Two Number to Subtract");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=num1-num2;
			System.out.println("Substraction of Number"+num3);
			break;
			
		case 3:
			System.out.println("Enter Two Number to multiply");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=num1*num2;
			System.out.println("Multiply of Number"+num3);
			break;
			
		case 4:
				//return ;
			System.exit(0);
			
			default:
				System.out.println("Invalid Choice");	
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que3 obj=new Que3();
	
		obj.calculate();
		
	}

}
