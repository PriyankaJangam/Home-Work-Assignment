package com.hefshine.myass.inheritance;

class Sum
{
	int no1=10, no2=20,sum=0;
	void add()
	{
		sum=no1+no2;
		System.out.println("Sum "+sum);
	}
}
class Avg extends Sum
{
	int avg;
	void average()
	{
		avg=sum/2;
		System.out.println("Average "+avg);
	}
}
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum=new Sum();
		sum.add();
		Avg avg=new Avg();
		avg.add();
		avg.average();
	}

}
