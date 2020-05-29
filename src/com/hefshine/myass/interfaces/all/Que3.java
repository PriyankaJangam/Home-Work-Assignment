package com.hefshine.myass.interfaces.all;

abstract class Parent{
	abstract void method1();
	
	void method2(){
		System.out.println("Instance Method of abstract Class");
	}
	
}
class Child extends Parent{
	void method1()
	{
		System.out.println("Abstract method implemented in Child");
	}
}
public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child();
		child.method1();
		child.method2();
	}

}
