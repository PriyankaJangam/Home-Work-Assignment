package com.hefshine.myass.collectionlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Que40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1=new LinkedList();
		list1.add(20);
		list1.add(10);
		list1.add(10);
		list1.add(40);
		
		LinkedList list2=new LinkedList();
		list2.add(50);
		list2.add(60);
		list2.add(70);
		list2.add(80);
		
		LinkedList list3=new LinkedList();
		list3.addAll(list1);
		list3.addAll(list2);
		
		System.out.println("join List ");
		Iterator itr1=list3.iterator();
		while(itr1.hasNext())
		{
			Object obj=itr1.next();
			Integer i=(Integer)obj;
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
