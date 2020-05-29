package com.hefshine.myass.collectionset;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeSet set=new TreeSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
		System.out.println("Enter Element to remove");
		int ele=sc.nextInt();
		set.remove(ele);
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
