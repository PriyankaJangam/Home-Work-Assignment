package com.hefshine.myass.inheritance;

class Parent{
	static float pi=3.14f;
	
}
class Child extends Parent{
	void area(){
		float area=pi*2*2;
		System.out.println("Circle Area "+area);
	}
}
public class Que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.area();
	}

}
