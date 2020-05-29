package com.hefshine.myass.containment.que1;

public class Person {
	FullName fullname;
	private String gender;
	private String age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(FullName fullname, String gender, String age) {
		super();
		this.fullname = fullname;
		this.gender = gender;
		this.age = age;
	}
	public FullName getFullname() {
		return fullname;
	}
	public void setFullname(FullName fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [fullname=" + fullname + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
