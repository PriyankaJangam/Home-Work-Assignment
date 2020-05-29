package com.hefshine.myass.constructor.Que3;

public class Bank {
	float amount=5000;
	
	Bank(){
		System.out.println("Bank amount "+amount);
	}
	Bank(int add)
	{
		this.amount=this.amount+add;
	}
	float finalAmount()
	{
		return this.amount;
	}
}
