package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Que46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1=new LinkedList();
		list1.add(20);
		list1.add(10);
		list1.add(10);
		list1.add(40);
		
		List list2=new ArrayList(list1);
		System.out.println("Linked list to Arrayist");
		Iterator itr1=list2.iterator();
		while(itr1.hasNext())
		{
			Object obj=itr1.next();
			Integer i=(Integer)obj;
			System.out.print(i+" ");
		}
		
	}

}
