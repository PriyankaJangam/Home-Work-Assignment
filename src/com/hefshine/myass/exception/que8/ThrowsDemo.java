package com.hefshine.myass.exception.que8;

import java.util.Scanner;

public class ThrowsDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dividend ");
		int dividend=sc.nextInt();
		System.out.println("Enter Dividend ");
		int divisor=sc.nextInt();
		int res=d.division(dividend, divisor);
		System.out.println(res);
	}

}
