package com.hefshine.myass.methods;
import java.util.Scanner;
public class Que9 {
	 int calculateArea(int length)
	 {
		 int area=length*length;
		 return area;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que9 obj=new Que9();
		System.out.println("Enter Length");
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int a=obj.calculateArea(len);
		System.out.println("Area of Square"+a);
	}

}
