package com.hefshine.myass.collectionlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Que32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.add(20);
		list.add(10);
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
		list.removeFirst();
		list.removeLast();
		System.out.println("After remove ");
		Iterator itr2=list.iterator();
		while(itr2.hasNext())
		{
			Object obj=itr2.next();
			Integer i=(Integer)obj;
			System.out.print(i+" ");
		}
	}

}
