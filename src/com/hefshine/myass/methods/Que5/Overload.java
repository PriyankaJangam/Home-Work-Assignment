package com.hefshine.myass.methods.Que5;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadDemo obj=new OverloadDemo();
		int a=obj.test(10,20);
		System.out.println("Addition of two Integer Digit ="+a);
	
		double b=obj.test(10.10,20.20,30.30);
		System.out.println("Addition of three Float Digit ="+b);
		
		double c=obj.test(10,20.20);
		System.out.println("Addition of one Integer and two Float Digit ="+c);
		
		double d=obj.test(10.10,20);
		System.out.println("Addition of two Integer Digit ="+d);
	}

}
