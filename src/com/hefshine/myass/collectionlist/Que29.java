package com.hefshine.myass.collectionlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Que29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("Original List ");
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			Object obj=itr1.next();
			Integer i=(Integer)obj;
			System.out.println(i);
		}
		
		System.out.println("First Element "+list.getFirst());
		System.out.println("Last Element "+list.getLast());
	}

}
