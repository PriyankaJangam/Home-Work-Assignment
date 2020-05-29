package com.hefshine.myass.inheritance;

class Shape
{
	final float pi=3.14f;
	float area=0.0f;
	
	void calarea()
	{
		System.out.println("Shape Method");
	}
	final void display()
	{
		System.out.println(this.area);
	}
}
final class Circle extends Shape
{
	void calarea()
	{
		System.out.println("Circle Method");
		area=pi*5;
	}
	
}
class Rectangle extends Shape
{
	void calarea()
	{
		System.out.println("Rectangle Method");
		area=5*2;
	}
	
}
class Triangle extends Shape
{
	void calarea()
	{
		System.out.println("Triangle Method");
		area=5*2/2;
	}
	
}
public class Que8 {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.calarea();
		c.display();
		Rectangle r=new Rectangle();
		r.calarea();
		r.display();
		Triangle t=new Triangle();
		t.calarea();
		t.display();
	}
}
