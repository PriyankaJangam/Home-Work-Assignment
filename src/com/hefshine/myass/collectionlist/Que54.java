package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Que54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		
		ArrayList list2=new ArrayList();
		list2=(ArrayList)list1.clone();
		Iterator itr1=list2.iterator();
		while(itr1.hasNext())
		{
			Object obj=itr1.next();
			Integer i=(Integer)obj;
			System.out.print(i+" ");
		}
	}

}
