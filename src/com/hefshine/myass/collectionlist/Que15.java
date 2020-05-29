package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Que15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list =new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter element ");
		int ele=sc.nextInt();
		
		list.set(2, ele);
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			Object obj=itr.next();
			Integer i=(Integer)obj;
			System.out.println(i);
		}
	}

}
