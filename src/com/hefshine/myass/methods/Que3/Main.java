package com.hefshine.myass.methods.Que3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		
		System.out.println("Enter Two Number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		double add=c.addition(n1, n2);
		System.out.println(add);
		
		double sub=c.substraction(n1, n2);
		System.out.println(sub);
		
		double mul=c.multiplication(n1, n2);
		System.out.println(mul);
		
		double div=c.division(n1, n2);
		System.out.println(div);
	}

}
