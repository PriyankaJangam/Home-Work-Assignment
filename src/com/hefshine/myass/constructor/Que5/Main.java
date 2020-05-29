package com.hefshine.myass.constructor.Que5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(10);
		int id=e.getId();
		System.out.println("Id of Employee "+id);
		e.setName("Priyanka");
		String name=e.getName();		
		System.out.println("Name of Employee "+name);
	}

}
