package com.hefshine.myass.methods.Que5;

public class OverloadDemo {
	int test(int num1,int num2)
	{
		int num3=num1+num2;
		return num3;
	}
	double test(double num1,double num2,double num3)
	{
		double num4=num1+num2+num3;
		return num4;
	}
	double test(int num1,double num2)
	{
		double num3=num1+num2;
		return num3;
	}
	double test(double num1,int num2)
	{
		double num3=num1+num2;
		return num3;
	}
}
