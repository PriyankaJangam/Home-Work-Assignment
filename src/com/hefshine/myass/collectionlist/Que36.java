package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Que36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
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
			System.out.print(i+" ");
		}
		System.out.println();
		List list1=list.subList(2, 3);
		System.out.println("Extract portion of List ");
		Iterator itr2=list1.iterator();
		while(itr2.hasNext())
		{
			Object obj=itr2.next();
			Integer i=(Integer)obj;
			System.out.print(i+" ");
		}
		
	}

}
