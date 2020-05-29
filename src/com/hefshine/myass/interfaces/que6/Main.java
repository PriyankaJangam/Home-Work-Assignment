package com.hefshine.myass.interfaces.que6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUser kiduser=new KidUser(10,"Kids");
		kiduser.registerAccount();
		kiduser.requestBook();
		Adult adult=new Adult(43,"Fiction");
		adult.registerAccount();
		adult.requestBook();
	}

}
