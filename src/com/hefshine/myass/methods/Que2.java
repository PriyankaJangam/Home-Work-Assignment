package com.hefshine.myass.methods;
import java.util.Scanner;
public class Que2 {
	int height;
	int width;
	int depth;
	
	void volumeCube(int h,int w,int d)
	{
		height=h;
		width=w;
		depth=d;
		
		int Cube=height*width*depth;
		System.out.println("Volume of Cube :"+Cube);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que2 obj=new Que2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height, Width, Height Value:");
		int h=sc.nextInt();
		int w=sc.nextInt();
		int d=sc.nextInt();
		obj.volumeCube(h, w, d);
		
	}

}
