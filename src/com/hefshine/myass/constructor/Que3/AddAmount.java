package com.hefshine.myass.constructor.Que3;

public class AddAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		Bank b2=new Bank(3000);
		float amt=b2.finalAmount();
		System.out.println("Final amount "+amt);
	}

}
