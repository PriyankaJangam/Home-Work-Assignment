package com.hefshine.myass.containment.que2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date("1","12","2019");
		Department department=new Department(101,"IT");
		Employee employee=new Employee(24,"Priyanka",30000f,department,date);
		System.out.println(employee);
	}

}
