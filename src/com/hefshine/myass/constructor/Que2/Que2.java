package com.hefshine.myass.constructor.Que2;

public class Que2 {
	int length;
	int breadth;
	int len;
	int bre;
	float a1;
	float a2;
	Que2(){
		this.length=0;
		this.breadth=0;
	}
	Que2(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	Que2(int lenbre)
	{
		this.len=lenbre;
		this.bre=lenbre;
	}
	float area()
	{
		a1=this.length*this.breadth;
		return a1;
	}
	float area1()
	{
		a2=this.len*this.bre;
		return a2;
	}
}
