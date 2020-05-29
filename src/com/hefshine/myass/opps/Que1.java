package com.hefshine.myass.opps;
import java.util.Scanner;
public class Que1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Celcious value");
		Scanner sc=new Scanner(System.in);
		Float c=sc.nextFloat();
		Float faherheit=c*(9f/5)+32;
		System.out.println("Celcious to fariherant is "+faherheit);
	
		Float celsius=faherheit-32;
		System.out.println(" fariherant to Celcious is "+celsius);
	}

}
