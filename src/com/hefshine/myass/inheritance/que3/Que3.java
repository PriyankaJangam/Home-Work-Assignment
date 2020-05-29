package com.hefshine.myass.inheritance.que3;


public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1=new Department(101,"MCA");
		Student s1=new Student(1,"Priyanka",d1);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());
		System.out.println(s1.getSname());
	}

}
