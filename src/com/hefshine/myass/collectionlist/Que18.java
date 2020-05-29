package com.hefshine.myass.collectionlist;

import java.util.*;


public class Que18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1 =new ArrayList();
		list1.add("priyanka");
		list1.add("abhay");
		list1.add("Khushal");
		
		List list2=new ArrayList();
		list2.add("jyoti");
		list2.add("sachin");
		list2.add("shivansh");
		list2.add("Chinki");
		list2.addAll(list1);
		//Collections.copy(list2, list1);
		Iterator itr=list2.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			String i=(String)obj;
			System.out.println(i);
		}
		
	}

}
