package com.hefshine.myass.constructor.Que7;

public class Circle {
	static float pi=3.14f;
	float Area(float radius)
	{
		float area=pi*radius*radius;
		return area;
	}
	float circumstance(float radius)
	{
		float circum=2*pi*radius;
		return circum;
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		float area=c.Area(2);
		System.out.println("Area of Circle "+area);
		float circumstance=c.circumstance(4);
		System.out.println("Circumstance of Circle "+circumstance);
	}
}
