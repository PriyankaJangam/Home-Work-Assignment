package com.hefshine.myass.controlstatement;

public class MaxThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=50,num2=30,num3=70;
		if(num1>num2 && num1>num3)
		{
			System.out.println("Number 1 is greater");
		}
		else{
			if(num2>num3)
			{
				System.out.println("Number 2 is greater");
			}
			else{
				System.out.println("Number 3 is greater");
			}
		}
	}

}
