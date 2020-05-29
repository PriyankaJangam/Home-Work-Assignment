package com.hefshine.myass.collectionlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Que42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1=new LinkedList();
		list1.add(20);
		list1.add(10);
		list1.add(10);
		list1.add(40);
		System.out.println("Remove First Element ");
		System.out.println(list1.removeFirst());
		System.out.println("After Remove First Element ");
		Iterator itr1=list1.iterator();
		while(itr1.hasNext())
		{
			Object obj=itr1.next();
			Integer i=(Integer)obj;
			System.out.print(i+" ");
		}
	}

}
