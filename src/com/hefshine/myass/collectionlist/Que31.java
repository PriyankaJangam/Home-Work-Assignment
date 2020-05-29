package com.hefshine.myass.collectionlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Que31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(40);
		
		System.out.println("Original List ");
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			Object obj=itr1.next();
			Integer i=(Integer)obj;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Enter Position of an element ");
		int pos=sc.nextInt();
		list.remove(pos);
		Iterator itr2=list.iterator();
		while(itr2.hasNext())
		{
			Object obj=itr2.next();
			Integer i=(Integer)obj;
			System.out.print(i+" ");
		}
	}

}
