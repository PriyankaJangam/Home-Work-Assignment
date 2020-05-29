package com.hefshine.myass.interfaces.all;

abstract class Class1{
	abstract void method();
	
}

//we can declare a class abstract with no method
abstract class Class2{
}

//we can declare a class abstract with no abstract method
abstract class Class3{
	void method()
	{
		System.out.println("Abstact Class Instance Method1");
	}
}
class Class4 extends Class3
{
	
}
//we can declare a class abstract with abstract method and Implemented method
abstract class Class5{
	abstract void method1();
	void method2()
	{
		System.out.println("Abstact Class Instance Method2");
	}
}
class Class6 extends Class5
{
	void method1()
	{
		System.out.println("Abstract Method implement in Sub class");
	}
	
}

//Check class extends 2 or more Abstract Class
/*
class Class7 extends Class1,Class2,Class3{}
*/

//Check abstract class extends 2 or more Abstract Class
/*
abstract class Class8 extends Class1,Class2,Class3{}
*/

//Check interface extends 2 or more Abstract Class
/*
interface interface1 extends Class1,Class2,Class3{}
*/ 

interface interface2{
	void m1();
}
interface interface3{
	void m2();
}

//Check abstract implements 2 or more interface Class
abstract class Class9 implements interface2,interface3{
	public void m1()
	{
		System.out.println("Abstract class implements interface2");
	}
	public void m2()
	{
		System.out.println("Abstract class implements interface3");
	}
}

class Class10 extends Class9{}
public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* We can not Create Object of Abstract Class 
		   Class1 class1=new Class1(); */
		
		Class3 class3=new Class4();
		class3.method();
		Class5 class5=new Class6();
		class5.method2();
		class5.method1();
		Class9 class9=new Class10();
		class9.m1();
		class9.m2();
		
	}

}
