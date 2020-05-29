package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Que22 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		list1.ensureCapacity(6);
		list1.add(50);
		list1.add(60);
		Iterator itr=list1.iterator();
		
		while(itr.hasNext())
		{
			
			Object obj=itr.next();
			Integer i=(Integer)obj;
			System.out.println(i);
			
		}
	}

}
