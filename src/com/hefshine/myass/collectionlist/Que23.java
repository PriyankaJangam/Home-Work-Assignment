package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Que23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("Enter Position ");
		int pos=sc.nextInt();
		System.out.println("Enter Element ");
		int ele=sc.nextInt();
		
		list.set(pos, ele);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			Integer i=(Integer)obj;
			System.out.println(i);
		}
		
	}

}
