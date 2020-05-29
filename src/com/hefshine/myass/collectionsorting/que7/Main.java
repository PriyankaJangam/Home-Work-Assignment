package com.hefshine.myass.collectionsorting.que7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee("Priyanka",'f',500000f);
		Employee e2=new Employee("Khushal",'m',400000f);
		Employee e3=new Employee("Abhay",'m',600000f);
		
		EmployeeName ename=new EmployeeName();
		EmployeeSalary esal=new EmployeeSalary();
		
		List list=new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println("Enter Choice ");
		String choice=sc.nextLine();
		switch(choice)
		{
			case "name":
				Collections.sort(list,ename);
				break;
				
			case "salary":
				Collections.sort(list,esal);
				break;
				
		}
		
		ListIterator itr=list.listIterator();
		while(itr.hasNext())
		{
			Employee temp=(Employee)itr.next();
			System.out.print(temp.getName()+" ");
			System.out.print(temp.getAge()+" ");
			System.out.println(temp.getSalary());
		}
		
	}

}
