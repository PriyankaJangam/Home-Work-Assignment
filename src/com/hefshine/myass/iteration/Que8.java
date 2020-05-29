package com.hefshine.myass.iteration;

public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=131,rem,rev=0;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(rev==temp)
		{
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is Not Palindrome");
		}
	}

}
