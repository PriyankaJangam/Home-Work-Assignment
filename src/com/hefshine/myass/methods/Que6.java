package com.hefshine.myass.methods;
import java.util.Scanner;
public class Que6 {
	int height;
	int width;
	int depth;
	
	double volume(int h,int w,int d)
	{
		height=h;
		width=w;
		depth=d;
		double vol=height*width*depth;
		return vol;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que6 obj=new Que6();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height , Width and depth value");
		int h=sc.nextInt();
		int w=sc.nextInt();
		int d=sc.nextInt();
		double cal=obj.volume(h, w, d);
		System.out.println("Volume of Box ="+cal);
	}
	

}
