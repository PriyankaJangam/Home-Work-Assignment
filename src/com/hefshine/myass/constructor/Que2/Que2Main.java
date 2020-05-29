package com.hefshine.myass.constructor.Que2;

public class Que2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que2 q1=new Que2();
		Que2 q2=new Que2(2,2);
		float a1=q2.area();
		System.out.println("Area of two variable "+a1);
		Que2 q3=new Que2(3);
		float a2=q3.area1();
		System.out.println("Area of one variable "+a2);
		
	}

}
