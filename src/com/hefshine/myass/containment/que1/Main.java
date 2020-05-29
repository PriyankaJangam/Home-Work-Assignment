package com.hefshine.myass.containment.que1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address("Chalisgaon","Maharashtra","India");
		FullName fullname=new FullName("Priyanka","Subhash","Jangam",address);
		Person person=new Person(fullname,"Female","24");
		System.out.println(person.getFullname().getFirstname());
		System.out.println(person.getFullname().getMiddlename());
		System.out.println(person.getFullname().getLastname());
		System.out.println(person.fullname.getAddress().getCity());
		System.out.println(person.fullname.getAddress().getState());
		System.out.println(person.fullname.getAddress().getCountry());
		System.out.println(person.getGender());
		System.out.println(person.getAge());
		
	}

}
