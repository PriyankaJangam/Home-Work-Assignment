package com.hefshine.myass.collectionlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Que51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1=new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
	
		
		
		List list2=new ArrayList();
		list2.add(10);
		list2.add(20);
		list2.add(30);

		
		list1.retainAll(list2);
		Enumeration en1=Collections.enumeration(list1);
		while(en1.hasMoreElements())
		{
			
			Object obj=en1.nextElement();
			System.out.println(obj);
		}
		
	}

}
