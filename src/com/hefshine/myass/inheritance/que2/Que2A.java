package com.hefshine.myass.inheritance.que2;

class GrandParent{
	void Method1()
	{
		System.out.println("GrandParent Class");
	}
}
class Parent extends GrandParent {
	void Method2()
	{
		System.out.println("Parent Class");
	}
}
class Child extends Parent{
	void Method3()
	{
		System.out.println("Child Class");
	}
}
public class Que2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.Method1();
		obj.Method2();
		obj.Method3();
	}

}
