package com.hefshine.myass.opps;
import java.util.Scanner;
public class Que2 {

	double HRA;
	double DA;
	double GSalary;
	double ProvidentFund;
	double netSalary;
	double addBonus;
	
	float calculate(int salary,int service)
	{
		HRA=salary*2.5;
		DA=salary*2.0;
		GSalary=HRA+DA+salary;
		ProvidentFund=(GSalary*10)/100;
		netSalary=GSalary-ProvidentFund;
		System.out.println("Salary of Employee="+netSalary);
		if(service>3)
		{
			addBonus=(netSalary*20)/100;
			netSalary=netSalary+addBonus;
			System.out.println("Salary of Employee="+netSalary);
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que2 obj=new Que2();
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Service Year=");
		int Service=sc.nextInt();
		
		System.out.println("Enter Salary=");
		int Salary=sc.nextInt();
		
		obj.calculate(Salary,Service);
	}

}
