package com.hefshine.myass.methods;
import java.util.Scanner;
public class Que1 {
	int day;
	int month;
	int year;
	
	void setDate(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;

	}
	void getDate()
	{
		System.out.println(day+"/"+month+"/"+year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que1 obj=new Que1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day,Month and Year");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		
		obj.setDate(d, m, y);
		obj.getDate();
	}

}
