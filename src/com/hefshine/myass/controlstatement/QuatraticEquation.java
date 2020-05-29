package com.hefshine.myass.controlstatement;

public class QuatraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		float b=5f,a= 1f,c=6f;
		float e=(b*b)-(4*a*c);
		x=(((-b)+(Math.sqrt(e)))/(2*a));
		y=(((-b)-(Math.sqrt(e)))/(2*a));
		
		System.out.println("Quatratic Equation == "+x+" "+y);
	}

}
