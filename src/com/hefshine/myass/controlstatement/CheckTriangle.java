package com.hefshine.myass.controlstatement;

public class CheckTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side1=20,side2=20,side3=10;
		if(side1!=side2 && side1!=side3 && side2!=side3)
		{
			
				System.out.println("Triangle is scalene");
			
		}
		if(side1 == side2 && side2== side3 && side2==side3 )
		{
				System.out.println("Triangle is equilateral");
			
		}
		if(((side1==side2)&&(side1!=side3))|| ((side1==side3)&&(side1!=side2)) || ((side2==side3)&&(side2!=side1)))
		{
		  
		    	System.out.println("Triangle is Isosceles");
		}
	}
}


