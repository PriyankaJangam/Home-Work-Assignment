package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Que50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		Enumeration en=Collections.enumeration(list);
		System.out.println("Before Remove ");
		while(en.hasMoreElements())
		{
			
			Object obj=en.nextElement();
			System.out.println(obj);
		}
		
		System.out.println("After Remove ");
		list.removeAll(list);
		
		Iterator itr=list.iterator();
		//Enumeration en1=Collections.enumeration(list);
		while(itr.hasNext())
		{
			
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
