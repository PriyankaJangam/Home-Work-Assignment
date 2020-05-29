package com.hefshine.myass.constructor.Que1;

public class Que1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Priyanka", "Developer", 30000.0f, 2.5f, 2.0f);
		e1.display();
		float gsal=e1.Cal();
		System.out.println("Gross Salary of Employee "+gsal);
	}

}
