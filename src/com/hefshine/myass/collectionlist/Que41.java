package com.hefshine.myass.collectionlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Que41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1=new LinkedList();
		list1.add(20);
		list1.add(10);
		list1.add(10);
		list1.add(40);
		
		LinkedList list2=new LinkedList();
		
		list2=(LinkedList)list1.clone();
		System.out.println("clone List ");
		Iterator itr1=list2.iterator();
		while(itr1.hasNext())
		{
			Object obj=itr1.next();
			Integer i=(Integer)obj;
			System.out.print(i+" ");
		}
	}

}
