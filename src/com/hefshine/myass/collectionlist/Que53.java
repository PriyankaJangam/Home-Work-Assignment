package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Que53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1=new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		
		List list2=new ArrayList();
		list2.add(60);
		list2.add(70);
		list2.add(80);
		
		List list3=new ArrayList();
		list3.addAll(list1);
		list3.addAll(list2);
		
		Iterator itr1=list3.iterator();
		while(itr1.hasNext())
		{
			Object obj=itr1.next();
			Integer i=(Integer)obj;
			System.out.print(i+" ");
		}
	}

}
