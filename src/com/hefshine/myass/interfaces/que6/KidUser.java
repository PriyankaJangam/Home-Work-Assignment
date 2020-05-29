package com.hefshine.myass.interfaces.que6;

public class KidUser implements LibraryUser{
	int age;
	String ch1="kids";
	
	public KidUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public KidUser(int age, String ch1) {
		super();
		this.age = age;
		this.ch1 = ch1;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCh1() {
		return ch1;
	}

	public void setCh1(String ch1) {
		this.ch1 = ch1;
	}

	public void registerAccount()
	{
		if(getAge()<12)
		{
			System.out.println("You have Successfully register in Kid Account");
		}
		else
		{
			System.out.println("Sorry less than 12 to register kid account");
		}
		
	}
	public void requestBook()
	{
		
		if(getCh1()==ch1)
		{
			System.out.println("Book Issue Successfully ,Please return book within 10 days");
		}
		else
		{
			System.out.println("OOps You are allowed to issue only adult book");
		}
	}
}
