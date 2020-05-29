package com.hefshine.myass.methods;
import java.util.Scanner;
 public class Que8 {
	 void printMessage(String name)
	 {
		 System.out.println("My Name is "+name);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que8 obj=new Que8();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name ");
		String n=sc.nextLine();
		obj.printMessage(n);
	}

}
