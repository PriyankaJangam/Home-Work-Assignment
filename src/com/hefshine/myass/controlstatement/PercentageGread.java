package com.hefshine.myass.controlstatement;

public class PercentageGread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Physics=78,Chemistry=72,Biology=98,Mathematics=89,Computer=69;
		float total,per,avg;
		total=Physics+Chemistry+Biology+Mathematics+Computer;
	
		per=total/5;
		System.out.println("Percentage of Student:"+per);
		
		if(per>=90)
		{
			System.out.println("Grade A");
		}
		else if(per>=80)
		{
			System.out.println("Grade B");
		}
		else if(per>=70)
		{
			System.out.println("Grade C");
		}
		else if(per>=60)
		{
			System.out.println("Grade D");
		}
		else if(per>=40)
		{
			System.out.println("Grade E");
		}
		else{
			System.out.println("Grade F");
		}
	}

}
